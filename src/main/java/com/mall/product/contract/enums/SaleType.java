package com.mall.product.contract.enums;

import java.util.stream.Stream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SaleType {
  // 0预售, 1非预售
  PRE_SALE(0), NOT_PRE_SALE(1);

  private final Integer value;

  public static SaleType of(Integer value) {
    return Stream.of(SaleType.values()).filter(v -> v.getValue().equals(value))
        .findFirst()
        .orElse(NOT_PRE_SALE);
  }
}
