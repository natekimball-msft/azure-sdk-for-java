// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.PrivateLinkServiceConnectionStateProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkServiceConnectionStatePropertyTests {
    @Test
    public void testDeserialize() {
        PrivateLinkServiceConnectionStateProperty model =
            BinaryData
                .fromString(
                    "{\"status\":\"fiyipjxsqwpgrj\",\"description\":\"norcjxvsnbyxqab\",\"actionsRequired\":\"ocpcy\"}")
                .toObject(PrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals("fiyipjxsqwpgrj", model.status());
        Assertions.assertEquals("norcjxvsnbyxqab", model.description());
    }

    @Test
    public void testSerialize() {
        PrivateLinkServiceConnectionStateProperty model =
            new PrivateLinkServiceConnectionStateProperty()
                .withStatus("fiyipjxsqwpgrj")
                .withDescription("norcjxvsnbyxqab");
        model = BinaryData.fromObject(model).toObject(PrivateLinkServiceConnectionStateProperty.class);
        Assertions.assertEquals("fiyipjxsqwpgrj", model.status());
        Assertions.assertEquals("norcjxvsnbyxqab", model.description());
    }
}
