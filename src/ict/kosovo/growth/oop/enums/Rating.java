package ict.kosovo.growth.oop.enums;

public enum Rating {
    //vlersimi,
    NO_STAR("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");


    private String stars;

    private Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
//-this e ka kptimin e instances se objektit
    public void print() {
        System.out.printf("%s -> %s %n", this.toString(), stars);
    }
}
