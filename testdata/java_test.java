// Autogenerated with DRAKON Editor 1.9
package foobar;

import something.woo;

public class Chubaka extends Monster
	implements Big, Hairy {

    public Chubaka() {
        pass
    }

    Chubaka(ArrayList<Integer> ints, float height) throws BadException {
        pass
    }

    private Chubaka(ArrayList<Integer> ints) throws BadException, GoodException {
        pass
    }

    protected Chubaka(String name, int value) {
        pass
    }

    public abstract void publicAbstract();

    public Rectangle<Integer> publicNormal(int left, int top) throws BadException {
        #item 58
        say hi
    }

    @Override
    public void publicOverride() {
        #item 70
        say hi
    }

    public static void publicStatic() {
        #item 88
        say hi
    }

    abstract void noneAbstract();

    void noneNormal() {
        #item 31
        say hi
    }

    @Override
    void noneOverride() {
        #item 30
        say hi
    }

    static void noneStatic() {
        #item 76
        say hi
    }

    protected abstract void protectedAbstract();

    protected void protectedNormal() {
        #item 40
        say hi
    }

    @Override
    protected void protectedOverride() {
        #item 50
        say hi
    }

    protected static void protectedStatic() {
        #item 82
        say hi
    }

    private abstract void privateAbstract();

    private void privateNormal() {
        #item 94
        say hi
    }

    @Override
    private void privateOverride() {
        #item 106
        say hi
    }

    private static void privateStatic() {
        #item 112
        say hi
    }
}
