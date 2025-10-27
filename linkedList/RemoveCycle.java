public class RemoveCycle{
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
    
    public static boolean isCycle(){
      Node slow=head;
      Node fast=head;

      while(fast!=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true; //cycle exist
        }
      }

      return false;//cycle does't exist
  }

    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast == slow){
                cycle=true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
         slow=head;
         Node prev=null;//last node
         while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
         }
        //remove cycle -> last.next=null
        prev.next=null;
    }
    
       public static void main(String args[]){
       head=new Node(1);
       Node temp=new Node(2);
       head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        // 1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
    }
}
