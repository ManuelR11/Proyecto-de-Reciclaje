import java.util.Scanner;
/**
 * vista
 * Esta clase funje una función meramente estetica para poder solicitar, agregar o decirle al usuario lo que se necesite
 */
public class vista {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
     public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    Scanner sc = new Scanner(System.in);
    /**
     * saludo()
     * Un saludo el cual presenta el programa y diga lo que es
    */
    public void saludo() {
        System.out.println(ANSI_RED + " --- Hola y bienvenido al sistema de apoyo de reciclaje ---" + ANSI_RESET);
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
        System.out.println("2.Creditos");
        System.out.println("3.salir");
    }
    /**
    * location()
    * Este solicita la zona de la cual quiere saber la información
    */
    public void location() {
        System.out.println("ingrese la zona en la que se encuentra actualmente para que le podamos dar la información sobre los lugares en esa zona a las que puede acudir");

    }
    public void creditos() {
        System.out.println("----------- Programa de encuentra y resolución de dudas sobre centros de reciclaje--------");
        System.out.println("Un programa hecho por:");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         System.out.println(ANSI_GREEN + " Andres Chivalan" + ANSI_RESET);
         try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         System.out.println(ANSI_PURPLE + " Manuel Rodas"+  ANSI_RESET);
         try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         System.out.println(" Sebastian Juarez");
         try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         System.out.println(ANSI_CYAN + " Alejando Erales" + ANSI_RESET);
         try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}
