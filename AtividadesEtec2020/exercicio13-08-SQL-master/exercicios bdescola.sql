use bdEscola

--exercicio 1
create PROCEDURE spVerificaAluno
	@codAluno VARCHAR(10)
AS
BEGIN
	SELECT codAluno, nomeAluno, dataNascimentoAluno from tbAluno
    where @codAluno = tbAluno.codAluno
END	

EXEC spVerificaAluno '1'


--exercicio 2
create PROCEDURE spInsereAluno
	@nome varchar(100), @dataN smalldatetime, @rg varchar(25)
	,@naturalidade varchar(5)
AS
		begin
			INSERT INTO tbAluno(nomeAluno, dataNascimentoAluno, rgAluno,
			naturalidadeAluno)
				VALUES (@nome, @dataN, @rg, @naturalidade)
				declare @codigo int
			set @codigo = (SELECT max(codAluno) from tbAluno)
			print ('Aluno '+@nome+' cadastrado com sucesso! com código '+ convert(varchar(6), @codigo) )
		end

SELECT * FROM tbAluno

EXEC spInsereAluno 'Antonio Junior', '14/07/1990', '117788-x',
	'SP'

EXEC spInsereAluno 'Ana Santiago', '25/11/2000', '8787545',
	'SP'


--exercicio 3
create PROCEDURE spAumenta_Preco
	@nomecurso VARCHAR(30),@porcetagem SMALLMONEY
AS
	begin
            UPDATE tbCurso
            SET tbCurso.valorCurso += (@porcetagem * valorCurso) / 100
            WHERE tbCurso.nomeCurso = @nomecurso
	end



EXEC spAumenta_Preco 'Espanhol',10

SELECT * FROM tbCurso

-- exercicio 4
create PROCEDURE Exibe_Turma
	@nomeThurma VARCHAR(30)
AS
	begin
            SELECT * from tbTurma
            where nomeTurma = @nomeThurma
	end

EXEC Exibe_Turma '1AA'

--exercicio 5
create PROCEDURE Exibe_AlunosdaTurma
	@nomeThurma VARCHAR(30)
AS
	begin
            SELECT nomeTurma, nomeAluno from tbTurma
            iNNER JOIN tbMatricula ON tbTurma.codTurma = tbMatricula.codTurma
            iNNER JOIN tbAluno ON tbMatricula.codAluno = tbAluno.codAluno
            where nomeTurma = @nomeThurma
	end

EXEC Exibe_AlunosdaTurma '1|A'



--exercicios lista 2
-- exercicio 1
create PROCEDURE spInsereAlunoLista2
	@nome varchar(100), @dataN smalldatetime, @rg varchar(25)
	,@naturalidade varchar(5)
AS
	begin
		IF EXISTS(SELECT codAluno FROM tbAluno WHERE rgAluno like @rg)
		begin
			print('Impossivel cadastrar. Aluno cpf '+@rg+' já cadastrado')
		end
		else
		begin
			INSERT INTO tbAluno(nomeAluno, dataNascimentoAluno, rgAluno,
			naturalidadeAluno)
				VALUES (@nome, @dataN, @rg, @naturalidade)
				declare @codigo int
			set @codigo = (SELECT max(codAluno) from tbAluno)
			print ('Aluno '+@nome+' cadastrado com sucesso! com código '+ convert(varchar(6), @codigo) )
		end
	end


EXEC spInsereAlunoLista2 'AntoniJunioro ', '14/07/1990', '117768-x',
	'SP'

SELECT * FROM tbAluno

--exercicio 2

after PROCEDURE AddAluno
	@nomeCurso VARCHAR(30), @nomeAluno VARCHAR(100)
AS
	begin
		IF (@nomeCurso == 'Ingles')	
		BEGIN
			insert into tbMatricula(dataMatricula,codAluno,codTurma)
			values('10/03/2077',
			(SELECT codAluno from tbAluno
			WHERE nomeAluno = @nomeAluno),1)
		END
		else IF (@nomeCurso == 'Alemao')
		BEGIN
			insert into tbMatricula(dataMatricula,codAluno,codTurma)
			values('10/03/2077',
			(SELECT codAluno from tbAluno
			WHERE nomeAluno = @nomeAluno),'1')
		END
		else IF (@nomeCurso == 'Espanhol')
		BEGIN
			insert into tbMatricula(dataMatricula,codAluno,codTurma)
			values('10/03/2077',
			(SELECT codAluno from tbAluno
			WHERE nomeAluno = @nomeAluno),1)
		END
	End	

EXEC AddAluno 'Espanhol','AntoniJunioro' 

SELECT * from tbMatricula