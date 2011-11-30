package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PIIRIPUNKTI_ORG_YKSUS
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIPUNKTI_ORG_YKSUS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiripunkti_org_yksus_ID;
	private static final long serialVersionUID = 1L;

	public PIIRIPUNKTI_ORG_YKSUS() {
		super();
	}   
	public Long getPiiripunkti_org_yksus_ID() {
		return this.piiripunkti_org_yksus_ID;
	}

	public void setPiiripunkti_org_yksus_ID(Long piiripunkti_org_yksus_ID) {
		this.piiripunkti_org_yksus_ID = piiripunkti_org_yksus_ID;
	}
   
}
