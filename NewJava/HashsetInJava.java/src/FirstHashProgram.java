import java.util.HashSet;
import java.util.Iterator;

public class FirstHashProgram {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set =new HashSet<>();


        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//list.add(el)

        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("does not contain 1 - we deleted 1");
        }

        //size
        System.out.println("size of set is : "+set.size());
        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
