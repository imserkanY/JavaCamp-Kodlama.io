package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	  JobAdvertisement findByIdAndEmployer_UserId(int id, int userId);
	  
      List<JobAdvertisement> findByActivityStatus(boolean activityStatus);
      
      List<JobAdvertisement> findByActivityStatusOrderByApplicationDeadline(boolean activityStatus);
      
      List<JobAdvertisement> findByActivityStatusAndEmployer_CompanyName(boolean activityStatus, String companyName);
      
}