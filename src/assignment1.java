import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class assignment1{
    public static ArrayList<String> fileList=new ArrayList<String>();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("enter 1.to display required files 2.to exit");
            int a=sc.nextInt();
            String s;
            if(a==2)
            {
                break;
            }
            else
            {
                System.out.println("enter your required extension files");

                s=sc.next();
            }

            listDirectory("/home/",s);

            displayFiles(fileList);
            fileList.clear();
        }
    }

    public static void displayFiles(ArrayList<String> fileList) {
        for (String filePath:fileList){

            System.out.println(filePath);
        }
        if (fileList.size()==0){
            System.out.println("No match found");
        }
    }

    public static void listDirectory(String path,String s){
        File dir = new File(path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                // Check if the file is a directory
                if (file.isDirectory()) {


                    listDirectory(file.getAbsolutePath(),s);
                } else {
                    String fileName=file.getName();
                    if (fileName.matches("^.*"+s) ){
                        fileList.add(file.getAbsolutePath() +" " +fileName);

                    }
                }
            }
        }
    }
}