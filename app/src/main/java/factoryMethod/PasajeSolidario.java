package factoryMethod;

public class PasajeSolidario implements IPasaje{
    private int numberFly;
    private Destino destiny = new Destino();
    private Origen origin = new Origen();
    private Avion plane = new Avion();
    private Pasajero passager = new Pasajero();
    private int numberSeats;
    private String cost;
    private String ofert;
    private String kindOfert;

    public PasajeSolidario() {}

    public int getNumeroVuelo() {
        return numberFly;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numberFly = numeroVuelo;
    }

    public Destino getDestino() {
        return destiny;
    }

    public void setDestino(Destino destino) {
        this.destiny = destino;
    }

    public Origen getOrigen() {
        return origin;
    }

    public void setOrigen(Origen origen) {
        this.origin = origen;
    }

    public Avion getAvion() {
        return plane;
    }

    public void setAvion(Avion avion) {
        this.plane = avion;
    }

    public Pasajero getPasajero() {
        return passager;
    }

    public void setPasajero(Pasajero pasajero) {
        this.passager = pasajero;
    }

    public int getNumeroAsiento() {
        return numberSeats;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numberSeats = numeroAsiento;
    }

    public String getCostoPasaje() {
        return cost;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.cost = costoPasaje;
    }

    public String getDescuento() {
        return ofert;
    }

    public void setDescuento(String descuento) {
        this.ofert = descuento;
    }

    public String getMotivoDescuento() {
        return kindOfert;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.kindOfert = motivoDescuento;
    }

    @Override
    public void showPasaje() {
        System.out.println(" -Solidarity Passager");
        System.out.println("Number of Fly: "+getNumeroVuelo());
        destiny.showInfo();
        origin.showInfo();
        plane.showInfo();
        passager.showInfo();
        System.out.println("Number of Seat: "+getNumeroAsiento());
        System.out.println("Cost: "+getCostoPasaje());
        System.out.println("Ofert: "+getDescuento());
        System.out.println("Kind of Ofert: "+getMotivoDescuento());
    }
}
