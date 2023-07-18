package com.mycompany.group234.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.mycompany.group234.model.Account;
import com.mycompany.group234.model.Person;

@Entity(name = "PersonHolds")
@Table(schema = "\"generated_app\"", name = "\"PersonHolds\"")
@Data
public class PersonHolds{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PersonId\"")
	private Integer personId;

    
    @Column(name = "\"AccountId\"")
    private Integer accountId;
 
}