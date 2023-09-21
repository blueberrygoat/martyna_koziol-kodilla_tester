public class GradesCheck {
    public static void main(String[] args) {
        Grades grades = new Grades ();

        grades.add(5);
        grades.add(2);
        grades.add(20);
        grades.add(1);

        System.out.println(grades.lastAddedGrade());
        System.out.println(grades.averageGrade());
    }
}
