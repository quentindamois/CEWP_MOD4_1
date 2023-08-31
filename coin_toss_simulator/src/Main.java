import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        System.out.println("Origin side : " + coin1.getSideUp());
        int head = 0, tail = 0;
        for(int i=0;i<20;i++){
            coin1.toss();
            System.out.println(coin1.getSideUp());
            if(Objects.equals(coin1.getSideUp(), coin1.sideHeads)){
                head++;
            } else if (Objects.equals(coin1.getSideUp(), coin1.sideTails)) {
                tail++;
            }
        }
        System.out.printf("Result :\n%2d heads\n%2d tails\n",head,tail);
    }
}