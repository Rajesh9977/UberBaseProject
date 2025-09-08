package Uber.Uber.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter


public class DriverReview extends Review{
    private String DriverReviewComment;
}
