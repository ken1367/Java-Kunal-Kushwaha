public class SLL{
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    // --------------------Insert First--------------------------------
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
         tail=head;
        size++;
    }
    // --------------------Insert Last--------------------------------
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        tail.next=null;
        size++;
    }
    // --------------------Insert Mid----------------------------------
    public void insertMid(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        // System.out.println(temp.value+" index value is "+index);
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        // System.out.println("temp.value is "+temp.value+" temp.next.value is "+temp.next.value);
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
        // System.out.println("After Operation temp.next.value is "+temp.next.value);
    }
    // --------------------Delete First----------------------------------
    public void delFirst(){
        // int value=head.value;
        head=head.next;
        if(head==null)
         tail=null;
        size--;
    }
    // --------------------Delete Last------------------------------------
    public void delLast(){
        if(size<=1){
            delFirst();
            return;
        }
        Node Slast=get(size-2);
        // System.out.println("The Second Last is "+Slast.value);
        tail=Slast;
        tail.next=null;
        size--;
    }
    public Node get(int index){
        // System.out.println("The index is "+index);
        Node node=head;
        for(int i=0;i<index;i++)
         node=node.next;
        // System.out.println("node.value is "+node.value+" node.next.value is "+node.next.value);
        return node;
    }
    // --------------------Delete Mid------------------------------------
    public void delInd(int index){
        if(index==0){
            delFirst();
            return;
        }
        if(index==size-1){
            delLast();
            return;
        }
        Node prev=get(index-1);
        prev.next=prev.next.next;
        size--;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-> ");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println("Size is "+size);
    }
}