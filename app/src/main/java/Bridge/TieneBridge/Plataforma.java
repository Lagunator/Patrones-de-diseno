package Bridge.TieneBridge;

public abstract class Plataforma {
    protected Arquitectura arqu;

    public Plataforma(Arquitectura arqu) {
        this.arqu = arqu;
    }

    public abstract void plataforma();
}
