public class ResultPrinter {
    public static void print(Result result) {
        printElement("x1", result.x1);
        printElement("x2", result.x2);
    }

    private static void printElement(String resultName, Double x) {
        String resultView = "";
        if (x != null) {
            resultView = x.toString();
        }
        System.out.println(resultName +  "=" + resultView);
    }
}
