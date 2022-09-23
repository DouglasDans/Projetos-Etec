<?php

   require_once 'global.php';

   try{
      header("Location: area-restrita/cadastrar-periodo.php");
      $periodo = new Periodo();
      $periodo->setDescPeriodo($_POST['txtPeriodoObra']);
      echo $periodo->cadastrar($periodo);
   }
   catch(Exception $e){
      echo '<pre>';
         print_r($e);
      echo '</pre>';
      echo $e->getMessage();
   }

?>