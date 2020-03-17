package com.mall.product.contract.persistence.po;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_attribute")
@EqualsAndHashCode(callSuper = false)
public class AttributePo extends IdBaseModel {

  private String code;
  private String frontName;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<AttributeValuePo> attributeValueList;
}
