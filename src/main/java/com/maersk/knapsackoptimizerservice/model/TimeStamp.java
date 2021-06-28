package com.maersk.knapsackoptimizerservice.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeStamp {

	@JsonProperty
	private LocalDateTime submitted;

	@JsonProperty
	private LocalDateTime started;

	@JsonProperty
	private LocalDateTime completed;

	public LocalDateTime getSubmitted() {
		return submitted;
	}

	public void setSubmitted(LocalDateTime submitted) {
		this.submitted = submitted;
	}

	public LocalDateTime getStarted() {
		return started;
	}

	public void setStarted(LocalDateTime started) {
		this.started = started;
	}

	public LocalDateTime getCompleted() {
		return completed;
	}

	public void setCompleted(LocalDateTime completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "TimeStamp [submitted=" + submitted + ", started=" + started + ", completed=" + completed + "]";
	}

}
