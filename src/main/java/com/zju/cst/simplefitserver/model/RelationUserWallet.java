package com.zju.cst.simplefitserver.model;

import java.io.Serializable;

public class RelationUserWallet implements Serializable {
  private Integer id;

  private Integer buyerId;

  private Integer walletId;

  private Integer money;

  private Integer createTime;

  private Integer updateTime;

  private Integer validation;

  private Integer spending; // 0 代表购买卡 1 代表购买课 值得注意的是办卡的钱到商家 开课的钱到教练

  private Integer trainerLessonId; // 这节课的 id

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getBuyerId() {
    return buyerId;
  }

  public void setBuyerId(Integer buyerId) {
    this.buyerId = buyerId;
  }

  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(Integer walletId) {
    this.walletId = walletId;
  }

  public Integer getMoney() {
    return money;
  }

  public void setMoney(Integer money) {
    this.money = money;
  }

  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Integer getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getValidation() {
    return validation;
  }

  public void setValidation(Integer validation) {
    this.validation = validation;
  }

  public Integer getSpending() {
    return spending;
  }

  public void setSpending(Integer spending) {
    this.spending = spending;
  }

  public Integer getTrainerLessonId() {
    return trainerLessonId;
  }

  public void setTrainerLessonId(Integer trainerLessonId) {
    this.trainerLessonId = trainerLessonId;
  }
}