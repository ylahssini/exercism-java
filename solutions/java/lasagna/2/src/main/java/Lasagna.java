public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        return minutes - 10;
    }

    public int preparationTimeInMinutes(int minutes) {
        return minutes * 2;
    }

    public int totalTimeInMinutes(int couche, int minutes) {
        return (couche * 2) + minutes;
    }
}
