package Observer;

import java.util.List;

public class Main {
    public static void main (String []args){

        Notificacion company = new Notificacion();
        company.setTitle("Compañia Telefonica");
        company.setDescripcion("Actividades");

        Client pedro = new Client("71962847", "Maria");
        Client maria = new Client("68255783", "Eynar");
        Client eynar = new Client("72045388", "Pedro");

        company.subscription(pedro, List.of("premios", "promociones"));
        company.subscription(maria, List.of("noticia"));
        company.subscription(eynar, List.of("precios llamadas", "promociones", "premios", "noticia"));


        company.addMensaje(new Mensaje("Premio al usuario 1 millon", "premios"));

    }
}
