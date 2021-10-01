import java.util.Scanner;

/**
 * controler_main
 */
import java.util.Scanner;
public class controler_main {
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
                v.inmenu();
                insl = sc.nextInt();
                if (insl == 1) {
                v.location();
                zone = sc.nextInt();
                if (zone == 1) {
                    da.zone1();
                }
                if (zone == 12){
                    da.zone12();
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