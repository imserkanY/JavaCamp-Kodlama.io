package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.VerificationStatusService;
import kodlama.io.hrms.dataAccess.abstracts.VerificationStatusDao;
import kodlama.io.hrms.entities.concretes.VerificationStatus;

@Service
public class VerificationStatusManager implements VerificationStatusService{
	private VerificationStatusDao verificationStatusDao;
		

	@Autowired
	public VerificationStatusManager(VerificationStatusDao verificationStatusDao) {
		super();
		this.verificationStatusDao = verificationStatusDao;
	}



	@Override
	public List<VerificationStatus> getAll() {
		return this.verificationStatusDao.findAll();
	}
		
}
