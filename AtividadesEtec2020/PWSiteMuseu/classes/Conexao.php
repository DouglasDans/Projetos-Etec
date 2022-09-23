<?php

   class Conexao{
      public static function pegarConexao(){

         // Conexão Local

         /*
         
         $conexao = new PDO("mysql:host=localhost:3307;
                              dbname=bdmuseudali;",
                              "root",
                              "");
         
         */

         // Conexão Online

         
         $conexao = new PDO("mysql:host=localhost;
                              dbname=id15575215_bdmuseudali",
                              "id15575215_admbanco",
                              "Qigl+SosSze5&)s@");
      

         $conexao->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
         $conexao->exec("SET CHARACTER SET utf8");
         return $conexao;
      }
   }

?>