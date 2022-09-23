<?php
    $k = $_POST['numero'];
    $LimiteFor = 100;
    for($i = 1; $i <= $k; $i++){
        if ($k % $i == 0) print($i." -- Multiplo de ".$k."<br>");
    }
    echo("<br><br><a href='Exercicio7.php'> <input type = 'submit' value = 'voltar'></a>")
?>