package com.noker.helpers.dao;

import com.noker.helpers.model.Location;

public interface LocationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    int insert(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    int insertSelective(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    Location selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Location record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table location
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Location record);
}