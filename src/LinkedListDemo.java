public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.insert_end("B");
        linkedList.insert_end("A");
        linkedList.insert_end("L");
        linkedList.insert_end("L");
        linkedList.insert_end("L");
        linkedList.insert_end("S");
        System.out.println("My Linked List: " + linkedList);
        linkedList.insert_beginning("A");
        System.out.println("My Linked List:" + linkedList);

        System.out.println("Index of element with value B:" + linkedList.get("B"));
        System.out.println("Index of element with value Deez Nuts:" + linkedList.get("Deez Nuts"));

        linkedList.remove("L");
        System.out.println("Linked List:" + linkedList);
        System.out.println("First element of node:" + linkedList.get_head_node());
    }
}
