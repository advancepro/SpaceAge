package sample;

public class SpaceAge {
    private static final double EARTH_YEARS_IN_SECONDS = 365.25 * 24 * 60 * 60;
    private double ageInSeconds;

    public SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
    }
    public double getSeconds() {
        return ageInSeconds;
    }
    private enum RelativeOrbitalPeriod {
        MERCURY(0.2408467),
        VENUS  (0.61519726),
        MARS   (1.8808158),
        JUPITER(11.862615),
        SATURN (29.447498),
        URANUS (84.016846),
        NEPTUNE(164.79132);

        private final double ratio;

        RelativeOrbitalPeriod(double ratio) {
            this.ratio = ratio;
        }
        public double get(){
        return ratio;
        }
    }
        public double onEarth() {
            return ageInSeconds / EARTH_YEARS_IN_SECONDS;
    }

    public double onMercury() {
        return onEarth() / RelativeOrbitalPeriod.MERCURY.get();
    }

    public double onVenus() {
        return onEarth() / RelativeOrbitalPeriod.VENUS.get();
    }

    public double onMars() {
        return onEarth() / RelativeOrbitalPeriod.MARS.get();
    }

    public double onJupiter() {
        return onEarth() / RelativeOrbitalPeriod.JUPITER.get();
    }

    public double onSaturn() {
        return onEarth() / RelativeOrbitalPeriod.SATURN.get();
    }

    public double onUranus() {
        return onEarth() / RelativeOrbitalPeriod.URANUS.get();
    }

    public double onNeptune() {
        return onEarth() / RelativeOrbitalPeriod.NEPTUNE.get();
    }
}
