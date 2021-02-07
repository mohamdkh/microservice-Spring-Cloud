package ehtp.medkh.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class company {
	 @GeneratedValue(strategy = GenerationType.IDENTITY) @Id
	private long id;
	private String name;
	private double price;
	

}
