<?php
            $idConsole = $_GET['IdConsole'];
            $dataLancConsole = $_GET['dataLancConsole'];
            $descConsole = $_GET['descConsole'];
            $nomeConsole = $_GET['nomeConsole'];
            $qntdVendasConsole = $_GET['qntdVendasConsole'];
            $geracao = $_GET['geracaoConsole'];
            $fabricante = $_GET['nomeFabricante'];
            $imgConsole = $_GET['imgConsole'];
    

            use Dompdf\Dompdf;

            require_once("../dompdf//autoload.inc.php");

            $dompdf = new DOMPDF();

            $dompdf->load_html("
                <style>
                    *{
                        font-family: sans-serif
                    }
                </style>
                <h1>Consulta de dados em PDF</h1>
                <h5>Código: $idConsole </h5>
                <h5>Fabricado por: $fabricante</h5>
                <h5>Nome: $nomeConsole</h5>
                <h5>Lançamento: $dataLancConsole</h5>
                <h5>Geração: $geracao</h5>
                <h5>Quantidade de vendas: $qntdVendasConsole</h5>
                <h5>URL da imagem do front-end: $imgConsole</h5>
                <h5>Descrição: $descConsole</h5>
            ");

            $dompdf->setPaper('A4','portrait');

            $dompdf->render();

            $dompdf->stream(
                "certificado.pdf",
                array(
                    "Attachment" => false
                )
            );
        ?>