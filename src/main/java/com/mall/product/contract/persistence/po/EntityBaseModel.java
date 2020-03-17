package com.mall.product.contract.persistence.po;

import java.time.ZonedDateTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class EntityBaseModel extends IdBaseModel {

  private ZonedDateTime updateDate;
  @CreationTimestamp
  private ZonedDateTime createDate;
}
