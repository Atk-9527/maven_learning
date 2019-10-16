package com.maven.advance.controller;

import com.maven.advance.domain.Student;
import com.maven.advance.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private IStudentService studentService;

    @RequestMapping("/findAllStudent")
    public ModelAndView findAllStudent(){
        ModelAndView mv = new ModelAndView();
        List<Student> lists = studentService.findAllStudent();
        mv.addObject("studentLists", lists);
        mv.setViewName("result");
        return mv;
    }

}
