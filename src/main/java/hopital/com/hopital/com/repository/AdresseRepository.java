package hopital.com.hopital.com.repository;

import hopital.com.hopital.com.entities.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse,String> {
}
