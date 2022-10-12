// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for ProjectAllowedEnvironmentTypes Get. */
public final class ProjectAllowedEnvironmentTypesGetSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/ProjectAllowedEnvironmentTypes_Get.json
     */
    /**
     * Sample code: ProjectAllowedEnvironmentTypes_Get.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectAllowedEnvironmentTypesGet(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager
            .projectAllowedEnvironmentTypes()
            .getWithResponse("rg1", "Contoso", "{environmentTypeName}", Context.NONE);
    }
}
