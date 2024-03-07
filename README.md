# springboot-jpa

### 1 - O que é?
- I - Web service de cadastro de compras, contemplando o cenário de um e-commerce com seus produtos cadastrados, clientes e pedidos realizados;
- II - Modelo conceitual do domínio.
![Captura de tela de 2024-02-26 12-47-05](https://github.com/JhoneRodrigues/springboot-jpa/assets/110574688/f7957f21-47e3-4f68-8c7f-68aae5f99a0c)


### 2 - Objetivo
Após estudar o tópico de Spring e mapeamento de objetos relacionais com JPA, coloquei em prática todos os conceitos com este projeto. Gerei as classes de dominio seguindo o modelo, realizei a estruturação das camadas lógicas: Resource, service e repository, gerei o CRUD Create, Retrieve, Update e Delete e por fim fiz o tratamento de exceções.

### 3 - Json das ordens de pedido, a entidade que possui relacionamento com todas as demais

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

### 6 - Como executar utilizando o Docker
#### I - Comandos
Inicie a aplicação em sua máquina com o seguinte comando:
```bash
docker run -p 8080:8080 --name java-webservice jhonerodrigues/marketplace:0.0.2-SNAPSHOT 
```
Para parar a execução use CRTR + C
#### II - Endpoints HTTP utilizáveis
- Get todos os clientes: http://localhost:8080/users
- Get cliente por Id: http://localhost:8080/users/1
- Post novo cliente através do body: http://localhost:8080/users
- Put atualizar cliente por id: http://localhost:8080/users/1
- Get todas as categorias: http://localhost:8080/categories
- Get categoria por Id: http://localhost:8080/categories/1
- Get todos os produtos: http://localhost:8080/products
- Get produto por Id: http://localhost:8080/products/1
- Get todas as ordens de compra: http://localhost:8080/orders
- Get ordem de compra por Id: http://localhost:8080/orders/1

### 5 - Tecnologias utilizadas
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>JPA / Hibernate</li>
  <li>Maven</li>
  <li>H2 Database</li>
  <li>Docker</li>
</ul>

## <b> Vamos nos conectar..!</b><img src="https://github.com/0xAbdulKhalid/0xAbdulKhalid/raw/main/assets/mdImages/handshake.gif" width ="80">
<a href="https://www.linkedin.com/in/jhonerodrigues/" target="_blank">
<img src="https://img.shields.io/badge/linkedin:  jhone rodrigues-%2300acee.svg?color=405DE6&style=for-the-badge&logo=linkedin&logoColor=white" alt=linkedin style="margin-bottom: 5px;"/>
</a>
