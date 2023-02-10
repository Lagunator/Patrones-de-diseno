package com.example.patronesdediseo.prototype;

public class LaunchCelu {
    public static void main(String[] args) {

        Celular venta = new Celular("Samsumg R10",
                "41 x 53 mm",2,"8.0.1",
                "5.8 MP","Si",1,
                "600 mAh","Audifono, Cable Cargador, Protector");
        venta.setSim(new Sim("Entel","72910558"));
        System.out.println("------------PRIMERO------------");
        venta.showInfo();
        System.out.println("----------------SEGUNDO-----------------");
        Celular venta1 = venta.clone();
        venta1.setSim(new Sim("Tigo","5863308"));
        venta1.showInfo();
        System.out.println("----------------TERCERO--------------");
        Celular venta2 = venta.clone();
        venta2.setSim(new Sim("Viva","72069759"));
        venta2.showInfo();
        System.out.println("-----------------CUARTO--------------");
        Celular venta3 = venta.clone();
        venta3.setSim(new Sim("Claro","72709121"));
        venta3.showInfo();
        System.out.println("*******************FIVE********************");
        Celular venta4 = venta.clone();
        venta4.setSim(new Sim("Movistar","71971047"));
        venta4.showInfo();
        System.out.println("*******************FINISH********************");
    }
}
