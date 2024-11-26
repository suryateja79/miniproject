package com.example.OnlineExamination.Result;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {

    public List<Result> findByEmailEmail(String email );
}
