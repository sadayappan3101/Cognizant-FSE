import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nos = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> evenNos = nos.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNos);
    }
}
