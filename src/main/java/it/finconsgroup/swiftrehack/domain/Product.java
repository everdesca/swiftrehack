/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.finconsgroup.swiftrehack.domain;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Product.
 */
@Document(collection = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("version")
    private String version;

    @Field("productStructure")
    private List<ProductStructure> productStructure;

    @Field("inputParams")
    private List<InputParam> inputParams;

    @Field("productParms")
    private List<InputParam> productParms;

    @Field("validationRules")
    private List<InputParam> validationRules;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<ProductStructure> getProductStructure() {
        return productStructure;
    }

    public void setProductStructure(List<ProductStructure> productStructure) {
        this.productStructure = productStructure;
    }

    public List<InputParam> getInputParams() {
        return inputParams;
    }

    public void setInputParams(List<InputParam> inputParams) {
        this.inputParams = inputParams;
    }

    public List<InputParam> getProductParms() {
        return productParms;
    }

    public void setProductParms(List<InputParam> productParms) {
        this.productParms = productParms;
    }

    public List<InputParam> getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(List<InputParam> validationRules) {
        this.validationRules = validationRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", version=" + version + ", productStructure=" + productStructure + ", inputParams=" + inputParams + ", productParms=" + productParms + ", validationRules=" + validationRules + '}';
    }

}
