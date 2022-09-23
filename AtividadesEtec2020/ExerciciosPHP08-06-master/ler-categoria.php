<?php
    header("Location: index.php");

    $categoria = $_POST['slcCategoria'];
    setcookie('codcategoria', $categoria);
?>