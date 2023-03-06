package State;

public class OFF extends IState {
    @Override
    public void cambiarComponentes(PC pc) {
        System.out.println("Apagando tu PC");
        pc.getOpenProgram().clear();
        pc.getCpu().setConsumo(1);
        pc.getRam().setConsumoRAM(1);
        System.out.println("Apagado");
    }
}
