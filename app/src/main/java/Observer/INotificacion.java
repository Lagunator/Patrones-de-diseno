package Observer;

import java.util.List;

public interface INotificacion {
    void subscription(IClient client, List<String> types);
    void removeSubscription(IClient client);
    void notify(Mensaje message);
}
