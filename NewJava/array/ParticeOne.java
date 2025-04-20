package array;

import java.util.Scanner;

public class ParticeOne {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter the postion and element you want to change ");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        arr[a]=b;
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}