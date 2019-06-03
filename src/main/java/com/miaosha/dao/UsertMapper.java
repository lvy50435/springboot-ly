package com.miaosha.dao;

import com.miaosha.data.Usert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsertMapper {
    public int deleteByPrimaryKey(String id);

    public int insert(Usert record);

    public int insertSelective(Usert record);

    public Usert selectByPrimaryKey(String id);

    public int updateByPrimaryKeySelective(Usert record);

    public int updateByPrimaryKey(Usert record);
    Usert getAll();

    String getData();
}