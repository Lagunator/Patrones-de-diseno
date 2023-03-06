package State;

public class CPU {
    private String CPUnombre;
    private double consumoRecurso;

    public CPU(String nombreCPU) {
        this.CPUnombre = nombreCPU;
    }
    public void showInfo() {
        System.out.println("---- CPU -----");
        System.out.println("Nombre: "+ CPUnombre);
        System.out.println("Consumo: "+ consumoRecurso);
    }

    public String getCPUnombre() {
        return CPUnombre;
    }

    public void setCPUnombre(String CPUnombre) {
        this.CPUnombre = CPUnombre;
    }

    public double getConsumo() {
        return consumoRecurso;
    }

    public void setConsumo(double consumo) {
        this.consumoRecurso = consumo;
    }
}
