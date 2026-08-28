public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c1 = new Classroom("Morris", 30, 30);
        Classroom c2 = new Classroom("Kessler");

        c2.setDesks(30);


        System.out.println("Teacher: " + c1.teacher() + "Desks: " + c1.desks() + "Students: " + c1.students());
    }
}
