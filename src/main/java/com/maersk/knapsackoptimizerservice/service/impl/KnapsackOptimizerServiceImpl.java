package com.maersk.knapsackoptimizerservice.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maersk.knapsackoptimizerservice.model.ProblemRequest;
import com.maersk.knapsackoptimizerservice.model.ProblemResponse;
import com.maersk.knapsackoptimizerservice.model.TimeStamp;
import com.maersk.knapsackoptimizerservice.repository.KnapsackOptimizerRepository;
import com.maersk.knapsackoptimizerservice.service.KnapsackOptimizerService;
import com.maersk.knapsackoptimizerservice.util.KnapsackOptimizerUtil;

@Service
public class KnapsackOptimizerServiceImpl implements KnapsackOptimizerService {

	@Autowired
	private KnapsackOptimizerRepository knapsackOptimizerRepository;

	@Override
	public ProblemResponse getKnapsack(ProblemRequest problemRequest) {
		int[] solution = KnapsackOptimizerUtil.getSolution(problemRequest.getValues(), problemRequest.getWeights(),
				problemRequest.getCapacity());
		int totalValue = 0;
		for (int i = 0; i < solution.length; i++) {
			totalValue += problemRequest.getValues()[solution[i]];
		}
		TimeStamp timeStamp = new TimeStamp();
		try {
			timeStamp.setSubmitted(LocalDateTime.now());
			Thread.sleep(problemRequest.getValues().length);
			timeStamp.setStarted(LocalDateTime.now());
			Thread.sleep(problemRequest.getValues().length);
			timeStamp.setCompleted(LocalDateTime.now());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ProblemResponse problemResponse = new ProblemResponse();
		problemResponse.setTask(KnapsackOptimizerUtil.getAlphaNumericString());
		problemResponse.setStatus("completed");
		problemResponse.setTimestamps(timeStamp);
		problemResponse.setProblem(problemRequest);
		problemResponse.setSolution(solution);
		problemResponse.setTotal_value(totalValue);
		return knapsackOptimizerRepository.save(problemResponse);
	}

	@Override
	public ProblemResponse getKnapsackById(String taskId) {
		return knapsackOptimizerRepository.findByTask(taskId);
	}

}
