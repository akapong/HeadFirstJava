public class BeerSong {
    public static void main(String[] args) throws Exception {
        int beerNum = 10;
        String word = "bottles";

        while (beerNum > 1){
            if(beerNum == 1){
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;
            if (beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall");
            }else{
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}