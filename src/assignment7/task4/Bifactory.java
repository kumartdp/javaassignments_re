package assignment7.task4;

import assignment7.task4.Bicycle;
import assignment7.task4.Cycle;
import assignment7.task4.CycleFactory;

public class Bifactory implements CycleFactory {

    @Override
    public  Cycle getCycle() {
        return new Bicycle();
    }
}
