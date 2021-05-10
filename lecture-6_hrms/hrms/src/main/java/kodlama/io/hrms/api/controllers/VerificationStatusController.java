package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.VerificationStatusService;
import kodlama.io.hrms.entities.concretes.VerificationStatus;

@RestController
@RequestMapping("/api/verification_status")
public class VerificationStatusController {
	
	private VerificationStatusService verificationStatusService;
	
	@Autowired
	public VerificationStatusController(VerificationStatusService verificationStatusService) {
		super();
		this.verificationStatusService = verificationStatusService;
	}
	
	@GetMapping("/getall")
	public List<VerificationStatus> getAll(){
		return this.verificationStatusService.getAll();
	}
}
