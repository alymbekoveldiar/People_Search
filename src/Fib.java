import java.util.HashMap;
import java.util.Map;

public class Fib {
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1,1));
    public static int fib1(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, fib1(n - 1) + fib1(n - 2));
        }
        return memo.get(n);
    }
}
