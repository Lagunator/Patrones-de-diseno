package Bridge.NoTiene;

public class Main {
    public static void main(String[] args) {
        Windows7x64 pc1 = new Windows7x64();
        pc1.plataforma();
        pc1.arquitectura();

        Linux86 pc2 = new Linux86();
        pc2.plataforma();
        pc2.arquitectura();
    }
}
