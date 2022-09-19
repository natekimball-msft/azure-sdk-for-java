// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;
import com.azure.resourcemanager.kusto.models.ManagedPrivateEndpoint;
import com.azure.resourcemanager.kusto.models.ProvisioningState;

public final class ManagedPrivateEndpointImpl
    implements ManagedPrivateEndpoint, ManagedPrivateEndpoint.Definition, ManagedPrivateEndpoint.Update {
    private ManagedPrivateEndpointInner innerObject;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String privateLinkResourceId() {
        return this.innerModel().privateLinkResourceId();
    }

    public String privateLinkResourceRegion() {
        return this.innerModel().privateLinkResourceRegion();
    }

    public String groupId() {
        return this.innerModel().groupId();
    }

    public String requestMessage() {
        return this.innerModel().requestMessage();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ManagedPrivateEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String managedPrivateEndpointName;

    public ManagedPrivateEndpointImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public ManagedPrivateEndpoint create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .createOrUpdate(
                    resourceGroupName, clusterName, managedPrivateEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedPrivateEndpoint create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .createOrUpdate(resourceGroupName, clusterName, managedPrivateEndpointName, this.innerModel(), context);
        return this;
    }

    ManagedPrivateEndpointImpl(String name, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = new ManagedPrivateEndpointInner();
        this.serviceManager = serviceManager;
        this.managedPrivateEndpointName = name;
    }

    public ManagedPrivateEndpointImpl update() {
        return this;
    }

    public ManagedPrivateEndpoint apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .update(resourceGroupName, clusterName, managedPrivateEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public ManagedPrivateEndpoint apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .update(resourceGroupName, clusterName, managedPrivateEndpointName, this.innerModel(), context);
        return this;
    }

    ManagedPrivateEndpointImpl(
        ManagedPrivateEndpointInner innerObject, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.managedPrivateEndpointName = Utils.getValueFromIdByName(innerObject.id(), "managedPrivateEndpoints");
    }

    public ManagedPrivateEndpoint refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .getWithResponse(resourceGroupName, clusterName, managedPrivateEndpointName, Context.NONE)
                .getValue();
        return this;
    }

    public ManagedPrivateEndpoint refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getManagedPrivateEndpoints()
                .getWithResponse(resourceGroupName, clusterName, managedPrivateEndpointName, context)
                .getValue();
        return this;
    }

    public ManagedPrivateEndpointImpl withPrivateLinkResourceId(String privateLinkResourceId) {
        this.innerModel().withPrivateLinkResourceId(privateLinkResourceId);
        return this;
    }

    public ManagedPrivateEndpointImpl withPrivateLinkResourceRegion(String privateLinkResourceRegion) {
        this.innerModel().withPrivateLinkResourceRegion(privateLinkResourceRegion);
        return this;
    }

    public ManagedPrivateEndpointImpl withGroupId(String groupId) {
        this.innerModel().withGroupId(groupId);
        return this;
    }

    public ManagedPrivateEndpointImpl withRequestMessage(String requestMessage) {
        this.innerModel().withRequestMessage(requestMessage);
        return this;
    }
}
