package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.entities.concretes.dtos.EmployeeDto;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	private UserService userService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, UserService userService) {
		super();
		this.employeeDao = employeeDao;
		this.userService = userService;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll(),"İş arayan kişiler listelendi");
		
	}

	@Override
	public Result register(EmployeeDto employee) {
		User userToRegister = new User(employee.getEmail(), employee.getPassword(),false);
		userService.add(userToRegister);
		Employee employeeToRegister = new Employee(userToRegister.getId(), employee.getFirstName(),employee.getLastName(), employee.getNationalityId(),employee.getDateOfBirth());
		this.employeeDao.save(employeeToRegister);
		return new SuccessResult("Kişi eklendi");
	}

}
