<?php
    $numero = $_GET['numero'];
    $vetor = array(12,11,54,23,1,7,4,3,14,35,65,78,88,8,888,8888);
    print ("Vetor Normal <br>");
    print_r($vetor);
    $count = false;
    print ("<br><br>");
    for ($i=0;$i<15;$i++) {
        if ($numero == $vetor[$i]){
            $count= true;
        } 
     }
     if ($count == true){
        print("'".$numero."' tem neste vetor");
     }else{
        print("'".$numero."' não existe neste vetor");
     }



     print('<br><br><br><a href="index.php"> <input type = "submit" value = "voltar para Index"></a>');
?>