public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Grzegorz";
        names[1] = "Jagoda";
        names[2] = "Jacek";
        names[3] = "Martyna";
        names[4] = "Dominika";


        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElements);
        System.out.print(" elementów");
    }
}