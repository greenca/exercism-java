public class SpaceAge {

    private long age;
    private double earth_age;

    public SpaceAge(long seconds) {
        age = seconds;
        earth_age = (double)seconds/31557600;
    }

    public long getSeconds() {
        return age;
    }

    public double onEarth() {
        return earth_age;
    }

    public double onMercury() {
        return earth_age/0.2408467;
    }

    public double onVenus() {
        return earth_age/0.61519726;
    }

    public double onMars() {
        return earth_age/1.8808158;
    }

    public double onJupiter() {
        return earth_age/11.862615;
    }

    public double onSaturn() {
        return earth_age / 29.447498;
    }

    public double onUranus() {
        return earth_age / 84.016846;
    }

    public double onNeptune() {
        return earth_age / 164.79132;
    }

}
