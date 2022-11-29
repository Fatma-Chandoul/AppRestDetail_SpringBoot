package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IProduit;
import tn.essat.model.Produit;

@RestController
@CrossOrigin("*")
@RequestMapping("/rest")
public class AppRest {
	@Autowired
	IProduit prod;
	
	@GetMapping("/listes")
	public List<Produit> f11(){
		System.out.println(prod.findAll());
		List<Produit> ps=prod.findAll();
		return ps;
	}
	@PostMapping("/save")
	public void f12(@RequestBody Produit p) {
		prod.save(p);
	}
	@DeleteMapping("/delete/{id}")
	public void f13(@PathVariable("id") int id) {
		prod.deleteById(id);
	}
//	 @PostMapping("/add12")
//	 public void f12(@RequestBody Produit p) {
//		 gest.addProduit(p);
//		 
//	 }
//	 @GetMapping("produit/{id}")
//	 @RequestMapping(path = "/produit/{id}",method = RequestMethod.GET)
//	 public Produit f13(@PathVariable int id) {
//		 return new Produit(15,"rrrr");
//		 
//	 }
//	 @GetMapping("del/{id}")
//	 @RequestMapping(path = "/del/{id}",method = RequestMethod.DELETE)
//	 public Produit f14(@PathVariable int id) {
//		 return new Produit(15,"rrrr");
//		 
//	 }

}
