package com.revature.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.model.Batch;

public interface BatchDetails {
	public Batch getBatch(Batch tobeInserted)throws SQLException;
	public default int addBatchDetails(Batch batch) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	public abstract void showBatchDetails();

	public abstract void deleteBatchDetails(String topicName);

	public abstract void updateBatchDetails(String topicName,int n,String newValue);

	static ArrayList<Batch> batchList = new ArrayList<Batch>();

}
