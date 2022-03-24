package com.github.ponser2000.kladr.model.platex5;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KladrTownsId implements Serializable {
    private static final long serialVersionUID = -3067141337122447875L;
    @Column(name = "CODE", nullable = false, length = 6)
    private String code;
    @Column(name = "RGN_CODE", nullable = false, length = 6)
    private String rgnCode;
    @Column(name = "AREA_CODE", nullable = false, length = 6)
    private String areaCode;
    @Column(name = "CITY_CODE", nullable = false, length = 6)
    private String cityCode;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getRgnCode() {
        return rgnCode;
    }

    public void setRgnCode(String rgnCode) {
        this.rgnCode = rgnCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rgnCode, areaCode, code, cityCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KladrTownsId entity = (KladrTownsId) o;
        return Objects.equals(this.rgnCode, entity.rgnCode) &&
                Objects.equals(this.areaCode, entity.areaCode) &&
                Objects.equals(this.code, entity.code) &&
                Objects.equals(this.cityCode, entity.cityCode);
    }
}