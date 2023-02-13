package factoryMethod;

public class PasajeStandardCreator extends CreatorPasaje{
    @Override
    public PasajeStandard create() {
        PasajeStandard pasaje = new PasajeStandard();
        pasaje.setNumberFly(79);

        Destino destino = new Destino();
        destino.setAirport("El Dorado");
        destino.setCity("Bogota");
        destino.setCountry("Colombia");
        pasaje.setDestiny(destino);

        Origen origen = new Origen();
        origen.setAirport("Barajas");
        origen.setCity("Madrid");
        origen.setCountry("Eapaña");
        pasaje.setOrigin(origen);

        Avion avion = new Avion();
        avion.setCapacity("250 personas");
        avion.setBrand("Avianca");
        avion.setModelo("F97");
        avion.setNumberSeats("230 asientos");
        pasaje.setPlane(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setName("Alonso");
        pasajero.setId("9228464");
        pasaje.setPassenger(pasajero);

        pasaje.setNumberSeats(62);
        pasaje.setCost("3500 Bs");

        return pasaje;
    }
}
