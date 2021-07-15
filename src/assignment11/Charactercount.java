package assignment11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Charactercount {
    public static void main(String args[])throws Exception
    {
        File f= new File("/home/saikgm/saikumar/"+args[0]);
        BufferedReader br =new BufferedReader(new FileReader(f));
        FileWriter writer = new FileWriter("/home/saikgm/saikumar/output.txt");
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        String st;
        while ((st = br.readLine()) != null) {
            char[] s=st.toCharArray();
            for (char i:s) {

                if (map.containsKey(i)) {
                    map.replace(i, map.get(i), map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }

            }
        }
        map.remove(' ');
        writer.write("character"+" "+"count" );

        for (char i : map.keySet()) {
            writer.write( i  +" "+ map.get(i));
            writer.write("\n");
            System.out.println("key: " + i + " value: " + map.get(i));
        }
        writer.close();



    }
}
