package com.exservlet.hello;

import com.exservlet.models.Contato;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();

        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String dataEmTexto = request.getParameter("dataNascimento");
        Calendar dataNascimento;

        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy")
                    .parse(dataEmTexto);
            dataNascimento = Calendar.getInstance();
            dataNascimento.setTime(date);
        } catch (ParseException e) {
            out.println("Erro de conversão da data");
            return;
        }

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEndereco(endereco);
        contato.setEmail(email);
        contato.setDataNascimento(dataNascimento);

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("nome", contato.getNome());
        concurrentHashMap.put("endereco", contato.getEndereco());
        concurrentHashMap.put("email", contato.getEmail());
        concurrentHashMap.put("dataNascimento", contato.getDataNascimento().toString());

        out.println("<html>");
        out.println("<body>");
        out.println("Contato " + contato.getNome() +
                " adicionado com sucesso");
        out.println("</body>");
        out.println("</html>");
    }
}
