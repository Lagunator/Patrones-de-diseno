package State;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("RTX 1080", "SDRAM");
        pc.showInfo();

        pc.changeState(new ON());
        pc.showInfo();

        pc.changeState(new OFF());
        pc.showInfo();

        pc.changeState(new Restart());
        pc.showInfo();

    }
}
