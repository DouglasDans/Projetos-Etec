<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <!-- bootstrap, se quiser ativar depois, ta bugando um pouco -->
    <link rel="stylesheet" href="../css/Style.css" />
    <title>Translate - Home</title>
</head>

<body>
    <?php
        include_once('../global.php');
        include_once('sentinela.php');
        include_once('../classes/Console.php');
        include_once('../classes/Conexao.php');
        try{
            $console = new Console();
            $listaconsoles = $console->listar();
        }catch(Exception $e){
            echo 'Erro: '.$e->getMessage();
        }
    ?>

    <header id="header">

        <div>
            <img class="LogoBatata" src="../images/177164.png" />
            <a href="../index.php" id="logo">Potato Games</a>
        </div>

        <nav id="nav">
            <ul id="menu">
                <li><a href="../Sobre.php">Sobre</a></li>
                <li><a href="#">Logoff</a>
                </li>
            </ul>
        </nav>
    </header>




    <section class="flex">
        <div class="card-form">
            <div>
                <h1>Adicionar</h1>
            </div>
            <form method="POST" action="../inserir-console.php" class="add-form" name="InserirConsole">
                <label for="txtNome">Nome do Console</label>
                <input type="text" name="txtNome" id="txtNome">
                <label for="txtFabricante">Fabricante</label>
                <input type="text" name="txtFabricante" id="txtFabricante">
                <label for="txtData">Ano de lançamento</label>
                <input type="number" name="txtData" id="txtData">
                <label for="txtGeracao">Geração do Console</label>
                <input type="number" name="txtGeracao" id="txtGeracao">
                <label for="txtQntdVendas">Quantidade de vendas (Em milhões)</label>
                <input type="number" name="txtQntdVendas" id="txtQntdVendas">
                <label for="txtDesc">Descrição</label>
                <textarea name="txtDesc" id="txtDesc" cols="30" rows="7"></textarea>
                <label for="txtDesc">Endereço da imagem (URL ou endereço local)</label>
                <input type="text" name="txtImg" id="txtImg">
                <button type="submit" value="InserirConsole" id="validar" name="validar">Validar</button>
            </form>
        </div>
        <div class="card-form">
            <div>
                <h1>Editar</h1>
            </div>
            <form method="POST" action="../alterar-console.php" class="add-form" name="AlterarConsole">
                <label for="funfa">Código</label>
                <input type="text" name="funfa" id="funfa" value="<?php echo @$_GET['IdConsole']; ?>">
                <label for="txtNome">Nome do Console</label>
                <input type="text" name="txtNome" id="txtNome" value="<?php echo @$_GET['nomeConsole']; ?>">
                <label for="txtFabricante">Fabricante</label>
                <input type="text" name="txtFabricante" id="txtFabricante"
                    value="<?php echo @$_GET['nomeFabricante']; ?>">
                <label for="txtData">Ano de lançamento</label>
                <input type="number" name="txtData" id="txtData" value="<?php echo @$_GET['dataLancConsole']; ?>">
                <label for="txtGeracao">Geração do Console</label>
                <input type="number" name="txtGeracao" id="txtGeracao" value="<?php echo @$_GET['geracaoConsole']; ?>">
                <label for="txtQntdVendas">Quantidade de vendas (Em milhões)</label>
                <input type="number" name="txtQntdVendas" id="txtQntdVendas"
                    value="<?php echo @$_GET['qntdVendasConsole']; ?>">
                <label for="txtDesc">Descrição</label>
                <textarea name="txtDesc" id="txtDesc" cols="30" rows="4"><?php echo @$_GET['descConsole']; ?></textarea>
                <label for="txtDesc">Endereço da imagem (URL ou endereço local)</label>
                <input type="text" name="txtImg" id="txtImg" value="<?php echo @$_GET['imgConsole']; ?>">
                <button type="submit" value="AlterarConsole" id="validar" name="validar">Validar</button>
            </form>
        </div>
    </section>



    <section class="flex">
        <?php
                $i = 0;
                foreach ($listaconsoles as $linha){
                    $i++;
            ?>
        <div class="cartao">
            <div class="cd-body">
                <div>
                    <h5><?php echo $linha['nomeFabricante'] ?></h5>
                    <h1><?php echo $linha['nomeConsole'] ?></h1>
                    <h6 class="info-data">Lançado em <?php echo $linha['dataLancConsole'] ?></h6>
                    <h6 class="info-geracao">Console de <?php echo $linha['geracaoConsole'] ?>° Geração</h6>
                    <h6 class="info-vendas"><?php echo $linha['qntdVendasConsole'] ?> Milhões de unidades vendidas</h6>
                </div>
                <div class='botoes-concard'>
                    <?php
                            echo "<a class='button-selecionar' href='?IdConsole={$linha['IdConsole']}&descConsole={$linha['descConsole']}&geracaoConsole={$linha['geracaoConsole']}&nomeFabricante={$linha['nomeFabricante']}&dataLancConsole={$linha['dataLancConsole']}&nomeConsole={$linha['nomeConsole']}&qntdVendasConsole={$linha['qntdVendasConsole']}&imgConsole={$linha['imgConsole']}'>";
                                echo "Editar dados";
                            echo "</a>";
                        ?>
                    <?php
                            echo "<a class='button-selecionar' href='pdf.php?IdConsole={$linha['IdConsole']}&descConsole={$linha['descConsole']}&geracaoConsole={$linha['geracaoConsole']}&nomeFabricante={$linha['nomeFabricante']}&dataLancConsole={$linha['dataLancConsole']}&nomeConsole={$linha['nomeConsole']}&qntdVendasConsole={$linha['qntdVendasConsole']}&imgConsole={$linha['imgConsole']}'>";
                                echo "Gerar PDF";
                            echo "</a>";
                        ?>

                    <?php 
                        echo "<a class='button-excluir' href='../excluir-console.php?IdConsole=$linha[IdConsole]' class='btn btn-danger'>";
                            echo "Excluir";
                        echo "</a>"
                    ?>
                </div>
            </div>
        </div>
        <?php
                }
            ?>
    </section>


    <footer>

    </footer>










    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous">
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
    </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
    </script>

    <script>



    </script>

</body>

</html>