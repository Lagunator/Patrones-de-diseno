package Visitor;

public class LibreCambista implements ILibreCambista{

    @Override
    public void cambiarBillete(Bolivia bolivia, int monto) {
        int cambioADolar = monto/7;
        int cambioAEuro = monto/8;
        System.out.println("Cambiar de Bolivianos a Dolares: " + cambioADolar);
        System.out.println("Cambiar de Bolivianos a Euros: " + cambioAEuro);
    }

    @Override
    public void cambiarBillete(USA eeuu, int monto) {
        int cambioABoliviano = monto*7;
        int cambioAEuro = monto;
        System.out.println("Change Dollars to Bolivianos: " + cambioABoliviano);
        System.out.println("Change Dollars to Euros: " + cambioAEuro);
    }

    @Override
    public void cambiarBillete(Europa europa, int monto) {
        int cambioABoliviano = monto*8;
        int cambioADolar = monto;
        System.out.println("Cambiar de Euros a Dolares: " + cambioADolar);
        System.out.println("Cambiar de Euros a Bolivianos: " + cambioABoliviano);
    }
}
