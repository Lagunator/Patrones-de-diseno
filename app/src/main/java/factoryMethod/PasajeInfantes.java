package factoryMethod;

public class PasajeInfantes implements IPasaje{
    private int numberFly;
    private Destino destiny = new Destino();
    private Origen origin = new Origen();
    private Avion fly = new Avion();
    private Pasajero passager = new Pasajero();
    private int numberSeats;
    private String differentCost;
    public PasajeInfantes() {}

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

    public Avion getFly() {
        return fly;
    }

    public void setFly(Avion fly) {
        this.fly = fly;
    }

    public Pasajero getPassager() {
        return passager;
    }

    public void setPassager(Pasajero passager) {
        this.passager = passager;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getDifferentCost() {
        return differentCost;
    }

    public void setDifferentCost(String differentCost) {
        this.differentCost = differentCost;
    }
    @Override
    public void showPasaje() {
        System.out.println(" -Passage Infant-");
        System.out.println("Number fly: "+ getNumberFly());
        destiny.showInfo();
        origin.showInfo();
        fly.showInfo();
        passager.showInfo();
        System.out.println("Number of Seats: "+ getNumberSeats());
        System.out.println("Special cost: "+ getDifferentCost());
    }
}
