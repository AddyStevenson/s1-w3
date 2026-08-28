public class ScoreMain {
    public static void main(String[] args) {
        Score s1 = new Score();
        System.out.println(s1.getPoints());

        Score s2 = new Score(50);
        s2.increase(10);
        s2.decrease(20);
        System.out.println("should be 40: " + s2.getPoints());
    }
    
}
