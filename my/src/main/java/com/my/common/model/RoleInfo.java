package com.my.common.model;

import java.util.Date;

public class RoleInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.PARENT_ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.NAME
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.DESCRIPTION
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.STATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_info.CREATE_DATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.ID
     *
     * @return the value of role_info.ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.ID
     *
     * @param id the value for role_info.ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.PARENT_ID
     *
     * @return the value of role_info.PARENT_ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.PARENT_ID
     *
     * @param parentId the value for role_info.PARENT_ID
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.NAME
     *
     * @return the value of role_info.NAME
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.NAME
     *
     * @param name the value for role_info.NAME
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.DESCRIPTION
     *
     * @return the value of role_info.DESCRIPTION
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.DESCRIPTION
     *
     * @param description the value for role_info.DESCRIPTION
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.STATE
     *
     * @return the value of role_info.STATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.STATE
     *
     * @param state the value for role_info.STATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_info.CREATE_DATE
     *
     * @return the value of role_info.CREATE_DATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_info.CREATE_DATE
     *
     * @param createDate the value for role_info.CREATE_DATE
     *
     * @mbggenerated Tue Jan 13 17:30:45 CST 2015
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}