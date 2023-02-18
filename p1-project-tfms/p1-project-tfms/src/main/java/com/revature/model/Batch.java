package com.revature.model;

public class Batch {
	private String topicName;
    private String startDate;
    private String endDate;
    private int duration;
    private String trainerId;
    private String associateId;
    
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(String topicName, String startDate, String endDate, int duration, String trainerId,
			String associateId) {
		super();
		this.topicName = topicName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.trainerId = trainerId;
		this.associateId = associateId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getAssociateId() {
		return associateId;
	}

	public void setAssociateId(String associateId) {
		this.associateId = associateId;
	}
    
	
    
}
