package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/job-postings")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisementDto>> findByActivityStatus(){
		return this.jobAdvertisementService.findByActivityStatus();
	}
	@GetMapping("/getallapplicationdeadline")
	public DataResult<List<JobAdvertisementDto>> findByActivityStatusAndApplicationDeadline(){
		return this.jobAdvertisementService.findByActivityStatusAndApplicationDeadline();
	}
	@GetMapping("/getallcompanyname")
	public DataResult<List<JobAdvertisementDto>> findByActivityStatusTrueAndCompanyName(@RequestParam String companyName){
		return this.jobAdvertisementService.findByActivityStatusAndCompanyName(companyName);
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.delete(jobAdvertisement);
	}
}