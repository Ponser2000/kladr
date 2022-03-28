package com.github.ponser2000.kladr.model.platex5;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class KladrCitiesId implements Serializable {

  @Serial
  private static final long serialVersionUID = -4218607049665238938L;
  @Column(name = "CODE", nullable = false, length = 6)
  private String code;
  @Column(name = "RGN_CODE", nullable = false, length = 6)
  private String rgnCode;
  @Column(name = "AREA_CODE", nullable = false, length = 6)
  private String areaCode;

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
    return Objects.hash(rgnCode, areaCode, code);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    KladrCitiesId entity = (KladrCitiesId) o;
    return Objects.equals(this.rgnCode, entity.rgnCode) &&
        Objects.equals(this.areaCode, entity.areaCode) &&
        Objects.equals(this.code, entity.code);
  }
}