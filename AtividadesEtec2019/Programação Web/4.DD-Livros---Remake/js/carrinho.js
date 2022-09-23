var valorTotal = 0;

function Salvar() {
    document.getElementById('txtNomeCliente').value = document.getElementById('txtNome').value;

    var email = document.getElementById("txtEmail").value;
    document.getElementById('Email').value = email;

    var cpfc = document.getElementById("txtCPF").value;
    document.getElementById('CPF').value = cpfc;

    var sbTotal = parseFloat(document.getElementById('txtValorTotal').value);
    var rates = document.getElementsByName("r1");

    for (var i = 0; i < rates.length; i++) {
        if (rates[0].checked) {
            document.getElementById("txtEntr").value = "Correios - Acrécimo de R$ 10,00";
            sbTotal += parseFloat(10.00);
        } else if (rates[1].checked) {
            document.getElementById("txtEntr").value = "Sedex - Acrécimo de R$ 25,00";
            sbTotal += parseFloat(25.00);
        }
        break;
    }

    document.getElementById('sbTotal').value += sbTotal.toFixed(2);


    slcPag = document.getElementById("slcFormaPagto");
    if (slcPag.value == "1") {
        document.getElementById("txtPag").value = "Transferencia";
        par();
    } else if (slcPag.value == "2") {
        document.getElementById("txtPag").value = "Debito";
        par();
    } else if (slcPag.value == "3") {
        document.getElementById("txtPag").value = "Credito";
        par();
    } else if (slcPag.value == "4") {
        document.getElementById("txtPag").value = "Boleto";
        document.getElementById("txtPar").value = "Sem Parcelas - Somente A Vista";
    }


    if (document.getElementById("checkNL").checked) {
        alert("Você receberá as novidades da DD Livros em seu e-mail")
    }
}



function par() {
    pp = document.getElementById('sbTotal').value;
    slcPar = document.getElementById("slcFormaParc");
    if (slcPar.value == "2") {
        document.getElementById("txtPar").value = pp / 2;
        document.getElementById("qPar").value = "2"
    } else if (slcPar.value == "3") {
        document.getElementById("txtPar").value = pp / 3;
        document.getElementById("qPar").value = "3"
    } else if (slcPar.value == "4") {
        document.getElementById("txtPar").value = pp / 4;
        document.getElementById("qPar").value = "4"
    } else if (slcPar.value == "5") {
        document.getElementById("txtPar").value = pp / 5;
        document.getElementById("qPar").value = "5"
    } else if (slcPar.value == "6") {
        document.getElementById("txtPar").value = pp / 6;
        document.getElementById("qPar").value = "6"
    } else {
        document.getElementById("txtPar").value = "Sem Parcelas";
        document.getElementById("qPar").value = "A Vista"
    }
}



function addProduto() {
    var tabela = document.getElementById('tbProduto');
    var td1 = document.createElement("td");
    var td2 = document.createElement("td");
    var td3 = document.createElement("td");
    var td4 = document.createElement("td");
    var td5 = document.createElement("td");


    var tr = document.createElement("tr");
    var cod = parseInt(document.getElementById('codProduto').value);
    switch (cod) {
        case 1:
            var descricao = "A Guerra Dos Consoles";
            var preco = 24.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseFloat(qtde) * (preco));
            break;
        case 2:
            var descricao = "Vingadores: A Cruzada das Cranças";
            var preco = 59.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseFloat(qtde) * (preco));
            break;
        case 3:
            var descricao = "Assassin´s Creed - Revelações";
            var preco = 32.90;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseFloat(qtde) * (preco));
            break;
        case 4:
            var descricao = "Harry Potter E as Relíquias da Morte";
            var preco = 30.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 5:
            var descricao = "Animais Fantásticos";
            var preco = 35.90;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 6:
            var descricao = "Um Mais Um";
            var preco = 15.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 7:
            var descricao = "Hellboy";
            var preco = 10.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 8:
            var descricao = "As aventuras de Sherlock Holmes:";
            var preco = 20.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 9:
            var descricao = "Star Wars : Provação";
            var preco = 23.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 10:
            var descricao = "O Pequeno Príncipe";
            var preco = 30.00;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 11:
            var descricao = "O SENHOR DOS ANÉIS: A SOCIEDADE DO ANEL";
            var preco = 35.00;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 12:
            var descricao = "Vingadores - A Queda";
            var preco = 28.00;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 13:
            var descricao = "Rip Van Winkle";
            var preco = 6.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 14:
            var descricao = "A Ilha Misteriosa";
            var preco = 25.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 15:
            var descricao = "Viagem ao Centro da Terra";
            var preco = 28.00;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        case 16:
            var descricao = "God Of War";
            var preco = 39.99;
            var qtde = document.getElementById("qtde").value;
            valorTotal += (parseInt(qtde) * (preco));
            break;
        default:
            alert('Este código de produto não existe')
    }

    var codNode = document.createTextNode(cod);
    var descricaoNode = document.createTextNode(descricao);
    var precoNode = document.createTextNode(preco);
    var qtdeNode = document.createTextNode(qtde);
    var vtNode = document.createTextNode(valorTotal.toFixed(2));


    td1.appendChild(codNode);
    td2.appendChild(descricaoNode);
    td3.appendChild(precoNode);
    td4.appendChild(qtdeNode);
    td5.appendChild(vtNode);

    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);
    tr.appendChild(td4);
    tr.appendChild(td5);

    tabela.appendChild(tr);

    document.getElementById('codProduto').value = '';
    document.getElementById('qtde').value = '';
    document.getElementById('codProduto').focus();

    document.getElementById('txtValorTotal').value = valorTotal;

}