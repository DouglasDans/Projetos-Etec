<html>
    <head>
        <title>formulario Salario</title>
    </head>
    <body>
        <form method="post" action="Exercicio3Codigo.php">
            <label>nome:</label>
            <input type = "text"  name = "txtnome" id = "txtnome">
            <br>
            <label>nome do departamento:</label>
            <select name = "slCategoria" id = "slCategoria">
                <option value = "1">Operacional</option>
                <option value = "2">Desenvolvimento</option>
            </select>
            <br>
            <label>salario:</label>
            <input type = "number" name = "sl" id = "sl">
            <br>
            <input type = "submit" value = "calcular">
        </form>
        <a href="index.html"> <input type = "submit" value = "voltar para Index"></a>
    </body>
</html>
