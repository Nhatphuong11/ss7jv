package bt.bt1;

public class main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Thành");
        System.out.print("Original value:");
        System.out.println(myClass.getMyString());
        myClass.setMyString("Minh");
        System.out.print("New value: ");
        System.out.println(myClass.getMyString());
    }
}
