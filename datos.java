
import java.util.ArrayList;
import java.util.Scanner;
/**
 * datos
 * Este es el centro de manejo de base de datos principal de la aplicación
 * aquí se almacena y se produce diferentes formas de dar o aguardar las localisaciones 
 * principales de centros de recliclaje.
 */
public class datos {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Zona1 = new ArrayList<>();
    ArrayList<String> Zona2 = new ArrayList<>();
    ArrayList<String> Zona3 = new ArrayList<>();
    ArrayList<String> Zona4 = new ArrayList<>();
    ArrayList<String> Zona5 = new ArrayList<>();
    ArrayList<String> Zona6 = new ArrayList<>();
    ArrayList<String> Zona7 = new ArrayList<>();
    ArrayList<String> Zona8 = new ArrayList<>();
    ArrayList<String> Zona9 = new ArrayList<>();
    ArrayList<String> Zona10 = new ArrayList<>();
    ArrayList<String> Zona11 = new ArrayList<>();
    ArrayList<String> Zona12 = new ArrayList<>();
    ArrayList<String> Zona13 = new ArrayList<>();
    ArrayList<String> Zona14 = new ArrayList<>();
    ArrayList<String> Zona15 = new ArrayList<>();
    ArrayList<String> Zona16 = new ArrayList<>();
    ArrayList<String> Zona17 = new ArrayList<>();
    ArrayList<String> Zona18 = new ArrayList<>();
    ArrayList<String> Zona19 = new ArrayList<>();
    ArrayList<String> Zona20 = new ArrayList<>();
    ArrayList<String> Zona21 = new ArrayList<>();
    ArrayList<String> Zona22 = new ArrayList<>();
    ArrayList<String> Zona23 = new ArrayList<>();
    /**
     * arranque();
    * Este proceso se usa para poder agregar e iniciar las listas de Arraylist que en un inicio estan vacias y 
        sin ningun dato importante
     */
    public void arranque() {
        Zona12.add("- Vical, de, Av. Petapa 48-01, Cdad. de Guatemala 01012, +502 2422 6400");
        Zona9.add("- Recipa, 3 Avenida 2-16 Zona 9 Ciudad de Guatemala, 01009, +502 2491 5050 ");
    }
    /**
    * Zone()
    * Este recive la zona y registra la zona en la cual el usuario solicita la información
    * Regresa la zona solicitada
    */
    public int zone() {
        int zona; 
        zona = sc.nextInt();
        return zona;
    }
    /**
    * zone1() - zone23()
    * Estos preocesos desliegan en lista los elementos de toda la lista a la que se le solicita, eso queiere decir
        que regresa lo que es la informaicón de toda la zona solicitada
    */
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
    public void zone4() {
        for(int i = 0; i < Zona4.size(); i++) {
            System.out.println(Zona4.get(i));
        }
    }
    public void zone5() {
        for(int i = 0; i < Zona5.size(); i++) {
            System.out.println(Zona5.get(i));
        }
    }
    public void zone6() {
        for(int i = 0; i < Zona6.size(); i++) {
            System.out.println(Zona6.get(i));
        }
    }
    public void zone7() {
        for(int i = 0; i < Zona7.size(); i++) {
            System.out.println(Zona7.get(i));
        }
    }
    public void zone8() {
        for(int i = 0; i < Zona8.size(); i++) {
            System.out.println(Zona8.get(i));
        }
    }
    public void zone9() {
        for(int i = 0; i < Zona9.size(); i++) {
            System.out.println(Zona9.get(i));
        }
    }
    public void zone10() {
        for(int i = 0; i < Zona10.size(); i++) {
            System.out.println(Zona10.get(i));
        }
    }
    public void zone11() {
        for(int i = 0; i < Zona11.size(); i++) {
            System.out.println(Zona11.get(i));
        }
    }
    public void zone12() {
        for(int i = 0; i < Zona12.size(); i++) {
            System.out.println(Zona12.get(i));
        }
    }
    public void zone13() {
        for(int i = 0; i < Zona13.size(); i++) {
            System.out.println(Zona13.get(i));
        }
    }
    public void zone14() {
        for(int i = 0; i < Zona14.size(); i++) {
            System.out.println(Zona14.get(i));
        }
    }
    public void zone15() {
        for(int i = 0; i < Zona15.size(); i++) {
            System.out.println(Zona15.get(i));
        }
    }
    public void zone16() {
        for(int i = 0; i < Zona16.size(); i++) {
            System.out.println(Zona16.get(i));
        }
    }
    public void zone17() {
        for(int i = 0; i < Zona17.size(); i++) {
            System.out.println(Zona17.get(i));
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
