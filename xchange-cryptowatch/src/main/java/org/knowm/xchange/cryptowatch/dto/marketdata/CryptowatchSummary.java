package org.knowm.xchange.cryptowatch.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class CryptowatchSummary {

  private final CryptowatchSummaryPrice price;
  private final BigDecimal volume;
  private final BigDecimal volumeQuote;

  public CryptowatchSummary(
      @JsonProperty("price") CryptowatchSummaryPrice price,
      @JsonProperty("volume") BigDecimal volume,
      @JsonProperty("volumeQuote") BigDecimal volumeQuote) {
    this.price = price;
    this.volume = volume;
    this.volumeQuote = volumeQuote;
  }
}
