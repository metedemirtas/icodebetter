package iwb.domain.db;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;


// Generated Feb 25, 2007 1:41:05 PM by Hibernate Tools 3.2.0.b9

/**
 * WDbFunc generated by hbm2java
 */
@Entity
@Immutable
@Table(name="w5_db_func",schema="iwb")
public class W5GlobalFunc implements java.io.Serializable {

	private int dbFuncId;

	private String dsc;
	
	private short logLevelTip;
	private String rhinoScriptCode;
	
	private short accessExecTip;
	private String accessExecRoles;
	private String accessExecUsers;
	
	private String accessSourceTypes;
	private int timeout;
	private short lkpCodeType;

	
	private List<W5GlobalFuncParam> _dbFuncParamList;

	
	@Column(name="log_level_tip")	
	public short getLogLevelTip() {
		return logLevelTip;
	}

	public void setLogLevelTip(short logLevelTip) {
		this.logLevelTip = logLevelTip;
	}

	public W5GlobalFunc() {
	}

	@Id
	@Column(name="db_func_id")
	public int getDbFuncId() {
		return this.dbFuncId;
	}

	public void setDbFuncId(int dbFuncId) {
		this.dbFuncId = dbFuncId;
	}


	@Column(name="dsc")
	public String getDsc() {
		return this.dsc;
	}

	public void setDsc(String dsc) {
		this.dsc = dsc;
	}
	
	@Transient
	public List<W5GlobalFuncParam> get_dbFuncParamList() {
		return _dbFuncParamList;
	}

	public void set_dbFuncParamList(List<W5GlobalFuncParam> dbFuncParamList) {
		_dbFuncParamList = dbFuncParamList;
	}

	@Column(name="rhino_script_code")
	public String getRhinoScriptCode() {
		return rhinoScriptCode;
	}

	public void setRhinoScriptCode(String rhinoScriptCode) {
		this.rhinoScriptCode = rhinoScriptCode;
	}	
	

	@Column(name="access_source_types")
	public String getAccessSourceTypes() {
		return accessSourceTypes;
	}

	public void setAccessSourceTypes(String accessSourceTypes) {
		this.accessSourceTypes = accessSourceTypes;
	}

	@Column(name="access_exec_tip")
	public short getAccessExecTip() {
		return accessExecTip;
	}

	public void setAccessExecTip(short accessExecTip) {
		this.accessExecTip = accessExecTip;
	}

	@Column(name="access_exec_roles")
	public String getAccessExecRoles() {
		return accessExecRoles;
	}

	public void setAccessExecRoles(String accessExecRoles) {
		this.accessExecRoles = accessExecRoles;
	}

	@Column(name="access_exec_users")
	public String getAccessExecUsers() {
		return accessExecUsers;
	}

	public void setAccessExecUsers(String accessExecUsers) {
		this.accessExecUsers = accessExecUsers;
	}

	@Column(name="timeout")
	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	@Column(name="lkp_code_type")
	public short getLkpCodeType() {
		return lkpCodeType;
	}

	public void setLkpCodeType(short lkpCodeType) {
		this.lkpCodeType = lkpCodeType;
	}	
	
	private String projectUuid;
	@Id
	@Column(name="project_uuid")
	public String getProjectUuid() {
		return projectUuid;
	}

	public void setProjectUuid(String projectUuid) {
		this.projectUuid = projectUuid;
	}
	
}
