public class Practicum {
    public static void main(String[] args) {
        Object anyObject = new Person("������");
	int i = 1;
        System.out.println(anyObject);

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
} 