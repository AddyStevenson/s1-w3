public class Score {

    private int points;

    public Score(){
        points = 50;
    }

    public Score(int p){
        points = p;
    }

    public void increase(int pts){
        points += pts;
    }

    public void decrease(int pts){
        points -= pts;
    }

    public int getPoints(){
        return points;
    }

    
}
