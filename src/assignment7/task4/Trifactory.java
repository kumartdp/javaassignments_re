package assignment7.task4;

import assignment7.task4.Cycle;
import assignment7.task4.CycleFactory;
import assignment7.task4.Tricycle;

public class Trifactory  implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new  Tricycle();
    }
}
