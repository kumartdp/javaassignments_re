package assignment8;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String s)
    {

        super(s);
        System.out.println("exited");

    }
}
