import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter planet name: ");
        String planetName = scanner.nextLine().toUpperCase();
        SolarSystemPlanet planet = SolarSystemPlanet.valueOf(planetName);
        planet.getInfo();
    }
}