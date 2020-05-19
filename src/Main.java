public class Main {
    public static void main(String[] args) {
        Slnko slnko = Slnko.getInstance();
        Planeta planeta = new Planeta("Mars");

        slnko.addPlaneta(planeta);

        planeta = new Planeta("Uran");

        slnko.addPlaneta(planeta);

        slnko.printPlanets();
    }
}