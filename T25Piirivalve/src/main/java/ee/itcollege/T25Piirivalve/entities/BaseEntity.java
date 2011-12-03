package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.*;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.*;

/**
 * Entity implementation class for Entity: BaseEntity
 *
 */
@MappedSuperclass
@RooToString
@RooEntity(mappedSuperclass = true)

public abstract class BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Size(min = 1, max = 32)
	private String avaja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date avatud;
	
	@Size(min = 1, max = 32)
	private String muutja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date muudetud;
	
	@Size(min = 1, max = 32)
	private String sulgeja;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date suletud;
	
	private String kommentaar;
	private static final long serialVersionUID = 1L;	
	
	@PrePersist
	public void onCreate() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		setAvaja(auth.getName());
		Calendar cal = Calendar.getInstance();
		setAvatud(new Date());
		cal.set(9999, 11, 31);
		setMuutja("N/A");
		setSulgeja("N/A");
		setMuudetud(cal.getTime());
		setSuletud(cal.getTime());
	}
	
	@PreUpdate
	public void onUpdate() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		setMuutja(auth.getName());
		setMuudetud(new Date());
	}
	
	@Transactional
	public void remove() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		setSulgeja(auth.getName());
		setSuletud(new Date());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAvaja() {
		return this.avaja;
	}

	public void setAvaja(String avaja) {
		this.avaja = avaja;
	}   
	public Date getAvatud() {
		return this.avatud;
	}

	public void setAvatud(Date avatud) {
		this.avatud = avatud;
	}   
	public String getMuutja() {
		return this.muutja;
	}

	public void setMuutja(String muutja) {
		this.muutja = muutja;
	}   
	public Date getMuudetud() {
		return this.muudetud;
	}

	public void setMuudetud(Date muudetud) {
		this.muudetud = muudetud;
	}   
	public String getSulgeja() {
		return this.sulgeja;
	}

	public void setSulgeja(String sulgeja) {
		this.sulgeja = sulgeja;
	}   
	public Date getSuletud() {
		return this.suletud;
	}

	public void setSuletud(Date suletud) {
		this.suletud = suletud;
	}
	
	public String getKommentaar() {
		return this.kommentaar;
	}

	public void setKommentaar(String kommentaar) {
		this.kommentaar = kommentaar;
	}
   
}
