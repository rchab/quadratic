public class Resolver {

    public static Result resolve(Arguments arguments) {
        double x1, x2;

        double a = arguments.a;
        double b = arguments.b;
        double c = arguments.c;

        double d = Math.pow(b, 2) - (4 * a * c);

        if (d > 0){
            x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
            return new Result(x1, x2);
        } else if (d == 0) {
            x1 = (-1) * b;
            return new Result(x1);
        } else {
            return new Result();
        }
    }
}
