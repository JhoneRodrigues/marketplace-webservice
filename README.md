# springboot-jpa

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/JhoneRodrigues/workshop-springboot-mongodb/blob/main/LICENSE) 
### Sobre o projeto

Este desafio prático utilizei minhas habilidades em Java, Spring Boot, padrões REST e JPA / Hibernate para gerar uma aplicação Backend baseada na web que emula um sistema de e-commerce completo, repleto de clientes, produtos e pedidos.

Esta aplicação opera por meio de uma série de requisições web que têm a finalidade de adicionar clientes, criar pedidos e gerenciar produtos. Logo abaixo, irei apresentar alguns exemplos em execução.

## Exemplo de requisições aceitas no Postman
### Vizualizar todos usúarios
> ![image](https://user-images.githubusercontent.com/110574688/263355105-f1341b7c-36e6-412d-a6d8-9ae5eec4f6f8.png)

### Vizualizar os produtos por Id
> ![image](https://user-images.githubusercontent.com/110574688/263355351-ab00a10a-5704-46cf-97a6-52e3a53a0e2a.png)

### Vizualizar todas categorias
> ![image](https://user-images.githubusercontent.com/110574688/263355510-372bd98f-8978-4852-b4c3-6294d31b4d1c.png)

## Pedidos em Json

### Conforme o modelo conceitual, um pedido (Order) inclui os produtos solicitados, seus subvalores e o valor total do pedido:
```bash
{
    "id": 1,
    "moment": "2019-06-20T19:53:07Z",
    "orderStatus": "PAID",
    "client": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "11 988888888",
        "password": "123456"
    },
    "items": [
        {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "description": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [
                    {
                        "id": 2,
                        "name": "Books"
                    }
                ]
            },
            "subTotal": 181.0
        },
        {
            "quantity": 1,
            "price": 1250.0,
            "product": {
                "id": 3,
                "name": "Macbook Pro",
                "description": "Nam eleifend maximus tortor, at mollis.",
                "price": 1250.0,
                "imgUrl": "",
                "categories": [
                    {
                        "id": 3,
                        "name": "Computers"
                    }
                ]
            },
            "subTotal": 1250.0
        }
    ],
    "payment": {
        "id": 1,
        "moment": "2019-06-20T22:53:07Z"
    },
    "total": 1431.0
}
```

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Postman
- Maven
- H2

## Autor
<p>Jhone Costa Rodrigues</p>
<section align="left">  
  <div> 
    <a href = "mailto:jhonecosta30@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank" title="E-mail: jhonecosta30@gmail.com"></a>
      &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="https://www.linkedin.com/in/jhone-rodrigues-79a080234/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank" title="Linkedin: Jhone Costa Rodrigues"></a>
  </div>
</section>
