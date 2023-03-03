package Observer;

public class Mensaje {
    private String contenido;
    private String titulo;

    public Mensaje(String info, String titulo) {
        this.contenido = info;
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String info) {
        this.contenido = info;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void showInfo() {
        System.out .println("Message {" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' + '}');
    }
}
