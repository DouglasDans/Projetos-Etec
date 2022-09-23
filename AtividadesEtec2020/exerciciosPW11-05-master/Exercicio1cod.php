<?php
    $vetor = array($_GET['num1'],$_GET['num2'],$_GET['num3'],$_GET['num4']);
    print ("Vetor Normal <br>");
    print_r($vetor);
    $vsize = count($vetor)-1;
    print ("<br><br>");
    print ("Vetor inverso <br> ");
    for($i=0; $i <= count($vetor)-1; $i++){
        $inversoVetor[$i]= $vetor[$vsize];
        $vsize--;
    }
    print_r($inversoVetor)
?>