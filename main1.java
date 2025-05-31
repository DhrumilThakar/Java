class Foo {
    public static void classMethod() {
        System.out.println("classMethod() in foo");
    }

    public void instance() {
        System.out.println("instancemethod() in foo");
    }
}

class Bar extends Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Bar");
    }

    public void instance() {
        System.out.println("instancemethod() in Bar");
    }
}

public class main1 {
    public static void main(String[] args) {
        Foo f = new Bar();
        f.instance();
        f.classMethod();
    }
}
