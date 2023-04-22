package com.itheima.service.impl;
import com.itheima.dao.courseMapper;
import com.itheima.domain.course;
import com.itheima.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseServiceImpl implements courseService{
    @Autowired
    private courseMapper cMapper;

    @Override
    public List<course> selectAll(){
        return cMapper.selectAll();
    }
    public void add(course c) {
        cMapper.add(c);
    }

    @Override
    public void update(course c) {
        cMapper.update(c);

    }

    @Override
    public void delete(int id) {
        cMapper.delete(id);
    }
}