package State;

import java.util.List;

public class Restart extends IState {

    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Reiniciando tu computadora");
        List<String> openPrograms = pc.getOpenProgram();
        for (String programa : openPrograms) {
            System.out.println("Cerrando todos los programas: "+programa);
        }
        pc.getOpenProgram().clear();
        pc.getCpu().setConsumo(0);
        pc.getRam().setConsumoRAM(0);
        System.out.println("Computadora reiniciada");
    }
}
