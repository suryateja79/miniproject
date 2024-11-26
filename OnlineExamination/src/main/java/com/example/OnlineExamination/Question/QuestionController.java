package com.example.OnlineExamination.Question;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;


    @GetMapping("/question")
    public List<Question> getAllQuestion(){
        return (List<Question>) this.questionRepository.findAll();
    }



    @PostMapping("/question")
    public Question addNewQuestion(@RequestBody Question question ){
        return this.questionRepository.save(question);
    }



    @GetMapping("/exam/{id}/question")
    public List<Question> getAllQuestionForExam(@PathVariable("id") int id){
        return this.questionRepository.findByEnameId(id);
    }



    @PutMapping("/question/{id}")
    public Question updateQuestion(@PathVariable("id") int id , @RequestBody Question question) {
        question.setId(id);
        return this.questionRepository.save(question);
    }



    @DeleteMapping("/question/{id}")
    public void deleteQuestion(@PathVariable("id") int id) {
        this.questionRepository.deleteById(id);
    }


}
