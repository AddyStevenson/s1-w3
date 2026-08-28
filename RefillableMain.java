public class RefillableMain {
    public static void main(String[] args) {
        Refillable r1 = new Refillable();
        r1.addTo(10);
        r1.useUp(13);
        System.out.println(r1.getPoints());

    }
}
