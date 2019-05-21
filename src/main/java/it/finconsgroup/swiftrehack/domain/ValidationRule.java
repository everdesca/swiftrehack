/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.finconsgroup.swiftrehack.domain;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author emanuele.verdesca
 */
public class ValidationRule {

    @Field("id")
    private String id;

    @Field("type")
    private String type;

    @Field("inputParmRef")
    private String inputParmRef;

    @Field("productParmRef")
    private String productParmRef;

    @Field("message")
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInputParmRef() {
        return inputParmRef;
    }

    public void setInputParmRef(String inputParmRef) {
        this.inputParmRef = inputParmRef;
    }

    public String getProductParmRef() {
        return productParmRef;
    }

    public void setProductParmRef(String productParmRef) {
        this.productParmRef = productParmRef;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
        
}
