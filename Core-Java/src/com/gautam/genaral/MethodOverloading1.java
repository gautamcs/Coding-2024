package gautam.general;

public class MethodOverloading1 {

    static void display(String s) {

        System.out.println(" String arguments ");

    }

    static void display(Object o) {

        System.out.println(" Object arguments ");

    }

    public static void main(String[] args) {
        display(null);
    }
}
