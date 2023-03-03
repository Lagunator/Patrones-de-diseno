package Observer;

import java.util.ArrayList;
import java.util.List;

public class Client implements IClient{
    private String ci;
    private String name;
    private List<String> types;

    public Client(String ci, String name) {
        this.ci = ci;
        this.name = name;
        types = new ArrayList<>();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void update(String info, Mensaje message) {
        System.out.println("$$$$$$$$$$ Notificacion $$$$$$$$$$$");
        System.out.println("nombre: "+name);
        System.out.println("carnet: "+ci);
        for(String type: types){
            System.out.print(type + ", ");
        }
        System.out.println();
        System.out.println(info);
        message.showInfo();
        System.out.println("$$$$$$$$$$         $$$$$$$$$$");

    }

    @Override
    public void setTypeNotification(List<String> types) {
        this.types = types;
    }

    @Override
    public List<String> getTypeNotification() {
        return types;
    }
}
