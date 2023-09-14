public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        int a = 4;
        int b = 100;
        int c = 400;
        int rest = 0;
        boolean leapYear = true;
        boolean noLeapYear = false;

        System.out.println(year);


        if (year % a > rest) {
            System.out.println(noLeapYear);
        } else if (year % c == rest) {
            System.out.println(leapYear);
        } else if (year % b == rest) {
            System.out.println(noLeapYear);
        } else {
            System.out.println(leapYear);
        }
    }
}

