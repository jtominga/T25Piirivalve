package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: OBJEKT
 *
 */
@Entity
@RooToString
@RooEntity

public class OBJEKT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long objekt_ID;
	private static final long serialVersionUID = 1L;

	public OBJEKT() {
		super();
	}   
	public Long getObjekt_ID() {
		return this.objekt_ID;
	}

	public void setObjekt_ID(Long objekt_ID) {
		this.objekt_ID = objekt_ID;
	}
   
}
