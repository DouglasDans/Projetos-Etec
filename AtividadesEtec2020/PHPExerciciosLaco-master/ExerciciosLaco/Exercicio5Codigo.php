<?php
    $k = $_POST['numero'];
    $divisores = 0;
    for($i=1;$i<=$k;$i++){
        if($k%$i==0){
            $divisores = $divisores +1;
        }

    } 
    
        if ($divisores == 2){
            print("<h2>Primo</h2>");
        }else{
            print("<h2>Não é primo </h2>");
        }
        echo("<br><br><a href='Exercicio5.php'> <input type = 'submit' value = 'voltar'></a>");

?>