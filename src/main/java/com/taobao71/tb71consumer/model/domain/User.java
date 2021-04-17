package com.taobao71.tb71consumer.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.stereotype.Component;

/**
 * 存储用户信息
 */
@Component
public class User {
  @TableId(type= IdType.AUTO)
  private int id;
  private String openid;
  private int closingOrder;
  private float closingCommission;
  private float wallet;
  private float settlement;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public int getClosingOrder() {
    return closingOrder;
  }

  public void setClosingOrder(int closingOrder) {
    this.closingOrder = closingOrder;
  }

  public float getClosingCommission() {
    return closingCommission;
  }

  public void setClosingCommission(float closingCommission) {
    this.closingCommission = closingCommission;
  }

  public float getWallet() {
    return wallet;
  }

  public void setWallet(float wallet) {
    this.wallet = wallet;
  }

  public float getSettlement() {
    return settlement;
  }

  public void setSettlement(float settlement) {
    this.settlement = settlement;
  }
}
