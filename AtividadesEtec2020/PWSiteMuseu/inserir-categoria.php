<?php

   require_once 'global.php';

   try{
      header("Location: area-restrita/cadastrar-tipo-obra.php");
      $categoria = new Categoria();
      $categoria->setDescCategoria($_POST['txtCategoriaObra']);
      echo $categoria->cadastrar($categoria);
   }
   catch(Exception $e){
      echo '<pre>';
         print_r($e);
      echo '</pre>';
      echo $e->getMessage();
   }

?>