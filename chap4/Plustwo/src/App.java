class plus{
    int plusTwo(int x, int y){
        int z = x + y;
        return z;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        plus p = new plus();
        int x = p.plusTwo(4, 3);
        System.out.println("x = "+ x);
    }
}
