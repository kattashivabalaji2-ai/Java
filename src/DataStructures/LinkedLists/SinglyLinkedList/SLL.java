package DataStructures.LinkedLists.SinglyLinkedList;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SLL {
    Node head;
    SLL(){
        head=null;
    }
    void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;
    }
   void insertAtEnd(int val){
       Node n=new Node(val);
       if(head==null){
           head=n;
           head.next=null;
           return;
       }
       Node temp=head;
           while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=n;

    }
    void insertAtParticularPosition(int val,int pos) {
        Node n=new Node(val);
        if(head==null){
            head=n;
            head.next=null;
            return;
        }
        int c=1;
        while(c!=pos){
            int temp=head
;        }

    }

     void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }

}
class Driver{
    public static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.display();
        sll.insertAtEnd(50);
        //System.out.println();
        sll.display();
    }
}