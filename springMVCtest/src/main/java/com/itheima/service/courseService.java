package com.itheima.service;
import com.itheima.domain.course;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface courseService{
    public List<course> selectAll();
    public  void add(course c);

    public void update(course c);

    public void delete(int id);
}