/**
 * RmsJobResult.java
 * Created at 2017-06-04
 * Created by Administrator
 * Copyright (C) 2016 egridcloud.com, All rights reserved.
 */
package com.egridcloud.udf.scheduler.client.domain;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 描述 : RmsJobResult
 *
 * @author Administrator
 *
 */
@ApiModel(description = "通用job返回值")
public class RmsJobResult implements Serializable {

  /**
   * 描述 : ID
   */
  private static final long serialVersionUID = 1L;

  /**
   * 描述 : 执行ID
   */
  @ApiModelProperty(value = "执行ID", required = true, dataType = "string")
  private String fireInstanceId;

  /**
   * 描述 : 参数
   */
  @ApiModelProperty(value = "参数", required = true, dataType = "object")
  private RmsJobParam param;

  /**
   * 描述 : 客户端接收时间
   */
  @ApiModelProperty(value = "客户端接收时间", required = true, dataType = "long")
  private Date clientReceiveTime;

  /**
   * 描述 : 客户端开始时间
   */
  @ApiModelProperty(value = "客户端开始时间", required = true, dataType = "long")
  private Date clientStartExecuteTime;

  /**
   * 描述 : 客户端结束时间
   */
  @ApiModelProperty(value = "客户端结束时间", required = true, dataType = "long")
  private Date clientEndExecuteTime;

  /**
   * 描述 : 状态
   */
  @ApiModelProperty(value = "状态", required = true, dataType = "int")
  private Integer stats;

  /**
   * 描述 : 错误信息
   */
  @ApiModelProperty(value = "错误信息", required = true, dataType = "string")
  private String errorMsg;

  /**
   * 描述 : 获取param
   *
   * @return the param
   */
  public RmsJobParam getParam() {
    return param;
  }

  /**
   * 描述 : 设置param
   *
   * @param param the param to set
   */
  public void setParam(RmsJobParam param) {
    this.param = param;
  }

  /**
   * 描述 : 获取errorMsg
   *
   * @return the errorMsg
   */
  public String getErrorMsg() {
    return errorMsg;
  }

  /**
   * 描述 : 设置errorMsg
   *
   * @param errorMsg the errorMsg to set
   */
  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  /**
   * 描述 : 获取stats
   *
   * @return the stats
   */
  public Integer getStats() {
    return stats;
  }

  /**
   * 描述 : 设置stats
   *
   * @param stats the stats to set
   */
  public void setStats(Integer stats) {
    this.stats = stats;
  }

  /**
   * 描述 : 获取clientReceiveTime
   *
   * @return the clientReceiveTime
   */
  public Date getClientReceiveTime() {
    return clientReceiveTime;
  }

  /**
   * 描述 : 设置clientReceiveTime
   *
   * @param clientReceiveTime the clientReceiveTime to set
   */
  public void setClientReceiveTime(Date clientReceiveTime) {
    this.clientReceiveTime = clientReceiveTime;
  }

  /**
   * 描述 : 获取clientStartExecuteTime
   *
   * @return the clientStartExecuteTime
   */
  public Date getClientStartExecuteTime() {
    return clientStartExecuteTime;
  }

  /**
   * 描述 : 设置clientStartExecuteTime
   *
   * @param clientStartExecuteTime the clientStartExecuteTime to set
   */
  public void setClientStartExecuteTime(Date clientStartExecuteTime) {
    this.clientStartExecuteTime = clientStartExecuteTime;
  }

  /**
   * 描述 : 获取clientEndExecuteTime
   *
   * @return the clientEndExecuteTime
   */
  public Date getClientEndExecuteTime() {
    return clientEndExecuteTime;
  }

  /**
   * 描述 : 设置clientEndExecuteTime
   *
   * @param clientEndExecuteTime the clientEndExecuteTime to set
   */
  public void setClientEndExecuteTime(Date clientEndExecuteTime) {
    this.clientEndExecuteTime = clientEndExecuteTime;
  }

  /**
   * 描述 : 获取fireInstanceId
   *
   * @return the fireInstanceId
   */
  public String getFireInstanceId() {
    return fireInstanceId;
  }

  /**
   * 描述 : 设置fireInstanceId
   *
   * @param fireInstanceId the fireInstanceId to set
   */
  public void setFireInstanceId(String fireInstanceId) {
    this.fireInstanceId = fireInstanceId;
  }

}