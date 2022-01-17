# desafiopubfuture
# Desafio Pub Future

#Primeiramente peço desculpas por qualquer erro, pois é a minha primeira vez utilizando o GitHUb. Agora, vamos ao que interessa.

# O presente projeto utilizou as seguintes bibliotecas:
    #Persistence (JPA 2.1)
    #Hibernate 4.3x
    #EclipseLink (JPA 2.1)
    #jandex-1.1.0.final
    #javax.servlet.jsp.jstl-api-1.2.1
    #jstl-impl
    #log4j-1.2.16
    #log4j-api-2.0.1
    #mysql-connector-java-8.0.27
  
#Banco de dados MySQL(XAMPP)
    #Nome do banco de dados: desafiopub
    #Usuario: root
    #Senha: ""
    #Porta: 3306

#Script para criação do banco de dados:
    
    
    create database desafioPub
    use desafioPub;

    create table contas(
    idContas int primary key auto_increment,
    banco  varchar(50) not null,
    agencia int not null,
    conta int not null,
    saldo double not null,
    dataCadastro timestamp default current_timestamp not null,
    dataAtualizacao timestamp default current_timestamp not null
    );

    create table receitas(
    idReceitas int primary key auto_increment,
    origem varchar(50) not null,
    valor double not null,
    dataRecebimento date,
    dataCadastro timestamp default current_timestamp not null,
    dataAtualizacao timestamp default current_timestamp,
    observacao varchar(200)
    );

    create table despesas(
    idDespesas int primary key auto_increment,
    credor varchar(50) not null,
    valor double not null,
    dataVencimento date not null,
    dataCadastro timestamp default current_timestamp not null,
    dataAtualizacao timestamp default current_timestamp not null,
    observacao varchar(200)
    );

  
  
  
  
  
