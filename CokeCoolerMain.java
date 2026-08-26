public class CokeCoolerMain {
    public static void main(String[] args) {
        CokeCooler a1 = new CokeCooler();
        CokeCooler a2 = new CokeCooler();

        a1.take(10);
        a2.add(10);

        System.out.println(a1.cokeCount());
        System.out.println(a2.cokeCount());



    }
    
}
