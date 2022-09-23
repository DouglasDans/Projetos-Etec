<?php

   require_once 'global.php';

   try{
      header("Location: area-restrita\cadastrar-obra.php");
      $obra = new Obra();
      $obra->setNomeObra($_POST['txtNomeObra']);
      $obra->setAnoObra($_POST['txtAnoObra']);
      $obra->setIdCategoria($_POST['txtIdCategoria']);
      $obra->setIdPeriodo($_POST['txtIdPeriodo']);
      $obra->setIdAutor($_POST['txtIdAutor']);
      echo $obra->cadastrar($obra);
   }
   catch(Exception $e){
      echo '<pre>';
         print_r($e);
      echo '</pre>';
      echo $e->getMessage();
   }

?>