package Decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        IVehiculo mini = new Minibus();
        mini.avanzar();
        mini = new MejoraTurbo(mini);
        mini.avanzar();
        mini = new MejoraGAS(mini);
        mini.avanzar();
        mini = new MejoraGPS(mini);
        mini.avanzar();

        System.out.println();

        IVehiculo taxi = new Taxi();
        taxi.avanzar();
        taxi = new MejoraGPS(taxi);
        taxi.avanzar();

        System.out.println();

        IVehiculo vago = new Vagoneta();
        vago.avanzar();
        vago = new MejoraTurbo(vago);
        vago.avanzar();
        vago = new MejoraGPS(vago);
        vago.avanzar();
    }
}
