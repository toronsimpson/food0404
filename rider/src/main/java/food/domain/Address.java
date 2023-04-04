package food.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Address_table")
@Data
public class Address {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
