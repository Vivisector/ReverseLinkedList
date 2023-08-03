public class LinkedListReverse {
    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // сохраняем ссылку на следующий узел
            current.next = prev; // меняем ссылку текущего узла на предыдущий

            prev = current; // перемещаем указатель prev на текущий узел
            current = next; // перемещаем указатель current на следующий узел
        }

        return prev; // новый head после разворота
    }

    public static void main(String[] args) {
        // Создаем список: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Исходный список:");
        printLinkedList(head);

        Node reversedHead = reverseLinkedList(head);

        System.out.println("Развернутый список:");
        printLinkedList(reversedHead);
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
