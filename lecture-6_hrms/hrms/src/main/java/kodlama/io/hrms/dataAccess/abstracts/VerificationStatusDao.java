package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.VerificationStatus;

public interface VerificationStatusDao extends JpaRepository<VerificationStatus, Integer > {

}
