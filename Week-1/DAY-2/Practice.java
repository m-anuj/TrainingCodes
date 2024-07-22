package day2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> num = List.of(3,3,44,55,2789,5,4,7,5,4);

        List<String> st = List.of("Apple","Banana","Cat","DOG");

        // Stream program for printing sum of odd number using reduce
        int evenSum = num.stream().filter(element -> element%2==1).reduce(0,(num1,num2) -> num1+num2 );
        System.out.println(evenSum);

        //Stream program for printing sum of even number using reduce
        int oddSum = num.stream().filter(element -> element%2==0).reduce(0,(num1,num2) -> num1+num2 );
        System.out.println(oddSum);

        // Intermediate operation in stream

        // sort the list
        num.stream().sorted().forEach(e-> System.out.println(e));

        // sort the distinct list
        num.stream().distinct().sorted().forEach(e -> System.out.println(e));

        // sort the distinct list with elements squared

       num.stream().distinct().sorted().map(e -> e*e).forEach(e-> System.out.println(e));

        // Print the square of Ist 10 natural number
        IntStream.range(1,11).map(e -> e*e).forEach(e-> System.out.println(e));

        // Print the string List all element in lowerCase

       st.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));

        // Print the length of each element in string list

        //st.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

        // Terminal Operation on stream for Max using comparator
       int max = num.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
        System.out.println(max);

        // returning as list for string

        //System.out.println(num.stream().sorted().filter(e -> e%2 ==0).collect(Collectors.toList()));

        // returning as a list for an integer
        System.out.println(IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList()));

        // NOTE: filter method uses Predicate Function, Foreach uses Consumer interface , map uses Function interface. These interface are functional interfaces
    }
}
