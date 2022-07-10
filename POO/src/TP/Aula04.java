package TP;
// import java.util.*;

interface NumericTest {
    boolean test(int n);
}
public class Aula04 {
    // public static void main(String[] args) {
    //     HashSet<String> set = new HashSet<String>();

    //     set.add("John");
    //     set.add("Jane");
    //     set.add("John");
    //     set.add("Jack");
    //     System.out.println("John".hashCode());
    //     System.out.println("Jane".hashCode());
    //     System.out.println("John".hashCode());
    //     System.out.println(set);
    // }
    // Another functional interface.

    public static void main(String args[]) {
        // A lambda expression that tests if a number is even.
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("10 is even");
        if (!isEven.test(9)) System.out.println("9 is not even");
        // A lambda expression that tests if a number is non-negative.
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) System.out.println("1 is non-negative");
        if (!isEven.test(9)) System.out.println("9 is even");
        if (!isNonNeg.test(-1)) System.out.println("-1 is negative");
    }
}
