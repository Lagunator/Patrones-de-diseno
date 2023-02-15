package build;

public class Computadora {
    private int monitor;
    private String teclado;
    private String mouse;
    private String memoria;
    private String procesador;
    private int video;

    public int getMonitor() {
        return monitor;
    }

    public Computadora setMonitor(int monitor) {
        this.monitor = monitor;
        return this;
    }

    public String getTeclado() {
        return teclado;
    }

    public Computadora setTeclado(String teclado) {
        this.teclado = teclado;
        return this;
    }

    public String getMouse() {
        return mouse;
    }

    public Computadora setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public String getMemoria() {
        return memoria;
    }

    public Computadora setMemoria(String memoria) {
        this.memoria = memoria;
        return this;
    }

    public String getProcesador() {
        return procesador;
    }

    public Computadora setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public int getVideo() {
        return video;
    }

    public Computadora setVideo(int video) {
        this.video = video;
        return this;
    }
    public void showComputadora(){
        System.out.println("El Monitor es: "+getMonitor());
        System.out.println("El Teclado es: "+getTeclado());
        System.out.println("El Mouse es: "+getMouse());
        System.out.println("La Memoria es: "+getMemoria());
        System.out.println("El Procesador es: "+getProcesador());
        System.out.println("El Video es: "+getVideo());
    }
}
