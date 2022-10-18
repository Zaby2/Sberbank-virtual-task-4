import java.text.NumberFormat;

public class City {
    private int num;
    private int population;
    NumberFormat f = NumberFormat.getInstance();
    public City(int num, int population) {
        this.num = num;
        this.population = population;

    }
    public void Output() {
        System.out.println("[" + num + "] " + f.format(population));
    }
}
