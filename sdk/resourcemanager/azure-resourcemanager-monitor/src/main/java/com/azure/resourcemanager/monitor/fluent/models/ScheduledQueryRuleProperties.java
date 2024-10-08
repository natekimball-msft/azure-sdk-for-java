// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.models.Actions;
import com.azure.resourcemanager.monitor.models.AlertSeverity;
import com.azure.resourcemanager.monitor.models.ScheduledQueryRuleCriteria;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * scheduled query rule Definition.
 */
@Fluent
public final class ScheduledQueryRuleProperties implements JsonSerializable<ScheduledQueryRuleProperties> {
    /*
     * The api-version used when creating this alert rule
     */
    private String createdWithApiVersion;

    /*
     * True if alert rule is legacy Log Analytic rule
     */
    private Boolean isLegacyLogAnalyticsRule;

    /*
     * The description of the scheduled query rule.
     */
    private String description;

    /*
     * The display name of the alert rule
     */
    private String displayName;

    /*
     * Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest. Relevant and required only for
     * rules of the kind LogAlert.
     */
    private AlertSeverity severity;

    /*
     * The flag which indicates whether this scheduled query rule is enabled. Value should be true or false
     */
    private Boolean enabled;

    /*
     * The list of resource id's that this scheduled query rule is scoped to.
     */
    private List<String> scopes;

    /*
     * How often the scheduled query rule is evaluated represented in ISO 8601 duration format. Relevant and required
     * only for rules of the kind LogAlert.
     */
    private Duration evaluationFrequency;

    /*
     * The period of time (in ISO 8601 duration format) on which the Alert query will be executed (bin size). Relevant
     * and required only for rules of the kind LogAlert.
     */
    private Duration windowSize;

    /*
     * If specified then overrides the query time range (default is WindowSize*NumberOfEvaluationPeriods). Relevant only
     * for rules of the kind LogAlert.
     */
    private Duration overrideQueryTimeRange;

    /*
     * List of resource type of the target resource(s) on which the alert is created/updated. For example if the scope
     * is a resource group and targetResourceTypes is Microsoft.Compute/virtualMachines, then a different alert will be
     * fired for each virtual machine in the resource group which meet the alert criteria. Relevant only for rules of
     * the kind LogAlert
     */
    private List<String> targetResourceTypes;

    /*
     * The rule criteria that defines the conditions of the scheduled query rule.
     */
    private ScheduledQueryRuleCriteria criteria;

    /*
     * Mute actions for the chosen period of time (in ISO 8601 duration format) after the alert is fired. Relevant only
     * for rules of the kind LogAlert.
     */
    private Duration muteActionsDuration;

    /*
     * Actions to invoke when the alert fires.
     */
    private Actions actions;

    /*
     * The flag which indicates whether this scheduled query rule has been configured to be stored in the customer's
     * storage. The default is false.
     */
    private Boolean isWorkspaceAlertsStorageConfigured;

    /*
     * The flag which indicates whether this scheduled query rule should be stored in the customer's storage. The
     * default is false. Relevant only for rules of the kind LogAlert.
     */
    private Boolean checkWorkspaceAlertsStorageConfigured;

    /*
     * The flag which indicates whether the provided query should be validated or not. The default is false. Relevant
     * only for rules of the kind LogAlert.
     */
    private Boolean skipQueryValidation;

    /*
     * The flag that indicates whether the alert should be automatically resolved or not. The default is true. Relevant
     * only for rules of the kind LogAlert.
     */
    private Boolean autoMitigate;

    /**
     * Creates an instance of ScheduledQueryRuleProperties class.
     */
    public ScheduledQueryRuleProperties() {
    }

    /**
     * Get the createdWithApiVersion property: The api-version used when creating this alert rule.
     * 
     * @return the createdWithApiVersion value.
     */
    public String createdWithApiVersion() {
        return this.createdWithApiVersion;
    }

    /**
     * Get the isLegacyLogAnalyticsRule property: True if alert rule is legacy Log Analytic rule.
     * 
     * @return the isLegacyLogAnalyticsRule value.
     */
    public Boolean isLegacyLogAnalyticsRule() {
        return this.isLegacyLogAnalyticsRule;
    }

    /**
     * Get the description property: The description of the scheduled query rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the scheduled query rule.
     * 
     * @param description the description value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name of the alert rule.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the alert rule.
     * 
     * @param displayName the displayName value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the severity property: Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest.
     * Relevant and required only for rules of the kind LogAlert.
     * 
     * @return the severity value.
     */
    public AlertSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest.
     * Relevant and required only for rules of the kind LogAlert.
     * 
     * @param severity the severity value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withSeverity(AlertSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the enabled property: The flag which indicates whether this scheduled query rule is enabled. Value should be
     * true or false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: The flag which indicates whether this scheduled query rule is enabled. Value should be
     * true or false.
     * 
     * @param enabled the enabled value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the scopes property: The list of resource id's that this scheduled query rule is scoped to.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: The list of resource id's that this scheduled query rule is scoped to.
     * 
     * @param scopes the scopes value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the evaluationFrequency property: How often the scheduled query rule is evaluated represented in ISO 8601
     * duration format. Relevant and required only for rules of the kind LogAlert.
     * 
     * @return the evaluationFrequency value.
     */
    public Duration evaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * Set the evaluationFrequency property: How often the scheduled query rule is evaluated represented in ISO 8601
     * duration format. Relevant and required only for rules of the kind LogAlert.
     * 
     * @param evaluationFrequency the evaluationFrequency value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withEvaluationFrequency(Duration evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
        return this;
    }

    /**
     * Get the windowSize property: The period of time (in ISO 8601 duration format) on which the Alert query will be
     * executed (bin size). Relevant and required only for rules of the kind LogAlert.
     * 
     * @return the windowSize value.
     */
    public Duration windowSize() {
        return this.windowSize;
    }

    /**
     * Set the windowSize property: The period of time (in ISO 8601 duration format) on which the Alert query will be
     * executed (bin size). Relevant and required only for rules of the kind LogAlert.
     * 
     * @param windowSize the windowSize value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withWindowSize(Duration windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * Get the overrideQueryTimeRange property: If specified then overrides the query time range (default is
     * WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert.
     * 
     * @return the overrideQueryTimeRange value.
     */
    public Duration overrideQueryTimeRange() {
        return this.overrideQueryTimeRange;
    }

    /**
     * Set the overrideQueryTimeRange property: If specified then overrides the query time range (default is
     * WindowSize*NumberOfEvaluationPeriods). Relevant only for rules of the kind LogAlert.
     * 
     * @param overrideQueryTimeRange the overrideQueryTimeRange value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withOverrideQueryTimeRange(Duration overrideQueryTimeRange) {
        this.overrideQueryTimeRange = overrideQueryTimeRange;
        return this;
    }

    /**
     * Get the targetResourceTypes property: List of resource type of the target resource(s) on which the alert is
     * created/updated. For example if the scope is a resource group and targetResourceTypes is
     * Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in the resource
     * group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
     * 
     * @return the targetResourceTypes value.
     */
    public List<String> targetResourceTypes() {
        return this.targetResourceTypes;
    }

    /**
     * Set the targetResourceTypes property: List of resource type of the target resource(s) on which the alert is
     * created/updated. For example if the scope is a resource group and targetResourceTypes is
     * Microsoft.Compute/virtualMachines, then a different alert will be fired for each virtual machine in the resource
     * group which meet the alert criteria. Relevant only for rules of the kind LogAlert.
     * 
     * @param targetResourceTypes the targetResourceTypes value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withTargetResourceTypes(List<String> targetResourceTypes) {
        this.targetResourceTypes = targetResourceTypes;
        return this;
    }

    /**
     * Get the criteria property: The rule criteria that defines the conditions of the scheduled query rule.
     * 
     * @return the criteria value.
     */
    public ScheduledQueryRuleCriteria criteria() {
        return this.criteria;
    }

    /**
     * Set the criteria property: The rule criteria that defines the conditions of the scheduled query rule.
     * 
     * @param criteria the criteria value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withCriteria(ScheduledQueryRuleCriteria criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Get the muteActionsDuration property: Mute actions for the chosen period of time (in ISO 8601 duration format)
     * after the alert is fired. Relevant only for rules of the kind LogAlert.
     * 
     * @return the muteActionsDuration value.
     */
    public Duration muteActionsDuration() {
        return this.muteActionsDuration;
    }

    /**
     * Set the muteActionsDuration property: Mute actions for the chosen period of time (in ISO 8601 duration format)
     * after the alert is fired. Relevant only for rules of the kind LogAlert.
     * 
     * @param muteActionsDuration the muteActionsDuration value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withMuteActionsDuration(Duration muteActionsDuration) {
        this.muteActionsDuration = muteActionsDuration;
        return this;
    }

    /**
     * Get the actions property: Actions to invoke when the alert fires.
     * 
     * @return the actions value.
     */
    public Actions actions() {
        return this.actions;
    }

    /**
     * Set the actions property: Actions to invoke when the alert fires.
     * 
     * @param actions the actions value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withActions(Actions actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the isWorkspaceAlertsStorageConfigured property: The flag which indicates whether this scheduled query rule
     * has been configured to be stored in the customer's storage. The default is false.
     * 
     * @return the isWorkspaceAlertsStorageConfigured value.
     */
    public Boolean isWorkspaceAlertsStorageConfigured() {
        return this.isWorkspaceAlertsStorageConfigured;
    }

    /**
     * Get the checkWorkspaceAlertsStorageConfigured property: The flag which indicates whether this scheduled query
     * rule should be stored in the customer's storage. The default is false. Relevant only for rules of the kind
     * LogAlert.
     * 
     * @return the checkWorkspaceAlertsStorageConfigured value.
     */
    public Boolean checkWorkspaceAlertsStorageConfigured() {
        return this.checkWorkspaceAlertsStorageConfigured;
    }

    /**
     * Set the checkWorkspaceAlertsStorageConfigured property: The flag which indicates whether this scheduled query
     * rule should be stored in the customer's storage. The default is false. Relevant only for rules of the kind
     * LogAlert.
     * 
     * @param checkWorkspaceAlertsStorageConfigured the checkWorkspaceAlertsStorageConfigured value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties
        withCheckWorkspaceAlertsStorageConfigured(Boolean checkWorkspaceAlertsStorageConfigured) {
        this.checkWorkspaceAlertsStorageConfigured = checkWorkspaceAlertsStorageConfigured;
        return this;
    }

    /**
     * Get the skipQueryValidation property: The flag which indicates whether the provided query should be validated or
     * not. The default is false. Relevant only for rules of the kind LogAlert.
     * 
     * @return the skipQueryValidation value.
     */
    public Boolean skipQueryValidation() {
        return this.skipQueryValidation;
    }

    /**
     * Set the skipQueryValidation property: The flag which indicates whether the provided query should be validated or
     * not. The default is false. Relevant only for rules of the kind LogAlert.
     * 
     * @param skipQueryValidation the skipQueryValidation value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withSkipQueryValidation(Boolean skipQueryValidation) {
        this.skipQueryValidation = skipQueryValidation;
        return this;
    }

    /**
     * Get the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is true. Relevant only for rules of the kind LogAlert.
     * 
     * @return the autoMitigate value.
     */
    public Boolean autoMitigate() {
        return this.autoMitigate;
    }

    /**
     * Set the autoMitigate property: The flag that indicates whether the alert should be automatically resolved or not.
     * The default is true. Relevant only for rules of the kind LogAlert.
     * 
     * @param autoMitigate the autoMitigate value to set.
     * @return the ScheduledQueryRuleProperties object itself.
     */
    public ScheduledQueryRuleProperties withAutoMitigate(Boolean autoMitigate) {
        this.autoMitigate = autoMitigate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (criteria() != null) {
            criteria().validate();
        }
        if (actions() != null) {
            actions().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("severity", this.severity == null ? null : this.severity.toString());
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeArrayField("scopes", this.scopes, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("evaluationFrequency",
            CoreUtils.durationToStringWithDays(this.evaluationFrequency));
        jsonWriter.writeStringField("windowSize", CoreUtils.durationToStringWithDays(this.windowSize));
        jsonWriter.writeStringField("overrideQueryTimeRange",
            CoreUtils.durationToStringWithDays(this.overrideQueryTimeRange));
        jsonWriter.writeArrayField("targetResourceTypes", this.targetResourceTypes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("criteria", this.criteria);
        jsonWriter.writeStringField("muteActionsDuration",
            CoreUtils.durationToStringWithDays(this.muteActionsDuration));
        jsonWriter.writeJsonField("actions", this.actions);
        jsonWriter.writeBooleanField("checkWorkspaceAlertsStorageConfigured",
            this.checkWorkspaceAlertsStorageConfigured);
        jsonWriter.writeBooleanField("skipQueryValidation", this.skipQueryValidation);
        jsonWriter.writeBooleanField("autoMitigate", this.autoMitigate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduledQueryRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduledQueryRuleProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ScheduledQueryRuleProperties.
     */
    public static ScheduledQueryRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduledQueryRuleProperties deserializedScheduledQueryRuleProperties = new ScheduledQueryRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdWithApiVersion".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.createdWithApiVersion = reader.getString();
                } else if ("isLegacyLogAnalyticsRule".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.isLegacyLogAnalyticsRule
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("description".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.description = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.displayName = reader.getString();
                } else if ("severity".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.severity = AlertSeverity.fromLong(reader.getLong());
                } else if ("enabled".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.enabled = reader.getNullable(JsonReader::getBoolean);
                } else if ("scopes".equals(fieldName)) {
                    List<String> scopes = reader.readArray(reader1 -> reader1.getString());
                    deserializedScheduledQueryRuleProperties.scopes = scopes;
                } else if ("evaluationFrequency".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.evaluationFrequency
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("windowSize".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.windowSize
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("overrideQueryTimeRange".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.overrideQueryTimeRange
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("targetResourceTypes".equals(fieldName)) {
                    List<String> targetResourceTypes = reader.readArray(reader1 -> reader1.getString());
                    deserializedScheduledQueryRuleProperties.targetResourceTypes = targetResourceTypes;
                } else if ("criteria".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.criteria = ScheduledQueryRuleCriteria.fromJson(reader);
                } else if ("muteActionsDuration".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.muteActionsDuration
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("actions".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.actions = Actions.fromJson(reader);
                } else if ("isWorkspaceAlertsStorageConfigured".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.isWorkspaceAlertsStorageConfigured
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("checkWorkspaceAlertsStorageConfigured".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.checkWorkspaceAlertsStorageConfigured
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("skipQueryValidation".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.skipQueryValidation
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("autoMitigate".equals(fieldName)) {
                    deserializedScheduledQueryRuleProperties.autoMitigate = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduledQueryRuleProperties;
        });
    }
}
