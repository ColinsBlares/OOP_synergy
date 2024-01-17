interface Philosopher {
    String getWisdomQuote();
}
class Sage implements Philosopher {
    @Override
    public String getWisdomQuote() {
        return "Мудрость — это не в знаниях, а в их применении.";
    }
}

public class Main {
    public static void main(String[] args) {
        Philosopher philosopher = new Sage();
        System.out.println("Цитата мудреца: " + philosopher.getWisdomQuote());

        Philosopher lambdaPhilosopher = () -> "Лямбда: Будьте как вода, адаптируйтесь к обстоятельствам.";
        System.out.println("Цитата лямбда-философа: " + lambdaPhilosopher.getWisdomQuote());
    }
}
