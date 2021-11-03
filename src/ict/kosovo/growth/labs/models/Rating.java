package ict.kosovo.growth.labs.models;

public enum Rating {
    NO_STAR(0, "\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR(1, "\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR(2, "\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR(3, "\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR(4, "\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR(5, "\u2605\u2605\u2605\u2605\u2605");

    private final int value;
    private final String stars;

    private Rating(int value, String stars) {
        this.value = value;
        this.stars = stars;
    }

    public int getValue() {
        return value;
    }

    public String getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return getStars();
    }
}
