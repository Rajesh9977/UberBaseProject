package Uber.Uber.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "bookingreview")
public class Review extends BaseModel{

    String reviewContent;

    int rating;

    public String toString(){
        return "review "+ this.reviewContent+ " "+this.rating+" "+this.createdAt;
    }



}
