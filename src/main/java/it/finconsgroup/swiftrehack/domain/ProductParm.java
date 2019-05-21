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
public class ProductParm {
    @Field("id")
    private String id;
    
    @Field("caption")
    private String caption;
    
    @Field("value")
    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
       
}
