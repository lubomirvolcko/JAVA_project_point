package sk.akademiasovy.sk.akademiasovy.abstrakt;

public abstract class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void info ();
}
