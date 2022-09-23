create database bdEncomenda
go

Use bdEncomenda

Create table tbCliente(
codCliente int primary key identity (1,1)
,nomeCliente varchar (50) not null
,dataNascimentoCliente smalldatetime not null
,ruaCliente varchar (60) not null
,numCasaCliente varchar (6) not null
,cepCliente varchar (25) not null
,bairroCliente varchar (50) not null
,cidadeCliente varchar (50) not null
,estadoCliente varchar (50) not null
,cpfCliente char (14) not null
,sexoCliente varchar (15) not null
)

create table tbCategoriaProduto(
codCategoriaProduto int primary key identity (1,1)
,nomeCategoriaProduto varchar (50) not null
)

create table tbProduto (
codProduto int primary key identity (1,1)
,nomeProduto varchar (50) not null
,precoKiloProduto smallmoney not null
,codCategoriaProduto int foreign key references tbCategoriaProduto (codCategoriaProduto)
)

create table tbEncomenda(
codEncomenda int primary key identity (1,1)
,dataEncomenda smalldatetime not null
,valorTotalEncomenda smallmoney not null
,dataEntregaEncomenda smalldatetime not null
,codCliente int foreign key references tbCliente (codCliente)
)

create table tbItensEncomenda(
codItensEncomenda int primary key identity (1,1)
,quantidadeKilosItensEncomneda varchar (100) not null
,subTotalItensEncomenda smallmoney not null
,codEncomenda int foreign key references tbEncomenda (codEncomenda)
,codProduto int foreign key references tbProduto (codProduto)
)