package com.mall.product.contract.persistence.po;

import com.mall.product.contract.enums.ProductLevel;
import com.mall.product.contract.enums.SaleStatus;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_sku")
@EqualsAndHashCode(callSuper = false)
public class SkuPo extends EntityBaseModel {

  private String code;
  @Enumerated(EnumType.STRING)
  private SaleStatus status;// 是否可用：0 enable 1 disable
  private BigDecimal listPrice;
  private BigDecimal salePrice;
  private BigDecimal weight;
  private String externalCode;
  @Enumerated(EnumType.STRING)
  private ProductLevel isDefault;
  private Long sales;
  private Long netQty;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<AttributePo> attributeList;
  private String barCode;
}
