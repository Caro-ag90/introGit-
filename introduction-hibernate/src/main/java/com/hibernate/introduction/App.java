package com.hibernate.introduction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.introduction.modelo.Mascota;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //Crear un objeto que permita fabricar las sesiones
        SessionFactory factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Mascota.class).buildSessionFactory();

        //Fabricar sesión
        Session session = factory.openSession();

        //Preparar sesion para transacciones
        session.beginTransaction();
        try{
            //Crear objeto
            Mascota objMascota= new Mascota("Roko", "Acuna", "Criollo", "#", "Ninguna");
            session.persist(objMascota);
            session.getTransaction().commit();;
            
        }catch(Exception e){
            e.printStackTrace();
        }

        //cerrar sesión
        session.close();
    }
}
