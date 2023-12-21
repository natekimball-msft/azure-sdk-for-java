// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for Workspaces ListByResourceGroup.
 */
public final class WorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2023-11-01/examples/workspaces/
     * Workspaces_ListByResourceGroup.json
     */
    /**
     * Sample code: Get workspaces by resource group.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void
        getWorkspacesByResourceGroup(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.workspaces().listByResourceGroup("testRG", com.azure.core.util.Context.NONE);
    }
}
