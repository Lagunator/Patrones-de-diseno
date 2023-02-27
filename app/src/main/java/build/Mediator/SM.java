package build.Mediator;

public class SM extends Persona{
    private String certificaciones;
    public SM(ICanalComunicacion canalComunicacion, String certificaciones) {
        super(canalComunicacion);
        this.certificaciones=certificaciones;
    }

    @Override
    public void send(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfoPersona();
        System.out.println("Certificaciones: "+certificaciones);
        System.out.println("Mensaje recibido correctamente... "+msg+"\n");
    }
}
