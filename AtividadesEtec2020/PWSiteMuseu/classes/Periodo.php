<?php

   class Periodo{
      private $idPeriodo;
      private $descPeriodo;

      public function getIdPeriodo(){
         return $this->idPeriodo;
      }

      public function setIdPeriodo($idPeriodo){
         $this->idPeriodo = $idPeriodo;
      }

      public function getDescPeriodo(){
         return $this->descPeriodo;
      }

      public function setDescPeriodo($descPeriodo){
         $this->descPeriodo = $descPeriodo;
      }

      public function cadastrar($periodo){
         $conexao = Conexao::pegarConexao();
         $stmt = $conexao->prepare("INSERT INTO tbperiodo(descPeriodo)
                                       VALUES (?)");
         $stmt->bindParam(1, $periodo->getDescPeriodo());
         $stmt->execute();
         return 'Cadastro do periodo realizado com sucesso!';
      }

      public function listar(){
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT idPeriodo, descPeriodo FROM tbperiodo";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }

   }

?>