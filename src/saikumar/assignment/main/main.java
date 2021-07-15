package saikumar.assignment.main;
import saikumar.assignment.data.one;
import saikumar.assignment.singleton.two;

public class main {
    public static void main(String args[])
    {
        one ob1=new one();
        ob1.printvalues();
        ob1.printvalues2();
        two ob2=two.initial("singleton");
        ob2.print();




    }
}
