public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price <= 1000) {
            System.out.println("This notebook is good.");
        } else {
            System.out.println("This notebook is expansive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1200) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1600) {
            System.out.println("This notebook is heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkPriceYear() {
        if (this.price > 1600 && this.year > 2020) {
            System.out.println("This notebook is expansive, but quite new.");
        } else if (this.price <= 1600 && this.year <= 2020) {
            System.out.println("This notebook is cheap, but old.");
        } else if (this.price > 1600 || this.year <= 2020) {
            System.out.println("This notebook is expansive and old.");
        } else {
            System.out.println("This notebook is cheap and new.");
        }
    }
}