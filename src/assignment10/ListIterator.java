package assignment10;


public class ListIterator<T> {

    private Node<T> head;

    public ListIterator(Linkedlist<T> list) {
        this.head = list.head;

    }


    public void add(T data) {
        Node<T> temp = head;
        if (!this.isEmpty()) {
            Node<T> node = new Node<T>(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        } else {
            temp.data = data;
            temp.next = null;
        }

    }


    public void remove() {
        Node<T> temp = head;
        Node<T> prevTemp = new Node<T>();
        if (temp.next == null) {
            temp.data = null;
        } else {
            while (temp.next != null) {
                prevTemp = temp;
                temp = temp.next;
            }

            prevTemp.next = null;
        }
    }

    public Boolean isEmpty(){
        if(head.data == null){
            return true;
        }
        else
            return false;
    }

}