package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: VAHTKOND_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKOND_INTSIDENDIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkod_intsidendis_ID;
	private static final long serialVersionUID = 1L;

	public VAHTKOND_INTSIDENDIS() {
		super();
	}   
	public Long getVahtkod_intsidendis_ID() {
		return this.vahtkod_intsidendis_ID;
	}

	public void setVahtkod_intsidendis_ID(Long vahtkod_intsidendis_ID) {
		this.vahtkod_intsidendis_ID = vahtkod_intsidendis_ID;
	}
   
}
