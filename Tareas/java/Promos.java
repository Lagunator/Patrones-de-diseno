public class Promocion {

    private Producto producto;
    private double descuento;
    private boolean aplicado;

    public Promociones(Producto producto, double descuento){
        this.producto = producto;
        this.descuento = descuento;
    }

    public void activar(){
        aplicado = true;
        Logger.getInstance().escribir("ESTE PRODUCTO "+producto.nombre()+" TIENE UN DESCUENTO DE: "+descuento+" %");
    }

    public void desactivar(){
        if(aplicado){
            Logger.getInstance().escribir("ESTE PRODUCTO "+producto.nombre()+" YA NO TIENE UN DESCUENTO DE: "+descuento+" %");
        } else{
            Logger.getInstance().escribir("ESTE PRODUCTO "+producto.nombre()+" TODAVÍA NO TIENE UN DESCUENTO DE: "+descuento+" %");
        }
    }
    
}
