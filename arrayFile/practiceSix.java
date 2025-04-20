import java.util.Scanner;
public class practiceSix {

    public static void main(String[] args) {
        
        char str[]={'s','u','m','a','n','t'};
        
        for(int i=0;i<6;i++)
        {
            System.out.print(str[i]);
        }
        
        System.out.println();

        for(int i=0;i<6;i++)
        {
            str[i]='*';
            System.out.print(str[i]);
        }

    }
}
