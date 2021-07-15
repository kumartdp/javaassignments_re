package assignment7.task4;

import assignment7.task4.Cycle;
import assignment7.task4.CycleFactory;
import assignment7.task4.Unicycle;

public class Unifactory implements CycleFactory {

    @Override
    public  Cycle getCycle() {
        return new Unicycle();
    }
}
