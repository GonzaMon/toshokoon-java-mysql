package edu.toshokoteca.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.toshokoteca.dao.HistorietaDAO;
import edu.toshokoteca.pojo.Historieta;

@WebServlet("/api/ListadoHistorietasController")
public class ListadoHistorietasController extends HttpServlet {
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //Crea la instancia de HistorietaDAO
        HistorietaDAO dao = new HistorietaDAO();

        //Invocar el metodo listarHistorietas()
        List<Historieta> listado = dao.listarHistorietas();

        //grabar el listado en el request para que lo vea la siguiente pagina
        req.setAttribute("listado", listado);

        //ir a la siguiente pagina
        getServletContext().getRequestDispatcher("/listado.jsp").forward(req, res);
    }
}
