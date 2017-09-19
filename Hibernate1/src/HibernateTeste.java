
import hibernate1.Estudante;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dumingx
 */
public class HibernateTeste {
    public static void main(String[]args){
     Estudante e1  = new Estudante();
     Estudante e2  = new Estudante();
      
     e2.setCurso("Estatistica");
     e2.setIdade(22);
     e2.setNome("Celio Manso");
     e1.setCurso("informatica");
     e1.setIdade(19);
     e1.setNome("Domingos");
       Session e=new NewHibernateUtil().getSessionFactory().openSession();
       e.beginTransaction();
       e.save( e1);
       e.save(e2);
       e.getTransaction().commit();
       //e.close();
      // new NewHibernateUtil().getSessionFactory().close();
       
       
    }
    
}
