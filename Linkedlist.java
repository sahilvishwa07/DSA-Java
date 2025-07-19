public class Linkedlist {
    static class node{
    int data;
    node next;

    public node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    static class index{
    node head;
    public void addToFirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        index list = new index();
        list.addToFirst(10);
        list.addToFirst(20);
        list.addToFirst(30);

        node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    }
}
