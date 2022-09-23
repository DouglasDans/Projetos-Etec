<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="shortcut icon" type="image/x-icon" href="./favicon.ico">
    <title>Login - Salvador Dalí</title>
</head>

<body>
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
            </div>
         </nav>
      </div>
    <!-- AINDA TEM TRABALHO PRA FAZER AQUI, MAS POR ENQUANTO É ISSO -->
    <div class="view pt-5 pb-5"
        style="background-image: url(img/bg_login.jpg); background-repeat:no-repeat; background-size:cover; background-position: center center">
        <div class="container mt-4 mb-4">
            <div class="justify-content-center">
                <div class="card text-center areaLogin w-50 mx-auto p-4">
                    <div class="row">
                        <form class="p-4" method="POST" action="valida-login.php">
                            <img src="img/daliVetor.png" class="pb-4 bigode img-fluid">
                            <h1 class="display-4">Entrar</h1>
                            <label class="font-weight-bold mt-2">Login</label>
                            <input type="text" class="form-control" id="txtLogin" name="txtLogin"
                                placeholder="Insira o seu login" required>
                            <br>
                            <label class="font-weight-bold">Senha:</label>
                            <input type="password" class="form-control" name="txtSenha" id="txtSenha"
                                placeholder="Insira a sua senha" required>
                            <br>
                            <div class="row pl-2 pr-2">
                                <button type="submit" value="Logar"
                                    class="btn-block btn-lg btn-outline-warning">Logar</button>
                            </div>
                            <div class="row pl-2 pr-2">
                                <p class="mt-3">Problemas com o login?</p>
                                <p><a href="https://www.youtube.com/watch?v=IZuO0My23Xw">Esqueci minha senha</a></p>
                            </div>
                            <div class="row pl-2 pr-2">
                                <p class="mt-3">É novo por aqui?</p>
                                <p><a href="https://www.youtube.com/watch?v=moZtoMP7HAA&">Registrar-se</a></p>
                            </div>
                        </form>
                    </div>
                    <div class="row">
                        <p class="mt-4 mb-0 text-muted">© 2020 DDLivros & Aviaras - Parceria entre Paralax e Aviaras
                            Technology</p>
                        <p class="mt-0 mb-0 text-muted position-sticky">Site criado para aprovação de Vanessa Ferraz</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>