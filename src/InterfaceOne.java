public interface InterfaceOne {
    public abstract void method_one();
}
interface InterfaceTwo{
    public abstract void method_two();
}
class Inheritance implements InterfaceOne,InterfaceTwo{
    @Override
    public void method_one() {
        System.out.println("one");
    }

    @Override
    public void method_two() {
        System.out.println("two");
    }
}
class Test{
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.method_one();
        i.method_two();
    }
}