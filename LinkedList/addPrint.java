import java.util.*;
public class addPrint{
    //node object creation
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //head and tail creation
    public static Node head;
    public static Node tail;

    //addFirst in LinkedList
    public void addFirst(int data){
        //step 1, new node created
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2, newNode next -> head
        newNode.next = head;
        //step 3, head = newNode
        head = newNode;

    }
    //addLast in LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;    
    }

    //print the LinkedList
    public void print(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String args[]){
        addPrint ll = new addPrint();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();



    }
    
}
