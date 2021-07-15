package assignment6;

public class constructor {
    int a;
    constructor()
    {

        this("called");

        System.out.println(this.a);
        this.a=10;
        System.out.println(this.a);



    }
    constructor(String s)
    {
        System.out.println(s);
        this.a=15;
        System.out.println(this.a);

    }
    public static void main(String []args)
    {
        constructor c=new constructor();

    }
}
