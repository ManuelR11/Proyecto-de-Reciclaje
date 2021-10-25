
/**
 * controler_main
 * Este es el centro de operación de la aplicación
 */
import java.util.Scanner;
public class controler_main {
    /**
 * A continuación se instacian y se llaman a programas y importaciones que se nos seran utiles durante el proceso
 * de solicitar o adquirir información por parte del usuario 
 */
    public static void main(String[] args) {
        vista v = new vista();
        Scanner sc = new Scanner(System.in);
        persona p = new persona();
        datos da = new datos();
        v.saludo();
        da.arranque();
        int sl = 0; 
        while (sl != 3) {
            v.menu();
            sl = sc.nextInt();
            if (sl == 1) {
                v.ask();
                p.register();
                int insl = 0;
                int zone = 0;
                while (insl !=3) {
                v.inmenu();
                insl = sc.nextInt();
                if (insl == 1) {
                v.location();
                zone = da.zone();
                if (zone == 3) {
                    da.zone3();
                }
                if (zone == 6) {
                    da.zone6();
                }
                if (zone == 9) {
                    da.zone9();
                }
                if (zone == 12){
                    da.zone12();
                }
                if (zone == 14) {
                    da.zone14();
                }
                if (zone == 18) {
                    da.zone18();
                }
                else {
                    System.out.println("No hay mas lugares en la zona referida");
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                sc.nextLine();
                }
                if (insl == 2) {
                   v.creditos();
                }
            }
        }
            if (sl == 2) {
                v.register();p.register();
            }
            if (sl == 3) {
                System.out.println("Tenga feliz día");
            }
        }
    }
    
}