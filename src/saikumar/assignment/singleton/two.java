package saikumar.assignment.singleton;

public class two {
    public String str;
    public static int var=1;
    public  static two initial(String s)
    {
        two ref=new two();
        ref.str=s;

        return ref;


    }
    public void print()
    {
        System.out.println(var);

        System.out.println(str);
    }
}
