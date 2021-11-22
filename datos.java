import java.util.ArrayList;
import java.util.Scanner;
/**
 * datos
 * Este es el centro de manejo de base de datos principal de la aplicación
 * aquí se almacena y se produce diferentes formas de dar o aguardar las localisaciones 
 * principales de centros de recliclaje.
 */
public class datos implements IntDatos{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> Zona3 = new ArrayList<>();
    ArrayList<String> Zona6 = new ArrayList<>();
    ArrayList<String> Zona9 = new ArrayList<>();
    ArrayList<String> Zona12 = new ArrayList<>();
    ArrayList<String> Zona14 = new ArrayList<>();
    ArrayList<String> Zona18 = new ArrayList<>();
    /**
     * arranque();
    * Este proceso se usa para poder agregar e iniciar las listas de Arraylist que en un inicio estan vacias y 
        sin ningun dato importante
     */
    @Override
    public void arranque() {
        Zona12.add("-Nombre: Vical          Dirección: Av. Petapa 48-01, Cdad. de Guatemala 01012,      Contacto: +502 2422 6400      Descripción: VICAL es una sociedad centroamericana, toma la iniciativa de desarrollar Por un mundo limpio como el vidrio, a través de la cual se brinda a los consumidores y público en general información útil y valiosa sobre los beneficios y los impacto del uso de vidrio para la salud y el medio ambiente, así como para la economía del hogar y detalles de los programas de reciclaje.      Horas: Abierto de 8am a 5pm entre semana y el sábado de 8am a 1pm.");
        Zona9.add("- Nombre: Recipa     Dirección: 3 Avenida 2-16 Zona 9 Ciudad de Guatemala, 01009,        Contacto: +502 2491 5050        Descripción: Recipa es una empresa dedicada al reciclaje de distintos materiales como metal, plástico, papel, cartón y vidrio, que pueden ser reutilizados como materia prima para nuevos productos.        Horas: Abierto de 8am a 5pm entre semana y el sábado de 8am a 12pm. "); 
        Zona14.add("- Nombre: Scrapex       Dirección: 5ta Avenida 5-55, Edificio Europlaza, Torre 1 Nivel 2 Zona 14 ciudad de Guatemala,       Contacto: +502 2386 9999        Descripción: Scrapex es una organización que se dedica al reciclaje de materiales como metal, baterías, electrónicos, luminarias, aceites y otros materiales.       Horas: Abierto de 7am a 5pm entre semana");
        Zona6.add("- Nombre: La Joya        Dirección: 1 Calle 1-85 Zona 6 Col Alamos San Miguel Petapa,        Contacto: + 502 2448 1286       Descripción: Recicladora La Joya es una empresa que se dedica al reciclaje de plástico. Compra y venta de desechos de papel, cartón y otros materiales reciclables.     Horas: Abierto de 8am a 5pm entre semana y el sábado de 8am a 12pm ");
        Zona18.add("- Nombre: Red Ecologica     Dirección: Kilómetro 8 Carretera al Atlántico, Zona 18, Ciudad de Guatemala,        Contacto: +502 2301 1500        Descripción: Red Ecológica es una empresa profesional, especializada en la recuperación y reciclaje de papel.       Horas: Abierto de 8am a 4pm entre semana");
       Zona3.add("- Nombre: Interfisa, 7a. Avenida 39-26, zona 3, Guatemala,        Contacto: +502 5834-5723        Descripción: Interfisa es una empresa profesional, especializada en la recuperación y reciclaje de papel, cartón y plástico.        Horas: Abierto de 8am a 5pm entre semana y el sábado de 8am a 11:30pm"); // centros de reciclaje 
    }
    /**
    * Zone()
    * Este recive la zona y registra la zona en la cual el usuario solicita la información
    * Regresa la zona solicitada
    */
    @Override
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
    
    @Override
    public void zone3() {
        for(int i = 0; i < Zona3.size(); i++) {
            System.out.println(Zona3.get(i));
        }
    }
    @Override
    public void zone6() {
        for(int i = 0; i < Zona6.size(); i++) {
            System.out.println(Zona6.get(i));
        }
    }
    @Override
    public void zone9() {
        for(int i = 0; i < Zona9.size(); i++) {
            System.out.println(Zona9.get(i));
        }
    }
    @Override
    public void zone12() {
        for(int i = 0; i < Zona12.size(); i++) {
            System.out.println(Zona12.get(i));
        }
    }
    @Override
    public void zone14() {
        for(int i = 0; i < Zona14.size(); i++) {
            System.out.println(Zona14.get(i));
        }
    }
    @Override
    public void zone18() {
        for(int i = 0; i < Zona18.size(); i++) {
            System.out.println(Zona18.get(i));
        }
    }
}
