<?php
    $base = $_POST['base'];
    $Exp = $_POST['Exp'];
    $resp = $base;
    for($i=1;$i<$Exp;$i++){
        $resp = $resp*$base;
        
    }
    print($resp);

    echo("<br><br><a href='Exercicio4.php'> <input type = 'submit' value = 'voltar'></a>")
?>