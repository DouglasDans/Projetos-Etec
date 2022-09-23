<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <title>Home - DD Livros</title>
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/istilu.css">
    <link rel="shortcut icon" type="image/x-icon" href="./favicon.ico">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>
    <?php
            include_once("valida-sentinela.php");
        ?>

    <header class="justify-content-end">
        <div class="nav-container justify-content-end ">
            <nav class="navbar navbar-expand-md navbar-white fixed-top p-0 justify-content-end nav-color p-2">
                <div class="container">
                    <a class="nav-link" href="../cont.php"><img src="../img/DD-Paralax.png" height="35px"></a>

                    <ul class="navbar-nav mr-auto nav justify-content-end">
                        <li class="nav-item active">

                        </li>
                    </ul>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <img src="../img/loadsc7.png" class="rounded-circle mr-3" style="height: 30px;" title="Seu Perfil"><font class="mt-3 text-white">Olá Vanessa </font><small><a href="../logout.php" style="top:30px" class="pl-5 position-absolute nav-link text-decoration-none text-white">Sair</a> </small> 
                        </li>
                        <li class="nav-item ">
                            <a class="nav-link carrinho" href="../cont.php"><img src="../img/icone-carrinho.png"
                                    style="height: 40px;">
                                <font class="mt-5">Meu Carrinho</font>
                            </a>
                        </li>

                    </ul>
                </div>
            </nav>

            <nav class="sticky-top position-fixed bg-dark text-white p-0"
                style="width: 100%;margin-top: 56px;height: 40px;">
                <div class="container nav-item navbar text-left navbar-expand-md justify-content">
                    <a class="nav-link" href="../index-area-restrita.php">Home</a>
                    <a class="nav-link" href="../cont.php">Produtos</a>
                    <a class="nav-link" href="../cont.php">Quem Somos</a>
                    <a class="nav-link" href="../cont.php">Fale Conosco</a>
                </div>
            </nav>

        </div>
    </header>



    <main style="z-index: 3;position: relative;" class="bg-white">
        <div class="bd-example">
            <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="../img/bg.png" class="d-block w-100" alt="...">




                    </div>
                    <div class="carousel-item">
                        <img src="../img/BG3.png" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h3>Rip Wan Winkle</h3>
                            <p>Nosso primeiro grande sucesso por apenas <font class="text-danger">R$ 6,99</font>.</p>
                            <a name="button" class="btn btn-primary" href="../cont.php" role="button">Veja mais dos
                                nossos produtos</a>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="../img/Sem%20t%C3%ADtulo.png">
                        <div class="carousel-caption d-none d-md-block text-left" style="top: 200px; left: 100px">
                            <img src="../img/DD-Rmk-W.png" alt="Logo DD Livros" height="40px">
                            <h1>Novidades para você</h1>
                            <small class="h6">Veja os vários livros que estão em alta na nossa loja</small>
                        </div>
                        <div class="carousel-caption d-none d-md-block">
                            <img src="../img/anifanta.jpg" class="float-right shadow" height="300px">
                            <img src="../img/asscreed.jpg" class="float-right shadow" height="300px">
                            <img src="../img/GowMelhorQueGow.png" class="float-right shadow" height="300px">
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>

        <div class="text-center p-3 bg-black text-left">
            <img src="../img/bf-LOGO.png" alt="Black Friday" title="Black Friday">
            <h1 class="text-white">Ofertas</h1>
            <div class="card-deck m-3 ">
                <div class="card p-1" style="max-height: auto;">
                    <div class="row no-gutters">
                        <div class="col-md-4">
                            <img src="../img/SANICO.jfif" class="card-img prdt-livro" alt="Livro: A Guerra Dos Consoles"
                                title="Livro: A Guerra Dos Consoles">
                        </div>
                        <div class="col-8">
                            <div class="card-body">
                                <small class="small-card text-primary">Produto Em Alta</small>
                                <small class="small-card text-danger">Desconto de 50% ou mais</small>
                                <small class="small-card bg-black text-warning p-1 rounded-sm">BLACK FRIDAY</small>
                                <h2 class="card-title">A Guerra Dos Consoles</h2>
                                <small>De R$ 49,99 Por</small>
                                <h1 class="text-danger small-card">R$ 24,99</h1>
                                <div class="dropdown mb-2">
                                    <button class="btn btn-sm btn-secondary dropdown-toggle dropdown-toggle-split"
                                        type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
                                        aria-expanded="false">
                                        Sinopse
                                    </button>

                                    <button type="button" disabled class="btn-sm btn-black">Código Do Produto: <font
                                            class="text-warning">
                                            1</font></button>

                                    <div class="dropdown-menu shadow p-2 text-justify" aria-labelledby="dropdownMenu2">
                                        <small>Da mesma forma que outras grandes rivalidades modernas, como Coca-Cola
                                            versus Pepsi e Apple
                                            versus Microsoft, redefiniram cada competidor e reescreveram a história
                                            dessas empresas, o intenso
                                            combate entre Sega e Nintendo nos anos 1990 revelou o melhor e o pior de
                                            cada uma e mudou para
                                            sempre o mundo do entretenimento, fazendo nascer uma indústria mundial de 60
                                            bilhões de
                                            dólares.</small>
                                    </div>
                                </div>

                                <small>Autor: Blake J. Harris</small><br>
                                <small>Lançamento: 13 de maio de 2014</small>
                            </div>
                        </div>
                    </div>
                </div>



                <div class="card p-1" style="max-height: auto;">
                    <div class="row no-gutters">
                        <div class="col-md-4">
                            <img src="../img/queda.jpg" class="card-img prdt-livro" alt="Livro: A Guerra Dos Consoles"
                                title="Livro: A Guerra Dos Consoles">
                        </div>
                        <div class="col-8">
                            <div class="card-body">
                                <small class="small-card text-primary">Produto Em Alta</small>
                                <small class="small-card text-danger">Desconto de 50% ou mais</small>
                                <small class="small-card bg-black text-warning p-1 rounded-sm">BLACK FRIDAY</small>
                                <h2 class="card-title">Vingadores: A Queda</h2>
                                <small>De R$ 100,99 Por</small>
                                <h1 class="text-danger small-card">R$ 28,00</h1>
                                <div class="dropdown mb-2">
                                    <button class="btn btn-sm btn-secondary dropdown-toggle dropdown-toggle-split"
                                        type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
                                        aria-expanded="false">
                                        Sinopse
                                    </button>

                                    <button type="button" disabled class="btn-sm btn-black">Código Do Produto: <font
                                            class="text-warning">
                                            12</font></button>

                                    <div class="dropdown-menu shadow p-2 text-justify" aria-labelledby="dropdownMenu2">
                                        <small>Esta saga mostra o fim dos Vingadores na sua formação mais duradoura. A
                                            mansão dos heróis foi
                                            destruída: eles foram atacados pelos Kree (aliens, que são velhos inimigos
                                            do grupo). A
                                            Mulher-Hulk enlouqueceu, agindo como o Hulk por um breve período (no qual
                                            ela destruiu o Visão),
                                            entre outros fatos. Foram convocados todos os heróis que já haviam
                                            participado do grupo para
                                            ajudar na situação. No fim da história, descobriu-se que tudo foi feito pela
                                            Feiticeira Escarlate,
                                            vingadora que havia perdido o controle sobre seus poderes de alteração da
                                            realidade, ao ser levada
                                            a crer que perdeu seus filhos (descobriria-se um bom tempo depois que, na
                                            verdade, estavam vivos,
                                            e são atualmente Wiccano e Célere dos Jovens Vingadores). Após derrotarem a
                                            colega, os Vingadores
                                            deixaram-na com o vilão Magneto, pai da heroína, para que ele a levasse até
                                            Genosha, para ser
                                            tratada por Charles Xavier. Os acontecimentos dessa história levaram até a
                                            saga Dinastia
                                            M.</small>
                                    </div>
                                </div>

                                <small>Autor: Brian Michael Bendis e David Finch</small><br>
                                <small>Lançamento: agosto de 2004</small>
                            </div>
                        </div>
                    </div>
                </div>


            </div>
            <center>
                <a name="button" class="btn btn-primary" href="../cont.php" role="button">Veja mais dos nossos
                    produtos</a>
            </center>
        </div>

        <section class=" flush-with-above p-5">
            <div class="container">
                <div class="row justify-content-around align-items-center">
                    <div class="col-12 col-md-5 order-md-2 mb-5 mb-md-0">
                        <span class="title-decorative">DD Livros</span>
                        <h5 class="h1">Quem Somos</h5>
                        <p class="lead text-justify">
                            Somos uma empresa que atende em todo o Brasil, nós chamamos DD Livros, temos os mais
                            variados livros desde
                            de fantasia a ficção, nosso maior sucesso é Rip Van Winkle do autor Washington Irving, temos
                            várias
                            parceiras como a Paralax, estamos no mercado há mais de 20 anos somos a número 1 em todo o
                            Brasil.
                        </p>
                    </div>
                    <!--end of col-->
                    <div class="col-12 col-md-5 order-md-1">
                        <img alt="Imagem" src="../img/DD-Rmk.png" class="img-fluid ">
                    </div>
                    <!--end of col-->
                </div>
                <!--end of row-->
            </div>
            <!--end of container-->
        </section>







        <section class="secon flush-with-above p-5 bg-light">
            <div class="container">
                <div class="row justify-content-around align-items-center">
                    <div class="col-12 col-md-6 col-lg-5 text-center text-md-left section-intro">
                        <span class="title-decorative">1998</span>
                        <h3 class="h1">Passeio no Passado</h3>
                        <span class="lead">
                            Nós precisamos nos preparar para o futuro, mais sem esquecer o nosso passado, volte no
                            tempo, e dê uma
                            olhada em como tudo começou. Especial 21 Anos Site DD Livros!
                            <br><br>
                            <a name="button" class="btn btn-primary" href="../cont.php"
                                role="button">Visitar Site
                                Legado</a>
                        </span>
                    </div>
                    <div class="col-12 col-md-5 order-md-1">
                        <img alt="Imagem" src="../img/Captura de Tela (139).png" class="img-fluid shadow rounded-sm">
                    </div>
                </div>
            </div>
        </section>

    </main>

    <footer class="text-white">
        <div class="p-3 text-left float-left">
            <img src="../img/DD-Rmk-W.png" height="30px">
        </div>
        <div class="text-right p-3">
            <small>DD Livros é uma marca registrada Paralax Company © 2019</small>
            <br>
            <small>© 2019 Paralax Design Site 5 é uma marca Grupo Liga</small>
        </div>
        <img src="../img/fBorder.png" width=100% height="2px">
    </footer>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
    </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
    </script>

</body>

</html>