package com.mall.product.contract.persistence.po;

import com.mall.product.contract.enums.ProductLevel;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_single_sku")
@EqualsAndHashCode(callSuper = false)
public class SingleSkuPo extends EntityBaseModel {

  private String code;
  private String title;
  private String picUrl;
  private Long num;
  private BigDecimal salePrice;
  private BigDecimal listPrice;
  private BigDecimal allocationPrice;
  @Enumerated(EnumType.STRING)
  private ProductLevel isMain;
  private String brandCode;
  private String brandName;
  private String categoryCode;
  private String attribute;
}
