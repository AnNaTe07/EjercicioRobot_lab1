package p1e1;

public class Hombre {

    public Hombre() {

    }

    public void jugarConRobot(Robot robo) {

        if (robo.getState() != true && robo.getBat() >= 52) {
            robo.avanzar(500);
            System.out.println("Robox avanza 500 pasos");
            robo.retroceder(20);
            System.out.println("Robox retrocede 20 pasos");
            System.out.println("Bateria al " + robo.energiaActual() + "%");
            System.out.println("Apagando...");
            robo.dormir();
        } else {
            if (robo.getBat() < 52) {
                System.out.println("\nLA BATERIA DE ROBOX NO ES SUFICIENTE PARA JUGAR\n");
            } else {
                System.out.println("No se puede jugar, el robot esta apado");
            }
        }

    }

}


