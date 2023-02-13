package factoryMethod;

public class PasajeSolidarioCreator extends CreatorPasaje{
    @Override
    public PasajeSolidario create() {
        PasajeSolidario pasaje = new PasajeSolidario();
        pasaje.setNumeroVuelo(5);

        Destino destino = new Destino();
        destino.setAirport("Franco");
        destino.setCity("Rio de Janeiro");
        destino.setCountry("Brazil");
        pasaje.setDestino(destino);

        Origen origen = new Origen();
        origen.setAirport("Viru Viru");
        origen.setCity("Santa Cruz");
        origen.setCountry("Bolivia");
        pasaje.setOrigen(origen);

        Avion avion = new Avion();
        avion.setCapacity("300 personas");
        avion.setBrand("AirPlane");
        avion.setModelo("F23");
        avion.setNumberSeats("300 asientos");
        pasaje.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setName("Juan");
        pasajero.setId("789415");
        pasaje.setPasajero(pasajero);

        pasaje.setNumeroAsiento(52);
        pasaje.setCostoPasaje("200 Bs");
        pasaje.setDescuento("25%");
        pasaje.setMotivoDescuento("Apoyo economico");

        return pasaje;
    }
}
