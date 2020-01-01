package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.StudyDao;
import edu.hubu.learn.entity.Study;



@Service
public class StudyService {

    @Autowired
    private StudyDao studyDao;

    public Study getStudy(Long id) {
        return studyDao.findById(id).get();
    }

    public List<Study> getStudys() {
        return studyDao.findAll(new Sort(Direction.DESC, "id"));
    }

    public List<Study> searchStudys(String keyword) {
        Study study = new Study();
        study.setClassroom(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("classroom", match->match.contains());
        Example<Study> example = Example.of(study, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return studyDao.findAll(example, sort);
    }

    public Study addStudy(Study study) {
        return studyDao.save(study);
    }

    public void deleteUser(Long id) {
        studyDao.deleteById(id);
    }

    public void modifyUser(Study study) {
        studyDao.save(study);
    }
}