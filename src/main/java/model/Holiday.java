package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "HOLIDAYS")
public class Holiday {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "HOLIDAY_DATE")
	private LocalDate holidayDate;

	@Column(name = "REASON")
	private String status;

}
