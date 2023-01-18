// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.models.AccountKeyRegenerateRequest;
import com.azure.resourcemanager.mixedreality.models.Serial;
import org.junit.jupiter.api.Assertions;

public final class AccountKeyRegenerateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountKeyRegenerateRequest model =
            BinaryData.fromString("{\"serial\":1}").toObject(AccountKeyRegenerateRequest.class);
        Assertions.assertEquals(Serial.ONE, model.serial());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountKeyRegenerateRequest model = new AccountKeyRegenerateRequest().withSerial(Serial.ONE);
        model = BinaryData.fromObject(model).toObject(AccountKeyRegenerateRequest.class);
        Assertions.assertEquals(Serial.ONE, model.serial());
    }
}
