# Infnet - PB - Projeto de Bloco Java
Teste de Performance 3 da matéria de Desenvolvimento de Serviços em Nuvem com Java

REST API Usuário do Sistema VenturaHr

## Apresentação

REST API Usuário do VenturaHr com o consumo adicional da API de CEP: https://viacep.com.br/ws/{cep}/json 

Para ser testado por meio de requisições Http.


## Desenvolvimento

As rotas de interação com o sistema são:

http://localhost:8081/cadastro (Post)

http://localhost:8081/usuarios (Get)

http://localhost:8081/editar (Put)

http://localhost:8081/usuarios/{id}  (Get)

http://localhost:8081/usuarios/deletar/{id}  (Get)

O modelo de inclusão de usuário é:

{
    
    "nome": "Carlos Gomes",
    "endereco": "São Paulo",
    "telefone": "48899751234",
    "email": "Carlos@email.com",
    "senha": "1234",
    "tipoDeConta": "Candidato",
    "cpf": "335.234.777-98",
    "razaoSocial": "Carlos tecnologia sa",
    "cnpj": "45.343.789/0001-45",
    "cep": " 20010020",
    
  }
