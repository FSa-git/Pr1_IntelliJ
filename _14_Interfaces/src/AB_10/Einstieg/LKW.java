package AB_10.Einstieg;

public class LKW implements Driveable{

    private double acceleration;

    @Override
    public void beschleunigen(double a) {
        // Hereingeben --> a = 0,5 m/s^2, v = 100 km/h = 27,8 m/s Formel: t = v / a
        double v = 27.8;
        double t = v / a;

        System.out.println("Zeit von 0 auf 100 km/h beträgt: " + t + " Sekunden");

        acceleration = a;
    }

    @Override
    public void verzoegern(double a) {

    }

    // getter Methode um die Beschleunigung als Wert auszulesen
    public double getAcceleration(){
        return acceleration;
    }


}
