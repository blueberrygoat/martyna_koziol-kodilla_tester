public class Grades {
    private int[] grades;
    private int size;


    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastAddedGrade() {
        int value = this.grades[this.size - 1];
        return value;
    }

    public double averageGrade() {
        double sum = 0.00;
        for (int i = 0; i <= this.size - 1; i++) {
            sum = sum + grades[i];
        }

            double average = sum / this.size;
            return average;
        }
    }