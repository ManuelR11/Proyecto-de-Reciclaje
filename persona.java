import java.util.ArrayList;

import java.util.Scanner;
public class persona {
    Scanner sc = new Scanner(System.in);
    String name = "";
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
