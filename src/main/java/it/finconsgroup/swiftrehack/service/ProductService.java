/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.finconsgroup.swiftrehack.service;

import java.util.List;
import java.util.Optional;

import it.finconsgroup.swiftrehack.domain.Product;


/**
 * Service Interface for managing {@link Product}.
 */
public interface ProductService {

    /**
     * Save a product.
     *
     * @param product the entity to save.
     * @return the persisted entity.
     */
    Product save(Product product);

    /**
     * Get all the products.
     *
     * @return the list of entities.
     */
    List<Product> findAll();


    /**
     * Get the "id" product.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Product> findOne(String id);

    /**
     * Delete the "id" product.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}