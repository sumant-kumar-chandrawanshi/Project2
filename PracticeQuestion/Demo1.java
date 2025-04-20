import java.util.Scanner;

class Demo1{
    public static void main(String[] args) {
        //1. Write a java program to print hello on screen and your name on a separate line.
        System.out.println("hello");
        System.out.println("it me sumant kumar");
        //2. Write a java program to print the sum of two numbers.
        int a=74;
        int b=36;
        System.out.println(a+b);

        //3. write a java program to divide two number and print them on the screen.
        a=50;
        b=3;
        System.out.println(a/b);
        // Write a java Program to print the results of the following operatios.
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
        
        
        //Write a java program that takes two numebrs as input and displays the product of two numbers.
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the first numebr: ");
        a=in.nextInt();
        System.out.println("Enter the second number: ");
        b=in.nextInt();

        System.out.println(a*b);


        // Write a java program to print the sum (addition), Multiply, subtract,divide and remainder of two numebrs.
        System.out.println("Ans of question number 6. : ");
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        

    
    
            // 7. Write a java program that takes a number as input and prints its multiplication table up to 10.
            System.out.println("Enter the number of you want to print the tables");
            int c=in.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(c*i);
            }

    }
}
