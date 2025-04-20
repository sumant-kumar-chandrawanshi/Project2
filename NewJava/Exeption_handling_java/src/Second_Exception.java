public class Second_Exception {
    void do_work()
    {
        System.out.println("do_work function");
        do_More_Work();
    }
    void do_More_Work()
    {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        Second_Exception e=new Second_Exception();
        e.do_work();

    }
}
