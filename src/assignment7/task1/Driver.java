package assignment7.task1;



public class Driver {
    public static void main(String[]args) {
        Rodent types[]=new Rodent[3];

        types[0] = new Gerbil();
        types[0].behaviour();
        types[1]=new Mouse();
        types[1].behaviour();
        types[2]=new Hamster();
        types[2].behaviour();

    }



}
