package assignment6;

public class initial {
    initial(String s)
    {
        System.out.println("initialization message is"+s);
    }
    public static void  main(String []args)
    {
        initial arr[] = new initial[5];
        
        for(int i=0;i<5;i++)
        {
            arr[i]=new initial("  object"+ String.valueOf(i+1)+" "+" created");
        }

    }
}
