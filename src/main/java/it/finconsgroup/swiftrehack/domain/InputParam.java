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
public class InputParam {
    @Field("id")
    private String id;
    
    @Field("caption")
    private String caption;
    
    @Field("required")
    private boolean required;
    
    @Field("type")
    private String type;
    
    @Field("hidden")
    private boolean hidden;
    
    @Field("value")
    private boolean defaultValue;

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

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }
    
    
    
}
