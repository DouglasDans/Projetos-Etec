<?php
    $k = $_POST['numero']; 
    $ant=0;
    $p=1;
    $i = 1;
    print("Resultado 1 <br>");
    while($i < $k){
        $a=$ant+$p;
        print("Resultado ".$a."<br>");
        $ant=$p;
        $p=$a;
        $i++;
    }
    echo("<br><br><a href='Exercicio6.php'> <input type = 'submit' value = 'voltar'></a>")
?>