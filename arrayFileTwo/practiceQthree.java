

public class practiceQthree {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,4,2};

        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        int cout=0;
        System.out.println();
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(arr[i]==arr[j] && i<j)
                {
                    cout++;
                }
            }
        }
        System.out.println(cout);

    }
}
