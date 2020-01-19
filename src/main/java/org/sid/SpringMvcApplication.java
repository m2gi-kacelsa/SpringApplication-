package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		produitRepository.save(new Produit(null, "Stelo", 20.00, 5));
//		produitRepository.save(new Produit(null, "PC DELL", 20000.00, 5));
//		produitRepository.save(new Produit(null, "Clavier", 2000.00, 5));
//		produitRepository.save(new Produit(null, "Souris", 200.00, 5));
		
		produitRepository.findAll().forEach(p -> {
			System.out.println(p.getDesignation());
		});
	}

}
