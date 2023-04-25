public class Main {
    public static void main(String[] args) {
        Rownaniekwadratowe r = new Rownaniekwadratowe(-1, 2, 1);

        try {
            double[] rozwiazania = r.obliczRozwiazanie();
            System.out.println("x1 = " + rozwiazania[0] + ", x2 = " + rozwiazania[1]);
        } catch (Rownaniekwadratowe.DeltaUjemnaException e) {
            System.out.println("Delta jest ujemna");
        }
    }
}