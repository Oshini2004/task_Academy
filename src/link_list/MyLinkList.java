//package link_list;
////import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;
//public class MyLinkList {
//    public static void main(String[] args) {
//        MyLinkList obj = new MyLinkList();
//        obj.insertTail();
//        obj.printList();
//    }
//    Node<Integer> head;
//    int size;
//    MyLinkList(){
//        this.head=null;
//        this.size=0;
//    }
//    public void insertNode(int data,int position){
//    }
//    public void printList(){
//        Node<Integer>temp=head;
//        while(temp!=null){
//            System.out.println("data is : "+temp.data);
//            temp=temp.next;
//        }
//    }
//}
//class Node<T>{
//    T data; //kisis bhi type ka data le skta h
//    Node next;//next node ka address hold krega
//    Node(){            //default constructor
//        this.next=null;
//    }
//    Node(T data){      //paremetrize constructor ,taki user se direct data le ske
//        this.next=null;
//        this.data=data;
//    }
//}
//public void insertNode(int data,int position){
//    if(position>size+1 || position<=0){
//        System.out.println("wrong input");
//        return;
//
//    }
//    if (position==1){
//        insertHead(data);
//     //   return;
//    } else if (position==size+1) {//1 based idxing le rhe h.if 4 node h =size=4 ,isliye size+1=5 so we can do insertion at tail
//        insertTail(data);
//      //  return;
//    }else{  //if we want to insert at any spesific position
//        int counter=1;
//        Node<Integer>newNode=new Node<>(data);
//        Node<Integer>temp =head;//we have made temprary node
//        while(counter<position-1 && temp!=null) {//ek less position pe rukna hai
//            counter++;
//            temp=temp.next; //aage badh jao
//        }
//        newNode.next=temp.next;
//        temp.next=newNode;
//        size++;
//    }
//    System.out.println("insertion successful at position" +position);
//}
//public void insertHead(int data){
//    Node<Integer>newNode=new Node<>(data);
//    if(head==null){  //this mean link list is empty
//        head=newNode;
//        System.out.println("Insertion at head is successful");
//        size++;
//        return;
//    }
//    newNode.next=head;  // jo new head bnne wala h uske next m head dal ke khud head bn jao
//    head=newNode;
//    System.out.println("Insertion at head is successful");
//    size++;
//}
//public void insertTail(int data){
//    Node<Integer>newNode=new Node<>(data);
//    if(head==null){  //this mean link list is empty
//        head=newNode;
//        System.out.println("insertion at tail is successful ");
//        size++;
//        return;
//    }
//    Node<Integer>temp=head; //here we have created a new node
//    while(temp.next!=null){
//        temp=temp.next;  //aise krte krte end m pohoch jayege
//    }
//    temp.next=newNode;
//    System.out.println("insertion at tail is successful");
//    size++;
//
//
//
//
//}
