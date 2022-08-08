// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.privatedns.fluent.models.VirtualNetworkLinkInner;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworkLinks Update. */
public final class VirtualNetworkLinksUpdateSamples {
    /*
     * x-ms-original-file: specification/privatedns/resource-manager/Microsoft.Network/stable/2020-06-01/examples/VirtualNetworkLinkPatch.json
     */
    /**
     * Sample code: PATCH Private DNS Zone Virtual Network Link.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void pATCHPrivateDNSZoneVirtualNetworkLink(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .privateDnsZones()
            .manager()
            .serviceClient()
            .getVirtualNetworkLinks()
            .update(
                "resourceGroup1",
                "privatezone1.com",
                "virtualNetworkLink1",
                new VirtualNetworkLinkInner().withTags(mapOf("key2", "value2")).withRegistrationEnabled(true),
                null,
                Context.NONE);
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
