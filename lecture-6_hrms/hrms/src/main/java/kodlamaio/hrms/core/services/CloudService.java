package kodlamaio.hrms.core.services;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface CloudService {
	Map add(MultipartFile multipartFile) throws IOException;
}