package assignment10;

public class Linkedlist<T>{

    public Node<T> head;

    public Linkedlist(){
        head = new Node<T>();
    }

    public ListIterator<T> iterator(){
        return new ListIterator<T>(this);
    }

    public String toString(){
        if(head.data==null){
            return "List is empty";
        }
        else {
            Node<T> temp = this.head;
            String s = "Single Linked list: ";
            while (temp.next != null) {
                s = s + temp.data.toString() + " ";
                temp = temp.next;
            }
            s = s + temp.data.toString() ;
            return s;
        }
    }
}

