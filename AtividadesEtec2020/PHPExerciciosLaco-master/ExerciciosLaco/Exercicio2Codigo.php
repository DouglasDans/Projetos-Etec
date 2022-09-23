<?php
    $nome = $_POST['txtnome'];
    $n1 = $_POST['n1'];
    $n2 = $_POST['n2'];
    $n3 = $_POST['n3'];
    $n4 = $_POST['n4'];

    $r = 0;

    $r = ($n1+$n2+$n3+$n4)/4;
    if ($r < 4.9) {
        print ("O aluno: ".$nome." Foi retido");
    }else if ($r > 5.0 && $r < 6.9){
        print ("O aluno: ".$nome." Está em exame");
    }else if ($r > 7.0){
        print ("O aluno: ".$nome." Foi promovido");
    } 
    print("<br>Sua média é: ".$r);

    echo("<br><br><a href='Exercicio2.php'> <input type = 'submit' value = 'voltar'></a>")
?>