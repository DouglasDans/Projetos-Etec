<?php
     $nome = $_POST['txtnome'];
     $sl = $_POST['sl'];
    $slCategoria = $_POST['slCategoria'];
     switch($slCategoria){
        case 1:
            $resp = $sl + ($sl*15)/100;
            print ("Seu salario é: ".$resp);
        break;
        case 2:
            if ($sl >= 1500.00 && $sl <= 1750.00){
                $resp = $sl + ($sl*12)/100;
                print ("Seu salario é: ".$resp); 
            }else if ($sl > 1750.00 && $sl <= 2000.00){
                $resp = $sl + ($sl*10)/100;
                print ("Seu salario é: ".$resp); 
            }else if ($sl > 2000.00 && $sl <= 3000.00){
                $resp = $sl + ($sl*7)/100;
                print ("Seu salario é: ".$resp); 
            }else if ($sl > 3000.00){
                $resp = $sl + ($sl*5)/100;
                print ("Seu salario é: ".$resp); 
            }
        break;
        default:
            print("Não");
     }
     echo("<br><br><a href='Exercicio3.php'> <input type = 'submit' value = 'voltar'></a>")



?>