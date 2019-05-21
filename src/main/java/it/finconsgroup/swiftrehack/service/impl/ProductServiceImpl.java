package it.finconsgroup.swiftrehack.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import it.finconsgroup.swiftrehack.domain.Product;
import it.finconsgroup.swiftrehack.repository.ProductRepository;
import it.finconsgroup.swiftrehack.service.ProductService;


/**
 * Service Implementation for managing {@link Product}.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Save a product.
     *
     * @param product the entity to save.
     * @return the persisted entity.
     */
    @Override
    public Product save(Product product) {
        log.debug("Request to save Product : {}", product);
        return productRepository.save(product);
    }

    /**
     * Get all the products.
     *
     * @return the list of entities.
     */
    @Override
    public List<Product> findAll() {
        log.debug("Request to get all Products");
        return productRepository.findAll();
    }


    /**
     * Get one product by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    public Optional<Product> findOne(String id) {
        log.debug("Request to get Product : {}", id);
        return productRepository.findById(id);
    }

    /**
     * Delete the product by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Product : {}", id);
        productRepository.deleteById(id);
    }
}