import java.util.ArrayList;
import java.util.List;
public class ok {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(new Integer(8)); // Line 7
         // Line 8
        for (Integer number: numbers) System.out.println(number); // Line 9
    }
}
