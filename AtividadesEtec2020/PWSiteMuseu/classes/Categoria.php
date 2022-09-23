<?php

   class Categoria{
      private $idCategoria;
      private $descCategoria;

      public function getIdCategoria(){
         return $this->idCategoria;
      }

      public function setIdCategoria($idCategoria){
         $this->idCategoria = $idCategoria;
      }

      public function getDescCategoria(){
         return $this->descCategoria;
      }

      public function setDescCategoria($descCategoria){
         $this->descCategoria = $descCategoria;
      }
      
      public function cadastrar($categoria){
         $conexao = Conexao::pegarConexao();
         $stmt = $conexao->prepare("INSERT INTO tbcategoria(descCategoria)
            VALUES(?)");
         $stmt->bindParam(1, $categoria->getDescCategoria());
         $stmt->execute();
         return 'Cadastro da categoria realizado com sucesso!';
      }

      public function listar(){ 
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT idCategoria, descCategoria FROM tbcategoria";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }
      
   }

?>