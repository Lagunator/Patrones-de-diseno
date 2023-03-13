package Adapter;

public class Main {
    public static void main(String[] args) {
        AppAndroid youtube = new AppAndroid();

        AppEscritorio paint = new AppEscritorio();
        AppEscritorioAdapter paintMobile = new AppEscritorioAdapter(paint);

        youtube.login();
        youtube.reportes();
        youtube.logout();

        paintMobile.login();
        paintMobile.reportes();
        paintMobile.logout();
    }
}
