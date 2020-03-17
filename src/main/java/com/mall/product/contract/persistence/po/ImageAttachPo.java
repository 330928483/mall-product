package com.mall.product.contract.persistence.po;

import com.mall.product.contract.enums.MediaType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_image_attach")
@EqualsAndHashCode(callSuper = false)
public class ImageAttachPo extends IdBaseModel {

  @Enumerated(EnumType.STRING)
  private MediaType mediaType;
  private String url;
}
