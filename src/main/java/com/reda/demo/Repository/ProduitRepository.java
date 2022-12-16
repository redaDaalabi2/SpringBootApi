package com.reda.demo.Repository;

import com.reda.demo.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {



}
