package com.itheima.Controller;
//import com.itheima.dao.courseMapper;
import com.alibaba.druid.support.json.JSONUtils;
import com.itheima.domain.course;
import com.itheima.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class courseController {
    @Autowired
    private courseService cService;

    @RequestMapping("/selectAll")
    @ResponseBody
    public List<course> selectAll(){
        return cService.selectAll();
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ResponseBody
    public void add(course c) {
       cService.add(c);
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    @ResponseBody
    public void update( course c) {
         cService.update(c);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    @ResponseBody
    public void delete( @RequestParam("id") int id) {
         cService.delete(id);
    }


}