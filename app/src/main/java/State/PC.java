package State;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<String> openProgram = new ArrayList<>();
    private CPU cpu;
    private IState state;
    private RAM ram;

    public PC(String nombreCPU, String nombreRAM) {
        state = new OFF();
        cpu = new CPU(nombreCPU);
        ram = new RAM(nombreRAM);
    }
    public void changeState(IState state) {
        this.state = state;
        state.cambiarComponentes(this);
    }
    public void showInfo() {
        System.out.println("_______PC_______");
        System.out.println("La cantidad de programas que estan abiertos: "+ openProgram.size());
        System.out.println();
        ram.showInfo();
        cpu.showInfo();
    }

    public List<String> getOpenProgram() {
        return openProgram;
    }

    public void setOpenProgram(List<String> openProgram) {
        this.openProgram = openProgram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
