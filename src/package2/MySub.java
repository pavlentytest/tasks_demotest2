package package2;

import package1.MySuper;

public class MySub extends MySuper {

    int r = 8;
    private int s = 3;

    public static void main(String[] args) {
        MySuper ca = new MySuper();
        MySub cb = new MySub();
        System.out.print(ca.p + " ");
        System.out.print(cb.p + " ");
        System.out.print(cb.q + " ");
        System.out.print(cb.r + " ");
        System.out.print(cb.s + " ");
    }
}