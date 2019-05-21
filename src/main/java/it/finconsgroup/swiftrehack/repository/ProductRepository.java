package it.finconsgroup.swiftrehack.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.finconsgroup.swiftrehack.domain.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}