<?php

    require_once 'global.php';
    require_once 'classes/Conexao.php';

    header("Location: restrito/adm.php");
        
    $id = $_GET['IdConsole'];
    
    try{
        
        $conexao = Conexao::conectar();
        $queryDelete = "DELETE FROM tbconsoles WHERE IdConsole = $id";
        $conexao->query($queryDelete);
        /*
        $stmt = $conexao->prepare("UPDATE tbtermo SET nomeTermo = '$nome', descTermo = '$desc' WHERE idTermo = $id");
        $stmt->execute();
        */
    }
    catch(Exception $e){
        echo 'Erro: '.$e->getMessage();
    }

?>