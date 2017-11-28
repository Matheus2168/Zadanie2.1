public class Main {


    public static void main(String[] args) {

        Szafka pierwszaSzafka = new Szafka("Szafka stojaca VERTEX",100.5,45,5,true);

        Szafka drugaSzafka = new Szafka("Szafka stojaca METALOWA",244,76.7,8,false);


        System.out.println(pierwszaSzafka.fullName+" "+pierwszaSzafka.height+" "+pierwszaSzafka.width+" "+pierwszaSzafka.numberOfDrawers+" "+pierwszaSzafka.isItWooden);
        System.out.println(drugaSzafka.fullName+" "+drugaSzafka.height+" "+drugaSzafka.width+" "+drugaSzafka.numberOfDrawers+" "+drugaSzafka.isItWooden);

    }
}
