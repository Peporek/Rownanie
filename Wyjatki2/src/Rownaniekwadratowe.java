public class Rownaniekwadratowe {
    double a;
    double b;
    double c;

    public Rownaniekwadratowe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obliczDelte() {
        return b * b - 4 * a * c;
    }

    public double[] obliczRozwiazanie() throws DeltaUjemnaException {
        double delta = obliczDelte();
        if (delta < 0) {
            throw new DeltaUjemnaException();
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x, x};
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        }
    }

    class DeltaUjemnaException extends Exception {
        public DeltaUjemnaException() {
            super("Delta jest ujemna!");
        }

    }
}