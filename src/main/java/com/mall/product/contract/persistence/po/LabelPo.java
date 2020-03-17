package com.mall.product.contract.persistence.po;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_label")
@EqualsAndHashCode(callSuper = false)
public class LabelPo extends EntityBaseModel {

  private String code;
  private String frontName;
  private String description;
  private String name;
  private String labelType;
}
