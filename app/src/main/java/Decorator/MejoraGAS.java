package Decorator;

public class MejoraGAS extends Decorator{

    public MejoraGAS(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void avanzar() {
        System.out.println("El vehiculo ahora puede soportar gas");
    }
}
