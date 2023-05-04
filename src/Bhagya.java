public interface Bhagya {
    public abstract void sound();
    public abstract void sleep();
}
class Human implements Bhagya{
    public void sound(){
        System.out.println("ho....hoo....");
    }
    public void sleep(){
        System.out.println("zzz...zzzz....");
    }
}
class Main{
    public static void main(String[] args) {
        Human h = new Human();
        h.sound();
        h.sleep();
    }
}