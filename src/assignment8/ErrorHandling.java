package assignment8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String []args) throws InsufficientBalanceException, InvalidAmountException, LimitExceededException, IOException {
        int availableBalance = 1000;
        int limit = 500;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter amount to withdraw");
        String withDrawAmount = buf.readLine ();





        try {

            transaction(availableBalance, limit, withDrawAmount);
        }
        catch (InsufficientBalanceException|LimitExceededException|InvalidAmountException|NullPointerException e)
        {
            e.printStackTrace();


        }
        finally
        {
            System.out.println("transaction completed");
        }

    }
    public static void transaction(int availableBalance,int limit ,String  withDrawAmount) throws InsufficientBalanceException,LimitExceededException,InvalidAmountException
    {
        if(withDrawAmount.equals(" "))
        {

            throw new NullPointerException("give a with draw amount");
        }
        int wd=Integer.parseInt(withDrawAmount);






            if (wd <= 0) {
                throw new InvalidAmountException("entered invalid amount");
            } else if (availableBalance > wd && wd > limit) {
                throw new LimitExceededException("limited exceeded");
            } else if (wd > availableBalance) {
                throw new InsufficientBalanceException("insufficient balance");
            }
            else
                {
                    availableBalance-=wd;
                    System.out.println("money withdrawn balance is "+availableBalance);

                }






    }
}
