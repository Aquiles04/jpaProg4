
package br.pucpr.bsi.prog4.controller;

import br.pucpr.bsi.prog4.modelos.Automovel;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AutomovelNovoServlet", urlPatterns = {"/automovel/novo"})
public class AutomovelNovoServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visões/automovel-novo-form.jsp");
        rd.forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String placa;
        placa = request.getParameter("placa");
        
        String anoFabricacaoParam;
        anoFabricacaoParam = request.getParameter("anoFabricacao");
        
        int anoFabricacao;
        anoFabricacao = Integer.parseInt(anoFabricacaoParam);
        
        Automovel auto;
        auto = new Automovel();
        auto.setPlaca(placa);
        auto.setAnoFabricacao(anoFabricacao);
        
        EntityManagerFactory fábrica;
        fábrica = Persistence.createEntityManagerFactory("autobd");
        
        EntityManager em;
        em = fábrica.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(auto);
        em.getTransaction().commit();
        
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("/WEB-INF/visões/automovel-listar.jsp");
        rd.forward(request,response);
    }


}
