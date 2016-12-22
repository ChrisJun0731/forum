package com.zj.forum.web;


import com.zj.forum.domain.User;
import com.zj.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhujun on 2016/11/27.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request, User user){
        ModelAndView mav = new ModelAndView();
        //用户校验
        Boolean exsits = userService.existsUser(user);
        //设置session
        if(exsits==true)
            mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/doLogout")
    public String logout(HttpSession session){
        return null;
    }
}
