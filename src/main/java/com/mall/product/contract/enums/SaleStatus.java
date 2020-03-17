package com.mall.product.contract.enums;

import java.util.stream.Stream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SaleStatus {
  // 1上架, 0下架,2定时上架
  AVAILABLE(1), DISABLED(0), TIMING_ON(-1);

  private final Integer value;

  public static SaleStatus of(Integer value) {
    return Stream.of(SaleStatus.values()).filter(v -> v.getValue().equals(value))
        .findFirst()
        .orElse(DISABLED);
  }
}
