package com.maersk.knapsackoptimizerservice.model;

import java.util.Arrays;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "knapsackoptimizer")
public class ProblemResponse {

	private String task;

	private String status;

	private TimeStamp timestamps;

	private ProblemRequest problem;

	private int[] solution;

	private int total_value;

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TimeStamp getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(TimeStamp timestamps) {
		this.timestamps = timestamps;
	}

	public ProblemRequest getProblem() {
		return problem;
	}

	public void setProblem(ProblemRequest problem) {
		this.problem = problem;
	}

	public int[] getSolution() {
		return solution;
	}

	public void setSolution(int[] solution) {
		this.solution = solution;
	}

	public int getTotal_value() {
		return total_value;
	}

	public void setTotal_value(int total_value) {
		this.total_value = total_value;
	}

}
