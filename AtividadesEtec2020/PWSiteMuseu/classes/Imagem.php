<?php

   class Imagem{
      private $idImagem;
      private $descImagem;
      private $nomeImagem;
      private $caminhoImagem;
      private $idObra;

      public function getIdImagem(){
         return $this->idImagem;
      }

      public function setIdImagem($idImagem){
         $this->idImagem = $idImagem;
      }

      public function getDescImagem(){
         return $this->descImagem;
      }

      public function setDescImagem($descImagem){
         $this->descImagem = $descImagem;
      }

      public function getNomeImagem(){
         return $this->nomeImagem;
      }

      public function setNomeImagem($nomeImagem){
         $this->nomeImagem = $nomeImagem;
      }

      public function getCaminhoImagem(){
         return $this->caminhoImagem;
      }

      public function setCaminhoImagem($caminhoImagem){
         $this->caminhoImagem = $caminhoImagem;
      }

      public function getIdObra(){
         return $this->idObra;
      }

      public function setIdObra($idObra){
         $this->idObra = $idObra;
      }

      public function cadastrar($imagem){
         $conexao = Conexao::pegarConexao();
         $stmt = $conexao->prepare("INSERT INTO tbimagem (descImagem, nomeImagem, caminhoImagem, idObra)
                                       VALUES (?, ?, ?, ?)");
         $stmt->bindParam(1, $imagem->getDescImagem());
         $stmt->bindParam(2, $imagem->getNomeImagem());
         $stmt->bindParam(3, $imagem->getCaminhoImagem());
         $stmt->bindParam(4, $imagem->getIdObra());
         $stmt->execute();
         return 'Cadastro da Imagem realizado com sucesso!'; 
      }

      public function listar(){
         $conexao = Conexao::pegarConexao();
         $querySelect = "SELECT descImagem, caminhoImagem, tbimagem.idObra FROM tbimagem 
                           WHERE tbimagem.idObra = (SELECT DISTINCT idObra FROM tbobra)";
         $resultado = $conexao->query($querySelect);
         $lista = $resultado->fetchAll();
         return $lista;
      }

   }

?>