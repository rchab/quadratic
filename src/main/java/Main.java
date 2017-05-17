public class Main {

    public static void main(String[] args) {
        Arguments arguments = new Arguments(1, -13, 36);
        Result result = Resolver.resolve(arguments);
        ResultPrinter.print(result);
    }
}
