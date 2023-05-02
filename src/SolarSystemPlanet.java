public enum SolarSystemPlanet {
    MERCURY(1, 0, 0.39, 2439.7, null),
    VENUS(2, 0.72, 0.72, 6051.8, MERCURY),
    EARTH(3, 1, 1, 6371, VENUS),
    MARS(4, 1.52, 1.52, 3389.5, EARTH),
    JUPITER(5, 5.2, 5.2, 69911, MARS),
    SATURN(6, 9.58, 9.58, 58232, JUPITER),
    URANUS(7, 19.18, 19.18, 25362, SATURN),
    NEPTUNE(8, 30.07, 30.07, 24622, URANUS),
    PLUTO(9, 39.48, 39.48, 1188.3, NEPTUNE);

    private final int numberFromSun;
    private final double distanceFromPrevious;
    private final double distanceFromSun;
    private final double radius;
    private final SolarSystemPlanet previousPlanet;
    private SolarSystemPlanet nextPlanet;

    static {
        MERCURY.setNextPlanet(VENUS);
        VENUS.setNextPlanet(EARTH);
        EARTH.setNextPlanet(MARS);
        MARS.setNextPlanet(JUPITER);
        JUPITER.setNextPlanet(SATURN);
        SATURN.setNextPlanet(URANUS);
        URANUS.setNextPlanet(NEPTUNE);
        NEPTUNE.setNextPlanet(PLUTO);
        PLUTO.setNextPlanet(null);
    }

    SolarSystemPlanet(int numberFromSun, double distanceFromPrevious, double distanceFromSun, double radius,SolarSystemPlanet previousPlanet) {
        this.numberFromSun = numberFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }

    public int getNumberFromSun() {
        return numberFromSun;
    }

    public double getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystemPlanet getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystemPlanet getNextPlanet() {
        return nextPlanet;
    }

    public void setNextPlanet(SolarSystemPlanet nextPlanet) {
        this.nextPlanet = nextPlanet;
    }

    public void getInfo() {
        System.out.println("Planet " + this.name() + ":");
        System.out.println("Order from the Sun: " + this.numberFromSun);
        System.out.println("Distance from previous planet: " + this.distanceFromPrevious);
        System.out.println("Distance from the Sun: " + this.distanceFromSun );
        System.out.println("Radius: " + this.radius + " km");
        if (this.previousPlanet != null) {
            System.out.println("Previous planet: " + this.previousPlanet.name());
        } else {
            System.out.println("No previous planet.");
        }
        if (this.nextPlanet != null) {
            System.out.println("Next planet: " + this.nextPlanet.name());
        } else {
            System.out.println("No next planet.");
        }
    }
}


