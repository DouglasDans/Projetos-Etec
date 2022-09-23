<html>
    <head>
        <title>formulario detran</title>
    </head>
    <body>
        <form method="post" action="VerificarMaiorIdade.php">
            <label>nome:</label>
            <input type = "text"  name = "txtnome" id = "txtnome">
            <br>
            <label>ano de nascimento:</label>
            <input type = "number" name = "anonascimento" id = "anonascimento">
            <br>
            <label>cpf:</label>
            <input type  = "number" name  = "cpf" id = "cpf">
            <br>
            <label>categoria:</label>
            <select name = "slCategoria" id = "slCategoria">
                <option value = "1">categoria A -moto</option>
                <option value = "2">categoria B -veiculo</option>
                <option value = "3">categoria C -transporte remunerado</option>
                <option value = "4">categoria D -caminhão</option>
                <option value = "5">categoria E -ônibus e mega caminhão</option>
            </select>
            <br>
            <input type = "submit" value = "verificar">
        
        </form>
        <a href="index.html"> <input type = "submit" value = "voltar para Index"></a>
    </body>
</html>
