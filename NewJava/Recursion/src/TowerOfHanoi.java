public class TowerOfHanoi {
    public void toh(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("element "+n+" is transfer into "+s+" to "+d);

            return;
        }
        toh(n-1,s,d,h);
        System.out.println("element "+n+" is transfer into "+s+" to "+d);
        toh(n-1,h,s,d);
    }
    public static void main(String[] args) {
        int n=2;
        TowerOfHanoi t=new TowerOfHanoi();
        t.toh(n,"sourse","helper","Destination");

    }
}
