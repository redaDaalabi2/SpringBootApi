package com.reda.demo.Controller;

import com.reda.demo.Entity.Produit;
import com.reda.demo.Service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit) {
        return produitService.creer(produit);
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id,@RequestBody Produit produit) {
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return produitService.supprimer(id);
    }

    @GetMapping("/getAll")
    public List<Produit> getAll() {
        return produitService.lister();
    }

}
