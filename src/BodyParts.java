public class BodyParts {
    protected String nameOfPart;

    public BodyParts(String nameOfPart) {
        this.nameOfPart = nameOfPart;
    }
    //вложенные классы нестатические
    public class Arm{

        public String unclench() {
            return nameOfPart + " расжались ";
        }
        public String spreadOut(){
            return nameOfPart + " раскинуты";
        }
    }

    public class Head{
        public String dizzy(){
            return nameOfPart + " не кружится";
        }
    }

    public class Eyes{
        public String close(){
            return nameOfPart + " закрыты";
        }
    }
}
