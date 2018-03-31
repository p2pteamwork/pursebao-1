package com.pursebao.commons.pojo.po;

import java.io.Serializable;

public class ComAccount implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column com_account.cid
     *
     * @mbggenerated
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column com_account.com_amount
     *
     * @mbggenerated
     */
    private Double comAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table com_account
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column com_account.cid
     *
     * @return the value of com_account.cid
     *
     * @mbggenerated
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column com_account.cid
     *
     * @param cid the value for com_account.cid
     *
     * @mbggenerated
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column com_account.com_amount
     *
     * @return the value of com_account.com_amount
     *
     * @mbggenerated
     */
    public Double getComAmount() {
        return comAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column com_account.com_amount
     *
     * @param comAmount the value for com_account.com_amount
     *
     * @mbggenerated
     */
    public void setComAmount(Double comAmount) {
        this.comAmount = comAmount;
    }
}