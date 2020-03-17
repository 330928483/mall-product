package com.mall.product.contract.enums;

import java.util.stream.Stream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MediaType {
  // 媒体类型：1:图片，2：视频，3：文件
  IMAGE(1), VIDEO(2), FILE(3);

  private final Integer value;

  public static MediaType of(Integer value) {
    return Stream.of(MediaType.values()).filter(v -> v.getValue().equals(value))
        .findFirst()
        .orElse(null);
  }
}
