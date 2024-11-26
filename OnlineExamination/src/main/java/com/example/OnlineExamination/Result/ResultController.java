package com.example.OnlineExamination.Result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ResultController {

    @Autowired
    private ResultRepository resultRepository;


    @GetMapping("/result")
    public List<Result> getAllResult(){
        return (List<Result>)this.resultRepository.findAll();
    }



    @PostMapping("/result")
    public  Result addNewResult(@RequestBody Result result)
    {
        return this.resultRepository.save(result);
    }

    @GetMapping("/user/{email}/result")
    public List<Result> getAllResultForStudent(@PathVariable("email") String email){
        return this.resultRepository.findByEmailEmail(email);

    }

}
