<html lang="en">

<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css" />
    <title>Sobre - Potato Games</title>

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

    <main class="sobre">
        <h1>Sobre</h1>
        <p>Somos um site desenvolvido em meados de 2021 para mostrar as últimas noticias e histórias sobre a indústria que mais cresce no mundo, a da videogames.</p>
        <h1>Contato</h1>
        <p>8-10 Al Rabeea' 1 St - Barsha Heights - Dubai - Emirados Árabes Unidos</p>
        <div id="map" style="height: 100%; width: 100%;"></div>

        <br>
        <form action="email.php" method="get">
            <div class="newsletter">
            <h1>Assine nossa newsletter</h1>
            <input type="text" name="txtEmail" id="txtEmail" class="loginText" placeholder="Insira seu email...">
            <button class="btnSubmit">Assinar nossa Newsletter</button>
            </div>
        </form>
    </main>
</body>
</html>

<script async src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCAckKLHl-T6HPk2pTVfxrjHXf4yLojpfw&callback=initMap"></script>
<script>
    let map;

    function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 25.094284243874938, lng: 55.177430639859786},
        zoom: 16,
    });
    }
</script>