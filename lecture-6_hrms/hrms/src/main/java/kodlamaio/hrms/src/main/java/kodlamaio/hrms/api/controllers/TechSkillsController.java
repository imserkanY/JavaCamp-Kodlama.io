package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.TechSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.TechSkill;

@RestController
@RequestMapping("/api/tech-skills")
public class TechSkillsController {
	
	private TechSkillService techSkillService;
	
	@Autowired
	public TechSkillsController(TechSkillService techSkillService) {
		super();
		this.techSkillService = techSkillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody TechSkill techSkill ) {
		return this.techSkillService.add(techSkill);
	}
	@GetMapping("/getall")
	public DataResult<List<TechSkill>> getAll(){
		return this.techSkillService.getAll();
	}
}
