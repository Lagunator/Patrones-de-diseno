package CheinOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void resolver(Falla falla);
}
