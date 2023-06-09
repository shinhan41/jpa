package ex;

import ex.Enum.DeliveryStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "delivery")
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    private String city;
    private String street;
    private String zipcode;
    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;


}