package chap03;

public class Counter {
    int count;
    Counter(int count) {
        this.count = count;
    }

    public String toString() {
        return "Counter-" + count;
    }
}
