package com.zj.forum.web;

import com.zj.forum.domain.User;
import com.zj.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhujun on 2016/11/24.
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/register",method= RequestMethod.POST)
    public ModelAndView register(HttpServletRequest request, User user){
        String passwordAgain = request.getParameter("again");
        if(user.getPassword().equals(passwordAgain)){
            userService.register(user);
        }
        else{
            System.out.println("两次输入的密码不一致！");
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value="/register.html")
    public String getRegisterHtml(){
        return "register";
    }

}
