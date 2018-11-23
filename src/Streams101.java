import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams101 {
    public static void main(String[] args)
    {
        List<String> fruits = Arrays.asList("pear","banana","apricot","apple");
        fruits.stream()
                .sorted()
                .forEach(fruit -> System.out.println(fruit));

        System.out.println("The original list is in original order: "+fruits);

        //find the first element from the fruits collection (if it was sorted
        //alphabetically )
        fruits.stream()
              .sorted()
              .findFirst()
              .ifPresent(fruit -> System.out.println("\nThe first fruit if sorted is: "+fruit));

        //filter for all the fruit that start with the letter a
        System.out.println("\nFruit that start with the letter A");
        fruits.stream()
                .filter(fruit -> fruit.startsWith("a") || fruit.startsWith("A"))
                .forEach(System.out::println);

        //show how .map works
        List<String> coolNewList = fruits.stream()
                                        .sorted()
                                        .map(fruit -> fruit.toUpperCase())
                                        .collect(Collectors.toList());
        System.out.println("After mapping to uppercase: "+coolNewList);



    }
}
