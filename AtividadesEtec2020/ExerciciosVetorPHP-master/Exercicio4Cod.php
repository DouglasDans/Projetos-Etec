<?php
    $vetor = array(12,11,54,23,1,7,4,3,8,35,65,78,88,8,888,8888);
    print ("Vetor Normal <br>");
    print_r($vetor);
    print ("<br><br>");
    print ("Vetor Invertido <br>");
    $vsize = count($vetor);
    $crescenteVetor = array();
    for ($i=0;$i<$vsize;$i++) {
        $crescenteVetor[$i] = $vetor[15-$i];
     }
     print_r($crescenteVetor);



     print('<br><br><br><a href="index.php"> <input type = "submit" value = "voltar para Index"></a>');
?>