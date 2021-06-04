package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	  JobAdvertisement findByIdAndEmployer_UserId(int id, int userId);
	  
      @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto (e.companyName, j.jobDefinition, j.openPositions, j.createDate, j.applicationDeadline) From Employer e Inner Join e.jobAdvertisements j")	  
      List<JobAdvertisementDto> findByActivityStatus(boolean activityStatus);
      
      @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto (e.companyName, j.jobDefinition, j.openPositions, j.createDate, j.applicationDeadline) From Employer e Inner Join e.jobAdvertisements j")
      List<JobAdvertisementDto> findByActivityStatusOrderByApplicationDeadline(boolean activityStatus);
      
      @Query("Select new kodlamaio.hrms.entities.dtos.JobAdvertisementDto (e.companyName, j.jobDefinition, j.openPositions, j.createDate, j.applicationDeadline) From Employer e Inner Join e.jobAdvertisements j")
      List<JobAdvertisementDto> findByActivityStatusAndEmployer_CompanyName(boolean activityStatus, String companyName);
      
}