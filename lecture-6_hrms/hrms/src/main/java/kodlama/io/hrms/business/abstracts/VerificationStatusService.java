package kodlama.io.hrms.business.abstracts;

import java.util.List;


import kodlama.io.hrms.entities.concretes.VerificationStatus;

public interface VerificationStatusService {
	List<VerificationStatus> getAll();
}
