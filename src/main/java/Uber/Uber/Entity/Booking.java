package Uber.Uber.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Booking extends BaseModel{
    @OneToOne
    private Review review;
    private Date startTime;
    private Date EndTime;
    private int TotalDistance;
    @Enumerated(EnumType.STRING)  //Enum Mapping in JPA
    private BookingStatus bookingStatus;


}
