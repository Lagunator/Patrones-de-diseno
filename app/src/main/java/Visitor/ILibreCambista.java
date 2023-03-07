package Visitor;

public interface ILibreCambista {
    void cambiarBillete(Bolivia bolivia, int monto);
    void cambiarBillete(USA eeuu, int monto);
    void cambiarBillete(Europa europa, int monto);
}
