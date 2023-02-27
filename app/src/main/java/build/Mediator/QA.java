package build.Mediator;

public class QA extends Persona{
    private String grado;
    public QA(ICanalComunicacion canalComunicacion, String grado){
        super(canalComunicacion);
        this.grado=grado;
    }
    @Override
    public void send(String msg) {
        this.canalComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfoPersona();
        System.out.println("Grado: "+grado);
        System.out.println("Mensaje recibido correctamente... "+msg+"\n");
    }

}
