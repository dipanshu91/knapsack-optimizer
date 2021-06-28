package com.maersk.knapsackoptimizerservice.model;

import java.util.Arrays;

public class ProblemRequest {
	
	private int capacity;
	
	private int[] weights;
	
	private int[] values;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int[] getWeights() {
		return weights;
	}

	public void setWeights(int[] weights) {
		this.weights = weights;
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "ProblemRequest [capacity=" + capacity + ", weights=" + Arrays.toString(weights) + ", values="
				+ Arrays.toString(values) + "]";
	}

}
