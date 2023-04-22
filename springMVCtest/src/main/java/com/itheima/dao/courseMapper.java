package com.itheima.dao;
import com.itheima.domain.course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface courseMapper {
    public List<course> selectAll();
//    public int add(course c);
    public int update(course c);
    public int delete(int id);

    void add(course c);
}