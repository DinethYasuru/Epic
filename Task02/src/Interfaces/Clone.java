package Interfaces;

public class Clone implements Cloneable {
    int age;
    String name;

    public Clone(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
