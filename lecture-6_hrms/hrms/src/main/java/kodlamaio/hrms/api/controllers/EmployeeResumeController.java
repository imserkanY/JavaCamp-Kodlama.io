package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployeeResume;

@RestController
@RequestMapping("/api/employee-resumes")
public class EmployeeResumeController {
	
	private EmployeeResumeService employeeResumeService;
	
	@Autowired
	public EmployeeResumeController(EmployeeResumeService employeeResumeService) {
		super();
		this.employeeResumeService = employeeResumeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeResume employeeResume) {
		return this.employeeResumeService.add(employeeResume);
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeResume>> getAll(){
		return this.employeeResumeService.getAll();
	}
	
	@GetMapping("/getByEmployeeEmployeeId")
	public DataResult<List<EmployeeResume>> getByEmployee_EmployeeId(int employeeId){
		return this.employeeResumeService.getByEmployee_EmployeeId(employeeId);
	}
	
}
