package com.maersk.knapsackoptimizerservice.service;

import com.maersk.knapsackoptimizerservice.model.ProblemRequest;
import com.maersk.knapsackoptimizerservice.model.ProblemResponse;

public interface KnapsackOptimizerService {

	ProblemResponse getKnapsack(ProblemRequest problemRequest);

	ProblemResponse getKnapsackById(String taskId);

}
