<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css" />
    <title>Home - Potato Games</title>

    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        google.charts.load('current', {
            'packages': ['corechart']
        });
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {

            var data = google.visualization.arrayToDataTable([
                ['Task', 'Hours per Day'],
                ['1. Playstation 2', 155],
                ['2. Playstation 4', 108],
                ['3. Playstation one', 102],
                ['4. Nintendo Wii', 101],
                ['5. Playstation 3', 86],
                ['6. Xbox 360', 85],
                ['7. Nintendo Entertainment System', 61],
                ['8. Nintendo Switch', 55],
                ['9. Super Nintendo', 50],
                ['10. Xbox One', 46],
            ]);

            var options = {
                title: 'Consoles mais vendidos da história',
                'width': 700,
                'height': 400,
                'backgroundColor': '#42464d',
                'backgroundColor.stroke': '#fff',


            };

            var chart = new google.visualization.PieChart(document.getElementById('piechart'));

            chart.draw(data, options);
        }
    </script>
</head>

<body>

    <header id="header">

        <div>
            <img class="LogoBatata" src="images/177164.png" />
            <a href="index.php" id="logo">Potato Games</a>
        </div>

        <nav id="nav">
            <ul id="menu">
                <li><a href="Sobre.php">Sobre</a></li>
                <li><a href="login.php">Login</a></li>
            </ul>
        </nav>
    </header>

    <?php
        include_once('global.php');
        try{
            $console = new Console();
            $listaconsoles = $console->listar();
        }catch(Exception $e){
            echo 'Erro: '.$e->getMessage();
        }
    ?>

    <div class="section-top">
        <div class="content">
            <h1>Quem vendeu mais consoles?</h1>
            <p>Conheça os consoles mais vendidos da história da indústria dos games</p>
            <div style="position:relative;width:100%">
                <div id="piechart" class="Grafico"></div>
            </div>

        </div>
    </div>

    <div class="Painel">
        <ul id="menu">
            <li><a href="Sobre.php">1.</a></li>
            <li><a href="Sobre.php">2.</a></li>
            <li><a href="Sobre.php">3.</a></li>
            <li><a href="Sobre.php">4.</a></li>
            <li><a href="Sobre.php">5.</a></li>
            <li><a href="Sobre.php">6.</a></li>
            <li><a href="Sobre.php">7.</a></li>
            <li><a href="Sobre.php">8.</a></li>
            <li><a href="Sobre.php">9.</a></li>
            <li><a href="Sobre.php">10.</a></li>
        </ul>
    </div>

    <div class="Main">
        <?php
            $conexao = Conexao::conectar();
            $resultado = $conexao->query("SELECT dataLancConsole, descConsole, geracaoConsole, imgConsole, nomeConsole, nomeFabricante, qntdVendasConsole FROM tbConsoles ORDER BY qntdVendasConsole");
            $listaconsoles = $resultado->fetchAll();
            foreach($listaconsoles as $linha){
        ?>

        <div class="cardConsole">
            <div class="ImgMain">
                <img src="<?php echo $linha['imgConsole'] ?>" alt="" class="">
            </div>



            <div class="Colocacoes">
                <h4><?php echo $linha['nomeFabricante'] ?></h4>
                <h1><?php echo $linha['nomeConsole'] ?></h1>
                <h6>Lançado em <?php echo $linha['dataLancConsole'] ?></h6>
                <h6>Console de <?php echo $linha['geracaoConsole'] ?>° Geração</h6>
                <h4 class="TituloMain"><?php echo $linha['qntdVendasConsole'] ?> Milhões de Unidades Vendidas</h4>

                <p class="textoMain"><?php echo $linha['descConsole'] ?></p>
            </div>
        </div>

        <?php
            }
        ?>
    </div>

</body>

</html>