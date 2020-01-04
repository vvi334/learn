package edu.hubu.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
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
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
            return "/study/search";
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