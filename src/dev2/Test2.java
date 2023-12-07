package dev2;

import dev1.Test;
import package1.MySuper;

public class Test2 extends Test {
    // flag - не доступен! (модификатор доступа по умолчанию - означает private-package)
    // iObj - не доступен! (- // -)
    // showNum - не доступен! (private - ТОЛЬКО ВНУТРИ КЛАССА Test)

    Test2() {
        super();
    }

    @Override
    protected double getCount(double counter) {
        return super.getCount(counter);
    }

    public void doSmth() {
       // super()
    }
}
