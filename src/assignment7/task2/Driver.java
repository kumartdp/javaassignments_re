package assignment7.task2;

public class Driver {
    public  static void  main(String[]args) {
        Cycle cyc[] = new Cycle[3];

        Tricycle tri = new Tricycle();
        Bicycle bi = new Bicycle();
        Unicycle uni = new Unicycle();

        cyc[0]=uni;
        cyc[1]=bi;
        cyc[2]=tri;

        cyc[0].balance();
        cyc[1].balance();
        cyc[2].balance();


        Unicycle u1 = (Unicycle) cyc[0];
        Bicycle b1 = (Bicycle) cyc[1];
        Tricycle t1 = (Tricycle) cyc[2];
        //Unicycle u2=(Unicycle) new Cycle();
        //u2.balance(); //we get exception for downcasting.
        u1.balance();
        b1.balance();
        t1.balance();


    }
}
