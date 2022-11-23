// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpoint;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.cognitiveservices.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"ayhuy\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"odepoogin\",\"actionsRequired\":\"amiheognarxz\"},\"provisioningState\":\"Creating\",\"groupIds\":[\"tusivyevcciqihn\"]},\"location\":\"gbwjzrnf\",\"etag\":\"xgispemvtzfkufu\",\"id\":\"ljofxqeofjaeqjh\",\"name\":\"jbasvmsmjqulngs\",\"type\":\"tnb\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED,
                model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("odepoogin", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("amiheognarxz", model.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("tusivyevcciqihn", model.properties().groupIds().get(0));
        Assertions.assertEquals("gbwjzrnf", model.location());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withProperties(
                    new PrivateEndpointConnectionProperties()
                        .withPrivateEndpoint(new PrivateEndpoint())
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionState()
                                .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                                .withDescription("odepoogin")
                                .withActionsRequired("amiheognarxz"))
                        .withGroupIds(Arrays.asList("tusivyevcciqihn")))
                .withLocation("gbwjzrnf");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED,
                model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("odepoogin", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("amiheognarxz", model.properties().privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("tusivyevcciqihn", model.properties().groupIds().get(0));
        Assertions.assertEquals("gbwjzrnf", model.location());
    }
}
