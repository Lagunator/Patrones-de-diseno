package Decorator;

public class MejoraGPS extends Decorator{

    public MejoraGPS(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo puede utilizar el GPS desde ahora");
    }
}
