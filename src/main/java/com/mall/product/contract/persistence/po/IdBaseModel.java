package com.mall.product.contract.persistence.po;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class IdBaseModel {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
}
