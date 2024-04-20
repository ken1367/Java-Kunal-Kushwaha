public class SinglyLL{
    public static void main(String[] args){
        SLL List =new SLL();
        List.insertFirst(3);
        List.insertFirst(7);
        List.insertLast(4);
        List.insertLast(23);
        List.display();
        List.insertMid(19,2);
        // List.display();
        // List.delFirst();
        // List.display();
        List.delInd(2);
        // List.display();

    }
}