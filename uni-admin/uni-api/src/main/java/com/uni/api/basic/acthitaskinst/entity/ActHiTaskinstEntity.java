package com.uni.api.basic.acthitaskinst.entity;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * ActHiTaskinst对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("act_hi_taskinst")
public class ActHiTaskinstEntity extends Model<ActHiTaskinstEntity> {

    private static final long serialVersionUID = 1L;


                    @TableId("ID_")
                private String id;

    @TableField("REV_")
        private Integer rev;

    @TableField("PROC_DEF_ID_")
        private String procDefId;

    @TableField("TASK_DEF_ID_")
        private String taskDefId;

    @TableField("TASK_DEF_KEY_")
        private String taskDefKey;

    @TableField("PROC_INST_ID_")
        private String procInstId;

    @TableField("EXECUTION_ID_")
        private String executionId;

    @TableField("SCOPE_ID_")
        private String scopeId;

    @TableField("SUB_SCOPE_ID_")
        private String subScopeId;

    @TableField("SCOPE_TYPE_")
        private String scopeType;

    @TableField("SCOPE_DEFINITION_ID_")
        private String scopeDefinitionId;

    @TableField("NAME_")
        private String name;

    @TableField("PARENT_TASK_ID_")
        private String parentTaskId;

    @TableField("DESCRIPTION_")
        private String description;

    @TableField("OWNER_")
        private String owner;

    @TableField("ASSIGNEE_")
        private String assignee;

    @TableField("START_TIME_")
        private LocalDateTime startTime;

    @TableField("CLAIM_TIME_")
        private LocalDateTime claimTime;

    @TableField("END_TIME_")
        private LocalDateTime endTime;

    @TableField("DURATION_")
        private Long duration;

    @TableField("DELETE_REASON_")
        private String deleteReason;

    @TableField("PRIORITY_")
        private Integer priority;

    @TableField("DUE_DATE_")
        private LocalDateTime dueDate;

    @TableField("FORM_KEY_")
        private String formKey;

    @TableField("CATEGORY_")
        private String category;

    @TableField("TENANT_ID_")
        private String tenantId;

    @TableField("LAST_UPDATED_TIME_")
        private LocalDateTime lastUpdatedTime;


        public String getId() {
        return id;
    }

            public void setId(String id) {
        this.id = id;
    }

        public Integer getRev() {
        return rev;
    }

            public void setRev(Integer rev) {
        this.rev = rev;
    }

        public String getProcDefId() {
        return procDefId;
    }

            public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

        public String getTaskDefId() {
        return taskDefId;
    }

            public void setTaskDefId(String taskDefId) {
        this.taskDefId = taskDefId;
    }

        public String getTaskDefKey() {
        return taskDefKey;
    }

            public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

        public String getProcInstId() {
        return procInstId;
    }

            public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

        public String getExecutionId() {
        return executionId;
    }

            public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

        public String getScopeId() {
        return scopeId;
    }

            public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

        public String getSubScopeId() {
        return subScopeId;
    }

            public void setSubScopeId(String subScopeId) {
        this.subScopeId = subScopeId;
    }

        public String getScopeType() {
        return scopeType;
    }

            public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

        public String getScopeDefinitionId() {
        return scopeDefinitionId;
    }

            public void setScopeDefinitionId(String scopeDefinitionId) {
        this.scopeDefinitionId = scopeDefinitionId;
    }

        public String getName() {
        return name;
    }

            public void setName(String name) {
        this.name = name;
    }

        public String getParentTaskId() {
        return parentTaskId;
    }

            public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

        public String getDescription() {
        return description;
    }

            public void setDescription(String description) {
        this.description = description;
    }

        public String getOwner() {
        return owner;
    }

            public void setOwner(String owner) {
        this.owner = owner;
    }

        public String getAssignee() {
        return assignee;
    }

            public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

        public LocalDateTime getStartTime() {
        return startTime;
    }

            public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

        public LocalDateTime getClaimTime() {
        return claimTime;
    }

            public void setClaimTime(LocalDateTime claimTime) {
        this.claimTime = claimTime;
    }

        public LocalDateTime getEndTime() {
        return endTime;
    }

            public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

        public Long getDuration() {
        return duration;
    }

            public void setDuration(Long duration) {
        this.duration = duration;
    }

        public String getDeleteReason() {
        return deleteReason;
    }

            public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason;
    }

        public Integer getPriority() {
        return priority;
    }

            public void setPriority(Integer priority) {
        this.priority = priority;
    }

        public LocalDateTime getDueDate() {
        return dueDate;
    }

            public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

        public String getFormKey() {
        return formKey;
    }

            public void setFormKey(String formKey) {
        this.formKey = formKey;
    }

        public String getCategory() {
        return category;
    }

            public void setCategory(String category) {
        this.category = category;
    }

        public String getTenantId() {
        return tenantId;
    }

            public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

        public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

            public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
}

    @Override
    public String toString() {
    return "ActHiTaskinst{" +
                    "id=" + id +
                    ", rev=" + rev +
                    ", procDefId=" + procDefId +
                    ", taskDefId=" + taskDefId +
                    ", taskDefKey=" + taskDefKey +
                    ", procInstId=" + procInstId +
                    ", executionId=" + executionId +
                    ", scopeId=" + scopeId +
                    ", subScopeId=" + subScopeId +
                    ", scopeType=" + scopeType +
                    ", scopeDefinitionId=" + scopeDefinitionId +
                    ", name=" + name +
                    ", parentTaskId=" + parentTaskId +
                    ", description=" + description +
                    ", owner=" + owner +
                    ", assignee=" + assignee +
                    ", startTime=" + startTime +
                    ", claimTime=" + claimTime +
                    ", endTime=" + endTime +
                    ", duration=" + duration +
                    ", deleteReason=" + deleteReason +
                    ", priority=" + priority +
                    ", dueDate=" + dueDate +
                    ", formKey=" + formKey +
                    ", category=" + category +
                    ", tenantId=" + tenantId +
                    ", lastUpdatedTime=" + lastUpdatedTime +
            "}";
}
}