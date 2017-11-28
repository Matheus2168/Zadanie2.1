public class Main {


    public static void main(String[] args) {

        Szafka pierwszaSzafka = new Szafka();
        pierwszaSzafka.fullName = "Szafka stojaca VERTEX";
        pierwszaSzafka.height = 100.5;
        pierwszaSzafka.width = 45;
        pierwszaSzafka.numberOfDrawers = 5;
        pierwszaSzafka.isItWooden = true;

        Szafka drugaSzafka = new Szafka();
        drugaSzafka.fullName = "Szafka stojaca METALOWA";
        drugaSzafka.height = 244;
        drugaSzafka.width = 76.7;
        drugaSzafka.numberOfDrawers = 8;
        drugaSzafka.isItWooden = false;

        System.out.println(pierwszaSzafka.fullName+" "+pierwszaSzafka.height+" "+pierwszaSzafka.width+" "+pierwszaSzafka.numberOfDrawers+" "+pierwszaSzafka.isItWooden);
        System.out.println(drugaSzafka.fullName+" "+drugaSzafka.height+" "+drugaSzafka.width+" "+drugaSzafka.numberOfDrawers+" "+drugaSzafka.isItWooden);

    }
}
