<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<html>
<meta charset="UTF-8">
<head>
    <title>Lista</title>
</head>
<body>

<c:import url="cabecalho.jsp" />

<jsp:useBean id="dao" class="com.exservlet.models.Contatos"/>
<table>
    <!-- percorre contatos montando as linhas da tabela -->
    <c:forEach var="contato" items="${dao.to}">
        <tr>
            <td>${contato.nome}</td>
            <td>
                <c:if test="${not empty contato.email}">
                    <a href="mailto:${contato.email}">${contato.email}</a>
                </c:if>

                <c:if test="${empty contato.email}">
                    E-mail não informado
                </c:if>
            </td>
            <td>${contato.endereco}</td>
            <td>
                <fmt:formatDate value="${contato.dataNascimento.time}"
                                pattern="dd/MM/yyyy" />
            </td>
        </tr>
    </c:forEach>
</table>

<c:import url="rodape.jsp" />
</body>
</html>
