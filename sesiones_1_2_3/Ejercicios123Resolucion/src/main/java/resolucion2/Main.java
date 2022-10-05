package resolucion2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext bean = new ClassPathXmlApplicationContext("beans2.xml");

        UserService us = (UserService)bean.getBean("userService");

        us.nt.imprimeSaludo();

    }



}
