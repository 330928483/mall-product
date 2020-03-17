package com.mall.product.contract.persistence.po;

import com.mall.product.contract.enums.SaleStatus;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "t_recommend")
@EqualsAndHashCode(callSuper = false)
public class RecommendPo extends EntityBaseModel {

  private String code;
  private String title;
  @Enumerated(EnumType.STRING)
  private SaleStatus saleStatus;
}
