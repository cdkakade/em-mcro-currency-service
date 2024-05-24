package expense.manager.currency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "currency")
public class CurrencyEntity implements Serializable {

    private static final long serialVersionUID = -9153638561553445322L;

    @Id
    private long id;
    @Column(unique = true)
    private String name;
    private String iconUrl;
}
