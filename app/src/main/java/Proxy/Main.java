package Proxy;

public class Main {
    public static void main(String[] args) {
        CuentaDeAhorro miCuenta = new CuentaDeAhorro("Jaime",15000);
        TarjetaDeDebito tarjeta = new TarjetaDeDebito(miCuenta, "BS");

        tarjeta.depositar(200);

        tarjeta.setMoneda("USD");
        tarjeta.retirar(60);
    }
}
