package hopital.com.hopital.com.repository;

import hopital.com.hopital.com.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String> {
    Patient findByNom(String nom);

}
