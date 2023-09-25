// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Kustomization defining how to reconcile the artifact pulled by the source type on the cluster. */
@Fluent
public final class KustomizationPatchDefinition {
    /*
     * The path in the source reference to reconcile on the cluster.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Specifies other Kustomizations that this Kustomization depends on. This Kustomization will not reconcile until
     * all dependencies have completed their reconciliation.
     */
    @JsonProperty(value = "dependsOn")
    private List<String> dependsOn;

    /*
     * The maximum time to attempt to reconcile the Kustomization on the cluster.
     */
    @JsonProperty(value = "timeoutInSeconds")
    private Long timeoutInSeconds;

    /*
     * The interval at which to re-reconcile the Kustomization on the cluster.
     */
    @JsonProperty(value = "syncIntervalInSeconds")
    private Long syncIntervalInSeconds;

    /*
     * The interval at which to re-reconcile the Kustomization on the cluster in the event of failure on
     * reconciliation.
     */
    @JsonProperty(value = "retryIntervalInSeconds")
    private Long retryIntervalInSeconds;

    /*
     * Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     */
    @JsonProperty(value = "prune")
    private Boolean prune;

    /*
     * Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to an immutable field
     * change.
     */
    @JsonProperty(value = "force")
    private Boolean force;

    /*
     * Enable/disable health check for all Kubernetes objects created by this Kustomization.
     */
    @JsonProperty(value = "wait")
    private Boolean enableWait;

    /*
     * Used for variable substitution for this Kustomization after kustomize build.
     */
    @JsonProperty(value = "postBuild")
    private PostBuildDefinition postBuild;

    /** Creates an instance of KustomizationPatchDefinition class. */
    public KustomizationPatchDefinition() {
    }

    /**
     * Get the path property: The path in the source reference to reconcile on the cluster.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path in the source reference to reconcile on the cluster.
     *
     * @param path the path value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the dependsOn property: Specifies other Kustomizations that this Kustomization depends on. This Kustomization
     * will not reconcile until all dependencies have completed their reconciliation.
     *
     * @return the dependsOn value.
     */
    public List<String> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Specifies other Kustomizations that this Kustomization depends on. This Kustomization
     * will not reconcile until all dependencies have completed their reconciliation.
     *
     * @param dependsOn the dependsOn value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The maximum time to attempt to reconcile the Kustomization on the cluster.
     *
     * @return the timeoutInSeconds value.
     */
    public Long timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The maximum time to attempt to reconcile the Kustomization on the cluster.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the syncIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster.
     *
     * @return the syncIntervalInSeconds value.
     */
    public Long syncIntervalInSeconds() {
        return this.syncIntervalInSeconds;
    }

    /**
     * Set the syncIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster.
     *
     * @param syncIntervalInSeconds the syncIntervalInSeconds value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withSyncIntervalInSeconds(Long syncIntervalInSeconds) {
        this.syncIntervalInSeconds = syncIntervalInSeconds;
        return this;
    }

    /**
     * Get the retryIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster
     * in the event of failure on reconciliation.
     *
     * @return the retryIntervalInSeconds value.
     */
    public Long retryIntervalInSeconds() {
        return this.retryIntervalInSeconds;
    }

    /**
     * Set the retryIntervalInSeconds property: The interval at which to re-reconcile the Kustomization on the cluster
     * in the event of failure on reconciliation.
     *
     * @param retryIntervalInSeconds the retryIntervalInSeconds value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withRetryIntervalInSeconds(Long retryIntervalInSeconds) {
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        return this;
    }

    /**
     * Get the prune property: Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     *
     * @return the prune value.
     */
    public Boolean prune() {
        return this.prune;
    }

    /**
     * Set the prune property: Enable/disable garbage collections of Kubernetes objects created by this Kustomization.
     *
     * @param prune the prune value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withPrune(Boolean prune) {
        this.prune = prune;
        return this;
    }

    /**
     * Get the force property: Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to
     * an immutable field change.
     *
     * @return the force value.
     */
    public Boolean force() {
        return this.force;
    }

    /**
     * Set the force property: Enable/disable re-creating Kubernetes resources on the cluster when patching fails due to
     * an immutable field change.
     *
     * @param force the force value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Get the enableWait property: Enable/disable health check for all Kubernetes objects created by this
     * Kustomization.
     *
     * @return the enableWait value.
     */
    public Boolean enableWait() {
        return this.enableWait;
    }

    /**
     * Set the enableWait property: Enable/disable health check for all Kubernetes objects created by this
     * Kustomization.
     *
     * @param enableWait the enableWait value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withEnableWait(Boolean enableWait) {
        this.enableWait = enableWait;
        return this;
    }

    /**
     * Get the postBuild property: Used for variable substitution for this Kustomization after kustomize build.
     *
     * @return the postBuild value.
     */
    public PostBuildDefinition postBuild() {
        return this.postBuild;
    }

    /**
     * Set the postBuild property: Used for variable substitution for this Kustomization after kustomize build.
     *
     * @param postBuild the postBuild value to set.
     * @return the KustomizationPatchDefinition object itself.
     */
    public KustomizationPatchDefinition withPostBuild(PostBuildDefinition postBuild) {
        this.postBuild = postBuild;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (postBuild() != null) {
            postBuild().validate();
        }
    }
}
