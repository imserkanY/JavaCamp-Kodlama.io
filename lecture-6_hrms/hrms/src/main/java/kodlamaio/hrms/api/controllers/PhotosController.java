package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;


@RestController
@RequestMapping("/api/photos")
public class PhotosController {
	
	private PhotoService photoService;
	
	@Autowired
	public PhotosController(PhotoService photoService) {
		this.photoService = photoService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Photo photo) {
		return this.photoService.add(photo);
	}

		
	@GetMapping("/getall")
	public DataResult<List<Photo>> getAll(){
		return this.photoService.getAll();
	}
}
