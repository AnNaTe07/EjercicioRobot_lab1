package robox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class robox {

    public static void main(String[] args) {

        Robot robox = new Robot();
        Hombre lalo = new Hombre();
        Hombre carla = new Hombre();
        int op;
        Scanner e = new Scanner(System.in);
        do {

            System.out.println("================================");
            System.out.println("=======   MENU DE ROBOX  =======");
            System.out.println("================================");
            System.out.println("===  1) ENCENDER ROBOT       ===");
            System.out.println("===  2) APAGAR ROBOT         ===");
            System.out.println("===  3) CONSULTAR BATERIA    ===");
            System.out.println("===  4) RECARGAR ROBOT       ===");
            System.out.println("===  5) LALO JUEGA           ===");
            System.out.println("===  6) CARLA JUEGA          ===");
            System.out.println("===  7) JUGADA PERSONALIZADA ===");
            System.out.println("===  8) VER ESTADO DEL ROBOT ===");
            System.out.println("===  9) DEJAR DE JUGAR       ===");
            System.out.println("================================");
            System.out.println("====   INGRESE UNA OPCION   ====");
            System.out.println("================================");
       try{    do {
                op = e.nextInt();
                if (op < 1 || op > 9) {
                    System.out.println("!!!! INGRESE UNA OPCION CORRECTA !!!!");
                }
            } while (op < 1 || op > 9);
       }catch(InputMismatchException ex){
           System.out.println("La opción ingresada no corresponde a lo solicitado.");
       }
            switch (op=0) {
                case 1:
                    robox.despertar();
                    continue;
                case 2:
                    robox.dormir();
                    continue;
                case 3:
                    System.out.println("Energia: " + robox.energiaActual() + "%");
                    if (robox.bateriaLlena()) {
                        System.out.println("La bateria esta llena.");

                    } else if (robox.getBat() == 0) {
                        robox.bateriaVacia();
                    }
                    continue;
                case 4:
                    robox.recargar();
                    continue;
                case 5:
                    lalo.jugarConRobot(robox);
                    continue;
                case 6:
                    carla.jugarConRobot(robox);
                    continue;
                case 7:
                    robox.personl();
                    continue;
                case 8:
                    System.out.println("\nEnergia: " + robox.energiaActual() + "%");
                    System.out.println("Pasos: " + robox.getPasos());
                    continue;
                case 9:
                    robox.dormir();
                    System.out.println("***********");
                    System.out.println("   Adios!  ");
                    System.out.println("***********");
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("Opcion ingresada inválida");
                    System.out.println("-------------------------");
            }
        } while (op != 9);

    }

}
