package oops2.oop2accessModifier.pkg1;

public class Student {
    // private String name; // Can access from the same class only
    private int age; // Private access
    String name; // Package-private access
    protected double psp; // Protected access
    public String universityName; // Public access

    // Public getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

