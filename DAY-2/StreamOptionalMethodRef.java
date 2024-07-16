package day2;

import java.util.List;
import java.util.Optional;

public class StreamOptionalMethodRef {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,4,5,6,4,444,56,77,33);

        Optional<Integer> l1Optional = l1.stream().filter(StreamOptionalMethodRef::isEven).max(Integer::compare);

        l1Optional.ifPresent(System.out::println);
    }

    public static boolean isEven(Integer num){
        return num%2==0;
    }
}
