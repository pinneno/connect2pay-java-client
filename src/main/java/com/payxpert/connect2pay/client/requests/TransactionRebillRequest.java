package com.payxpert.connect2pay.client.requests;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.payxpert.connect2pay.utils.Utils;
import net.sf.oval.constraint.MaxLength;
import net.sf.oval.constraint.NotNull;

/**
 * Request for the transaction rebill API call.
 * 
 */
public class TransactionRebillRequest extends GenericRequest<TransactionRebillRequest> {
  @NotNull
  @JsonIgnore
  private String transactionId;

  @NotNull
  private Integer amount;

  @MaxLength(100)
  private String orderId;

  @Override
  protected TransactionRebillRequest getThis() {
    return this;
  }

  /**
   * @return the transactionId
   */
  public String getTransactionId() {
    return this.transactionId;
  }

  /**
   * @param transactionId
   *          the transactionId to set
   */
  public TransactionRebillRequest setTransactionId(String transactionId) {
    this.transactionId = transactionId;
    return getThis();
  }

  public Integer getAmount() {
    return this.amount;
  }

  public TransactionRebillRequest setAmount(Integer amount) {
    this.amount = amount;
    return getThis();
  }

  public String getOrderId() {
    return orderId;
  }

  public TransactionRebillRequest setOrderId(String orderId) {
    this.orderId = Utils.limitLength(orderId, 100);
    return getThis();
  }
}
