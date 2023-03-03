package Observer;

import java.util.List;

public interface IClient {
    void update(String info, Mensaje message);
    void setTypeNotification(List<String> type);
    List<String> getTypeNotification();
}



//observer