package Composite;

public class Main {
    public static void main(String[] args){
        Computer c1 = new Computer("i9 7066", 100);
        Computer c2 = new Computer("i8 9050", 100);
        Computer c3 = new Computer("i7 8126", 100);
        Computer c4 = new Computer("i5 3600", 100);
        Computer c5 = new Computer("i5 9000", 100);
        Computer c6 = new Computer("i3 7230", 100);

        PCholder l1 = new PCholder("Laboratory");
        PCholder l2 = new PCholder("Laboratory");

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);

        l2.add(c4);
        l2.add(c5);
        l2.add(c6);

        PCholder pcContainer1 = new PCholder("Contenedor de PC's");
        pcContainer1.add(l1);
        pcContainer1.add(l2);

        System.out.println("El precio total del 'Contenedor de PC's' es: "+pcContainer1.getPrice());
    }
}
