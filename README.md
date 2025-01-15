O padrão Builder é utilizado para criar objetos complexos passo a passo. Ele é útil quando temos muitos atributos opcionais e queremos evitar a criação de vários construtores.

# Contexto: Sistema de Cadastro de Usuário
Imagine que temos um sistema de cadastro de usuário com as seguintes informações:

Nome
Email
Telefone
Endereço
Data de Nascimento
Nem todos os campos são obrigatórios. Vamos usar o Builder para construir o objeto User de maneira flexível.

# Explicação
Classe User:

Os atributos são privados e definidos pelo UserBuilder.
O construtor User(UserBuilder builder) recebe um builder e preenche os campos.
Classe UserBuilder:

Possui métodos setX para definir cada atributo do User.
O método build() cria uma instância de User.
Classe Main:

user1 é criado apenas com name e email.
user2 é criado com todos os atributos.
