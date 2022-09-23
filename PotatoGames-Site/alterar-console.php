<?php

    require_once 'global.php';
    require_once 'classes/Conexao.php';

    header("Location: restrito/adm.php");
        

    
    try{
        header("Location: restrito/adm.php");
        // dataLancConsole, descConsole, geracaoConsole, imgConsole, nomeConsole, nomeFabricante, qntdVendasConsole
        $conexao = Conexao::conectar();
            $stmt = $conexao->prepare("UPDATE tbconsoles SET dataLancConsole = ?,descConsole = ?,geracaoConsole = ?,imgConsole = ?, nomeConsole = ?, nomeFabricante = ?,qntdVendasConsole = ?  WHERE IdConsole = ?");
            $stmt->bindParam(1, $_POST['txtData']);
            $stmt->bindParam(2, $_POST['txtDesc']);
            $stmt->bindParam(3, $_POST['txtGeracao']);
            $stmt->bindParam(4, $_POST['txtImg']);
            $stmt->bindParam(5, $_POST['txtNome']);
            $stmt->bindParam(6, $_POST['txtFabricante']);
            $stmt->bindParam(7, $_POST['txtQntdVendas']);
            $stmt->bindParam(8, $_POST['funfa']);
            $stmt->execute();




        // $conexao = Conexao::conectar();
        // $stmt = $conexao->prepare("UPDATE tbconsole SET
        //     dataLancConsole = $txtData,
        //     descConsole = $txtDesc,
        //     geracaoConsole = $txtGeracao,
        //     imgConsole = $txtImg,
        //     nomeConsole = $txtNome,
        //     nomeFabricante = $txtFabricante,
        //     qntdVendasConsole = $txtQntdVendas
        //     WHERE IdConsole = 16
        //     ");
        // $stmt->execute();
    }
    catch(Exception $e){
        echo 'Erro: '.$e->getMessage();
    }

?>