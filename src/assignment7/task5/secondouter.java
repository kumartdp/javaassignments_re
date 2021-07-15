package assignment7.task5;
import assignment7.task5.firstouter.firstinner;
public class secondouter {
    class secondinner extends firstinner
    {
        secondinner(firstouter f1,String s){
            f1.super(s);
        }

    }
}
