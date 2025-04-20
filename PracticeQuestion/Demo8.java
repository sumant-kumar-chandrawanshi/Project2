public class Demo8 {
    // Linear Search Opration in array
    int linearsearch(int arr[],int sz,int target){
        for(int i=0;i<sz;i++){
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,2,7,8,1,2,5};
        int target=5;
        int sz=7;
        Demo8 c=new Demo8();
        int s=c.linearsearch(arr,sz,target);
        System.out.println(s);

    }
    
}
