Use bdEncomenda

--exercicio a

create procedure spInserirCategoria
@CategoriaProduto VARCHAR (50)
as
begin
    insert into tbCategoriaProduto (nomeCategoriaProduto) 
    values (@CategoriaProduto)
    print ('categoria '+@CategoriaProduto+' cadastrado com sucesso')
end

EXEC spInserirCategoria 'Bolo Festa'

EXEC spInserirCategoria 'Bolo Simples'

EXEC spInserirCategoria 'Torta'

EXEC spInserirCategoria 'Salgado'

SELECT * from tbCategoriaProduto


--exercicio b

create procedure spInserirProduto
@nomeProduto varchar(50),@precoProduto smallmoney,@codCategoriaProduto int
as
begin
    If exists (select nomeProduto from tbProduto where nomeProduto like @nomeProduto)
    begin
        print ( ' não é possível cadastrar o nome ' +@nomeProduto+' nome já existe')
    end
else
    begin
        insert into tbProduto (nomeProduto, precoKiloProduto, codCategoriaProduto)
        values (@nomeProduto, @precoProduto, @codCategoriaProduto)
        print (' nome '+@nomeProduto+' cadastrado com sucesso')
    end
end

EXEC spInserirProduto 'Bolo floresta negra', 42.00, 1

EXEC spInserirProduto 'Bolo prestigio', 43.00, 1

EXEC spInserirProduto 'Bolo Nutella', '44.00', 1

EXEC spInserirProduto 'Bolo formigueiro', 17.00, 2

EXEC spInserirProduto 'Bolo de cenoura', 19.00, 2

EXEC spInserirProduto 'torta de palmito ', 45.00, 3 

EXEC spInserirProduto 'torta de frango e catupiry ', 47.00, 3

EXEC spInserirProduto 'torta de escarola ', 44.00, 3

EXEC spInserirProduto 'coxinha de frango ', 25.00, 4

EXEC spInserirProduto 'esfiha de carne ', 27.00, 4

EXEC spInserirProduto 'folhado queijo ', 31.00, 4

EXEC spInserirProduto 'rissoles misto ', 29.00, 4

SELECT * from tbProduto


--exercicio c
create procedure spInserirCliente
@nomeCLiente VARCHAR(100),@dataCliente smalldatetime, @cpfCliente VARCHAR(11),@sexoCliente varchar(1),@ruaCliente VARCHAR(100),@ncasacliente VARCHAR(100),@cepcliente varchar(7),@bairroCliente VARCHAR(50),@cidadeCliente VARCHAR(100),@ufcliente VARCHAR(2)
as
begin
    if (@bairroCliente like 'guaianases')
    BEGIN
        If exists (select cpfCliente FROM tbCliente Where cpfCliente like @cpfCliente)
        begin
            print ('Cliente cpf '+@cpfCliente+' já cadastrado')
        end
        else
        begin
            insert into tbCliente (nomeCliente,dataNascimentoCliente,cpfCliente,sexoCliente,ruaCliente,numCasaCliente,cepCliente,bairroCliente,cidadeCliente,estadoCliente)
            values (@nomeCLiente,@dataCliente,@cpfCliente,@sexoCliente,@ruaCliente,@ncasacliente,@cepcliente,@bairroCliente,@cidadeCliente,@ufcliente)
            print ('nome '+@nomeCliente+' cadastrado com sucesso')
        end
    END
    ELSE if (@bairroCliente like 'itaquera')
    BEGIN
        If exists (select cpfCliente FROM tbCliente Where cpfCliente like @cpfCliente)
        begin
            print ('Cliente cpf '+@cpfCliente+' já cadastrado')
        end
        else
        begin
            insert into tbCliente (nomeCliente,dataNascimentoCliente,cpfCliente,sexoCliente,ruaCliente,numCasaCliente,cepCliente,bairroCliente,cidadeCliente,estadoCliente)
            values (@nomeCLiente,@dataCliente,@cpfCliente,@sexoCliente,@ruaCliente,@ncasacliente,@cepcliente,@bairroCliente,@cidadeCliente,@ufcliente)
            print ('nome '+@nomeCliente+' cadastrado com sucesso')
        end
    END
    else
    BEGIN
        PRINT('Não foi possível cadastrar o cliente '+ @nomeCLiente +' pois o bairro '+@bairroCliente+' não é atendido pela confeitaria')
    end 
end

EXEC spInserirCliente 'Samira Fatah','05/05/1990','12345678901','F','Rua Agapei','1000','8090000','guaianases','São Paulo','SP'

EXEC spInserirCliente 'Celia Nogueira','06/06/1992','23456789012','F','Rua Andes','234','8456090','guaianases','São Paulo','SP'

EXEC spInserirCliente 'paulo Cesar Siqueira','04/04/1984','34567890123','M','Rua Castelo do Piauí','234','8456090','guaianases','São Paulo','SP'

EXEC spInserirCliente 'Rodrigo Favaroni','09/04/1991','456789012','M','Rua Sansão Castelo Branco','10','8431090','guaianases','São Paulo','SP'

EXEC spInserirCliente 'Flávia Regina Brito','22/04/1992','56789012345','F','Rua Mariano Moro','300','8200123','Itaquera','São Paulo','SP'

SELECT * from tbCliente


--exercicio D
create PROCEDURE spEncomenda
@dataEncomenda smalldatetime,
@cpfCliente VARCHAR (11), 
@valorTotalvenda SMALLMONEY, 
@dataEntrega smalldatetime

AS
BEGIN
    If not exists (select cpfCliente from tbCliente where cpfCliente like @cpfCliente)
    begin
        print ('não foi possível efetivar a encomenda pois o cliente cpf: ' +@cpfCliente+' não existe')
    end
    else
    BEGIN
        if (@dataEncomenda < GETDATE())
        BEGIN
            PRINT('data inferior a atual')
        end
        else
        begin
            insert into tbEncomenda(dataEncomenda,valorTotalEncomenda,dataEntregaEncomenda,codCliente)
            VALUEs (@dataEncomenda,@valorTotalVenda,@dataEntrega,
            (select codCliente from tbCliente where cpfCliente like @cpfCliente))
        END
    END
END

--exercicio E

EXEC spEncomenda '08/09/2020', 12345678901 ,450.00,'15/09/2020'
Exec spEncomenda '10/10/2020', 56789012345 , 450.00 , '15/10/2020'
Exec spEncomenda '10/10/2020' , 34567890123 ,150.00 , '10/12/2020'
exec spEncomenda '06/10/2020' , 1456789012 , 250.00 , '12/10/2020'
exec spEncomenda '05/10/2021' , 34567890123 , 150.00 , '12/10/2020'

select * from tbEncomenda


--exercicio F
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (1,1,2.5,105.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (1,10,2.6,70.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (1,9,6,150.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (1,12,4.3,125.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (2,9,8,200.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (3,11,3.2,100.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (3,11,3.2,100.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (3,9,2,50.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (4,2,3.5,150.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (4,3,2.2,100.00)
INSERT into tbItensEncomenda (codEncomenda,codProduto,quantidadeKilosItensEncomneda,subTotalItensEncomenda)
VALUES (5,6,3.4,150.00)

select * from tbItensEncomenda

create PROCEDURE spMudaPreco
AS
BEGIN
    UPDATE tbItensEncomenda
    SET subTotalItensEncomenda = subTotalItensEncomenda * 0.10
    where codProduto = (SELECT codProduto from tbProduto where codCategoriaProduto = 1 and tbProduto.codProduto = tbItensEncomenda.codProduto)

    UPDATE tbItensEncomenda
    SET subTotalItensEncomenda = subTotalItensEncomenda / 0.20
    where codProduto = (SELECT codProduto from tbProduto where codCategoriaProduto = 2 and tbProduto.codProduto = tbItensEncomenda.codProduto)

    UPDATE tbItensEncomenda
    SET subTotalItensEncomenda = subTotalItensEncomenda * 0.25
    where codProduto = (SELECT codProduto from tbProduto where codCategoriaProduto = 3 and tbProduto.codProduto = tbItensEncomenda.codProduto)

    UPDATE tbItensEncomenda
    SET subTotalItensEncomenda = subTotalItensEncomenda * 0.20
    where codProduto = (SELECT codProduto from tbProduto where codCategoriaProduto = 4 and tbProduto.codProduto = tbItensEncomenda.codProduto and tbProduto.codProduto != 10)
END

Exec spMudaPreco

--exercicio G
create procedure spRemoverCliente
@cpfCliente VARCHAR(50)
as
BEGIN
    If  exists (select codEncomenda from tbEncomenda where (select cpfCliente from tbCliente where cpfCliente like @cpfCliente) like @cpfCliente)
    begin
		Declare @nome varchar(50)
		Select @nome = (select nomeCliente from tbCliente where cpfCliente like @cpfCliente)
        print ('Impossivel remover esse cliente pois o cliente: ' +@nome+ ' possui encomendas')
    end
    else
    BEGIN
       DELETE from tbCliente
       WHERE codCliente = (select codCliente from tbCliente where cpfCliente like @cpfCliente)
	   Declare @nome1 varchar(50)
		Select @nome1 = (select nomeCliente from tbCliente where cpfCliente like @cpfCliente)
        print ('cliente: ' +@nome1+ ' deletado com sucesso')
    END
END

EXEC spRemoverCliente '34567890123'

exec spRemoverCliente '23456789012'

exec spRemoverCliente '56789012345'


--exercicio H
create procedure spRemoverencomenda
@encomenda varchar(50),
@produto varchar(50)
as
BEGIN
    if ((select dataEntregaEncomenda from tbEncomenda where @encomenda like codEncomenda) > GETDATE())
    begin
		dELETE from tbItensEncomenda
        WHERE @encomenda like codEncomenda and @produto like codProduto
        print ('produto: ' +@produto+ ' deletado com sucesso')
    end
    else
    BEGIN
		print ('o produto ou a encomenda não existe')
    END
END

exec spRemoverencomenda '1','10'