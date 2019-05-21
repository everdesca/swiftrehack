package it.finconsgroup.swiftrehack.domain;

import org.springframework.data.mongodb.core.mapping.Field;

public class ProductStructure {

    @Field("name")
    private String name;
    @Field("lineOfBusiness")
    private String lineOfBusiness;
    @Field("typeOfBusiness")
    private String typeOfBusiness;
    @Field("country")
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
