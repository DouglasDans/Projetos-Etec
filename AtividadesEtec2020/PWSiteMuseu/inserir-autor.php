<?php

   require_once 'global.php';

   try{
      header("Location: area-restrita/cadastrar-autor.php");
      $autor = new Autor();
      $autor->setNomeAutor($_POST['txtNomeAutor']);
      $autor->setDataNascAutor($_POST['txtDataNascAutor']);
      echo $autor->cadastrar($autor);
   }
  catch(Exception $e){
      echo '<pre>';
         print_r($e);
      echo '</pre>';
      echo $e->getMessage();
   }

?>