import java.util.Scanner;

public class EncapsulationChallenge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of pages to Print: ");
        int numberOfPagesPrint = s.nextInt();
        System.out.println("1. One Side Printer 2. Duplex Printer");
        int duplexPrinter = s.nextInt();

        Printer p = new Printer(numberOfPagesPrint, duplexPrinter);

        p.fillUp();
        boolean pagesPrint = p.simulate(numberOfPagesPrint);
        System.out.println(pagesPrint);
        int typeOfPrinter = p.isDuplexPrinter(duplexPrinter);
        System.out.println(typeOfPrinter);
    }
}

class Printer {
    int toner_level = 100;
    int numberOfPagesPrint;
    int duplexPrinter;
    int availablePaper = 50;

    Printer(int numberOfPagesPrint, int duplexPrinter) {
        this.numberOfPagesPrint = numberOfPagesPrint;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUp() {
        if (toner_level > 1 && toner_level <= 100) {
            this.toner_level = toner_level;
        }
    }

    public boolean simulate(int numberOfPagesPrint) {
        if (availablePaper - numberOfPagesPrint > 0) {
            numberOfPagesPrint++;
            return true;
        } else {
            return false;
        }
    }

    public int isDuplexPrinter(int duplexPrinter) {
        if (duplexPrinter == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
