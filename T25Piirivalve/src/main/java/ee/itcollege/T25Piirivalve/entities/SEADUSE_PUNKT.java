package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.SEADUS;
import ee.itcollege.T25Piirivalve.entities.SEADUSE_PUNKT;

/**
 * Entity implementation class for Entity: SEADUSE_PUNKT
 *
 */
@Entity
@RooToString
@RooEntity

public class SEADUSE_PUNKT extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seaduse_punkt_ID;
	@Size(min = 1, max = 20)
	@NotNull
	private String paragrahv;
	@Size(min = 1, max = 20)
	@NotNull
	private String pais;
	@Size(min = 1, max = 20)
	@NotNull
	private String tekst;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kehtiv_alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kehtiv_kuni;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private SEADUS sEADUS;
	@ManyToOne
	private SEADUSE_PUNKT YLEMUS_SEADUSE_PUNKT;

	public SEADUSE_PUNKT() {
		super();
	}   
	public Long getSeaduse_punkt_ID() {
		return this.seaduse_punkt_ID;
	}

	public void setSeaduse_punkt_ID(Long seaduse_punkt_ID) {
		this.seaduse_punkt_ID = seaduse_punkt_ID;
	}   
	public String getParagrahv() {
		return this.paragrahv;
	}

	public void setParagrahv(String paragrahv) {
		this.paragrahv = paragrahv;
	}   
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}   
	public Date getKehtiv_alates() {
		return this.kehtiv_alates;
	}

	public void setKehtiv_alates(Date kehtiv_alates) {
		this.kehtiv_alates = kehtiv_alates;
	}   
	public Date getKehtiv_kuni() {
		return this.kehtiv_kuni;
	}

	public void setKehtiv_kuni(Date kehtiv_kuni) {
		this.kehtiv_kuni = kehtiv_kuni;
	}   
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public SEADUS getSEADUS() {
	    return sEADUS;
	}
	public void setSEADUS(SEADUS param) {
	    this.sEADUS = param;
	}
	public SEADUSE_PUNKT getSEADUSE_PUNKT() {
	    return sEADUSE_PUNKT;
	}
	public void setSEADUSE_PUNKT(SEADUSE_PUNKT param) {
	    this.sEADUSE_PUNKT = param;
	}
   
}
