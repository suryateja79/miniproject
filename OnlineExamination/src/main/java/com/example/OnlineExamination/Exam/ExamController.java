package com.example.OnlineExamination.Exam;



import java.util.List;
import java.util.Optional;

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
public class ExamController {

    @Autowired
    private ExamRepository examRepository;



    @GetMapping("/exam")
    public List<Exam> getAllExam(){
        return (List<Exam>)this.examRepository.findAll();
    }

    @GetMapping("/exam/{id}")
    public Exam getParticularExam(@PathVariable("id") int id){
        Optional<Exam> optional =  this.examRepository.findById(id);
        return optional.get();
    }

    @PostMapping("/exam")
    public Exam addNewExam(@RequestBody Exam exam ){
        return this.examRepository.save(exam);
    }



    @DeleteMapping("/exam/{id}")
    public void deleteExam(@PathVariable("id") int id){
        this.examRepository.deleteById(id);
    }




}
