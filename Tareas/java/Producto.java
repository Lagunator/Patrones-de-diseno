public class Producto {
    
    private String nombre;
    private String marca;

    public Producto(String nombre, String marca){
        this.nombre = nombre;
        this.marca = marca;
    }

    public void registrado(){
        Logger.getInstance().escribir("ESTÁ REGISTRANDO EL PRODUCTO: "+nombre+" DE "+marca);
    }

    public void eliminado(){
        Logger.getInstance().escribir("ESTÁ ELIMINANDO EL PRODUCTO: "+nombre+" DE "+marca);
    }

    public String nombre(){
        return nombre+" DE "+marca;
    }
}
