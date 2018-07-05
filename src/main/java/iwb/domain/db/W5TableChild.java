package iwb.domain.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;


// Generated Feb 25, 2007 1:41:05 PM by Hibernate Tools 3.2.0.b9

/**
 * WDbFunc generated by hbm2java
 */
@Entity
@Immutable
@Table(name="w5_table_child",schema="iwb")
public class W5TableChild implements java.io.Serializable {

	private int tableChildId;
	private int customizationId;
	private short relationTip;
	private int tableId;
	private int tableFieldId;
	private int relatedTableId;
	private int relatedTableFieldId;
	private int relatedStaticTableFieldId;
	private int relatedStaticTableFieldVal;
	private short copyStrategyTip;
	private short childViewTip;
	private int childViewObjectId;
	private short revisionFlag;
	
	@Id
	@Column(name="table_child_id")
	public int getTableChildId() {
		return tableChildId;
	}
	public void setTableChildId(int tableChildId) {
		this.tableChildId = tableChildId;
	}

	@Id
	@Column(name="customization_id")
	public int getCustomizationId() {
		return customizationId;
	}
	public void setCustomizationId(int customizationId) {
		this.customizationId = customizationId;
	}
	@Column(name="relation_tip")
	public short getRelationTip() {
		return relationTip;
	}
	public void setRelationTip(short relationTip) {
		this.relationTip = relationTip;
	}
	@Column(name="table_id")
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	@Column(name="table_field_id")
	public int getTableFieldId() {
		return tableFieldId;
	}
	public void setTableFieldId(int tableFieldId) {
		this.tableFieldId = tableFieldId;
	}
	@Column(name="related_table_id")
	public int getRelatedTableId() {
		return relatedTableId;
	}
	public void setRelatedTableId(int relatedTableId) {
		this.relatedTableId = relatedTableId;
	}
	@Column(name="related_table_field_id")
	public int getRelatedTableFieldId() {
		return relatedTableFieldId;
	}
	public void setRelatedTableFieldId(int relatedTableFieldId) {
		this.relatedTableFieldId = relatedTableFieldId;
	}
	@Column(name="related_static_table_field_id")
	public int getRelatedStaticTableFieldId() {
		return relatedStaticTableFieldId;
	}
	public void setRelatedStaticTableFieldId(int relatedStaticTableFieldId) {
		this.relatedStaticTableFieldId = relatedStaticTableFieldId;
	}
	@Column(name="related_static_table_field_val")
	public int getRelatedStaticTableFieldVal() {
		return relatedStaticTableFieldVal;
	}
	public void setRelatedStaticTableFieldVal(int relatedStaticTableFieldVal) {
		this.relatedStaticTableFieldVal = relatedStaticTableFieldVal;
	}
	@Column(name="copy_strategy_tip")
	public short getCopyStrategyTip() {
		return copyStrategyTip;
	}
	public void setCopyStrategyTip(short copyStrategyTip) {
		this.copyStrategyTip = copyStrategyTip;
	}
	@Column(name="child_view_tip")
	public short getChildViewTip() {
		return childViewTip;
	}
	public void setChildViewTip(short childViewTip) {
		this.childViewTip = childViewTip;
	}
	@Column(name="child_view_object_id")
	public int getChildViewObjectId() {
		return childViewObjectId;
	}
	public void setChildViewObjectId(int childViewObjectId) {
		this.childViewObjectId = childViewObjectId;
	}
	@Column(name="revision_flag")
	public short getRevisionFlag() {
		return revisionFlag;
	}
	public void setRevisionFlag(short revisionFlag) {
		this.revisionFlag = revisionFlag;
	}
	
	
}
