import java.util.Scanner;
public class vista {
    Scanner sc = new Scanner(System.in);
    public void saludo() {
        System.out.println(" --- Hola y bienvenido al sistema de apoyo de reciclaje ---");
    }
    public void menu() {
        System.out.println("Ingrese usuario o registrese");
        System.out.println("1. ingresar");
        System.out.println("2.Registrarse");
        System.out.println("3.salir");
    }
    public void register() {
        System.out.println("Inserte un nombre de usuario ");
    }
    public void ask() {
        System.out.println("Ingrese su nombre de usuario");
    }
    public void login() {
        System.out.println("Sea ingresado correctamente");
    }
    public void inmenu() {
        System.out.println("Ingrese el número de la acción que quiere realizar a continuación");
        System.out.println("1.Buscar un centro de reciclaje cercano a mi ubicación");
        System.out.println("2.Buscar documentación sobre el el uso de las recicladoras y su importancia");
        System.out.println("3.salir");
    }
    public void location() {
        System.out.println("ingrese la zona en la que se encuentra actualmente para que le podamos dar la información sobre los lugares en esa zona a las que puede acudir");

    }
}
