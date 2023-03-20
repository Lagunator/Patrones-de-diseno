package Decorator;

public class MejoraTurbo extends Decorator{

    public MejoraTurbo(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo puede ser más veloz gracias a su implementacion de tubo");
    }
}
