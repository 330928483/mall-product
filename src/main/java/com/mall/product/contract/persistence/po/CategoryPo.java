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
@Table(name = "t_category")
@EqualsAndHashCode(callSuper = false)
public class CategoryPo extends EntityBaseModel {

  private String code;
  private String name;
  private String frontName;
  private Integer sort;
  private String categoryPath;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CategoryPo> children;
}
