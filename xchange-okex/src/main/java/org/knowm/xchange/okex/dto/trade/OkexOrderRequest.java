package org.knowm.xchange.okex.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/* Author: Max Gao (gaamox@tutanota.com) Created: 09-06-2021 */
/** <a href="https://www.okex.com/docs-v5/en/#rest-api-trade-place-order">...</a> * */
@Data
@Builder
public class OkexOrderRequest {
  @JsonProperty("instId")
  private String instrumentId;

  @JsonProperty("tdMode")
  private String tradeMode;

  @JsonProperty("ccy")
  private String marginCurrency;

  @JsonProperty("clOrderId")
  private String clientOrderId;

  @JsonProperty("tag")
  private String tag;

  @JsonProperty("side")
  private String side;

  @JsonProperty("posSide")
  private String posSide;

  @JsonProperty("ordType")
  private String orderType;

  @JsonProperty("sz")
  private String amount;

  @JsonProperty("px")
  private String price;

  // TP/SL order properties
  @JsonProperty("tpTriggerPx")
  private BigDecimal tpTriggerPrice;

  @JsonProperty("tpTriggerPxType")
  private String tpTriggerPriceType;

  @JsonProperty("tpOrdPx")
  private BigDecimal tpOrderPrice;

  @JsonProperty("tpOrdKind")
  private String tpOrderKind;

  @JsonProperty("slTriggerPx")
  private BigDecimal slTriggerPrice;

  @JsonProperty("slTriggerPxType")
  private String slTriggerPriceType;

  @JsonProperty("slOrdPx")
  private BigDecimal slOrderPrice;

  @JsonProperty("cxlOnClosePos")
  private Boolean cancelOnClosePosition;

  // Trailing stop properties
  @JsonProperty("callbackRatio")
  private String callbackRatio;

  @JsonProperty("callbackSpread")
  private BigDecimal callbackSpread;

  @JsonProperty("reduceOnly")
  private boolean reducePosition;
}
