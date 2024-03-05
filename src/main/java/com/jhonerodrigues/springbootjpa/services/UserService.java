package com.jhonerodrigues.springbootjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.jhonerodrigues.springbootjpa.entities.User;
import com.jhonerodrigues.springbootjpa.entities.dtos.UserDTO;
import com.jhonerodrigues.springbootjpa.entities.request.UserRequest;
import com.jhonerodrigues.springbootjpa.repositories.UserRepository;
import com.jhonerodrigues.springbootjpa.services.exceptions.DatabaseException;
import com.jhonerodrigues.springbootjpa.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll(){
		return repository.findAll().stream()
				.map(x -> new UserDTO(x)).toList();
	}
	
	public UserDTO findById (Long id) {
		return new UserDTO (repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)));
	}
	
	public UserDTO insert (UserRequest obj) {
		return new UserDTO (repository.save(new User(obj)));
	}
	
	public void delete (Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public UserDTO update(Long id, UserRequest obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return new UserDTO (repository.save(entity));
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
 
	private void updateData(User entity, UserRequest obj) {
		entity.setName(obj.name());
		entity.setEmail(obj.email());
		entity.setPhone(obj.phone());
	}
}	
