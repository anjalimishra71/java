//remove nth child from end

public class RemoveNthChild{
     public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
     
     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

     }
    
     public void deleteNthfromEnd(int n){
       int size=0;
       Node temp=head;
       while(temp != null){
        temp =temp.next;
        size++;
       }

        //removeFirst
       if(n==size){
        head=head.next;
        return;
       }

       //size-n
       int i=1;
       int iToFind=size-n;
       Node prev=head;
       while(i<iToFind){
        prev=prev.next;
        i++;
       }
       prev.next=prev.next.next;
       return;
     }
    
    public static void main(String args[]){
        RemoveNthChild ll=new RemoveNthChild();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
      ll.deleteNthfromEnd(3);
        ll.print();

    }
}
