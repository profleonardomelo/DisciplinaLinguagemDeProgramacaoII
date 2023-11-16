<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro de Conta</title>
    </head>
    <body>
        <h1>Tela de Cadastro de Conta</h1>
        <p>
        <form action="../Conta/Cadastrar_" method="POST">
            <label>Número: </label>
            <input type="text" name="numero">
            <br><br>
            <label>Saldo: </label>
            <input type="text" name="saldo">
            <br><br>
            <label>Limite: </label>
            <input type="text" name="limite">
            <br><br><br>
            <button type="submit">Cadastrar</button>
        </form>
        </p>
    </body>
</html>
