public class CandyJarMain {
    public static void main(String[] args) {
      CandyJar a1 = new CandyJar();
      CandyJar a2 = new CandyJar(100);

    a1.eat(20);
    a2.refill(20);
    

    a1.printState();
    a2.printState();

  
    a1.printState();
    a2.printState();

    }



}
