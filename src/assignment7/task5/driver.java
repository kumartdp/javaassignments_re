package assignment7.task5;

public class driver {
    public static void main(String []args)
    {
        firstouter f=new firstouter();
        secondouter s=new secondouter();
        s.new secondinner(f,"hello");

    }
}
