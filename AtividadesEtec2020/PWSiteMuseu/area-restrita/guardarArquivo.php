<?php

   try{
      header("Location: ../obras.php");

      require_once 'global-interno.php';

      $imagem = new Imagem();

      $imagem->setIdObra($_POST['txtIdObra']);
      $imagem->setDescImagem($_POST['txtDescImagem']);
      $imagem->setNomeImagem($_FILES['arqImagem']['name']);
      $arquivo = $_FILES['arqImagem']['tmp_name'];
      $imagem->setCaminhoImagem("../img/obras/");
      move_uploaded_file($arquivo, $imagem->getCaminhoImagem().$imagem->getNomeImagem());
      $imagem->setCaminhoImagem("img/obras/");
      $imagem->setCaminhoImagem($imagem->getCaminhoImagem().$imagem->getNomeImagem());
      echo $imagem->cadastrar($imagem);

   }catch(Exception $e){
      echo '<pre>';
      print_r($e);
      echo '</pre>';
      echo $e->getMessage();
   }

?>