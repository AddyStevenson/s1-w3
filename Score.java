public class Score {

    private int points;

    public Score(){
        points = 50;
    }

    public Score(int p){
        points = p;
    }

    private void gain(int pts){
        points += pts;
    }

    private void lose(int pts){
        points -= pts;
    }

    public int getPoints(){
        return points;
    }

    
}
