class demogc
{
    void finalize()
    {
        System.out.println("finlize ");

    }
    public static void main(String[] args) {
        demogc d=new demogc();
        demogc d1=new demogc();
        d=null;
        d1=null;
    }
}