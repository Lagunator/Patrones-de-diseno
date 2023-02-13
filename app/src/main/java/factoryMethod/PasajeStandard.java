package factoryMethod;

public class PasajeStandard implements IPasaje {
    private int numberFly;
    private Destino destiny = new Destino();
    private Origen origin = new Origen();
    private Avion plane = new Avion();
    private Pasajero passenger = new Pasajero();
    private int numberSeats;
    private String cost;

    public PasajeStandard() {}

    public int getNumberFly() {
        return numberFly;
    }

    public void setNumberFly(int numberFly) {
        this.numberFly = numberFly;
    }

    public Destino getDestiny() {
        return destiny;
    }

    public void setDestiny(Destino destiny) {
        this.destiny = destiny;
    }

    public Origen getOrigin() {
        return origin;
    }

    public void setOrigin(Origen origin) {
        this.origin = origin;
    }

    public Avion getPlane() {
        return plane;
    }

    public void setPlane(Avion plane) {
        this.plane = plane;
    }

    public Pasajero getPassenger() {
        return passenger;
    }

    public void setPassenger(Pasajero passenger) {
        this.passenger = passenger;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public void showPasaje() {
        System.out.println(" -The Passage Standart- ");
        System.out.println("Number of fly: "+ getNumberFly());
        destiny.showInfo();
        origin.showInfo();
        plane.showInfo();
        passenger.showInfo();
        System.out.println("Number of Seat: "+ getNumberSeats());
        System.out.println("The cost is: "+ getCost());
    }
}
