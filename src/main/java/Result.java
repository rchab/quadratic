public class Result {
    public Double x1;
    public Double x2;

    public final static Result NO_RESULTS = new Result();

    public Result() {
    }

    public Result(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Result(Double x) {
        this.x1 = x;
        this.x2 = x;
    }
}
