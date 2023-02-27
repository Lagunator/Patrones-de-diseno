package build.Mediator;

public class Main {
    public static void main(String[] args) {
        Skype skype = new Skype();

        Dev dev1 = new Dev(skype, "python");
        dev1.setCi("69414689").setName("Andres").setCargo("dev");
        Dev dev2 = new Dev(skype, "JavaScript");
        dev2.setCi("74017401").setName("Ramon").setCargo("dev");
        Dev dev3 = new Dev(skype, "Scratch");
        dev3.setCi("74017490").setName("Sergio").setCargo("dev");

        QA qa1 = new QA(skype,"Junior");
        qa1.setCi("47104011").setName("Mauricio").setCargo("QA");
        QA qa2 = new QA(skype, "Senior");
        qa2.setCi("643926119").setName("Paul").setCargo("QA");
        QA qa3 = new QA(skype, "Medium");
        qa3.setCi("470172074").setName("Ian").setCargo("QA");

        SM sm1 = new SM(skype,"Scru Manager");
        sm1.setCi("07403174").setName("Enrique").setCargo("SM");
        SM sm2 = new SM(skype, "Jefe Scrum");
        sm2.setCi("64891648").setName("Ignacio").setCargo("SM");
        SM sm3 = new SM(skype, "DevOps");
        sm3.setCi("74012904").setName("Martin").setCargo("SM");


        skype.addProfesionalToTheChat(dev1.getCi(), dev1)
                .addProfesionalToTheChat(dev2.getCi(),dev2)
                .addProfesionalToTheChat(dev3.getCi(), dev3)
                .addProfesionalToTheChat(qa1.getCi(), qa1)
                .addProfesionalToTheChat(qa2.getCi(), qa2)
                .addProfesionalToTheChat(qa3.getCi(),qa3)
                .addProfesionalToTheChat(sm1.getCi(), sm1)
                .addProfesionalToTheChat(sm2.getCi(),sm2)
                .addProfesionalToTheChat(sm3.getCi(), sm3);
        qa1.send("A todos los QA's favor de enviar un informe");


    }
}
