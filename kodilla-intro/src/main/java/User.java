public class User {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User martyna = new User("Martyna", 33);
        User dominika = new User("Dominika", 51);
        User hanna = new User("Hanna", 25);
        User jagoda = new User("Jagoda", 30);

        User[] user = {martyna,dominika,hanna,jagoda};

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