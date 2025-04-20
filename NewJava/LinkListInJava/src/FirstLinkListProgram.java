//public class FirstLinkListProgram {
//    Node head;
//    private int size;
//    FirstLinkListProgram()
//    {
//        size=0;
//    }
//    class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data=data;
//            this.next=null;
//            size++;
//        }
//    }
//    // Add first
//
//    public void addFirst(String data){
//        Node newNode =new Node(data);
//        if(head==null)
//        {
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//
//
//    //Add last
//    public void addlast(String data){
//        Node newNode=new Node(data);
//        if(head==null)
//        {
//            head=newNode;
//            return;
//        }
//        Node currNode=head;
//        while(currNode.next!=null){
//            currNode=currNode.next;
//        }
//        currNode.next=newNode;
//    }
//
//    //print
//    public void printList(){
//        Node void printList(){
//            while(currNode.next!=null){
//                System.out.println(currNode.data+" ");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        FirstLinkListProgram list=new FirstLinkListProgram();
//        list.addFirst("a");
//        list.addFirst("is");
//    }
//}
