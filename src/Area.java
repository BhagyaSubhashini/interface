interface Area {
    abstract void getArea(final int length,final int width);
}
class Rectangle implements Area{
    public void getArea(int length,int width){
        System.out.println(length*width);
    }
}
class Run{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(10,5);
    }
}