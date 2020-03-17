package com.mall.product.contract.persistence.po;

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
@Table(name = "t_bundle_sku")
@EqualsAndHashCode(callSuper = false)
public class BundleSkuPo extends EntityBaseModel {

  private String skuCode;
  private String skuName;
  private String name;
  private String skuUrl;
  private BigDecimal salPrice;
  private BigDecimal listPrice;
  @Enumerated(EnumType.STRING)
  private SaleStatus status;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<SingleSkuPo> skuList;

}
