// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.IotHubDataConnection;
import com.azure.resourcemanager.kusto.models.IotHubDataFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IotHubDataConnectionTests {
    @Test
    public void testDeserialize() {
        IotHubDataConnection model =
            BinaryData
                .fromString(
                    "{\"kind\":\"IotHub\",\"properties\":{\"iotHubResourceId\":\"zfbn\",\"consumerGroup\":\"lmctlpd\",\"tableName\":\"itvgbmhrixkwm\",\"mappingRuleName\":\"jejveg\",\"dataFormat\":\"ORC\",\"eventSystemProperties\":[\"aixexccbdreaxh\"],\"sharedAccessPolicyName\":\"exdrrvqahqkg\",\"databaseRouting\":\"Single\",\"retrievalStartDate\":\"2021-11-10T12:53:36Z\",\"provisioningState\":\"Succeeded\"},\"location\":\"yjsvfyc\",\"id\":\"z\",\"name\":\"fvoow\",\"type\":\"rvmtgjq\"}")
                .toObject(IotHubDataConnection.class);
        Assertions.assertEquals("yjsvfyc", model.location());
        Assertions.assertEquals("zfbn", model.iotHubResourceId());
        Assertions.assertEquals("lmctlpd", model.consumerGroup());
        Assertions.assertEquals("itvgbmhrixkwm", model.tableName());
        Assertions.assertEquals("jejveg", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.ORC, model.dataFormat());
        Assertions.assertEquals("aixexccbdreaxh", model.eventSystemProperties().get(0));
        Assertions.assertEquals("exdrrvqahqkg", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-10T12:53:36Z"), model.retrievalStartDate());
    }

    @Test
    public void testSerialize() {
        IotHubDataConnection model =
            new IotHubDataConnection()
                .withLocation("yjsvfyc")
                .withIotHubResourceId("zfbn")
                .withConsumerGroup("lmctlpd")
                .withTableName("itvgbmhrixkwm")
                .withMappingRuleName("jejveg")
                .withDataFormat(IotHubDataFormat.ORC)
                .withEventSystemProperties(Arrays.asList("aixexccbdreaxh"))
                .withSharedAccessPolicyName("exdrrvqahqkg")
                .withDatabaseRouting(DatabaseRouting.SINGLE)
                .withRetrievalStartDate(OffsetDateTime.parse("2021-11-10T12:53:36Z"));
        model = BinaryData.fromObject(model).toObject(IotHubDataConnection.class);
        Assertions.assertEquals("yjsvfyc", model.location());
        Assertions.assertEquals("zfbn", model.iotHubResourceId());
        Assertions.assertEquals("lmctlpd", model.consumerGroup());
        Assertions.assertEquals("itvgbmhrixkwm", model.tableName());
        Assertions.assertEquals("jejveg", model.mappingRuleName());
        Assertions.assertEquals(IotHubDataFormat.ORC, model.dataFormat());
        Assertions.assertEquals("aixexccbdreaxh", model.eventSystemProperties().get(0));
        Assertions.assertEquals("exdrrvqahqkg", model.sharedAccessPolicyName());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-10T12:53:36Z"), model.retrievalStartDate());
    }
}
