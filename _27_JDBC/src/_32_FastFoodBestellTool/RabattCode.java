package _32_FastFoodBestellTool;

public enum RabattCode {

    CODEWELLI(0.1), // 10% Rabatt
    CODEFRANCI(0.2), // 20% Rabatt
    CODEADV(0.15), // 15% Rabatt
    CODE3BKI(0.25); // 25% Rabatt

    private double rabatt;

    RabattCode(double rabatt) {
        this.rabatt = rabatt;
    }

    public double getRabatt() {
        return rabatt;
    }

}
