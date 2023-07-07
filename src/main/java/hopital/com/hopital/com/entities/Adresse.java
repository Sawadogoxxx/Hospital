package hopital.com.hopital.com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor @AllArgsConstructor
public class Adresse {
    @Id
    private String id;
    private String telephone;
    private String email;
    private String ville;
}
