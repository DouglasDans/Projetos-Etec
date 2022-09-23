<?php
    $vetor = array(12,11,54,23,1,7,4,3,14,35,65,78,88,8,888,8888);
    print ("Vetor Normal <br>");
    print_r($vetor);
    print ("<br><br>");
    print ("Vetor em ordem crescente");
    $crescenteVetor = array();
    for ($i=0;$i<16;$i++) {
        $crescente=0;
        for($k=0;$k<16;$k++) {
          if ($vetor[$i]>$vetor[$k])
              $crescente++;
        }
        $crescenteVetor[$crescente]= $vetor[$i];
     }
     print("<br>");
     for ($i=0;$i<16;$i++) {
        print_r($crescenteVetor[$i]);
        print(" --- ");
     }

     print('<br><br><br><a href="index.php"> <input type = "submit" value = "voltar para Index"></a>');
?>