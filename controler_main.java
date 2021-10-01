import java.util.Scanner;

/**
 * controler_main
 */

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
                while (insl !=3) {
                    
                
                v.inmenu();
                insl = sc.nextInt();
                if (insl == 1) {
                v.location();
                zone = sc.nextInt();
                if (zone == 1) {
                    da.zone1();
                }
                if (zone == 2) {
                    da.zone2();
                }
                if (zone == 3) {
                    da.zone3();
                }
                if (zone == 4) {
                    da.zone4();
                }
                if (zone == 5) {
                    da.zone5();
                }
                if (zone == 6) {
                    da.zone6();
                }
                if (zone == 7) {
                    da.zone7();
                }
                if (zone == 8) {
                    da.zone8();
                }
                if (zone == 9) {
                    da.zone9();
                }
                if (zone == 10) {
                    da.zone10();
                }
                if (zone == 11) {
                    da.zone11();
                }
                if (zone == 12){
                    da.zone12();
                }
                if (zone == 13) {
                    da.zone13();
                }
                if (zone == 14) {
                    da.zone14();
                }
                if (zone == 15) {
                    da.zone15();
                }
                if (zone == 16) {
                    da.zone16();
                }
                if (zone == 17) {
                    da.zone17();
                }
                if (zone == 18) {
                    da.zone18();
                }
                if (zone == 19) {
                    da.zone19();
                }
                if (zone == 20) {
                    da.zone20();
                }
                if (zone == 21) {
                    da.zone21();
                }
                if (zone == 22) {
                    da.zone22();
                }
                if (zone == 23) {
                    da.zone23();
                }
                System.out.println("precione enter para continuar");
                sc.nextLine();
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