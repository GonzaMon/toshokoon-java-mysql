package edu.toshokoteca.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.toshokoteca.dao.HistorietaDAO;
import edu.toshokoteca.pojo.Historieta;

@WebServlet("/CrearHistorietaController")
public class CrearHistorietaController extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        try {
            String nombre = req.getParameter("nombre");
            String guionista = req.getParameter("guionista");
            String artista = req.getParameter("artista");
            String editorial = req.getParameter("editorial");
            int paginas = Integer.parseInt(req.getParameter("paginas"));

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            Date fecha = dateFormat.parse(req.getParameter("fecha"));
            String region = req.getParameter("region");

            Historieta unaHistorieta = new Historieta(nombre, guionista, artista, editorial, paginas, fecha, region);
            
            HistorietaDAO dao = new HistorietaDAO();

            boolean creacionCorrecta = dao.crearHistorieta(unaHistorieta);
            
            if (creacionCorrecta){
                //ir a la pagina del listado
                res.sendRedirect("http://localhost:8080/toshokoon/api/ListadoHistorietasController");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    
    }
}
