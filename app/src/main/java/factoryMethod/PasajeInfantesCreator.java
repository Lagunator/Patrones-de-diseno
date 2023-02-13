package factoryMethod;

public class PasajeInfantesCreator extends CreatorPasaje{
    @Override
    public PasajeInfantes create() {
        PasajeInfantes pasaje = new PasajeInfantes();
        pasaje.setNumberFly(25);

        Destino destino = new Destino();
        destino.setAirport("Evo Morales Airport");
        destino.setCity("Cochabamba Tropico");
        destino.setCountry("Bolivia");
        pasaje.setDestiny(destino);

        Origen origen = new Origen();
        origen.setAirport("Congonhas");
        origen.setCity("Sao Paolo");
        origen.setCountry("Brasil");
        pasaje.setOrigin(origen);

        Avion avion = new Avion();
        avion.setCapacity("400 personas");
        avion.setBrand("Boeing");
        avion.setModelo("F156");
        avion.setNumberSeats("100 asientos");
        pasaje.setFly(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setName("Mauricio");
        pasajero.setId("17705");
        pasaje.setPassager(pasajero);

        pasaje.setNumberSeats(74);
        pasaje.setDifferentCost("700 Bs");

        return pasaje;
    }

}
