public class Refillable {
    private int amount;

    private int totalUsed;

    private int totalTimesUsedHappens;

    public Refillable() {
        amount = 10;
        totalUsed = 0;
        totalTimesUsedHappens = 0;
    }

    public Refillable(int a) {
        amount = a;
        totalUsed += a;
        totalTimesUsedHappens +=1;

    }

    public void useUp(int amt) {
        amount -= amt;
        totalUsed += amt;
        totalTimesUsedHappens +=1;

    }

    public void addTo(int amt) {
        amount += amt;
    }

    public double averageUse(){

    }

    public int getPoints() {
        return amount;
    }



}
