package com.github.ponser2000.kladr.model.platex5;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.Hibernate;

@Embeddable
public class KladrAreasId implements Serializable {

  @Serial
  private static final long serialVersionUID = -4472705922928158962L;
  @Column(name = "CODE", nullable = false, length = 6)
  private String code;
  @Column(name = "RGN_CODE", nullable = false, length = 6)
  private String rgnCode;

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
    return Objects.hash(rgnCode, code);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    KladrAreasId entity = (KladrAreasId) o;
    return Objects.equals(this.rgnCode, entity.rgnCode) &&
        Objects.equals(this.code, entity.code);
  }
}