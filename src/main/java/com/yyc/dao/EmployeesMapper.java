package com.yyc.dao;

import com.yyc.entity.Employees;

public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer empNo);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer empNo);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}