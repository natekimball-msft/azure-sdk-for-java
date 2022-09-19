// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.kusto.models.DataConnectionValidationResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataConnectionValidationListResultInnerTests {
    @Test
    public void testDeserialize() {
        DataConnectionValidationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"errorMessage\":\"c\"},{\"errorMessage\":\"auwjuetaebu\"},{\"errorMessage\":\"vdmovsmzlxwabm\"}]}")
                .toObject(DataConnectionValidationListResultInner.class);
        Assertions.assertEquals("c", model.value().get(0).errorMessage());
    }

    @Test
    public void testSerialize() {
        DataConnectionValidationListResultInner model =
            new DataConnectionValidationListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new DataConnectionValidationResult().withErrorMessage("c"),
                            new DataConnectionValidationResult().withErrorMessage("auwjuetaebu"),
                            new DataConnectionValidationResult().withErrorMessage("vdmovsmzlxwabm")));
        model = BinaryData.fromObject(model).toObject(DataConnectionValidationListResultInner.class);
        Assertions.assertEquals("c", model.value().get(0).errorMessage());
    }
}
