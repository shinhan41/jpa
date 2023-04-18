package ex;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "category_item")
public class CategoryItem {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

}