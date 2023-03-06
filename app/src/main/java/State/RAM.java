package State;

public class RAM {
    private String RAMnombre;
    private double consumoRAM = 0;

    public RAM(String nombreRAM) {
        this.RAMnombre = nombreRAM;
    }

    public void showInfo() {
        System.out.println("---- RAM -----");
        System.out.println("Nombre: " + RAMnombre);
        System.out.println("Consumo: "+ consumoRAM);
    }

    public String getRAMnombre() {
        return RAMnombre;
    }

    public void setRAMnombre(String RAMnombre) {
        this.RAMnombre = RAMnombre;
    }

    public double getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(double consumoRAM) {
        this.consumoRAM = consumoRAM;
    }
}
