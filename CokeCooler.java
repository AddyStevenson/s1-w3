public class CokeCooler {
    private int numcokes;

    public CokeCooler(){
        numcokes = 100;

    }

    public CokeCooler(int c){
        numcokes = c;
    }
    
    public void take(int coke){
        numcokes -= coke;

    }

    public void add(int coke){
        numcokes += coke;
    }

     public void printState(){
        System.out.println("Number of Cokes:" + numcokes);
    }
    


}
