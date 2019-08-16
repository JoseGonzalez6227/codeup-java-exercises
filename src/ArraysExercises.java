import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] personArr = {new Person("Joey"), new Person("Jo"), new Person("Jose")};

        for (Person person : personArr) {
            System.out.println(person.getName());
        }

    }
}