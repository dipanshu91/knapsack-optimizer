package com.maersk.knapsackoptimizerservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maersk.knapsackoptimizerservice.model.ProblemRequest;
import com.maersk.knapsackoptimizerservice.model.ProblemResponse;
import com.maersk.knapsackoptimizerservice.service.KnapsackOptimizerService;

@RestController
@RequestMapping("/knapsack")
public class KnapsackOptimizerController {

	@Autowired
	private KnapsackOptimizerService knapsackOptimizerService;

	@PostMapping(value = { "" }, produces = "application/json")
	public ProblemResponse getKnapsack(@RequestBody ProblemRequest problemRequest) {
		return knapsackOptimizerService.getKnapsack(problemRequest);
	}

	@GetMapping(value = { "/{id}" }, produces = "application/json")
	public @ResponseBody ProblemResponse getKnapsackById(@PathVariable("id") String id) {
		return knapsackOptimizerService.getKnapsackById(id);
	}

}
