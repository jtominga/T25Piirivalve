package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: VAHTKONNA_LIIGE
 *
 */
@Entity
@RooToString
@RooEntity

public class VAHTKONNA_LIIGE extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long vahtkonna_liige_ID;
	private static final long serialVersionUID = 1L;

	public VAHTKONNA_LIIGE() {
		super();
	}   
	public Long getVahtkonna_liige_ID() {
		return this.vahtkonna_liige_ID;
	}

	public void setVahtkonna_liige_ID(Long vahtkonna_liige_ID) {
		this.vahtkonna_liige_ID = vahtkonna_liige_ID;
	}
   
}
