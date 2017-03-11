package com.domain.wx;

import java.util.Date;

public class WxTag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.id
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.name
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.wxid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private Integer wxid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.remark
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.createtime
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.accountid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private Integer accountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxtag.domain
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    private Integer domain;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.id
     *
     * @return the value of wxtag.id
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.id
     *
     * @param id the value for wxtag.id
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.name
     *
     * @return the value of wxtag.name
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.name
     *
     * @param name the value for wxtag.name
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.wxid
     *
     * @return the value of wxtag.wxid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public Integer getWxid() {
        return wxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.wxid
     *
     * @param wxid the value for wxtag.wxid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setWxid(Integer wxid) {
        this.wxid = wxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.remark
     *
     * @return the value of wxtag.remark
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.remark
     *
     * @param remark the value for wxtag.remark
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.createtime
     *
     * @return the value of wxtag.createtime
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.createtime
     *
     * @param createtime the value for wxtag.createtime
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.accountid
     *
     * @return the value of wxtag.accountid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.accountid
     *
     * @param accountid the value for wxtag.accountid
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxtag.domain
     *
     * @return the value of wxtag.domain
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public Integer getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxtag.domain
     *
     * @param domain the value for wxtag.domain
     *
     * @mbggenerated Sat Mar 11 17:24:26 CST 2017
     */
    public void setDomain(Integer domain) {
        this.domain = domain;
    }
}