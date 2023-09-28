import java.util.Scanner;
public class Colour {
    public static String colourChoice() {
        Scanner colour = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (R - red, B - blue, Y - yellow):");
            String nameColour = colour.nextLine().trim().toUpperCase();
            switch (nameColour) {
                case "R":
                    return "red";
                case "B":
                    return "blue";
                case "Y":
                    return "yellow";
                default:
                    System.out.println("Try again.");
            }
        }
    }
        public static void main(String[] args) {
            Colour yourColour = new Colour();
            String name = yourColour.colourChoice();
            System.out.println("Your colour is: " + name);
        }
    }