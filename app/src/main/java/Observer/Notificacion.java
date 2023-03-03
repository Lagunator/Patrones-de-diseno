package Observer;

import java.util.ArrayList;
import java.util.List;

public class Notificacion implements  INotificacion{

    private String title;
    private String descripcion;
    private List<IClient> clientList = new ArrayList<>();
    private List<Mensaje> messageList = new ArrayList<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Mensaje> getMeensajeList() {
        return messageList;
    }

    public void addMensaje(Mensaje mensaje) {
        this.messageList.add(mensaje);
        this.notify(mensaje);

    }

    @Override
    public void subscription(IClient client, List<String> type) {
        client.setTypeNotification(type);
        clientList.add(client);
    }

    @Override
    public void removeSubscription(IClient client) {
        clientList.remove(client);

    }

    @Override
    public void notify(Mensaje mensaje) {
        for (IClient client: clientList) {
            if (client.getTypeNotification().contains(mensaje.getTitulo()))
                client.update("Notificación: ["+title+"] envia un anuncio: \n",mensaje);
        }
    }
}
