package CheinOfResponsability;

public class DEV implements IHandler{
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
        if (falla.getSeveridad().equalsIgnoreCase("CRITICA")){
            System.out.println(" El equipo DEV soluciono la falla");
            falla.showInfo();
        } else {
            System.out.println(">> El equipo DEV no pudo solucionar la falla, siguiente");
            next.resolver(falla);
        }
    }
}
