package factoryMethod;

public class PasajeSolidarioCreator extends CreatorPasaje{
    @Override
    public PasajeSolidario create() {
        PasajeSolidario pasaje = new PasajeSolidario();
        pasaje.setNumeroVuelo(5);

        Destino destino = new Destino();
        destino.setAirport("Che Guevara");
        destino.setCity("Buenos Aires");
        destino.setCountry("Argentina");
        pasaje.setDestino(destino);

        Origen origen = new Origen();
        origen.setAirport("Viru Viru");
        origen.setCity("Santa Cruz");
        origen.setCountry("Bolivia");
        pasaje.setOrigen(origen);

        Avion avion = new Avion();
        avion.setCapacity("150 personas");
        avion.setBrand("Boing");
        avion.setModelo("F27");
        avion.setNumberSeats("180 asientos");
        pasaje.setAvion(avion);

        Pasajero pasajero = new Pasajero();
        pasajero.setName("Gerardo");
        pasajero.setId("785517");
        pasaje.setPasajero(pasajero);

        pasaje.setNumeroAsiento(32);
        pasaje.setCostoPasaje("2000 Bs");
        pasaje.setDescuento("15%");
        pasaje.setMotivoDescuento("Apoyo economico");

        return pasaje;
    }
}
