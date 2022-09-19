// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.models.DataConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataConnectionListResultTests {
    @Test
    public void testDeserialize() {
        DataConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"kind\":\"DataConnection\",\"location\":\"fn\",\"id\":\"ckw\",\"name\":\"fz\",\"type\":\"whxxbuyqax\"},{\"kind\":\"DataConnection\",\"location\":\"eqz\",\"id\":\"ppriol\",\"name\":\"or\",\"type\":\"altol\"}]}")
                .toObject(DataConnectionListResult.class);
        Assertions.assertEquals("fn", model.value().get(0).location());
    }

    @Test
    public void testSerialize() {
        DataConnectionListResult model =
            new DataConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new DataConnectionInner().withLocation("fn"),
                            new DataConnectionInner().withLocation("eqz")));
        model = BinaryData.fromObject(model).toObject(DataConnectionListResult.class);
        Assertions.assertEquals("fn", model.value().get(0).location());
    }
}
