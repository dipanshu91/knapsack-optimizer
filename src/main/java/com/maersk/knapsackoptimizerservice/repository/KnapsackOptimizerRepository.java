package com.maersk.knapsackoptimizerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maersk.knapsackoptimizerservice.model.ProblemResponse;

@Repository
public interface KnapsackOptimizerRepository extends MongoRepository<ProblemResponse, String> {

	ProblemResponse findByTask(String task);

}
