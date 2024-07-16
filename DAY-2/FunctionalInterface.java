package day2;

interface MyFunction{
    String print(String s);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // To upper Case
        MyFunction upCase = s -> s.toUpperCase();
        String res1 = applyFunction("hello",upCase);
        System.out.println("Result after UpperCase is: "+res1);

        // Reversing
        MyFunction rev = s -> new StringBuilder(s).reverse().toString();
        String res2 = applyFunction("Anuj",rev);
        System.out.println("Result after reversing is: "+res2);

    }
    static String applyFunction(String s,MyFunction fun){
        return fun.print(s);

    }
}
