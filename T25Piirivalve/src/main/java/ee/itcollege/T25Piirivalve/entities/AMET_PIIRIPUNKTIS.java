package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AMET_PIIRIPUNKTIS
 *
 */
@Entity
@RooToString
@RooEntity

public class AMET_PIIRIPUNKTIS extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long amet_piiripunktis_id;
	private static final long serialVersionUID = 1L;

	public AMET_PIIRIPUNKTIS() {
		super();
	}   
	public Long getAmet_piiripunktis_id() {
		return this.amet_piiripunktis_id;
	}

	public void setAmet_piiripunktis_id(Long amet_piiripunktis_id) {
		this.amet_piiripunktis_id = amet_piiripunktis_id;
	}
   
}
