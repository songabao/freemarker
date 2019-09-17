package com.freemarker.demo;

import com.freemarker.entiy.User;
import com.freemarker.util.CreateUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


/**
 * @author songabao
 * @date 2019-9-17 14:30
 */
@Controller
public class SimpleMakeFreemarker {
    private static final String INIT = "initFreemarker";
    private static final String LIST = "listFreemarker";
    /**
     * 简单使用freemarker实现一个html表格
     * @param name
     * @param age
     * @param sex
     * @return
     */
    @GetMapping(value = "simple")
    public  ModelAndView makeFreemarker(@RequestParam("name") String name,@RequestParam("age") String age,@RequestParam("sex") String sex,@RequestParam("tel") String tel,@RequestParam("email") String email,@RequestParam("address") String address,
                                        HttpServletRequest request){
        ModelAndView view = new ModelAndView();
        ModelMap model = new ModelMap();
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        model.addAttribute("sex",sex);
        model.addAttribute("tel",tel);
        model.addAttribute("email",email);
        model.addAttribute("address",address);
        view.addAllObjects(model);
        view.setViewName(INIT);
        User user = new User(name, age, sex, tel, email, address);
        //保存到session中
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        return  view;
    }
    /**
     * list
     * @return
     */
    @GetMapping(value = "list")
    public  ModelAndView listFreemarker(HttpServletRequest request){
        ModelAndView view = new ModelAndView();
        ModelMap model = new ModelMap();
        HttpSession session = null;
        if (request !=null) {
            session  = request.getSession();
        }
        User user2 = null;
        if (session !=null) {
           Object user1 =  session.getAttribute("user");
             user2 = (User) user1;
        }
        List<User> list = new ArrayList<>();
        if (user2!=null){
            list.add(user2);
        }
        for (int i = 0; i <= 10;i++){
            User user = CreateUtil.getUser();
            list.add(user);
        }
        model.addAttribute("list",list);
        view.addAllObjects(model);
        view.setViewName(LIST);
        return  view;
    }
}
