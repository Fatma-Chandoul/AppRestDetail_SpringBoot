package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Produit;
@Repository
public interface IProduit extends JpaRepository<Produit, Integer> {

}
