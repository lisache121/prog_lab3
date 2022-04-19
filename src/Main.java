public class Main {
    public static void main(String[] args) {
        ShortyHuman Neznayka = new ShortyHuman("Незнайка",
                20,
                'M',
                99,
                LiveStatus.Проведение_измерений_здоровья);
        ShortyHuman Znayka = new ShortyHuman("Знайка",
                22,
                'M',
                105,
                LiveStatus.Проведение_измерений_здоровья);
        ShortyHuman X = new ShortyHuman("Незнайка",
                20,
                'M',
                99,
                LiveStatus.Проведение_измерений_здоровья);

        System.out.println(Znayka.toString());
        Neznayka.setQ(Qualities.Хитрый);
        if (Znayka.status == Neznayka.status) {
            Znayka.raise();
            Znayka.lookAt(Condition.Сердито);
            Znayka.saySomething();
            Neznayka.tellLies();
            Neznayka.setTime(LiveStatus.Ожидание_списков);
        }
        if (Neznayka.status == LiveStatus.Ожидание_списков) {
            Neznayka.wantToFly();
            Neznayka.hope();
            Znayka.forget();
            Znayka.setQ(Qualities.Хорошая_память);
            Znayka.forget();
            Znayka.setTime(LiveStatus.Назначен_день_отлета);
        }
        if (Znayka.status == LiveStatus.Назначен_день_отлета) {
            System.out.println(Znayka.status);
            Znayka.makeList();
            Znayka.setTime(LiveStatus.Списки_готовы);
        }
        if (Znayka.status == LiveStatus.Списки_готовы) {
            Neznayka.canFly();
            Neznayka.setQ(Qualities.Плохая_переносимость_состояний_невесомости);
            Neznayka.isInList();
        }

        System.out.println();
        System.out.println(X.equals(Neznayka));
    }
}
