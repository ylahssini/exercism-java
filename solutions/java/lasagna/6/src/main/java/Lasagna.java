public class Lasagna {
    private int MINUTES_LASAGNA_EXPECTED = 40;
    private int MULTIPLY_COUCHE_MINUTE = 2;
    
    public int expectedMinutesInOven() {
        return this.MINUTES_LASAGNA_EXPECTED;
    }

    public int remainingMinutesInOven(int minutes) {
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int minutes) {
        return minutes * this.MULTIPLY_COUCHE_MINUTE;
    }

    public int totalTimeInMinutes(int couche, int minutes) {
        return this.preparationTimeInMinutes(couche) + minutes;
    }
}
