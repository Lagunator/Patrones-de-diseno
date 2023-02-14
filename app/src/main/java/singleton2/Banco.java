package singleton2;

public class Banco {

    public Banco(){
        System.out.println("Inicializando Banco");
    }
    public double exchangeBolivianos(int amount, String type){
        return EmpresaCambio.getCambio().convertToBoliviano(amount, type);
    }
    public double exchangeDollars(int amount, String type){
        return EmpresaCambio.getCambio().convertToDollar(amount, type);
    }
    public double exchangeEuros(int amount, String type){
        return EmpresaCambio.getCambio().convertToEuro(amount, type);
    }
}
