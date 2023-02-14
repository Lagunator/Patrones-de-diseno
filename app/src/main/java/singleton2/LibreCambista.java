package singleton2;

public class LibreCambista {
    public LibreCambista(){
        System.out.println("Inicializando LibreCambista");
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
