package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		EmployeeRepository repository = ctxt.getBean(EmployeeRepository.class);
		/*
		Employee e1 =new Employee(1,"John",59000.00,"Male","Sales");
		Employee e2 =new Employee(2,"Johny",25000.00,"Male","Admin");
		Employee e3 =new Employee(3,"JohnBhai",15000.00,"Male","Sales");
		Employee e4 =new Employee(4,"Jak",53000.00,"Male","Sales");
		Employee e5 =new Employee(5,"JohnyPapa",54000.00,"Male","HR");
		Employee e6 =new Employee(6,"Johnrey",55000.00,"Male","Accountent");
		Employee e7 =new Employee(7,"JohnySin",50600.00,"Male","Marketing");
		Employee e8 =new Employee(8,"Johns",57000.00,"Male","Manager");
		
		
		repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8));
		*/
		/*
		List<Employee> emps = repository.findAll();
		emps.forEach(System.out::println);
		*/
		/*
		Sort sort = Sort.by("empName","empSalary").ascending();
		List<Employee> empss = repository.findAll(sort);
		empss.forEach(System.out::println);
		*/
		/*
		int pageNum =3;
		PageRequest page = PageRequest.of(pageNum-1, 3);
		Page<Employee> findAll = repository.findAll(page);
		
		List<Employee> emps = findAll.getContent();
		emps.forEach(System.out::println);
		*/
		//Dynamic Search(Dynamically Query will be created)
		/*
		Employee emp =new Employee();
		emp.setEmpGender("Fe-Male");
		emp.setDept("HR");
		
		Example<Employee> of = Example.of(emp);
		List<Employee> emps = repository.findAll(of);
		emps.forEach(System.out::println);
		*/
		
		Employee emp =new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Rani");
		emp.setDept("Sales");
		emp.setEmpGender("Fe-Male");
		
		repository.save(emp);
	}

}
