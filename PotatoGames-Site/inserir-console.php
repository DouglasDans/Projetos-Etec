<?php

    require_once('global.php');
    require_once('classes/Conexao.php');
    require_once('classes/Console.php');

    try{
        
        header("Location: restrito/adm.php");
        $conexao = Conexao::conectar();
            $stmt = $conexao->prepare("INSERT INTO tbconsoles (dataLancConsole, descConsole, geracaoConsole, imgConsole, nomeConsole, nomeFabricante, qntdVendasConsole )
            VALUES (?,?,?,?,?,?,?)");
            $stmt->bindValue(1, $_POST['txtData']);
            $stmt->bindValue(2, $_POST['txtDesc']);
            $stmt->bindValue(3, $_POST['txtGeracao']);
            $stmt->bindValue(4, $_POST['txtImg']);
            $stmt->bindValue(5,$_POST['txtNome']);
            $stmt->bindValue(6, $_POST['txtFabricante']);
            $stmt->bindValue(7, $_POST['txtQntdVendas']);
            $stmt->execute();

            // $console->setNomeConsole($_POST['txtNome']);
            // $console->setFabricante($_POST['txtFabricante']);
            // $console->setDataLancConsole($_POST['txtData']);
            // $console->setGeracao($_POST['txtGeracao']);
            // $console->setQntdVendasConsole($_POST['txtQntdVendas']);
            // $console->setDescConsole($_POST['txtDesc']);

    }
    catch(Exception $e){
        echo 'Erro: '.$e->getMessage();
    }

?>