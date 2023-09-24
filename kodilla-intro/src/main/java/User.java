public class User {
    String name;
    int age;

    public static void main(String[] args) {
        User[] user = new User[4];

        user[0] = new User();
        user[1] = new User();
        user[2] = new User();
        user[3] = new User();

        user[0].name = "Martyna";
        user[1].name = "Dominika";
        user[2].name = "Jagoda";
        user[3].name = "Hanna";
        user[0].age = 33;
        user[1].age = 51;
        user[2].age = 25;
        user[3].age = 30;

        double sum = 0.00;
        for (int i = 0; i < user.length; i++) {
            sum = sum + user[i].age;
        }

        double averageAge = sum / user.length;
        System.out.println(averageAge);

        int x = 0;
        while (x <= 3) {
            if (user[x].age < averageAge) {
                System.out.println(user[x].name);
            }
            x = x + 1;
        }
    }
}