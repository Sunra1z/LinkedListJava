public class LinkedList<T>{
    private Node<T> head; // ссылка на голову листа

    public Node get_head_node(){ // Вывод первой ноды но она чет как то хуевастенько работает позже пофикшу наверное
        return head;
    }

    public void insert_beginning(T t){
        Node<T> firstNode = new Node<>(t); // Добавление элементов в начало
        firstNode.next = head;
        head = firstNode;
    }

    public void insert_end(T t){
        if(head == null){
            head = new Node<>(t); // Добавление элементов в конец
            return;
        }

        Node<T> currentNode = head; // Если элемент проходит Нулл проверку то это дает возможность просмотреть элементы листа
        while (currentNode.next != null){
            currentNode.next = new Node<>(t);
        }

    }

    public int get(T t){
        if (head == null) {  // Если нет элемента то возвращает минус 1
            return -1;
        }
        if (head.value == t){
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null){  // Цикл поиска элемента и передвижение так скажем указателя по списку а-ля ищи пока не найдешь дура
            ++result;
            if(currentNode.next.value == t){
                return result;
            }
            currentNode = currentNode.next;
        }

        return -1; // не нашел ну и хер с ним -1 пусть выводит
    }

    public void remove(T t){
        if (head == null) { // Если значение для удаления отсутствует то просто возвращается обратно
            return;
        }

        if(head.value == t){ // Если он значение находит то элемент вышвиривается
            head = head.next;
            return;
        }
        Node<T> currentNode = head;
        while(currentNode.next != null){   // Но не факт что этот элемент уникален и он один такой вдруг есть такой же что нужно удалить?
            if(currentNode.next.value == t){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {
        private final T value;
        private Node<T> next; // Ссылка на следующий элемент

        private Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}