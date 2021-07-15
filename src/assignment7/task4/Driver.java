package assignment7.task4;
import java.util.Locale;
import java.util.Scanner;
public class Driver {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter type of cycle");
        String s=sc.nextLine();
        Cycle c;
        if(s.toLowerCase().equals("unicycle"))
        {
            c=new Unifactory().getCycle();
            c.NumberOfWheels();
        }
        if(s.toLowerCase().equals("bicycle"))
        {
             c=new Bifactory().getCycle();
            c.NumberOfWheels();
        }
        if(s.toLowerCase().equals("tricycle"))
        {
            c=new Trifactory().getCycle();
            c.NumberOfWheels();
        }


    }
}
