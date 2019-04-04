package com.demo.dao;

import com.demo.model.contractInfo;

public interface contractInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(contractInfo record);

    int insertSelective(contractInfo record);

    contractInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(contractInfo record);

    int updateByPrimaryKey(contractInfo record);
}