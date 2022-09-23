
<?php 

    require 'phpmailer/src/PHPMailer.php';
    require 'phpmailer/src/SMTP.php';
    require 'phpmailer/src/Exception.php';
    require 'phpmailer/src/OAuth.php';
    require 'phpmailer/src/POP3.php';

    $email = $_GET['txtEmail'];

    $mail = new PHPMailer\PHPMailer\PHPMailer();
    $mail->IsSMTP(); // enable SMTP
    $mail->SMTPAuth = true;
    $mail->SMTPSecure = 'ssl';
    $mail->Host = 'smtp.gmail.com';
    $mail->Port = 465;

    $mail->Username = 'potatogames248@gmail.com';
    $mail->Password = 'Marcos248';


    $mail->setFrom('potatogames248@gmail.com');
    $mail->addAddress($email);

    $mail->SMTPDebug = 3;
    $mail->Debugoutput = 'html';
    $mail->setLanguage('pt');

    $mail->isHTML(true);
    $mail->Subject = 'Potato Games';
    $mail->Body    = '<h1>Obrigado por assinar nossa newsletter</h1><p>Você receberá</p>';

    if(!$mail->send()) {
        echo 'Não foi possível enviar a mensagem.<br>';
        echo 'Erro: ' . $mail->ErrorInfo;
    } else {
        echo "<script>alert('Obrigado por assinar nossa newsletter');</script>";
    }

    // header('location:Sobre.php');
?>