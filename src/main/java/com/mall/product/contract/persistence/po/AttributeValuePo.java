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
@Table(name = "t_attribute_value")
@EqualsAndHashCode(callSuper = false)
public class AttributeValuePo extends IdBaseModel {

  private String code;
  private String name;
  private String frontName;
  private String picUrl;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ImagePo> imageList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ImageAttachPo> imageAttachList;
}
