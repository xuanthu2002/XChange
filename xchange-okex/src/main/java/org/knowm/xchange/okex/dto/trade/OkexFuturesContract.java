package org.knowm.xchange.okex.dto.trade;

import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.derivative.FuturesContract;

import java.util.Objects;

public class OkexFuturesContract extends FuturesContract {
  private TradeMode tradeMode;

  public OkexFuturesContract(CurrencyPair currencyPair, String prompt) {
    super(currencyPair, prompt);
  }

  public OkexFuturesContract(String symbol) {
    super(symbol);
  }

  public OkexFuturesContract(CurrencyPair currencyPair, String prompt, TradeMode tradeMode) {
    super(currencyPair, prompt);
    this.tradeMode = tradeMode;
  }

  public OkexFuturesContract(String symbol, TradeMode tradeMode) {
    super(symbol);
    this.tradeMode = tradeMode;
  }

  public void setTradeMode(TradeMode tradeMode) {
    this.tradeMode = tradeMode;
  }

  public TradeMode getTradeMode() {
    return tradeMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    } else if (o instanceof FuturesContract) {
      FuturesContract contract = (FuturesContract) o;
      return Objects.equals(this.getCurrencyPair(), contract.getCurrencyPair()) && Objects.equals(this.getPrompt(), contract.getPrompt());
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  public enum TradeMode {
    CROSS, ISOLATED, CASH
  }
}
