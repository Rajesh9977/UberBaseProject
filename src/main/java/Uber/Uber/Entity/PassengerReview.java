package Uber.Uber.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class PassengerReview extends Review{
    private String PassengerReviewComment;
    private String PassengerRating;
}
