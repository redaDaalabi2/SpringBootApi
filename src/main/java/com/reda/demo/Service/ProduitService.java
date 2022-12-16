package com.reda.demo.Service;

import com.reda.demo.Entity.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit> lister();

    Produit modifier(Long id, Produit produit);

    String supprimer(Long id);

}
