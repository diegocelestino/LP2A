<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<head>
    <link href="css/jquery-ui.css" rel="stylesheet">
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.js"></script>
</head>
<body>
<c:import url="cabecalho.jsp" />
<form action="adicionaContato">
    Nome: <input type="text" name="nome" /><br />
    E-mail: <input type="text" name="email" /><br />
    Endereço: <input type="text" name="endereco" /><br />
    Data Nascimento: <caelum:campoData id="dataNascimento" /><br />

    <input type="submit" value="Gravar" />
</form>

<c:import url="rodape.jsp" />

</body>
</html>