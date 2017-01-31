package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIdentityIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|country")
@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "country_id"))
})
@Table(name = "country")
@Entity(name = "demo$Country")
public class Country extends BaseIdentityIdEntity {
    private static final long serialVersionUID = 2697492576588797196L;

    @Column(name = "country", nullable = false, length = 50)
    protected String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }


}