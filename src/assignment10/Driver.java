package assignment10;

public class Driver {
    public static void main(String[] args)
    {
        Linkedlist<Integer> list = new Linkedlist<Integer>();
        ListIterator<Integer> it = list.iterator();
        System.out.println(list.toString());
        System.out.println(it.isEmpty());
        it.add(1);
        it.add(2);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add(3);
        it.add(4);
        it.add(5);
        System.out.println(list.toString());
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());


    }
}
