package com.example.OnlineExamination.Subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;


    @GetMapping("/subject")
    public List<Subject> getAllSubjects(){
        return  (List<Subject>)this.subjectRepository.findAll();
    }


    @PostMapping("/subject")
    public Subject addNewSubject(@RequestBody Subject subject ){
        return  this.subjectRepository.save(subject);
    }


    @DeleteMapping("/subject/{name}")
    public String deleteSubject(@PathVariable("name") String name){
        int row =this.subjectRepository.deleteByName(name);
        return row + " row get deleted";
    }

}
