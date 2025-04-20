class Person1 {
    int id;
    String name;
    
    void set_Person(int id,String name)
    {
        try {
            this.id=id;
            this.name=name;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    void disp_Person()
    {
        System.out.println(id+"\t"+name+"\t");
    }
}

public class Employeel1 extends Person1 {
    int sal;
    String desgn;
    void set_Emp(int id, String name, String desgn, int sal)
    {
        try {
            set_Person(id,name);
            this.desgn=desgn;
            this.sal=sal;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
             

        }
        
    }
    void disp_Emp()
    {
        disp_Person();
        System.out.println(desgn+"\t"+sal);
    }
    public static void main(String args[])
    {
        Employeel1 e1=new Employeel1();
        e1.set_Emp(1001,"manjeet","AP",20000);
        e1.disp_Emp();
    }
}
