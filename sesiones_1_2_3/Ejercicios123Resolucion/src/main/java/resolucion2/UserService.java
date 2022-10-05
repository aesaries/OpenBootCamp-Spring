package resolucion2;

import jdk.jfr.Name;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService nt;

    public UserService(NotificationService nt){
        this.nt = nt;
    }



}
