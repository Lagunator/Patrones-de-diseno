public class Factura {

    private String nit;
    private double monto;

    public Factura(String nit, double monto){
        this.nit = nit;
        this.monto = monto;
    }

    public void escribir(){
        Logger.getInstance().escribir("SE CREÓ FACTURA QUE TIENE EL NIT: "+nit+" DE UN MONTO DE: "+monto+" BS");
    }

    public void anular(){
        Logger.getInstance().escribir("SE ANULÓ FACTURA QUE TIENE NIT: "+nit+" DE UN MONTO DE: "+monto+" BS");
    }
}
