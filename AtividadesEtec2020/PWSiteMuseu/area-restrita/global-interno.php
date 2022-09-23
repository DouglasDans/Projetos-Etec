<?php

   spl_autoload_register('chamarClasse');

   function chamarClasse($nomeClasse){
      if(file_exists('../classes/' . $nomeClasse . '.php')){
         require_once '../classes/' . $nomeClasse . '.php';
      }
   }

?>