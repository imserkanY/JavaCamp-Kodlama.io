package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.entities.concretes.Photo;

@Service
public class PhotoManager implements PhotoService{
	
	private PhotoDao photoDao;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao) {
		this.photoDao = photoDao;
	}
	
	@Override
	public Result add(Photo photo) {
		this.photoDao.save(photo);
		return new SuccessResult("Fotoğraf eklendi");
	}

	@Override
	public DataResult<List<Photo>> getAll() {
		return new SuccessDataResult<List<Photo>>(this.photoDao.findAll(),"Fotoğraflar listelendi.");
	}

}
