package ex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Locker {

    @Id @GeneratedValue
    private long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
