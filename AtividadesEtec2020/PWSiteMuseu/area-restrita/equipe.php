<html lang="pt-br">

<head>
   <meta charset="UTF-8">
   <title>Equipe - Salvador Dalí</title>
   <link rel="stylesheet" href="../css/reset.css">
   <link rel="stylesheet" href="../css/bootstrap.min.css">
   <link rel="stylesheet" href="../css/style.css">
   <link rel="shortcut icon" type="image/x-icon" href="../favicon.ico">
</head>

<body class="bg-dark text-white">
   <?php
  include("valida-sentinela.php");
?>
   <header>
   <div class="nav-container">
      <nav class="navbar navbar-dark bg-primary navbar-expand-lg bg-pers0 menu pl-2 pr-2">
        <a class="navbar-brand pl-2" href="index-area-restrita.php">
          <img src="../img/dalidaonde.png" height="40px">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto text-center justify-content-start">
            <li class="nav-item">
              <a class="nav-link" href="index-area-restrita.php">
                <p class="textoMenu">Home</p>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../obras.php">
                <p class="textoMenu">Ver Obras</p>
              </a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button"
                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <p class="textoMenu">Cadastrar</p>
              </a>
              <div class="bg-dropdown dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <a class="text-dropdown dropdown-item" href="cadastrar-obra.php">Obra</a>
                <a class="text-dropdown dropdown-item" href="cadastrar-periodo.php">Periodo</a>
                <a class="text-dropdown dropdown-item" href="cadastrar-tipo-obra.php">Categoria</a>
                <a class="text-dropdown dropdown-item" href="cadastrar-autor.php">Autor</a>
                <a class="text-dropdown dropdown-item" href="cadastrar-imagem.php">Imagem</a>
              </div>
            </li>
          </ul>
          <ul class="navbar-nav text-center justify-content-end">
            <li class="nav-item">
              <a class="nav-link">
                <p class="textoMenu">Bem vindo, adm <i class="fas fa-user-shield"></i></p>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="../logout.php">
                <p class="textoMenu">Sair <i class="fas fa-sign-out-alt"></i></p>
              </a>
            </li>
          </ul>
        </div>
      </nav>
    </div>
   </header>
   <div class="container-fluid text-center bg-pers0 parceria text-white p-3">
      <h1>Equipe do Projeto:</h1>
   </div>
   <div class="container pt-5 pb-5" id="cont-part">
      <div class="row">
         <div class="col">
            <div class="text-left text-center p-1">
               <img src="../img/diogo.jpg" class="shadow rounded-circle" width="120px"
                  class="rounded-circle p-0 mx-auto" alt="...">
               <div class="font-weight-bold mt-2 center text-white">
                  Diogo<br>
                  <font class="text-white-50">Responsável pela pesquisa das obras</font>
               </div>
            </div>
         </div>
         <div class="col">
            <div class="text-left text-center p-1">
               <img src="../img/cj.png" class="shadow rounded-circle" width="120px" class="rounded-circle p-0 mx-auto"
                  alt="...">
               <div class="font-weight-bold mt-2 center text-white">
                  Deivid Bryan (Vulgo CJ god)<br>
                  <font class="text-white-50">Responsável pela pesquisa da biografia</font>
               </div>
            </div>
         </div>
         <div class="col">
            <div class="text-left text-center p-1">
               <img src="../img/douglas.jpg" class="shadow rounded-circle" width="120px"
                  class="rounded-circle p-0 mx-auto" alt="...">
               <div class="font-weight-bold mt-2 center text-white">
                  Douglas (vulgo Risadinha)<br>
                  <font class="text-white-50">Responsável pelo modelo do site original e o design de algumas páginas e
                     ajustes caso necessário</font>
               </div>
            </div>
         </div>
         <div class="col">
            <div class="text-left text-center p-1">
               <img src="../img/danylo.jpg" class="shadow rounded-circle" width="120px"
                  class="rounded-circle p-0 mx-auto" alt="...">
               <div class="font-weight-bold mt-2 center text-white">
                  Danylo (Vulgo Italiano)<br>
                  <font class="text-white-50">Responsável pela nova versão do site e pelos bugs não corrigidos (o que
                     mais sofreu na guerra eu diria)</font>
               </div>
            </div>
         </div>


      </div>
   </div>
   <div class="container-fluid text-center bg-pers0 parceria bordaTopo text-white p-3">
      <h1>Quem Realmente somos:</h1>
   </div>
   <div class="container-fluid flush-with-above p-5 menu text-center text-white bg-dark">
      <div class="row justify-content-around align-items-center">
         <div class="col-12 col-md-5 order-md-1 mb-5 mb-md-0">
            <h3 class="h1">Livrarias Aviaras</h3>
            <p class="lead text-justify">
               Criada na Mooca em 1984, rapidamente se tornou a maior livraria do estado de São Paulo com filiais em
               diversas cidades do estado, passou por uma reformulação nos anos 90 onde passou a focar a sua venda para
               a internet, recentemente, foi adquirida pela Aperture Science e se transformou em uma empresa que busca
               soluções digitais, a Aviaras Technology.
            </p>
         </div>
         <div class="col-12 col-md-5 order-md-1">
            <img src="../img/logoAviarasTechnologyFinal.png" class="img-fluid ">
         </div>
      </div>
   </div>

   <div class="container-fluid flush-with-above p-5 menu text-center text-white bg-pers2">
      <div class="row justify-content-around align-items-center text-center">
         <div class="col-12 col-md-5 order-md-2 mb-5 mb-md-0">
            <h5 class="h1">DD Livros</h5>
            <p class="lead text-justify">
               Fundada a partir do fim de uma Livraria Aviaras, a DD Livros foi criada no ano 1990, mas só veio se
               destacar realmente por ser pioneira na venda de livros online a partir de 1998. Foi comprada pela Paralax
               em 2008. E hoje é a maior vendedora de livros digitais. (fonte: Institulto Dataline)
            </p>
         </div>
         <div class="col-12 col-md-5 order-md-1">
            <img src="../img/dd-paralax.png" class="img-fluid">
         </div>
      </div>
   </div>
   <div class="container-fluid flush-with-above p-5 menu text-center text-white bg-dark">
      <div class="row justify-content-around align-items-center">
         <div class="col-12 col-md-5 order-md-1 mb-5 mb-md-0">
            <h3 class="h1">Concorrentes árduos</h3>
            <p class="lead text-justify">
               Por anos e anos, as 2 maiores livrarias do Brasil se emfrentaram, com vários comerciais agressivos,
               brigas e até mesmo processos entre si, tendo muito dinheiro e sangue derramado nos últimos 30 anos.
            </p>
         </div>
         <div class="col-12 col-md-5 order-md-1">
            <img src="../img/versao2.png" class="img-fluid areaLogin">
         </div>
      </div>
   </div>

   <div class="container-fluid flush-with-above p-5 text-center text-white bg-pers2">
      <div class="row justify-content-around align-items-center text-center">
         <div class="col-12 col-md-5 order-md-2 mb-5 mb-md-0">
            <h5 class="h1">Dalí e o Corona</h5>
            <p class="lead text-justify">
               Nesse ano de 2020, a história foi reescrita, e a Aviaras e a DD Livros se juntaram por um bem maior
               nesses momentos difíceis, sabemos que os museus estão fechados, então tentamos fazer JUNTAS uma espécie
               de museu virtual, tentamos trazer algo inovador pensando no futuro, e algo intressante para diversão das
               pessoas nessa quarentena, pensando no presente, isso tudo com um grade acervo digital das duas maiores
               Livrarias do Brasil. Quem foi o artista escolhido para realizar isso? Salvador Dalí, achamos que ele foi
               a escolha correta para realizar tudo isso com facilidade e sucesso.
            </p>
         </div>
         <div class="col-12 col-md-5 order-md-1">
            <img src="../img/dali-mask.jpg" class="img-fluid areaLogin">
         </div>
      </div>
   </div>

   <footer class="pt-2 bordaRodape bg-pers0 text-white">
      <div class="container-fluid">
         <div class="row pl-5 pr-5">
            <div class="col-md-3 pt-3 pb-3">
               <img class="mb-2 img-fluid" src="../img/DD-Paralax.png">
            </div>
            <div class="col-md-6">
               <!-- nao coloca nada aqui nao -->
            </div>
            <div class="col-md-3 pt-3 pb-3">
               <img class="mb-2 img-fluid" src="../img/logoMista.png">
            </div>
         </div>
         <div class="row text-center pt-4">
            <div class="col-md-4 pb-5">
               <h3 class="linhaTitulo">Sobre</h3>
               <a href="" class="textoRodape">Equipe</a>
               <br>
               <a href="https://github.com/DouglasDans/PWSiteMuseu" class="textoRodape">Github</a>
            </div>
            <div class="col-md-4 pb-5">
               <h3 class="linhaTitulo">Fale Conosco</h3>
               <a href="https://www.youtube.com/watch?v=iW1Nff6jgjo" class="textoRodape">Telefone</a>
               <br>
               <a href="https://www.youtube.com/watch?v=pYcpZJVmXvU" class="textoRodape">Email</a>
            </div>
            <div class="col-md-4 pb-5">
               <h3 class="linhaTitulo">Doações</h3>
               <a href="https://www.youtube.com/watch?v=2q82bGtujFA" class="textoRodape">Bitcoins</a>
               <br>
               <a href="https://www.youtube.com/watch?v=000al7ru3ms" class="textoRodape">Dogecoins</a>
            </div>
         </div>
      </div>
      <div class="bordaRodape bg-pers1">
         <center><small class="text-center">DD Livros ©2020 Paralax Corporation</small></center>
         <center><small class="text-center">Aviaras ©2020 Aviaras Technology</small></center>
      </div>
   </footer>


   <script src="../js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
      integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</body>

</html>