package ejemplohibernate;

import org.hibernate.*;

public class EjemploHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Se conecto");
        
        Transaction transaction = session.beginTransaction();
        System.out.println("Inicio de Transaccion");
        
        Empleados emp = new Empleados();
        emp.setClave("12345");
        emp.setNombre("sadsd");
        emp.setDireccion("Calle 2");
        emp.setTelefono(1111);
        session.delete(emp);
        
        transaction.commit();
        System.out.println("Fin Transaccion");
        session.close();
    }
    
}
