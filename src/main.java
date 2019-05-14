import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        main main = new main();
        Computation computation;

        if (main.shouldMultiply()){
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double arg1 = main.getArgument();
        double arg2 = main.getArgument();

        double wynik = computation.compute(arg1, arg2);

        System.out.println(" ");
        System.out.println("Wynik wybranego działania to: " + wynik);
    }

    private boolean shouldMultiply() {
        boolean wynik;

        System.out.println("Zaczynamy!");
        System.out.println("Jeżeli chcesz mnożyć wpisz true, jeżeli dodawać wpisz false ");

        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();
        if (slowo.equals("true")){
            wynik = true;
        }
        else wynik = false;

        return wynik;
    }

    private double getArgument(){
        double argument;

        System.out.println(" ");
        System.out.println("Podaj liczbę: ");

        Scanner scanner = new Scanner(System.in);
        argument = scanner.nextDouble();

        return argument;
    }
}
