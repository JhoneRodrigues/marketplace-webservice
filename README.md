# springboot-jpa

# Microservice - beauty salon
<h3 style="color:blue"> Status: Em desenvolvimento</h3>

### 1 - O que é?
- I - Web service de cadastro de compras, contemplando o cenário de um e-commerce com seus produtos cadastrados, clientes e pedidos realizados.
- II - Modelo conceitual do domínio.
![Captura de tela de 2024-02-26 12-47-05](https://github.com/JhoneRodrigues/springboot-jpa/assets/110574688/f7957f21-47e3-4f68-8c7f-68aae5f99a0c)


### 2 - Objetivo
Após estudar o tópico de Spring e mapeamento de objetos relacionais com JPA, coloquei em prática todos os conceitos com este projeto. Gerei as classes de dominio seguindo o modelo, realizei a estruturação das camadas lógicas: Resource, service e repository, gerei o CRUD Create, Retrieve, Update e Delete e por fim fiz o tratamento de exceções.

### 3 - Retorno das requisições em produção
#### Vizualizar todos usúarios
> ![image](https://user-images.githubusercontent.com/110574688/263355105-f1341b7c-36e6-412d-a6d8-9ae5eec4f6f8.png)

#### Vizualizar os produtos por Id
> ![image](https://user-images.githubusercontent.com/110574688/263355351-ab00a10a-5704-46cf-97a6-52e3a53a0e2a.png)

#### Vizualizar todas categorias
> ![image](https://user-images.githubusercontent.com/110574688/263355510-372bd98f-8978-4852-b4c3-6294d31b4d1c.png)

### 4 - Json das ordens de pedido, a entidade que possui relacionamento com todas

#### Conforme o modelo conceitual, um pedido (Order) inclui os produtos solicitados, seus subvalores e o valor total do pedido:
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
### 5 - Tecnologias utilizadas
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>JPA / Hibernate</li>
  <li>Maven</li>
  <li>H2 Database</li>
</ul>

## <b> Vamos nos conectar..!</b><img src="https://github.com/0xAbdulKhalid/0xAbdulKhalid/raw/main/assets/mdImages/handshake.gif" width ="80">
<a href="https://www.linkedin.com/in/jhonerodrigues/" target="_blank">
<img src="https://img.shields.io/badge/linkedin:  jhone rodrigues-%2300acee.svg?color=405DE6&style=for-the-badge&logo=linkedin&logoColor=white" alt=linkedin style="margin-bottom: 5px;"/>
</a>
