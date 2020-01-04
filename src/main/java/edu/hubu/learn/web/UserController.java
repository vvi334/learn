package edu.hubu.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.dao.UserDao;
import edu.hubu.learn.entity.User;
import edu.hubu.learn.service.UserService;



@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }


    @RequestMapping("/registe")
    public ModelAndView doAddStudy(User user) {
        user.setAvatar("");
        userService.addUser(user);
        ModelAndView mav = new ModelAndView("redirect:/study/search");
        return mav;
    }

    @RequestMapping("/login")
        public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
            User user = UserDao.findByUsernameAndPassword(username,password);
            if(user !=null) {
                return "/study/search";
            }else{
            return"/";
        }
}
}