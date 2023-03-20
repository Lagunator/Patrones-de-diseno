package Decorator;

public class Vagoneta implements IVehiculo{
    @Override
    public void avanzar() {
        System.out.println("La vagoneta esta partiendo");
    }
}
