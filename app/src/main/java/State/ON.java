package State;

import java.util.List;
import java.util.Random;

public class ON extends IState {
    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Iniciando todos los programas para la PC");
        List<String> programasEjecutados = List.of("Anydesk", "Microsoft Teams","Warcraft","Antivirus","Chrome");
        Random random = new Random();

        int programas = random.nextInt(9)+1;
        double consumoRAM = pc.getRam().getConsumoRAM();
        double consumoCPU = pc.getCpu().getConsumo();

        for(int p = 0; p < programas;p++ ){
            System.out.println("Ejecutando : "+programasEjecutados.get(p));
            pc.getOpenProgram().add(programasEjecutados.get(p));
            try {
                Thread.sleep(1000);
                consumoCPU += 5;
                pc.getCpu().setConsumo(consumoCPU);
                consumoRAM += 5;
                pc.getRam().setConsumoRAM(consumoRAM);
                pc.showInfo();
            }catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        System.out.println("Iniciando");
    }
}
