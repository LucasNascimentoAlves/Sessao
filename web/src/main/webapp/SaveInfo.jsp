<!DOCTYPE html>
<html>
<head>
    <title>Formul�rio de Informa��es</title>
</head>
<body>
    <h1>Formul�rio de Informa��es</h1>
    <form action="SaveInfoServlet" method="post">
        <label for="login">Login:</label>
        <input type="text" name="login" id="login" required><br><br>
        
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required><br><br>
        
        <label for="instituicao">Institui��o:</label>
        <input type="text" name="instituicao" id="instituicao" required><br><br>
        
        <label for="cargo">Cargo:</label>
        <input type="text" name="cargo" id="cargo" required><br><br>
        
        <input type="submit" value="Salvar">
    </form>
</body>
</html>
