public abstract class Being {
    protected String name;
    protected int age;
    protected char gender;

    public Being(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void saySomething();
}
