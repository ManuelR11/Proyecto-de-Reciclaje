import java.util.Scanner;
/**
 * vista
 * Esta clase funje una función meramente estetica para poder solicitar, agregar o decirle al usuario lo que se necesite
 */
public class vista {
    Scanner sc = new Scanner(System.in);
    /**
     * saludo()
     * Un saludo el cual presenta el programa y diga lo que es
    */
    public void saludo() {
        System.out.println(" --- Hola y bienvenido al sistema de apoyo de reciclaje ---");
    }
    /**
    * menu()
    * Este hace la función de dar una visión de lo que la persona puede hacer con respecto a lo que es 
        el programa
    */
    public void menu() {
        System.out.println("Ingrese usuario o registrese");
        System.out.println("1. ingresar");
        System.out.println("2.Registrarse");
        System.out.println("3.salir");
    }
    /**
    * register()
    * Este solicita un nombre de usuario con el cual sera llamado más adelante
    */
    public void register() {
        System.out.println("Inserte un nombre de usuario ");
    }
    /**
    * ask()
    * Este solicita un nombre de usuarío valido para ingrsar
    */
    public void ask() {
        System.out.println("Ingrese su nombre de usuario");
    }
    /**
    * login()
    * Este indica que se ha ingresado correctamente
    */
    public void login() {
        System.out.println("Sea ingresado correctamente");
    }
    /**
    * inmenu()
    * Este hace de un submenú del cual este da 3 opciónes más
    */
    public void inmenu() {
        System.out.println("Ingrese el número de la acción que quiere realizar a continuación");
        System.out.println("1.Buscar un centro de reciclaje cercano a mi ubicación");
        System.out.println("2.Buscar documentación sobre el el uso de las recicladoras y su importancia");
        System.out.println("3.salir");
    }
    /**
    * location()
    * Este solicita la zona de la cual quiere saber la información
    */
    public void location() {
        System.out.println("ingrese la zona en la que se encuentra actualmente para que le podamos dar la información sobre los lugares en esa zona a las que puede acudir");

    }
}
