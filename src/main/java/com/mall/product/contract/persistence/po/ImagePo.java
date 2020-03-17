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
@Table(name = "t_image")
@EqualsAndHashCode(callSuper = false)
public class ImagePo extends EntityBaseModel {

  private String code;
  private String picUrl;
  private Long picOrder;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ImageAttachPo> imageAttachList;
}
