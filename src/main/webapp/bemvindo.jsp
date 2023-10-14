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
    String desenvolvido = "Desenvolvido por Diego";
%>
<%= desenvolvido %>

<br/>

<%
    System.out.println("Tudo foi executado!");
%>

<%
    List<Contato> contatos = Contatos.to();

    for (Contato contato : contatos ) {
%>
<li><%=contato.getNome()%>, <%=contato.getEmail()%>:
    <%=contato.getEndereco()%></li>

<%
    }
%>

</body>
</html>