package function_interface;
@FunctionalInterface
interface MyInterface{
	void display();
}
public class functional_interface1 {
public static void main(String[] args) {
	MyInterface i=()->{
		System.out.println("hello world");};
		i.display();
	}
}

