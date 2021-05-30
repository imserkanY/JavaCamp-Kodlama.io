package kodlamaio.hrms.entities.concretes.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	
	private String companyName;
	private String positionName;
	private int openPositions;
	private Date createDate;
	private String applicationDeadline;
}
