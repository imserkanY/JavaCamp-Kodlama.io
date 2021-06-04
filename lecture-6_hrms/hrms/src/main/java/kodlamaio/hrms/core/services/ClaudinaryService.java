package kodlamaio.hrms.core.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Service
public class ClaudinaryService implements CloudService{
	
	Cloudinary cloudinary;
	private Map<String, String> valuesMap = new HashMap<>();
	
	public  ClaudinaryService(){
		
		valuesMap.put("cloud_name", "dozbn0qcn");
		valuesMap.put("api_key", "762863762152764");
		valuesMap.put("api_secret", "YFTufZaT5YjX8DkJXF3wJDbpaX8");
		cloudinary = new Cloudinary(valuesMap);
	}
	public Map upload(MultipartFile multipartFile) throws IOException {
		
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream stream = new FileOutputStream(file);
		stream.write(multipartFile.getBytes());
		stream.close();
		
		Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		file.delete();
		
		return result;
	}
}