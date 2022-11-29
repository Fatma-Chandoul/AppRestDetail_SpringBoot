package tn.essat.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class Produit  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String titre;
public Produit(int id, String titre) {
	super();
	this.id = id;
	this.titre = titre;
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}

}
