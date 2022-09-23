<?php
    $nome = $_POST['txtnome'];
    $anonascimento = $_POST['anonascimento'];
    $cpf = $_POST['cpf'];
    $categoria = $_POST['slCategoria'];

    $anonascimento;
    $anoatual = 2020;

    $id=$anoatual-$anonascimento;
    if($categoria == 1 || $categoria == 2){
        if ($id >=18){
            print("você pode tirar a carteira");
        }else{
            print("você não pode tirar a carteira");
        }
    }else{
        if($id >21){
            print("você pode tirar a carteira");
        }else{
            print("você não pode tirar a carteira");
        }
    }

    switch($categoria){
        case 1:
            echo("<h2>categoria  A -moto</h2>");
            break;
        case 2:
            echo("<h2>categoria  B -veiculo</h2>");
            break;
        case 3:
            echo("<h2>categoria  C -transporte remunerado</h2>");
            break;
        case 4:
            echo("<h2>categoria  D -caminhão</h2>");
            break;
        case 5:
            echo("<h2>categoria  E -ônibus e mega caminhão</h2>");
            break;
        default:
            echo("<h2>categoria invalida</h2>");    
    }
    echo("<br><br><a href='Exercicio1.php'> <input type = 'submit' value = 'voltar'></a>")
?>