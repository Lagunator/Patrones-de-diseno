package Decorator;

public class Minibus implements IVehiculo{
    @Override
    public void avanzar() {
        System.out.println("El minibus arranca");
    }
}
