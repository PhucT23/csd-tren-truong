package mylinkedlist;

public class MyLinkedList {
    private Node head;


    public void printList(){
        Node temp = head;
        while ( temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int data, int index){
        Node newNode = new Node(data);
        if ( index == 0){
            addFirst(data);
            return ;
        }else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode; 
            newNode.next = nextNode;
        }

    }

    public void deleteFirst(){
        if (head == null)
             return;
        head = head.next;
     }

     public void deleteLast(){
        if(head == null)
            return;
       
        if(head.next == null){
            deleteFirst();
        }
        Node temp = head; 
        Node previous = null; 
        while(temp.next != null){
            previous = temp; 
            temp = temp.next; 
        }
        previous.next = null; 
    }


   
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        
        
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3); 
        
        myLinkedList.deleteLast();
        myLinkedList.printList();
        
        
        //3 2 1 

        
        // myLinkedList.addLast(1);
        // myLinkedList.addLast(2);
        // myLinkedList.addLast(3);
        // myLinkedList.addAtPosition(5,1);
        
        // myLinkedList.printList();
        // 1 2 3 
        
        

        
    }
}
