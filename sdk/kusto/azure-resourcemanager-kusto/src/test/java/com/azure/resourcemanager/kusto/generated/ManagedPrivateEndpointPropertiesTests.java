// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedPrivateEndpointPropertiesTests {
    @Test
    public void testDeserialize() {
        ManagedPrivateEndpointProperties model =
            BinaryData
                .fromString(
                    "{\"privateLinkResourceId\":\"rwdmhdlxyjrxsa\",\"privateLinkResourceRegion\":\"fcnihgwq\",\"groupId\":\"pnedgf\",\"requestMessage\":\"vkcvqvpkeqd\",\"provisioningState\":\"Creating\"}")
                .toObject(ManagedPrivateEndpointProperties.class);
        Assertions.assertEquals("rwdmhdlxyjrxsa", model.privateLinkResourceId());
        Assertions.assertEquals("fcnihgwq", model.privateLinkResourceRegion());
        Assertions.assertEquals("pnedgf", model.groupId());
        Assertions.assertEquals("vkcvqvpkeqd", model.requestMessage());
    }

    @Test
    public void testSerialize() {
        ManagedPrivateEndpointProperties model =
            new ManagedPrivateEndpointProperties()
                .withPrivateLinkResourceId("rwdmhdlxyjrxsa")
                .withPrivateLinkResourceRegion("fcnihgwq")
                .withGroupId("pnedgf")
                .withRequestMessage("vkcvqvpkeqd");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointProperties.class);
        Assertions.assertEquals("rwdmhdlxyjrxsa", model.privateLinkResourceId());
        Assertions.assertEquals("fcnihgwq", model.privateLinkResourceRegion());
        Assertions.assertEquals("pnedgf", model.groupId());
        Assertions.assertEquals("vkcvqvpkeqd", model.requestMessage());
    }
}
