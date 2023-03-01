package CheinOfResponsability;

public class Soporte implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void resolver(Falla falla) {
        if (falla.getSeveridad().equalsIgnoreCase("BAJA")){
            System.out.println("El equipo de Soporte soluciono la falla, siguiente");
            falla.showInfo();
        } else {
            System.out.println(">> La falla no puede ser resuelta por el equipo de Soporte, siguiente");
            next.resolver(falla);
        }
    }
}
