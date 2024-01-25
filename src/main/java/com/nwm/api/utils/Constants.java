package com.nwm.api.utils;

/**
 * <p>Title: contants of all avis system </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company: flex</p>
 *
 * @author chuong.ma
 * @version 1.0
 */
public class Constants {
	public static final String privateKey="private_key";
	public static final String domainCronJob="domain_cronjob_api";
	public static final String uploadRootPathConfigKey="uploadpath.root";
	public static final String dataBaseConfigFile = "database";
	public static final String appDev = "application-dev";
	public static final String appTest = "application-test";
	public static final String appProd = "application-prod";
	public static final String appStaging = "application-staging";
	
	public static final String sqlMapconfigXml = "mybatis/SQLMapconfig.xml";
	public static final String appConfigFileName="application";
	public static final String uploadFilePathReportFiles="uploadpath.files";
	public static final String tokenSignKey="nwemon@2024!@#";
	public static final String AES_KEY = "P_Rh@95dv1Zx#=OS";
    /**
     * Use for DB class to return result automatically without returnID
     */
    public static final String DEFAULT_RETURN_KEY = "return";
    /**
     * Using for break page of flex
     */
    public static final int STARTRECORD = 0;
    public static final int MAXRECORD = 20;
    public static final int ADD_MINUTE = 15;
    public static final int SUB_TRACT_MINUTE = -15;
    public static final int NO_COMMUNICATION  = 1001; // "nvm_1001";
    public static final int NO_PRODUCTION =  1000; // "nvm_1000";
    
    public static final int MAXRECORD_DISPLAY_DEFAULT = 5;
    public static final int MAXRECORD_NO_MINIT = 200;
    public static final int ADJUST_DELAY_MIN_DEFAULT = 3;
    public static final int ADJUST_TIME_DEFAULT = 43200;
    public static final int PRODUCT_SENDING_DELAY = 7;
    
    public static final int LANGUEAGE_ID_DEFAULT = 1; // French
    public static String SAVE_SUCCESS_MSG = Translator.toLocale("SAVE.SUCCESS");
    public static String USING_SUCCESS_MSG = Translator.toLocale("SAVE.USING");
    
    
    public static String SAVE_ERROR_MSG = Translator.toLocale("SAVE.ERROR");
    public static String INSERT_SUCCESS_MSG = Translator.toLocale("INSERT.SUCCESS");
    public static String INSERT_ERROR_MSG = Translator.toLocale("INSERT.ERROR");
    public static String UPDATE_SUCCESS_MSG = Translator.toLocale("UPDATE.SUCCESS");
    public static String UPDATE_ERROR_MSG = Translator.toLocale("UPDATE.ERROR");
    public static String DELETE_SUCCESS_MSG = Translator.toLocale("DELETE.SUCCESS");
    public static String RESTORE_SUCCESS_MSG = Translator.toLocale("RESTORE.SUCCESS");
    public static String DELETE_ERROR_MSG = Translator.toLocale("DELETE.ERROR");
    public static String GET_SUCCESS_MSG = Translator.toLocale("GET.SUCCESS");
    public static String SENT_EMAIL_SUCCESS = Translator.toLocale("EMAIL.SUCCESS");
    public static String SENT_EMAIL_ERROR = Translator.toLocale("EMAIL.ERROR");
    public static String SAVE_SCALE_ERROR = Translator.toLocale("SCALE.ERROR");
    public static String GET_ERROR_MSG = Translator.toLocale("GET.ERROR");
    public static String VALIDATE_ERROR_MSG = "VALIDATE.ERROR";
    
    
    
    /**
     * defined action
     * @author Long.Pham
     *
     */
	public enum ACTION_TYPE {
		Publish(1, "Publish"), PublishAndAnswer(2, "Publish and answer"),
		AnswerIncomprehensible(3, "Incoherent"), AnswerIncoherent(4, "Incomprehensible"),
		AnswerInappropriate(5, "Inappropriate"), Reject(6, "Reject"),
		Blocked(7, "Blocked"),
		Cancelled(8, "Cancelled"),
		Pending(9, "Pending"),
		Report(10, "Customer Report"),
		Depublish(11, "Moderation Depublish"),
		
		Request(12, "Last request"),
		UpdateMainSetting(13, "Update main setting"),
		UpdateAdjustEmailDelay(14, "Update adjiust email delay"),
		CreateUser(15, "Add new user"),
		UpdateWidget(16, "Update widget"),
		ExportDatas(17, "Export datas"),
		ModerationReject(18, "Moderation Reject"),
		WidgetRequest(19, "Widget request")
		;
		private int value;
		private String message;
		private ACTION_TYPE(int value, String message) {
			this.value = value;
			this.message = message;
			
		}

		public int getValue() {
			return value;
		}
		public String getMessage() {
			return message;
		}
		public static String getMessageByValue(int val) {
	        for (ACTION_TYPE e : ACTION_TYPE.values()) {
	            if (e.value == val) {
	                return e.message;
	            }
	        }
	        return null;
	    }
	}
    
}
