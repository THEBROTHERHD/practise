package adapter;

public class TachoMeeter implements ITachometer {

    private Speedometer speedometer;

    TachoMeeter() {
        this.speedometer = new Speedometer();
    }

    @Override
    public void messe(double meilen, double stunden) {
        speedometer.measure(meilen, stunden);
    }

    @Override
    public double getDurchschnittsgeschwindigkeitKmH() {
        return speedometer.getAverageSpeedMpH();
    }
}
