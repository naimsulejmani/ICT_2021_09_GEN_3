package ict.kosovo.growth.labs.models;

import java.time.LocalDateTime;

public class Review {
    /*
    Kush, kur, cka dhe sa
     */
    private String comment;
    private Rating rating;
    private String username;
    private LocalDateTime reviewDate;

    public Review(String comment, Rating rating, String username, LocalDateTime reviewDate) {
        this.comment = comment;
        this.rating = rating;
        this.username = username;
        this.reviewDate = reviewDate;
    }

    public Review(String comment, Rating rating, String username) {
        this(comment, rating, username, LocalDateTime.now());
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    @Override
    public String toString() {
        return String.format("User: %s (%s) Rated: %s%nComment: %s",
                username, reviewDate, rating, comment);
    }
}
