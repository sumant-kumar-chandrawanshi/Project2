public class SevernPatternQ {
//    123456
//    1    6
//    1    6
//    123456
public static void main(String[] args) {
    int n=6;
    for(int i=1;i<n-1;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==1||i==n-2||j==1||j==n)
            {
                System.out.print(j);
            }
            else {
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
}
