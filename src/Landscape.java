public class Landscape {
    protected static Location l;
    //внутренние статические классы
    static class Pier{

        String mastOn(Location l){
            return l + " виднелась пароходная пристань с высокой мачтой, верхушка которой была украшена развевающимся на ветру флагом ";
        }
    }

    static class SeaSurface{
        String shine(){
            return "Искристая поверхность моря засверкала сквозь редкие деревья";
        }
    }
}
