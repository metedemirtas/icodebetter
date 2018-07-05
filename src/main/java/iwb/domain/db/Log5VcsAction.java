package iwb.domain.db;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="log5_vcs_action")
public class Log5VcsAction implements Serializable{
	
	private int logId;
	private int userId;
	private int customizationId;  
	private short vcsActionTip;  
	private String userIp;  
	
	public Log5VcsAction() {
	}
	
	public Log5VcsAction(Map<String, Object> scd,short vcsActionTip,String userIp) {
		this.customizationId = (Integer)scd.get("customizationId");
		this.userId = (Integer)scd.get("userId");
		this.vcsActionTip = vcsActionTip;
		this.userIp = userIp;
	}

	@SequenceGenerator(name="sex_log5_vcs_action",sequenceName="iwb.seq_log5_vcs_action",allocationSize=1)
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sex_log5_vcs_action")
	@Column(name="log_id")  
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	@Id
	@Column(name="customization_id")
	public int getCustomizationId() {
		return customizationId;
	}
	public void setCustomizationId(int customizationId) {
		this.customizationId = customizationId;
	}
	@Column(name="user_id")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="vcs_action_tip")
	public short getVcsActionTip() {
		return vcsActionTip;
	}
	public void setVcsActionTip(short vcsActionTip) {
		this.vcsActionTip = vcsActionTip;
	}
	@Column(name="user_ip")
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	
}
