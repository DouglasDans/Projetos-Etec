<?php

    include_once('Conexao.php');

    class Console{
        private $idConsole;
        private $dataLancConsole;
        private $descConsole;
        private $nomeConsole;
        private $qntdVendasConsole;
        private $geracao;
        private $fabricante;

        public function getIdConsole(){
            return $this->idConsole;
        }
    
        public function setIdConsole($idConsole){
            $this->idConsole = $idConsole;
        }
        
        public function getGeracao(){
            return $this->geracaoConsole;
        }
    
        public function setGeracao($geracao){
            $this->geracaoConsole = $geracao;
        }

        public function getFabricante(){
            return $this->nomeFabricante;
        }
    
        public function setFabricante($fabricante){
            $this->nomeFabricante = $fabricante;
        }
    
        public function getDataLancConsole(){
            return $this->dataLancConsole;
        }
    
        public function setDataLancConsole($dataLancConsole){
            $this->dataLancConsole = $dataLancConsole;
        }
    
        public function getDescConsole(){
            return $this->descConsole;
        }
    
        public function setDescConsole($descConsole){
            $this->descConsole = $descConsole;
        }
    
        public function getNomeConsole(){
            return $this->nomeConsole;
        }
    
        public function setNomeConsole($nomeConsole){
            $this->nomeConsole = $nomeConsole;
        }
    
        public function getQntdVendasConsole(){
            return $this->qntdVendasConsole;
        }
    
        public function setQntdVendasConsole($qntdVendasConsole){
            $this->qntdVendasConsole = $qntdVendasConsole;
        }

        public function inserir($console){
            $conexao = Conexao::conectar();
            $stmt = $conexao->prepare("INSERT INTO tbconsoles (nomeConsole, descConsole, dataLancConsole, qntdVendasConsole, nomeFabricante, geracaoConsole)
            VALUES (?,?,?,?,?,?)");
            $stmt->bindValue(1, $console->getNomeConsole());
            $stmt->bindValue(2, $console->getDescConsole());
            $stmt->bindValue(3, $console->getDataLancConsole());
            $stmt->bindValue(4, $console->getQntdVendasConsole());
            $stmt->bindValue(5, $console->getFabricante());
            $stmt->bindValue(6, $console->getGeracao());
            $stmt->execute();
        }

        public function alterar($console){
            $conexao = Conexao::conectar();
            $stmt = $conexao->prepare("UPDATE tbConsole SET nomeConsole = '?', descConsole = '?', qntdVendasConsole = '?',dataLancConsole = '?',nomeFabricante = '?',geracaoConsole = '?' WHERE IdConsole = ?");
            $stmt->bindParam(1, $console->getNomeConsole());
            $stmt->bindParam(2, $console->getDescConsole());
            $stmt->bindParam(3, $console->getQntdVendasConsole());
            $stmt->bindParam(4, $console->getDataLancConsole());
            $stmt->bindParam(5, $console->getFabricante());
            $stmt->bindParam(6, $console->getGeracao());
            $stmt->bindParam(7, $console->getIdConsole());
            $stmt->execute();
        }

        public function listar(){
            $conexao = Conexao::conectar();
            $querySelect = 'SELECT * FROM `tbconsoles`';
            $resultado = $conexao->query($querySelect);
            $lista = $resultado->fetchAll();
            return $lista;
        }

        public function deletar($idConsole){
            $conexao = Conexao::conectar();
            $stmt = $conexao->prepare("DELETE FROM tbConsole WHERE IdConsole= ".$idConsole);
            $stmt->execute();
        }
    }

?>