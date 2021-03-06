package devoir.boulami.erguibi.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bug")
public class Bug {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String description;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Logiciel logiciel;
	
	private Boolean attribue ; 
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Urgence urgence;

	private String etat;
	public Bug(int id, String nom, String description, String etat, Urgence urgence, Logiciel logiciel) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.etat = etat;
		this.urgence = urgence;
		this.logiciel = logiciel;
		this.attribue = false;
	}
	public Boolean getAttribue() {
		return attribue;
	}
	public void setAttribue(Boolean attribue) {
		this.attribue = attribue;
	}
	public Bug() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Urgence getUrgence() {
		return urgence;
	}
	public void setUrgence(Urgence urgence) {
		this.urgence = urgence;
	}
	public Logiciel getLogiciel() {
		return logiciel;
	}
	public void setLogiciel(Logiciel logiciel) {
		this.logiciel = logiciel;
	}
	@Override
	public String toString() {
		
		return nom+"";
	}
	
	
	
}

