public class Main {
    public static void main(String[] args) {
        Locomotora loc509 = new Locomotora(509);
        Locomotora loc566 = new Locomotora(566);
        Locomotora loc666 = new Locomotora();
        loc666.codigo = 666;
        vagon vagon1 = new vagon("2 pesos", 80);
        vagon vagon2 = new vagon("1 pesos", 40);
        vagon vagon3 = new vagon("2 pesos", 80);
      
        Tren tren509=new Tren(509);
        loc509.tren=tren509;
        vagon1.tren=tren509;
        vagon2.tren=tren509;

        Tren tren666=new Tren(666);
        loc666.tren=tren666;
        vagon3.tren=tren666;

        System.out.println(tren509);
        System.out.println(tren666);
       
    }
}