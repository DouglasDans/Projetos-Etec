create database bdEscola
go
use bdEscola

create table tbAluno(
codAluno int primary key identity (1,1)
,nomeAluno varchar (40) not null
,dataNascimentoAluno smalldatetime
,rgAluno char (13) not null
,naturalidadeAluno varchar (40) not null
)

create table tbCurso(
codCurso int primary key identity (1,1)
,nomeCurso varchar (40) not null
,cargahorariaCurso varchar (10) not null
,valorCurso smallmoney not null
)

create table tbTurma(
codTurma int primary key identity (1,1)
,nomeTurma varchar (40)
,codCurso int foreign key references tbCurso(codCurso)
,horarioTurma smalldatetime
)

create table tbMatricula(
codMatricula int primary key identity (1,1)
,dataMatricula smalldatetime
,codAluno int foreign key references tbAluno(codAluno)
,codTurma int foreign key references tbTurma(codTurma)
)