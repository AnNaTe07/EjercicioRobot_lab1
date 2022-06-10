
package robox;

import java.util.Scanner;


public class Robot {

    private int bat=1000;
    private Boolean state=true;// true dormido
    private int pasos;

    public int getBat() {
        return bat;
    }

    public Boolean getState() {
        return state;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

  /*  public Robot() {
        bat = 1000;
        state = true; //true dormido
    }*/

    void avanzar(int cant) {
        if (state == false) {
            pasos += cant;
            bat -= (cant * 10) / 100;
        } else {
            System.out.println("ROBOX esta dormido.");
        }
    }

    void retroceder(int cant) {
        if (state == false) {
            pasos += cant;
            bat -= (cant * 10) / 100;
        } else {
            System.out.println("ROBOX esta dormido.");
        }
    }

    void dormir() {
        state = true;
        System.out.println("ROBOX ha sido apagado");

    }

    void despertar() {
        state = false;
        System.out.println("ROBOX se ha encendido");
    }

    void recargar() {

        bat = 1000;
        System.out.println("\nROBOX RECARGADO");
        System.out.println(" ----------------");
        System.out.println("|======100%======|=");
        System.out.println(" ----------------\n");

    }

    boolean bateriaLlena() {

        return (bat == 1000) ? true : false;

    }

    boolean bateriaVacia() {
        System.out.println("\n ----------------");
        System.out.println("|       0%       |=");
        System.out.println(" ----------------\n");
        return (bat < 1) ? true : false;
    }

    int energiaActual() {

        return bat;
    }

    void carga(int pas){
        pasos += pas;
        bat -= pas * 10 / 100;
    }

    void personl() {
        int pas = 0, op;
        Scanner e = new Scanner(System.in);
        if (state != true && bat > 1) {
            do {

                System.out.println("\n≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
                System.out.println("≈ 1) Avanzar      ≈≈");
                System.out.println("≈ 2) Retroceder   ≈≈");
                System.out.println("≈ 3) Volver       ≈≈");
                System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈\n");
                do {
                    op = e.nextInt();
                    if (op < 1 || op > 3) {
                        System.out.println("!!!! INGRESE UNA OPCION CORRECTA !!!!");
                    }
                } while (op < 1 || op > 3);
                switch (op) {
                    case 1:
                        System.out.println("Ingrese la cantidad de pasos");
                        pas = e.nextInt();
                        if(((pas * 10) / 100) <= bat){
                            carga(pas);
                            op=0;
                        } else{
                            System.out.println("No se pueden hacer tantos pasos");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad de pasos");
                        pas = e.nextInt();
                        if(((pas * 10) / 100) <= bat){
                            carga(pas);
                            op=0;
                        } else{
                            System.out.println("No se pueden hacer tantos pasos");
                        }
                        break;
                    case 3:
                        break;
                }
                if (((pas * 10) / 100) > bat && op != 0) {
                    int rec;
                    System.out.println("La bateria de ROBOX es insuficiente. Desea recargar? \n1- SI. 2- NO.");
                    do {
                        rec = e.nextInt();
                        if (rec < 1 || rec > 2) {
                            System.out.println("Ingrese un dato correcto.");
                        }
                    } while (rec < 1 || rec > 2);
                    if (rec == 1) {
                        recargar();
                    }
                }
            } while (((pas * 10) / 100) <= bat && op != 3 && bat != 0 && bat != 1);
        } else {
            if(state == true){
            System.out.println("ROBOX esta apagado.");
            } else {
                System.out.println("\nBATERIA INSUFICIENTE, RECARGUE\n");
            }
        }
    }

}


