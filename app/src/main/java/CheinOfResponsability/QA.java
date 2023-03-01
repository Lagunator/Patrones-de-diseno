package CheinOfResponsability;

public class QA implements IHandler{
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
        if (falla.getSeveridad().equalsIgnoreCase("ALTA")){
            System.out.println("El equipo QA soluciono la falla");
            falla.showInfo();
        } else {
            System.out.println("La falla no puede ser resuelta por el equipo de QA, siguiente");
            next.resolver(falla);
        }
    }
}
