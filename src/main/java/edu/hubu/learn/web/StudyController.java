package edu.hubu.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.Study;
import edu.hubu.learn.service.StudyService;


@Controller
@RequestMapping("/study")
public class StudyController {

    @Autowired
    private StudyService studyService;
    @RequestMapping("/modify/{id}")
    public ModelAndView modifyUser(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("study", studyService.getStudy(id));
        mav.setViewName("study_modify");
        return mav;
    }

    @RequestMapping("/do_modify")
    public ModelAndView doModifyUser(Study study) {
        study.setAvatar("");
        studyService.modifyUser(study);
        ModelAndView mav = new ModelAndView("study_search");
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        studyService.deleteUser(id);
        ModelAndView mav = new ModelAndView("study_search");
        return mav;
    }


    @RequestMapping("/add")
    public ModelAndView addStudy() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("study_add");
        return mav;
    }

    @RequestMapping("/search")
    public ModelAndView searchStudy() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("study_search");
        return mav;
    }

    @RequestMapping("/do_search")
    public ModelAndView doSearchUser(HttpServletRequest httpRequest) {
        ModelAndView mav = new ModelAndView();
        String keyword = httpRequest.getParameter("keyword");
        List<Study> studys = studyService.searchStudys(keyword);
        mav.addObject("studys", studys);
        mav.setViewName("study_result");
        return mav;
    }

    @RequestMapping("/do_add")
    public ModelAndView doAddStudy(Study study) {
        study.setAvatar("");
        studyService.addStudy(study);
        ModelAndView mav = new ModelAndView("redirect:/study/search");
        return mav;
    }

}