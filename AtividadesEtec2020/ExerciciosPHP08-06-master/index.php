<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <title>Cookie em Categorias</title>
</head>

<body>
    <form method="post" action=ler-categoria.php>
        <label>categoria:</label>
        <select name="slcCategoria">
            <option value="1">livros</option>
            <option value="2">papelaria</option>
            <option value="3">filmes</option>
            <option value="4">jogos</option>
        </select>
        <input type="submit" value="pesquisar">
    </form>
    <h1>lista de produtos:</h1>

    <?php
            if(isset($_COOKIE['codcategoria'])){
                //se o cookie existir, o usuário informou seu categoria de preferência
                // então vamos carregar os produtos desta categoria em cima das demais
                switch($_COOKIE['codcategoria']){
                    case "1":
                        {
                            print("
                            <h5>Produto preferido: Livros</h5>
                            <table border='1'>
                            <tr>
                            <td>
                                <img src='img/pote.webp' width='100'> <br> Harry Potter e a pedra filosofal
                                <br> Valor: R$ 30,00
                            </td>
                        </tr>
                        <tr>
                        <td>
                        <img src='img/narnia_1.jpg' width='100'> <br> As crônicas de Nárnia
                        <br> Valor: R$25,00
                        </td>
                        <tr>
                        <td>
                        <img src='img/cu.webp' width='100'> <br> O senhor dos anéis
                        <br> Valor: R$50,00
                        </td>
                    </tr>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/unissex.jpg' width='100'> <br> Mochila unissex
                        <br> Valor: R$70,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/image1.jpg' width='100'> <br> Crash Bandicoot N Sane Trilogy
                        <br> Valor: R$150,00
                        </td>
                    </tr>
                    <tr>
                    <td>
                    <img src='img/caneta.jpg' width='100'> <br> Canetas bic
                    <br> Valor: R$15,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/tony.jpg' width='100'> <br> Caderno Vingadores
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/image.jpg' width='100'> <br> Assassins Creed Ezio Collection
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/capa1.3.png' width='100'> <br> GTA Etec Versão Final
                    <br> Valor: Gratuito para professores e alunos do MTEC A
                    <br> <a href='https://youtu.be/UciW9c-wbsE'>Trailer Novo (Link de Download em breve)</a>
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/images.jpg' width='100'> <br> Sonic
                    <br> Valor: R$45,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/0866109.jpg' width='100'> <br> Resgate
                    <br> Valor: R$21,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/3699651.jpg' width='100'> <br> Dr Dolittle
                    <br> Valor: R$21,00
                    </td>
                </tr>
                             </table>");
                        break;
                        }
                    case "2":
                        {
                            print("
                            <h5>Produto preferido: Papelaria</h5>
                        <table border='1'>
                        <tr>
                        <td>
                        <img src='img/unissex.jpg' width='100'> <br> Mochila unissex
                        <br> Valor: R$70,00
                        </td>
                         </tr
                         <tr>
                         <td>
                         <img src='img/caneta.jpg' width='100'> <br> Canetas bic
                         <br> Valor: R$15,00
                         </td>
                     </tr>
                     <tr>
                    <td>
                    <img src='img/tony.jpg' width='100'> <br> Caderno Vingadores
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src='img/pote.webp' width='100'> <br> Harry Potter e a pedra filosofal
                        <br> Valor: R$ 30,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/image1.jpg' width='100'> <br> Crash Bandicoot N Sane Trilogy
                    <br> Valor: R$150,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/cu.webp' width='100'> <br> O senhor dos anéis
                    <br> Valor: R$50,00
                    </td>
                </tr>
            <tr>
                <td>
                <img src='img/narnia_1.jpg' width='100'> <br> As crônicas de Nárnia
                <br> Valor: R$25,00
                </td>
            </tr>
            <tr>
                <td>
                <img src='img/image.jpg' width='100'> <br> Assassins Creed Ezio Collection
                <br> Valor: R$35,00
                </td>
            </tr>
            <tr>
                <td>
                <img src='img/capa1.3.png' width='100'> <br> GTA Etec Versão Final
                <br> Valor: Gratuito para professores e alunos do MTEC A
                <br> <a href='https://youtu.be/UciW9c-wbsE'>Trailer Novo (Link de Download em breve)</a>
                </td>
            </tr>
            <tr>
                <td>
                <img src='img/images.jpg' width='100'> <br> Sonic
                <br> Valor: R$45,00
                </td>
            </tr>
            <tr>
                <td>
                <img src='img/0866109.jpg' width='100'> <br> Resgate
                <br> Valor: R$21,00
                </td>
            </tr>
            <tr>
                <td>
                <img src='img/3699651.jpg' width='100'> <br> Dr Dolittle
                <br> Valor: R$21,00
                </td>
            </tr>
            </table>
                        </table>
                    ");
                        break;
                        }

                    case "3":
                        {
                            print("
                            <h5>Produto preferido: Filmes</h5>
                            <table border='1'>
                            <tr>
                            <td>
                            <img src='img/images.jpg' width='100'> <br> Sonic
                            <br> Valor: R$45,00
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <img src='img/0866109.jpg' width='100'> <br> Resgate
                            <br> Valor: R$21,00
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <img src='img/3699651.jpg' width='100'> <br> Dr Dolittle
                            <br> Valor: R$21,00
                            </td>
                        </tr>
                        <tr>
                        <td>
                            <img src='img/pote.webp' width='100'> <br> Harry Potter e a pedra filosofal
                            <br> Valor: R$ 30,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/unissex.jpg' width='100'> <br> Mochila unissex
                        <br> Valor: R$70,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/image1.jpg' width='100'> <br> Crash Bandicoot N Sane Trilogy
                        <br> Valor: R$150,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/cu.webp' width='100'> <br> O senhor dos anéis
                        <br> Valor: R$50,00
                        </td>
                    </tr><tr>
                    <td>
                    <img src='img/caneta.jpg' width='100'> <br> Canetas bic
                    <br> Valor: R$15,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/narnia_1.jpg' width='100'> <br> As crônicas de Nárnia
                    <br> Valor: R$25,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/tony.jpg' width='100'> <br> Caderno Vingadores
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/image.jpg' width='100'> <br> Assassins Creed Ezio Collection
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/capa1.3.png' width='100'> <br> GTA Etec Versão Final
                    <br> Valor: Gratuito para professores e alunos do MTEC A
                    <br> <a href='https://youtu.be/UciW9c-wbsE'>Trailer Novo (Link de Download em breve)</a>
                    </td>
                </tr>
                            </table>
                            ");
                        break;
                        }
                    case "4":
                        {
                            print("<table border='1'>
                            <h5>Produto preferido: Jogos</h5>
                            <tr>
                            <td>
                            <img src='img/capa1.3.png' width='100'> <br> GTA Etec Versão Final
                            <br> Valor: Gratuito para professores e alunos do MTEC A
                            <br> <a href='https://youtu.be/UciW9c-wbsE'>Trailer Novo (Link de Download em breve)</a>
                            </td>
                            </tr>
                            <tr>
                            <td>
                            <img src='img/image1.jpg' width='100'> <br> Crash Bandicoot N Sane Trilogy
                            <br> Valor: R$150,00
                             </td>
                            </tr>
                            <tr>
                            <td>
                            <img src='img/image.jpg' width='100'> <br> Assassins Creed Ezio Collection
                             <br> Valor: R$35,00
                             </td>
                            </tr>
                            <tr>
                        <td>
                            <img src='img/pote.webp' width='100'> <br> Harry Potter e a pedra filosofal
                            <br> Valor: R$ 30,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/unissex.jpg' width='100'> <br> Mochila unissex
                        <br> Valor: R$70,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/cu.webp' width='100'> <br> O senhor dos anéis
                        <br> Valor: R$50,00
                        </td>
                    </tr><tr>
                    <td>
                    <img src='img/caneta.jpg' width='100'> <br> Canetas bic
                    <br> Valor: R$15,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/narnia_1.jpg' width='100'> <br> As crônicas de Nárnia
                    <br> Valor: R$25,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/tony.jpg' width='100'> <br> Caderno Vingadores
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                            <td>
                            <img src='img/images.jpg' width='100'> <br> Sonic
                            <br> Valor: R$45,00
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <img src='img/0866109.jpg' width='100'> <br> Resgate
                            <br> Valor: R$21,00
                            </td>
                        </tr>
                        <tr>
                            <td>
                            <img src='img/3699651.jpg' width='100'> <br> Dr Dolittle
                            <br> Valor: R$21,00
                            </td>
                        </tr>
                            </table>
                            ");
                        break;
                        }
                    

                }
            }else {
                print("
                <table border='1'>
                    <tr>
                        <td>
                            <img src='img/pote.webp' width='100'> <br> Harry Potter e a pedra filosofal
                            <br> Valor: R$ 30,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/unissex.jpg' width='100'> <br> Mochila unissex
                        <br> Valor: R$70,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/image1.jpg' width='100'> <br> Crash Bandicoot N Sane Trilogy
                        <br> Valor: R$150,00
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <img src='img/cu.webp' width='100'> <br> O senhor dos anéis
                        <br> Valor: R$50,00
                        </td>
                    </tr><tr>
                    <td>
                    <img src='img/caneta.jpg' width='100'> <br> Canetas bic
                    <br> Valor: R$15,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/narnia_1.jpg' width='100'> <br> As crônicas de Nárnia
                    <br> Valor: R$25,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/tony.jpg' width='100'> <br> Caderno Vingadores
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/image.jpg' width='100'> <br> Assassins Creed Ezio Collection
                    <br> Valor: R$35,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/capa1.3.png' width='100'> <br> GTA Etec Versão Final
                    <br> Valor: Gratuito para professores e alunos do MTEC A
                    <br> <a href='https://youtu.be/UciW9c-wbsE'>Trailer Novo (Link de Download em breve)</a>
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/images.jpg' width='100'> <br> Sonic
                    <br> Valor: R$45,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/0866109.jpg' width='100'> <br> Resgate
                    <br> Valor: R$21,00
                    </td>
                </tr>
                <tr>
                    <td>
                    <img src='img/3699651.jpg' width='100'> <br> Dr Dolittle
                    <br> Valor: R$21,00
                    </td>
                </tr>
                </table>
            ");
            }
        
        ?>
</body>

</html>