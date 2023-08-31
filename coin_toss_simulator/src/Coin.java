
public class Coin {
    private String sideUp;
    public String sideHeads = "heads";
    public String sideTails = "tails";
    public Coin(){
        if(Math.random() > 0.5) {
            this.sideUp = sideTails;
        } else {
            this.sideUp = sideHeads;
        }
    }
    public void toss(){
        if(Math.random() > 0.5) {
            this.sideUp = sideTails;
        } else {
            this.sideUp = sideHeads;
        }
    }

    public String getSideUp(){
        return sideUp;
    }
}
