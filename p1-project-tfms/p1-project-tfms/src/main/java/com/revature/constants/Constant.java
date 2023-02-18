package com.revature.constants;

public class Constant {
	public static final String ENTER_TOPIC="\nenter topic name to update: ";
	public static final String CONTINUE_OR_NOT="\nDo you want to continue?\nto continue press 1\nelse press 2";
	public static final String END="\nThankyou\n";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `topic_name`,`start_date`,`end_date`,`Batch_duration`,`trainer_id`,`associate_id` FROM `project_tfms`.`batch` WHERE `topic_name`=? ";
	public static final String INSERT_QUERY = "INSERT INTO `project_tfms`.`batch` (`topic_name`,`start_date`,`end_date`,`Batch_duration`,`trainer_id`,`associate_id`) VALUES (?,?,?,?,?,?) ";
	public static final String DELETE_QUERY="DELETE FROM `project_tfms`.`batch` WHERE `topic_name`=?";
	public static final String UPDATE_TOPICNAME_QUERY="UPDATE `project_tfms`.`batch` SET `topic_name`=? WHERE `topic_name`=?";
	public static final String UPDATE_DURATION_QUERY="UPDATE `project_tfms`.`batch` SET `batch_duration`=? WHERE `topic_name`=?";
	public static final String UPDATE_STARTDATE_QUERY="UPDATE `project_tfms`.`batch` SET `start_date`=? WHERE `topic_name`=?";
	public static final String UPDATE_ENDDATE_QUERY="UPDATE `project_tfms`.`batch` SET `end_date`=? WHERE `topic_name`=?";
}
