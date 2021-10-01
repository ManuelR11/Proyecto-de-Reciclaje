
import java.util.Scanner;
/**
 * persona
 * Aquí se ingresa lo que es la información de la persona que usa la aplicación 
 */
public class persona {
    Scanner sc = new Scanner(System.in);
    String name = "";
    /**
    * register()
    * Este pregunta y agrega el nombre de la persona la cual esta usando la aplicación para futuros usos
    */
    public String register() {
        try {
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("eso no es un nombre");
        }
        System.out.println("Sea creado el usuario " + name);
        return name;
    }

}
