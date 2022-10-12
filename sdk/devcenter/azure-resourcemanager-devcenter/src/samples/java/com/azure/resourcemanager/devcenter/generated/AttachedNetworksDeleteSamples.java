// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for AttachedNetworks Delete. */
public final class AttachedNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/AttachedNetworks_Delete.json
     */
    /**
     * Sample code: AttachedNetworks_Delete.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void attachedNetworksDelete(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.attachedNetworks().delete("rg1", "Contoso", "{attachedNetworkConnectionName}", Context.NONE);
    }
}
