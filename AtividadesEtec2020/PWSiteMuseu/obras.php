<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/reset.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="shortcut icon" type="image/x-icon" href="./favicon.ico">
  <title>Obras de Salvador Dalí</title>
</head>

<body class="bg-dark text-white">
  <?php
    require_once 'global.php';
  ?>
  <header>
  <div class="nav-container bg-pers0">
         <nav class="navbar navbar-dark bg-primary navbar-expand-lg bg-pers0 menu pl-2 pr-2">
            <a class="navbar-brand pl-2" href="index.php">
               <img src="img/dalidaonde.png" height="40px">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse"
               data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
               aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
               <ul class="navbar-nav mr-auto text-center justify-content-start">
                  <li class="nav-item">
                     <a class="nav-link" href="index.php">
                        <p class="textoMenu">Home</p>
                     </a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="obras.php">
                           <p class="textoMenu">Exposição Digital</p>
                     </a>
                  </li>
                  <li class="nav-item">
                     <a class="nav-link" href="biografia.php">
                        <p class="textoMenu">Biografia de Dalí</p>
                     </a>
                  </li>
               </ul>
               <ul class="navbar-nav text-center justify-content-end">
                  <li class="nav-item">
                     <a class="nav-link" href="login.php">
                        <p class="textoMenu">Login <i class="fas fa-sign-in-alt"></i></p>
                     </a>
                  </li>
               </ul>
            </div>
         </nav>
      </div>
  </header>
  <div class="bg-img bg-blur">
    <center>
      <div class="">
        <img src="img/1.jpg" style="height:40%;width:100%;backdrop-filter: blur(5px)" alt="">
      </div>
    </center>
  </div>

  <!-- NÃO SE ASSUSTE, SÃO APENAS TESTES! -->
  <?php
    try{
      $obra = new Obra();
      $listaobra = $obra->listar2();
    }
    catch(Exception $e){
      echo '<pre>';
        print_r($e);
      echo '</pre>';
      echo $e->getMessage();
    }
    
  ?>

  <div class="container-fluid p-0 atracaoMuseu">
    <div class=" bg-pers2 rounded shadow bg-blur p-4 text-center">
      <div class="container">
        <div class="row">
          <div class="col-2">
            <div class="text-left text-center rounded-sm img ">
              <div id="">
                <img src="img/dale.png"
                  class="rounded-lg p-0 mx-auto img shadow img-fluid" alt="...">
              </div>
            </div>
          </div>

          <div class="col-10 mt-5">
            <div class="text-left  text-center p-1 rounded-sm">
              <div class="ml-3">
                <div class="font-weight-bold text-left h1 m-4">
                  Salvador Dalí - A Exposição Digital<br>
                </div>
                <div class="text-left ml-4">
                  <p>Divirta-se na nossa exposição digital de Salvador Dalí, o tempo é ilimitado</p>
                  <small class="text-muted">Criado por Paralax DD Livros e Aviaras Technology</small>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <main class="">

      <!-- <div class="hoverzoom">
      <img class="rounded" src="img/lenildo_noel.png" alt="Obras de Dalí" />
      <div class="retina">
          <p>Lenildo Natal</p>
          <a href="#">Veja em alta qualidade</a>
      </div> Não vou remover o lenildo, seria bem triste :C
    </div> -->

      <!--- TAMBÉM É TESTE, SUJEUTO A MUDANÇAS -->









    </main>
  </div>
  <main style="margin-top:18%">
    <?php
      $i = 0;
      foreach ($listaobra as $linha){
    ?>
    <?php $i=$i+1 ?>
    <div class="bg-pers1 mt-5 mb-5">
      <div class="container-fluid flush-with-above bordaGaleria p-5 text-center text-white bg-pers2">
        <div class="row align-items-center ">
          <div class="col-4 ">
            <img src="<?php echo $linha['caminhoImagem']?>" class="img-fluid areaLogin"
              alt="<?php echo $linha['descImagem'] ?>">
          </div>
          <div class="col-8">
            <h1><?php echo $linha['nomeObra'] ?></h1>
            <h4 class="subtitulo-obra">Autor: <?php echo $linha['nomeAutor'] ?></h4>
            <p class="texto-obra mb-0">Categoria: <?php echo $linha['descCategoria'] ?></p>
            <p class="texto-obra mb-0">Período: <?php echo $linha['descPeriodo'] ?></p>
            <p class="texto-obra">Ano: <?php echo $linha['anoObra'] ?></p>
            <button class="btn-outline-warning btn-block btn-lg btn-cadastro" data-toggle="modal"
              data-target="<?php echo '#exampleModalLabel'.$i ?>">Alta Qualidade</button>
          </div>
        </div>
      </div>
    </div>

    <!-- Modal -->
    <div class="modal modal fade rouded" id="<?php echo 'exampleModalLabel'.$i ?>" tabindex="-1" role="dialog"
      aria-labelledby="<?php echo 'exampleModalLabel'.$i ?>" aria-hidden="true">
      <div class="modal-dialog modal-dialog-scrollable rouded modal-xl" role="document">
        <div class="modal-content ">
          <div class="modal-header bg-pers0 rouded">
            <h5 class="modal-title text-center text-white" id="<?php echo 'exampleModalLabel'.$i ?>"
              style="color: black;"><?php echo $linha['nomeObra'] ?></h5>
            <button type="button" class="close" data-dismiss="modal">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body text-center pt-5 bg-dark">
            <img src="<?php echo $linha['caminhoImagem'] ?>" class="areaLogin img-fluid" alt="<?php echo $linha['descImagem'] ?>">
          </div>
        </div>
      </div>
    </div>

    <?php
      }
    ?>
  </main>

  <footer class="pt-2 bordaRodape bg-pers0">
    <div class="container-fluid">
      <div class="row pl-5 pr-5">
        <div class="col-md-3 pt-3 pb-3">
          <img class="mb-2 img-fluid" src="img/DD-Paralax.png">
        </div>
        <div class="col-md-6">
          <!-- nao coloca nada aqui nao -->
        </div>
        <div class="col-md-3 pt-3 pb-3">
          <img class="mb-2 img-fluid" src="img/logoMista.png">
        </div>
      </div>
      <div class="row text-center pt-4">
        <div class="col-md-4 pb-5">
          <h3 class="linhaTitulo">Sobre</h3>
          <a href="equipe.php" class="textoRodape">Equipe</a>
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


  <script src="js/bootstrap.min.js"></script>
  <script src="js/scripts.js"></script>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
    integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</body>

</html>