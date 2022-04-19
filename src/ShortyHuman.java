import java.util.Objects;

public class ShortyHuman extends Being implements flyableToTheMoon, Actions, Moves{

    protected int health;
    protected String ListToFly = "Синеглазка " +
            "Винтик " +
            "Шпунтик ";
    protected LiveStatus status;
    protected Condition c;
    protected Qualities q;

    public ShortyHuman(String name, int age, char gender, int health, LiveStatus status) {
        super(name, age, gender);
        this.health = health;
        this.status = status;

    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getListToFly() {
        return ListToFly;
    }
    public void setListToFly(String listToFly) {
        ListToFly = listToFly;
    }
    public LiveStatus getTime() {
        return status;
    }
    public void setTime(LiveStatus time) {
        this.status = time;
    }
    public Condition getC() {
        return c;
    }
    public void setC(Condition c) {
        this.c = c;
    }
    public Qualities getQ() {
        return q;
    }
    public void setQ(Qualities q) {
        this.q = q;
    }

    @Override
    public void saySomething() {
        System.out.print("Сказал: ");
    }
    @Override
    public void canFly() {
        if (health > 100) {
            ListToFly += name + '\n';
        }
        System.out.println("Список летящих на Луну: " + ListToFly);
    }

    @Override
    public void raise() {
        System.out.print(name + " поднял с земли прибор.");
    }
    @Override
    public void lookAt(Condition c) {
        System.out.print("  " + c + " сверкнул глазами. ");
    }

    @Override
    public void tellLies() {
        if (q == Qualities.Хитрый) {
            System.out.print("Врал, " + name + "! ");
        }
    }

    @Override
    public void wantToFly() {
        System.out.println(name + " очень хотел полететь на Луну");
    }

    @Override
    public void hope() {
        if (gender == 'M') {
            System.out.print("Его не оставляла надежда, что ");
        }
        else {
            System.out.print("Ее не оставляла надежда, что ");
        }
    }

    @Override
    public void makeList() {
        System.out.println(name + " составил список коротышек, которые должны были лететь на Луну.");
    }

    @Override
    public void forget() {
        if (q == Qualities.Хорошая_память){
            System.out.print(", но надежды были напрасны." + name + " ничего не забыл. ");
        }
        else {
            System.out.print(name + " забыл");
        }
    }

    @Override
    public void isInList() {
        if (ListToFly.contains(name)) {
            System.out.print(name + " чудом оказался в списке");
        }
        else {
            System.out.print("Как и следовало ожидать, " + name + " не в списке, потому что у него " + q);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortyHuman that = (ShortyHuman) o;
        return health == that.health && name.equals(that.name) && age == that.age && gender == that.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, health);
    }

    @Override
    public String toString() {
        return "Коротышка " +
                "имя " + name +
                ", возраст=" + age +
                ", пол=" + gender +
                ", здоровье=" + health
                ;
    }

    @Override
    public String grabSomeone(ShortyHuman h) {
        return (name + " схватил коротышку по имени " + h.name + " на ");
    }

    public String runTo(Location l) {
        return name + " побежал в " + l;
    }

    @Override
    public String lie() {
        return "лежал " + name;
    }

    @Override
    public String loseConsciousness() {
        return name + " потерял сознание";
    }
    @Override
    public String findYourselfSomewhere(Location l) {
        return "Скоро они были " +  l;
    }

    @Override
    public String lookAround() {
        return " озирался по сторонам";
    }

    @Override
    public String sitOn(Location l) {
        return "сидит на " + l;
    }

    @Override
    public String fallOnSomething(Location l) {
        return " в изнеможении упал на " + l;
    }

    @Override
    public String runInto(Location l) {
        return name + " выбежал к " + l;
    }

    @Override
    public String turnInto() {
        class Lamb{
            String transform(){
                return " превратится в барашка ";
            }
        }
        Lamb l = new Lamb();
        return name + l.transform() + " и тогда его уже ничто не спасет ";
    }

    @Override
    public String fear() {
        return "Он боялся, что ";
    }

}
