
import java.util.Scanner;
class test
{
    public boolean check(String str)
    {
        int a[]=new int[26];

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int k=c;
            a[k-97]++;

        }
        int flag=1;
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        else{
            return false;
        }


    }


    public static  void main(String[]args)
    {
        test t=new test();
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String testing="";
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLowerCase(s.charAt(i)))
            {
                char c=Character.toLowerCase(s.charAt(i));
                testing=testing+c;
            }
            else
            {
                testing=testing+s.charAt(i);
            }

        }

        System.out.println(t.check(testing));
        //space complexity 0(26) constant space
        //time complexiy 0(n)


    }
}