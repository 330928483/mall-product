package com.mall.product.contract.persistence.po;

import com.mall.product.contract.enums.ProductType;
import com.mall.product.contract.enums.SaleStatus;
import com.mall.product.contract.enums.SaleType;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
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
@Table(name = "t_spu")
@EqualsAndHashCode(callSuper = false)
public class SpuPo extends EntityBaseModel {

  private String code;
  private String storeCode;
  private String name;
  private String title;
  private BigDecimal salePrice;
  private BigDecimal tagPrice;
  @Enumerated(EnumType.STRING)
  private ProductType type;
  private String style;
  private String description;
  private ZonedDateTime listTime;
  private ZonedDateTime deListTime;
  @Enumerated(EnumType.STRING)
  private SaleStatus saleStatus;
  @Enumerated(EnumType.STRING)
  private SaleType preOrder;
  private String sizeChart;
  private ZonedDateTime fixedListTime;
  private ZonedDateTime fixedDeListTime;
  private Long inventory;
  private Long sales;//所有sku总销量
  private String seoTitle;
  private String seoKeywords;
  private String seoDescription;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<CategoryPo> categoryList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<ImagePo> imageList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<LabelPo> labelList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<AttributePo> attributeList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<AttributePo> attributeSaleList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<SkuPo> skuList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<RecommendPo> recommendList;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  private List<BundleSkuPo> bundleSkuList;
}

