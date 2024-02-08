package edu.toshokoteca.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import edu.toshokoteca.pojo.Historieta;

public class HistorietaDAO {
    
    /*METODOS PARA EL CRUD*/
    public List<Historieta> listarHistorietas() {
    //conexion
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Historieta.class);

    //Crear Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
    //Inicializamos la Session
        Session session = sessionFactory.openSession();

        List<Historieta> list = new ArrayList<>();

        String hib = "from Historieta";
        Query<Historieta> query = session.createQuery(hib);
    
    //Agrego a la lista
        list = query.list();

        return list;
    }

    public boolean crearHistorieta( Historieta unaHistorieta) {

        boolean seCreo = false;
        try {
             //conexion
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Historieta.class);

            //Crear Session Factory
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            //Inicializamos la Session
            Session session = sessionFactory.openSession();
            Transaction tx1 = session.beginTransaction();

            session.save(unaHistorieta);
            tx1.commit();
            seCreo = true;
        } catch (Exception e) {
            seCreo = true;
           e.printStackTrace();
        }
       return seCreo;
    }
}

