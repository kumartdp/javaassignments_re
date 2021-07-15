

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Assignment4 {
        public static void main(String args[]) throws IOException {
            System.out.println("enter no of test cases");

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            ArrayList<String> output=new ArrayList<String>();


            while(t>0)
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String st=br.readLine();
                String arr[]=st.split(" ");
                String[] signup=arr[0].split("-");

                String[] current=arr[1].split("-");
                ArrayList<Integer> signupDate=new ArrayList<Integer>();
                ArrayList<Integer> currentDate=new ArrayList<Integer>();
                for(String x:signup){
                    signupDate.add(Integer.parseInt(x));
                }
                for(String x:current){
                    currentDate.add(Integer.parseInt(x));
                }

                output.add(checkRange(signupDate,currentDate));
                t-=1;





                }
            for(String s:output)
            {
                System.out.println(s+"\n");
            }




        }

        public static String checkRange(ArrayList<Integer> signupDate, ArrayList<Integer> currentDate) {
            int[] endRange=addThirty(signupDate,currentDate.get(2));
            int[] startRange=minusThirty(signupDate,currentDate.get(2));
            String result="";


            if(currentDate.get(2)>signupDate.get(2)){
                if((currentDate.get(1)>endRange[1]) || (currentDate.get(1)==endRange[1] && currentDate.get(0)>endRange[0])){
                    result=startRange[0]+"-"+startRange[1]+ "-"+startRange[2] +" "+
                    endRange[0]+"-"+endRange[1]+ "-"+endRange[2];
                }
                else if((currentDate.get(1)<startRange[1]) && (currentDate.get(1)==startRange[1] && currentDate.get(0)<startRange[0])){
                    result="No range Found";
                }
                else{
                    result=startRange[0]+"-"+startRange[1]+ "-"+startRange[2] +" "+
                    currentDate.get(0)+"-"+currentDate.get(1)+ "-"+currentDate.get(2);
                }

            }
            else{
                result="Range not found";
            }
            return result;
        }

        public static String convertToString(int[] startRange) {
            String date="";
            return date;
        }

        public static boolean leapYear(Integer year) {
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                return true;
            }
            else{
                return false;
            }

        }
        public static int[] addThirty(ArrayList<Integer> signupDate,int currentYear){
            int[] range1=new int[3];
            int[] leapYearDays=new int[]{31,29,31,30,31,30,31,31,30,31,30,31,31};
            int[] nonLeapYearDays=new int[]{31,28,31,30,31,30,31,31,30,31,30,31,31};
            if(leapYear(currentYear)){
                int x=leapYearDays[signupDate.get(1)-1]-signupDate.get(0);
                if(leapYearDays[signupDate.get(1)]>=30-x){
                    range1[0]=30-x;
                    range1[1]=signupDate.get(1)+1;
                }
                else{
                    range1[0]=30-x-leapYearDays[signupDate.get(1)];
                    range1[1]=signupDate.get(1)+2;
                }

            }
            else{
                int x=nonLeapYearDays[signupDate.get(1)-1]-signupDate.get(0);
                if(nonLeapYearDays[signupDate.get(1)]>=30-x){
                    range1[0]=30-x;
                    range1[1]=signupDate.get(1)+1;
                }
                else{
                    range1[0]=30-x-nonLeapYearDays[signupDate.get(1)];
                    range1[1]=signupDate.get(1)+2;
                }
            }
            if(signupDate.get(1)==12 && signupDate.get(0)>1) {
                range1[2] = currentYear + 1;
                range1[1] = 1;
            }else {
                range1[2]=currentYear;
            }
            return range1;

        }

        public static int[] minusThirty(ArrayList<Integer> signupDate,int currentYear){
            int[] range1=new int[3];
            int[] leapYearDays=new int[]{31,31,29,31,30,31,30,31,31,30,31,30,31,31};
            int[] nonLeapYearDays=new int[]{31,31,28,31,30,31,30,31,31,30,31,30,31,31};
            if(leapYear(currentYear)){

                int x=signupDate.get(0);
                if(leapYearDays[signupDate.get(1)-1]>30-x){
                    range1[0]=leapYearDays[signupDate.get(1)-1]-(30-x);
                    range1[1]=signupDate.get(1)-1;
                }
                else{
                    range1[0]=leapYearDays[signupDate.get(1)-2]-(30-x-leapYearDays[signupDate.get(1)-1]);
                    range1[1]=signupDate.get(1)-2;
                }

            }
            else{

                int x=signupDate.get(0);
                if(nonLeapYearDays[signupDate.get(1)-1]>30-x){
                    range1[0]=nonLeapYearDays[signupDate.get(1)-1]-(30-x);
                    range1[1]=signupDate.get(1)-1;
                }
                else{
                    range1[0]=nonLeapYearDays[signupDate.get(1)-2]-(30-x-nonLeapYearDays[signupDate.get(1)-1]);
                    range1[1]=signupDate.get(1)-2;
                }
            }
            if(signupDate.get(1)==1 && signupDate.get(0)<31) {
                range1[2] = currentYear - 1;
                range1[1] = 12;
            }else {
                range1[2]=currentYear;
            }
            return range1;

        }
    }

