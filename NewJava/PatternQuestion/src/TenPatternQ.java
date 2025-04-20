public class TenPatternQ {
//        1
//       121
//      12321
//     1234321
public static void main(String[] args) {
    int n=5;
    for(int i=1;i<n;i++)
    {
        for(int k=0;k<n-i+1;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        for(int j=1;j<i;j++)
        {
            System.out.print(j);
        }

        System.out.println();
    }
}
}
