package Decorator;

public class Taxi implements IVehiculo{
    @Override
    public void avanzar() {
        System.out.println("El taxi esta partiendo");
    }
}
