public class Tuple<R,S> {
    private final R first;
    private final S second;

    public Tuple(R first, S second) {
        this.first = first;
        this.second = second;
    }

    public R first() {
        return first;
    }

    public S second() {
        return second;
    }
}
