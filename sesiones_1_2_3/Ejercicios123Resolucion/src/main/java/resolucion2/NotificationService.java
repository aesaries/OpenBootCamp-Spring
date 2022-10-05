package resolucion2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public String saludo = "Saludos desde Notification Services";

    public void imprimeSaludo(){
        System.out.println(saludo);
    }

}
