public class Main {
    public static void main(String[] args) {

        int[] aufstellung = { 1, 3, 5, 7, 8, 10, 11, 13, 14, 16, 19 };

        int start = aufstellung.length - 1;

        int ergebnis = 7;

        while (aufstellung[start] != ergebnis)
            if (aufstellung[start] > ergebnis) start = start >> 1;
            else if (aufstellung[start] < ergebnis) start += start >> 1;

        System.out.println(aufstellung[start]);

    }
}
