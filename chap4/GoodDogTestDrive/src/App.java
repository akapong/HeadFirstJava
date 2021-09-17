class GoodDog{
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (size > 60 ){
            System.out.println("Wooof! Wooof!");
        }else if ( size > 14){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog One: " + one.getSize());
        System.out.println("Dog Two: " + two.getSize());
        one.bark();
        two.bark();
        int x = 3+one.getSize();
        System.out.println("x: " + x);
    }
}
