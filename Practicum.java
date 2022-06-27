public class Practicum {
    public static void main(String[] args) {
        Object anyObject = new Person("������");
        int i = 1;
        System.out.println(anyObject);
        //qwer

    }
}

class Person {
    private String name;
    // новая строка
    private String testName;
    public Person(String name) {
        this.name = name;
    }
} 