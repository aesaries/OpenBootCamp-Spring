package resolucion1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext bean = new ClassPathXmlApplicationContext("beans.xml");
        Saludo sal = (Saludo) bean.getBean("saludo");
        sal.imprimirSaludo();
        Saludo sal2 = (Saludo) bean.getBean("saludo");
        Saludo sal3 = new Saludo();
        boolean esIgual = sal.equals(sal2);
        System.out.println(esIgual);

    }
}
