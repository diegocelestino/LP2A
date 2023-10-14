<%@ page import="com.exservlet.models.Contato" %>
<%@ page import="java.util.List" %>
<%@ page import="com.exservlet.models.Contatos" %>

<html>
<body>
<%-- comentário em JSP aqui: nossa primeira página JSP --%>

<%
    String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
%>
<%= mensagem%>; %>

<br/>

<%
    String desenvolvido = "Desenvolvido por Diegoo";
%>
<%= desenvolvido %>

<br/>

<table>

    <%
        List<Contato> contatos = Contatos.to();

        for (Contato contato : contatos) {
    %>
    <tr>
        <td><%=contato.getNome() %></td>
        <td><%=contato.getEmail() %></td>
        <td><%=contato.getEndereco() %></td>
        <td><%=contato.getDataNascimento().getTime() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>