package com.yucong.controller;

import com.yucong.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login (ModelMap map) {

        User user = new User(1,"jack",11);
        map.put("user",user);

        User person = new User(2,"rose",22);
        map.addAttribute("person",person);

        return "index";
    }

}
