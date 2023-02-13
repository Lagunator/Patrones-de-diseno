package factoryMethod;

public class LaunchPasaje {
    public static void main(String[] args) {
        PasajeStandard pS1 = new PasajeStandardCreator().create();
        PasajeStandard pS2 = new PasajeStandardCreator().create();

        PasajeSolidario pSo1 = new PasajeSolidarioCreator().create();
        PasajeSolidario pSo2 = new PasajeSolidarioCreator().create();

        PasajeInfantes pI1 = new PasajeInfantesCreator().create();
        PasajeInfantes pI2 = new PasajeInfantesCreator().create();

        System.out.println("********************************");
        pS1.getPassenger().setName("Rodolfo");
        pS1.getPassenger().setId("72403");
        pS1.setNumberSeats(94);
        pS1.showPasaje();
        System.out.println("************************");
        pS2.getPassenger().setName("Facundo");
        pS2.getPassenger().setId("76414");
        pS2.setNumberSeats(18);
        pS2.showPasaje();

        System.out.println("************************");
        pSo1.getPasajero().setName("Ana");
        pSo1.getPasajero().setId("89566");
        pSo1.setNumeroAsiento(10);
        pSo1.showPasaje();
        System.out.println("************************");
        pSo2.getPasajero().setName("Jonas");
        pSo2.getPasajero().setId("397512");
        pSo2.setNumeroAsiento(23);
        pSo2.showPasaje();

        System.out.println("************************");
        pI1.getPassager().setName("Elias");
        pI1.getPassager().setId("67821");
        pI1.setNumberSeats(54);
        pI1.showPasaje();
        System.out.println("************************");
        pI2.getPassager().setName("Rene");
        pI2.getPassager().setId("70045");
        pI2.setNumberSeats(61);
        pI2.showPasaje();
    }
}
