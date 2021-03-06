package com.pursebao.commons.pojo.po;

import java.io.Serializable;

public class Invest implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.invest_id
     *
     * @mbggenerated
     */
    private String investId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.invest_oid
     *
     * @mbggenerated
     */
    private String investOid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.daily_increase
     *
     * @mbggenerated
     */
    private Double dailyIncrease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.current_increase
     *
     * @mbggenerated
     */
    private Double currentIncrease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.expected_increase
     *
     * @mbggenerated
     */
    private Double expectedIncrease;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invest.invest_status
     *
     * @mbggenerated
     */
    private Integer investStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table invest
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.invest_id
     *
     * @return the value of invest.invest_id
     *
     * @mbggenerated
     */
    public String getInvestId() {
        return investId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.invest_id
     *
     * @param investId the value for invest.invest_id
     *
     * @mbggenerated
     */
    public void setInvestId(String investId) {
        this.investId = investId == null ? null : investId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.invest_oid
     *
     * @return the value of invest.invest_oid
     *
     * @mbggenerated
     */
    public String getInvestOid() {
        return investOid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.invest_oid
     *
     * @param investOid the value for invest.invest_oid
     *
     * @mbggenerated
     */
    public void setInvestOid(String investOid) {
        this.investOid = investOid == null ? null : investOid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.daily_increase
     *
     * @return the value of invest.daily_increase
     *
     * @mbggenerated
     */
    public Double getDailyIncrease() {
        return dailyIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.daily_increase
     *
     * @param dailyIncrease the value for invest.daily_increase
     *
     * @mbggenerated
     */
    public void setDailyIncrease(Double dailyIncrease) {
        this.dailyIncrease = dailyIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.current_increase
     *
     * @return the value of invest.current_increase
     *
     * @mbggenerated
     */
    public Double getCurrentIncrease() {
        return currentIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.current_increase
     *
     * @param currentIncrease the value for invest.current_increase
     *
     * @mbggenerated
     */
    public void setCurrentIncrease(Double currentIncrease) {
        this.currentIncrease = currentIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.expected_increase
     *
     * @return the value of invest.expected_increase
     *
     * @mbggenerated
     */
    public Double getExpectedIncrease() {
        return expectedIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.expected_increase
     *
     * @param expectedIncrease the value for invest.expected_increase
     *
     * @mbggenerated
     */
    public void setExpectedIncrease(Double expectedIncrease) {
        this.expectedIncrease = expectedIncrease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invest.invest_status
     *
     * @return the value of invest.invest_status
     *
     * @mbggenerated
     */
    public Integer getInvestStatus() {
        return investStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invest.invest_status
     *
     * @param investStatus the value for invest.invest_status
     *
     * @mbggenerated
     */
    public void setInvestStatus(Integer investStatus) {
        this.investStatus = investStatus;
    }
}