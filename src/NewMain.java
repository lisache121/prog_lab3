public class NewMain {
    public static void main(String[] args) throws NoStrengthException{
        ShortyHuman Neznayka = new ShortyHuman("Незнайка",
                20,
                'M',
                100,
                LiveStatus.Escape);
        ShortyHuman Kozlik = new ShortyHuman("Козлик",
                18,
                'M',
                75,
                LiveStatus.Escape);
        //работа с вложенным (нестатическим) классом
        //создание экземпляра внешнего класса
        BodyParts part = new BodyParts("руки");
        //создание экземпляра внутреннего класса
        BodyParts.Arm arms = part.new Arm();

        BodyParts part2 = new BodyParts("голова");
        BodyParts.Head head = part2.new Head();

        BodyParts part3 = new BodyParts("глаза");
        BodyParts.Eyes eyes = part3.new Eyes();
        //обработка исключения
        try{
            if(Neznayka.health <= 0 || Kozlik.health <= 0 || Neznayka.age <= 0 || Kozlik.age <= 0 ) {
                throw new NoStrengthException("Неправильно введенная информация о персонаже ");
            }
            for (int i = 0; i<2; i++) {
                //обработка исключения
                try{
                    if(Neznayka.health * Neznayka.age < Kozlik.health* Kozlik.age){
                        throw new PowerException("Здоровья недостаточно! Больше нет сил бежать с Козликом на руках ");
                    }
                    System.out.print(Neznayka.grabSomeone(Kozlik));
                    System.out.println(part.nameOfPart);
                    System.out.print(Neznayka.fear());
                    System.out.println(Kozlik.turnInto());
                    System.out.println(Neznayka.runTo(Location.SEASIDE));
                    System.out.println(Neznayka.findYourselfSomewhere(Location.PALM_GROVE_DOWN));

                    //работа со статическим вложенным (внутренним) классом
                    Landscape.SeaSurface seaSurface = new Landscape.SeaSurface();
                    System.out.println(seaSurface.shine());

                    //работа со статическим вложенным (внутренним) классом
                    Landscape.Pier pier= new Landscape.Pier();
                    System.out.println(pier.mastOn(Location.IN_THE_DISTANCE));
                    Neznayka.setHealth(30);
                }catch(PowerException powerException){
                    System.out.println(powerException.getMessage());
                }
            }
            System.out.print(Neznayka.runInto(Location.SEASIDE));
            System.out.println(Neznayka.fallOnSomething(Location.SAND));
            System.out.print(arms.unclench());
            System.out.println(Neznayka.loseConsciousness());
            System.out.print(Kozlik.name + " очутившись на " + Location.SEASIDE);
            System.out.println(Kozlik.lookAround());

            //анонимный вложенный класс
            FreshenUp freshenUp = new FreshenUp() {
                @Override
                public void fresh() {
                    System.out.print("Прохладный морской " + wind + " освежил его ");
                }
            };
            freshenUp.fresh();
            System.out.println(head.dizzy());
            System.out.print(Kozlik.name + " не " + Kozlik.sitOn(Location.CAROUSEL));
            System.out.println(" " + Kozlik.name + " " + Kozlik.sitOn(Location.SAND));
            System.out.print("Рядом " + Neznayka.lie());
            System.out.println(" " + arms.spreadOut() + " " + eyes.close());


        }catch(NoStrengthException noStrengthException){
            System.out.println(noStrengthException.getMessage());
            System.out.println("Введите правильную информацию о персонаже ");
        }
    }
}
