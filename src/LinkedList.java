public class LinkedList {
    Node head;
    Node tail;
    LinkedList(){
        this.head=null;
        this.tail=null;

    }


    public void insertRear(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void deleteNode(int target){
        Node current=head;
        Node prev_node=head;

        while (current!=null){
            if (current.key==target){
                if (current==head){
                    head=current.next;
                } else if (current==tail) {
                    prev_node.next=current.next;
                }
                else{
                    prev_node.next=current.next;
                }
            }
            prev_node=current;
            current=current.next;
        }
    }

    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.key+" ");
            temp=temp.next;
        }
        System.out.println("");
    }


}