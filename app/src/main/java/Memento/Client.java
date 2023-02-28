package Memento;

public class Client {
    public static void main(String[] args) {
        BackupManager backupManager = new BackupManager();

        BaseDeDatos bd = new BaseDeDatos();

        bd.insertPersona(new Persona("Jaime","8264647832",18));
        bd.insertPersona(new Persona("Jonas","384738r943",26));
        bd.insertPersona(new Persona("Samuel","328473922",33));
        bd.insertPersona(new Persona("Rosa","384638945",42));
        bd.insertPersona(new Persona("MAnuela","38745284",15));
        backupManager.addMemento(new Backup("enero", bd));

        bd.insertPersona(new Persona("Ale","347875936",62));
        bd.insertPersona(new Persona("Julian","68972564",7));
        bd.insertPersona(new Persona("Sara","2774562884",8));
        bd.insertPersona(new Persona("Hugo","939757252",9));
        bd.insertPersona(new Persona("Lucas","858963321",10));
        backupManager.addMemento(new Backup("febrero", bd));


        bd.insertPersona(new Persona("Natan","568854448",11));
        bd.insertPersona(new Persona("Carlos","4578933",12));
        bd.insertPersona(new Persona("Carla","2257995",35));
        bd.insertPersona(new Persona("Monica","22467843",13));
        bd.insertPersona(new Persona("Gerardo","233478984",16));
        bd.insertPersona(new Persona("Gabriel","23457833",17));
        bd.insertPersona(new Persona("Oscar","32948622",18));
        bd.insertPersona(new Persona("Lucio","23257843",21));
        bd.insertPersona(new Persona("Huascar","235678899",22));
        bd.insertPersona(new Persona("Emanuel","445788944",50));
        backupManager.addMemento(new Backup("marzo", bd));


        bd.insertPersona(new Persona("Lesly","2368965",23));
        bd.insertPersona(new Persona("Simon","225787443",24));
        bd.insertPersona(new Persona("Sheyla","3456677885",25));
        bd.insertPersona(new Persona("Tomas","34367674",15));
        bd.insertPersona(new Persona("Tomy","4578874",26));
        backupManager.addMemento(new Backup("abril", bd));


        bd.insertPersona(new Persona("Lizbeth","7801924274",27));
        bd.insertPersona(new Persona("Kami","3334366777",29));
        bd.insertPersona(new Persona("Sion","445778",31));
        bd.insertPersona(new Persona("Romeo","5678876",32));
        bd.insertPersona(new Persona("Felipe","33567788",33));
        bd.insertPersona(new Persona("Willy","454567878",34));
        bd.insertPersona(new Persona("Elias","347878554",20));
        bd.insertPersona(new Persona("Sipe","0990281566",36));
        bd.insertPersona(new Persona("Joaquin","3467898",19));
        bd.insertPersona(new Persona("Omar","434677",40));
        bd.insertPersona(new Persona("Nicolas","34678989",37));
        bd.insertPersona(new Persona("Brenda","33577432",14));
        bd.insertPersona(new Persona("Kath","35798985",39));
        bd.insertPersona(new Persona("Melany","45477",41));
        bd.insertPersona(new Persona("Maty","4005396119",42));
        bd.insertPersona(new Persona("Fonsi","0785857559",43));
        bd.insertPersona(new Persona("Ezequiel","0305371312",28));
        bd.insertPersona(new Persona("Rafa","2573751953",44));
        bd.insertPersona(new Persona("Eynar","2740436033",47));
        bd.insertPersona(new Persona("Ambar","4194704444",38));
        bd.insertPersona(new Persona("Enrique","6001606862",45));
        bd.insertPersona(new Persona("Joel","7048285737",46));
        bd.insertPersona(new Persona("Ander","5617408704",30));
        bd.insertPersona(new Persona("Ema","4173728867",49));
        bd.insertPersona(new Persona("Rene","0431028087",48));
        backupManager.addMemento(new Backup("mayo", bd));

        BaseDeDatos bd_enero = backupManager.getMemento(0).getBaseDeDatos();
        BaseDeDatos bd_febrero = backupManager.getMemento(1).getBaseDeDatos();
        BaseDeDatos bd_marzo = backupManager.getMemento(2).getBaseDeDatos();
        BaseDeDatos bd_abril = backupManager.getMemento(3).getBaseDeDatos();
        BaseDeDatos bd_mayo = backupManager.getMemento(4).getBaseDeDatos();

        bd_febrero.mostrarTodasLasPersonas();
    }
}
