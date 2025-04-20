public class NightPatternQ {
//    1
//    12
//    123
//    1234
public static void main(String[] args) {
    int n=4;
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}

    public static class EightPatternQ {
    //    121212
    //    212121
    //    121212
    //    212121
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%2!=0)
                {
                    if(j%2!=0)
                    {
                        System.out.print("1");
                    }
                    else {
                        System.out.print("2");
                    }
                }
                else {
                    if(j%2!=0)
                    {
                        System.out.print("2");
                    }
                    else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
    }

    public static class ElevenPatternQ {
    //        1
    //       2 2
    //      3   3
    //     4444444
    }

    public static class FivePatternQ {
    //    1234567
    //    2345671
    //    3456712
    //    4567123
    //    5671234
    //    6712345
    //    7123456

        public static void main(String[] args) {
            int n=7;

            for(int i=1;i<=n;i++) {

                for (int j = i; j <=n; j++)
                {
                    System.out.print(j);
                }
                for(int k=1;k<i;k++)
                {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }

    public static class FouthPatternQ {
    //       *
    //      ***
    //     *****
    //    *******
    //   **********

        public static void main(String[] args) {
            int n=4;
            for(int i=0;i<=n;i++)
            {   for(int k=0;k<=n-i;k++)
            {
                System.out.print(" ");
            }
                for(int j=0;j<2*i+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
