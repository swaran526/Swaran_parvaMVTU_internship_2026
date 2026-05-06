package function_interface;

import java.util.function.Predicate;

public class predicateFunction_interface {
public static void main(String[] args) {
	Predicate<Integer> pre= a->a%2==0;
	System.out.println(pre.test(13));
}
}
