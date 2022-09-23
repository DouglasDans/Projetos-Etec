<?php

   class Autor{
      private $idAutor;
      private $nomeAutor;
      private $dataNascAutor;

      public function getIdAutor(){
         return $this->idAutor;
      }

      public function setIdAutor($idAutor){
         $this->idAutor = $idAutor;
      }

      public function getNomeAutor(){
         return $this->nomeAutor;
      }

      public function setNomeAutor($nomeAutor){
         $this->nomeAutor = $nomeAutor;
      }

      public function getDataNascAutor(){
         return $this->dataNascAutor;
      }

      public function setDataNascAutor($dataNascAutor){
         $this->dataNascAutor = $dataNascAutor;
      }
      
      public function cadastrar($autor){
         $conexao = Conexao::pegarConexao();
         $stmt = $conexao->prepare("INSERT INTO tbautor
         (nomeAutor, dataNascAutor)
            VALUES(?, ?)");
         $stmt->bindParam(1, $autor->getNomeAutor());
         $stmt->bindParam(2, $autor->getDataNascAutor());
         $stmt->execute();
         return 'Cadastro do autor realizado com sucesso!';
      }

      public function listar(){
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT idAutor, nomeAutor FROM tbautor";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }

   }

?>