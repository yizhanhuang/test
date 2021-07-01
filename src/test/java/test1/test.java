package test1;

public class test {
    public String sayHello() {
        return "Hello Maven!";
    }

    public static void main(String[] args) {
        System.out.println(new test().sayHello());
    }
}
