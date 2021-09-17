class PoorDog{
    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        PoorDog one = new PoorDog();
        System.out.println("Dog Name is " + one.getName());
        System.out.println("Dog Size is " + one.getSize());
    }
}
