<?php
    $vetor = array($_POST['nome'],$_POST['cpf'],$_POST['dt'], $_POST['rg'],$_POST['turma'],"","");
    $vetor2 = array("Nome: ","CPF: ","Data de Nascimento: ","RG: ","Turma: ","","");
    $size = count($vetor)-2;
    for($i=0; $i<=$size; $i++){
        print($vetor2[$i]);
        print($vetor[$i]."<br>");
    }
?>