<?php

   class Obra{
      private $idObra;
      private $nomeObra;
      private $anoObra;
      private $idCategoria;
      private $idPeriodo;
      private $idAutor;

      public function getIdObra(){
         return $this->idObra;
      }

      public function setIdObra($idObra){
         $this->idObra = $idObra;
      }

      public function getNomeObra(){
         return $this->nomeObra;
      }

      public function setNomeObra($nomeObra){
         $this->nomeObra = $nomeObra;
      }

      public function getIdCategoria(){
         return $this->idCategoria;
      }

      public function setIdCategoria($idCategoria){
         $this->idCategoria = $idCategoria;
      }

      public function getIdPeriodo(){
         return $this->idPeriodo;
      }

      public function setIdPeriodo($idPeriodo){
         $this->idPeriodo = $idPeriodo;
      }

      public function getAnoObra(){
         return $this->anoObra;
      }

      public function setAnoObra($anoObra){
         $this->anoObra = $anoObra;
      }

      public function getIdAutor(){
         return $this->idAutor;
      }

      public function setIdAutor($idAutor){
         $this->idAutor = $idAutor;
      }

      public function cadastrar($obra){
         $conexao = Conexao::pegarConexao();
         $stmt = $conexao->prepare("INSERT INTO tbobra (nomeObra, anoObra, idCategoria, idPeriodo, idAutor)
                                       VALUES (?, ?, ?, ?, ?)");
         $stmt->bindParam(1, $obra->getNomeObra());
         $stmt->bindParam(2, $obra->getAnoObra());
         $stmt->bindParam(3, $obra->getIdCategoria());
         $stmt->bindParam(4, $obra->getIdPeriodo());
         $stmt->bindParam(5, $obra->getIdAutor());
         $stmt->execute();
         return 'Cadastro da obra realizado com sucesso!';
      }

      public function listar(){
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT idObra, nomeObra, anoObra, descCategoria, descPeriodo, nomeAutor FROM tbobra
                              INNER JOIN tbcategoria
                                 ON tbcategoria.idCategoria = tbobra.idCategoria
                                    INNER JOIN tbperiodo
                                       ON tbperiodo.idPeriodo = tbobra.idPeriodo
                                          INNER JOIN tbautor
                                             ON tbautor.idAutor = tbobra.idAutor";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }

      public function listar2(){
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT nomeObra, anoObra, descCategoria, descPeriodo, nomeAutor, caminhoImagem, descImagem FROM tbobra
                              INNER JOIN tbcategoria
                                 ON tbcategoria.idCategoria = tbobra.idCategoria
                                    INNER JOIN tbperiodo
                                       ON tbperiodo.idPeriodo = tbobra.idPeriodo
                                          INNER JOIN tbautor
                                             ON tbautor.idAutor = tbobra.idAutor
                                                INNER JOIN tbimagem
                                                   ON tbimagem.idObra = tbobra.idObra";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }

   }

?>