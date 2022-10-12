// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.models.Project;
import java.util.HashMap;
import java.util.Map;

/** Samples for Projects Update. */
public final class ProjectsUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/Projects_Patch.json
     */
    /**
     * Sample code: Projects_Update.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void projectsUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        Project resource =
            manager.projects().getByResourceGroupWithResponse("rg1", "{projectName}", Context.NONE).getValue();
        resource.update().withTags(mapOf("CostCenter", "R&D")).withDescription("This is my first project.").apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
