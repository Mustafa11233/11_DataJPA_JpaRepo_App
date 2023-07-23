package in.ashokit.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tbl_emp")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	private Integer empId;
	@CreationTimestamp
	@Column(name = "date_created" ,updatable = false)
	private LocalDate dateCreated;
	private String empName;
	private Double empSalary;
	private String empGender;
	private String dept;
	
	
	
	@UpdateTimestamp
	@Column(name = "last_updated", insertable = false)
	private LocalDate lastUpdated;

}
