import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class datos {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Zona3 = new ArrayList<>();
    ArrayList<String> Zona6 = new ArrayList<>();
    ArrayList<String> Zona9 = new ArrayList<>();
    ArrayList<String> Zona12 = new ArrayList<>();
    ArrayList<String> Zona14 = new ArrayList<>();
    ArrayList<String> Zona18 = new ArrayList<>();
    ArrayList<String> Zona19 = new ArrayList<>();
    ArrayList<String> Zona20 = new ArrayList<>();
    ArrayList<String> Zona21 = new ArrayList<>();
    ArrayList<String> Zona22 = new ArrayList<>();
    ArrayList<String> Zona23 = new ArrayList<>();
    public void arranque() {
        Zona12.add("- Vical, de, Av. Petapa 48-01, Cdad. de Guatemala 01012, +502 2422 6400");
        Zona9.add("- Recipa, 3 Avenida 2-16 Zona 9 Ciudad de Guatemala, 01009, +502 2491 5050 "); // centros de reciclaje 
        Zona14.add("- Scrapex, 5ta Avenida 5-55, Edificio Europlaza, Torre 1 Nivel 2 Zona 14 ciudad de Guatemala, +502 2386 9999");
        Zona6.add("- La Joya, 1 Calle 1-85 Zona 6 Col Álamos San Miguel Petapa, + 502 2448 1286 ");
        Zona18.add("- Red Ecologica, Kilómetro 8 Carretera al Atllántico, Zona 18, Ciudad de Guatemala, +502 2301-1500");
        Zona3.add("- Interfisa, 7a. Avenida 39-26, zona 3, Guatemala, +502 5834-5723");

    }
    public int zone() {
        int zona; 
        zona = sc.nextInt();
        return zona;
    }
    public void zone1() {
        for(int i = 0; i < Zona1.size(); i++) {
            System.out.println(Zona1.get(i));
        }
    }
    public void zone2() {
        for(int i = 0; i < Zona2.size(); i++) {
            System.out.println(Zona2.get(i));
        }
    }
    public void zone3() {
        for(int i = 0; i < Zona3.size(); i++) {
            System.out.println(Zona3.get(i));
        }
    }
    public void zone6() {
        for(int i = 0; i < Zona6.size(); i++) {
            System.out.println(Zona6.get(i));
        }
    }
    public void zone9() {
        for(int i = 0; i < Zona9.size(); i++) {
            System.out.println(Zona9.get(i));
        }
    }
    public void zone12() {
        for(int i = 0; i < Zona12.size(); i++) {
            System.out.println(Zona12.get(i));
        }
    }
    public void zone14() {
        for(int i = 0; i < Zona14.size(); i++) {
            System.out.println(Zona14.get(i));
        }
    }
    public void zone18() {
        for(int i = 0; i < Zona18.size(); i++) {
            System.out.println(Zona18.get(i));
        }
    }
    public void zone19() {
        for(int i = 0; i < Zona19.size(); i++) {
            System.out.println(Zona19.get(i));
        }
    }
    public void zone20() {
        for(int i = 0; i < Zona20.size(); i++) {
            System.out.println(Zona20.get(i));
        }
    }
    public void zone21() {
        for(int i = 0; i < Zona21.size(); i++) {
            System.out.println(Zona21.get(i));
        }
    }
    public void zone22() {
        for(int i = 0; i < Zona22.size(); i++) {
            System.out.println(Zona22.get(i));
        }
    }
    public void zone23() {
        for(int i = 0; i < Zona23.size(); i++) {
            System.out.println(Zona23.get(i));
        }
    }
}
