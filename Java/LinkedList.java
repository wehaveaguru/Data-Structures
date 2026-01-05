class LL {
    private Node head;
    private Node tail;

    int size=0;
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if (tail== null){
            tail=head;
        }

        size++;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }


    }

    private class Node {
        Node next;
        int value;

        public Node(int value){
            this.value=value;
        }
    }
}




public class LinkedList {
    public static void main(String args[]){
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
    }
}
