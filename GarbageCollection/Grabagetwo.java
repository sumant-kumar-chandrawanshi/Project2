public class Grabagetwo {
    Grabagetwo i;
    public static void main(String[] args) {
        Grabagetwo g1=new Grabagetwo();
        Grabagetwo g2=new Grabagetwo();
        Grabagetwo g3=new Grabagetwo();
        g1.i=g2;
        g2.i=g3;
        g3.i=g1;
        g1=null;
        g2=null;
        g3=null;
    }
}
