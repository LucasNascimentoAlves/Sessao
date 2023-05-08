package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SaveInfoServlet")
public class SaveInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém os parâmetros do formulário
        String login = request.getParameter("login");
        String nome = request.getParameter("nome");
        String instituicao = request.getParameter("instituicao");
        String cargo = request.getParameter("cargo");
        
        // Cria uma nova sessão ou obtém a sessão existente
        HttpSession session = request.getSession();
        
        // Salva as informações na sessão
        session.setAttribute("login", login);
        session.setAttribute("nome", nome);
        session.setAttribute("instituicao", instituicao);
        session.setAttribute("cargo", cargo);
        
        // Redireciona para uma página de confirmação ou qualquer outra página desejada
        response.sendRedirect("Sessao");
    }
}
