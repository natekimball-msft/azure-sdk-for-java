// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.PatchExtensionProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PatchExtensionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchExtensionProperties model =
            BinaryData
                .fromString(
                    "{\"autoUpgradeMinorVersion\":false,\"releaseTrain\":\"bkpodepooginuv\",\"version\":\"iheogna\",\"configurationSettings\":{\"o\":\"xth\",\"cciqihnhungbwjz\":\"usivye\",\"kufubljo\":\"nfygxgispemvtz\",\"v\":\"xqeofjaeqjhqjba\"},\"configurationProtectedSettings\":{\"gsntnbybkzgcwr\":\"jqul\",\"skcqvkocrcjd\":\"clxxwrljdo\",\"lssai\":\"wtnhxbnjbiksqr\"}}")
                .toObject(PatchExtensionProperties.class);
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("bkpodepooginuv", model.releaseTrain());
        Assertions.assertEquals("iheogna", model.version());
        Assertions.assertEquals("xth", model.configurationSettings().get("o"));
        Assertions.assertEquals("jqul", model.configurationProtectedSettings().get("gsntnbybkzgcwr"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchExtensionProperties model =
            new PatchExtensionProperties()
                .withAutoUpgradeMinorVersion(false)
                .withReleaseTrain("bkpodepooginuv")
                .withVersion("iheogna")
                .withConfigurationSettings(
                    mapOf(
                        "o", "xth", "cciqihnhungbwjz", "usivye", "kufubljo", "nfygxgispemvtz", "v", "xqeofjaeqjhqjba"))
                .withConfigurationProtectedSettings(
                    mapOf("gsntnbybkzgcwr", "jqul", "skcqvkocrcjd", "clxxwrljdo", "lssai", "wtnhxbnjbiksqr"));
        model = BinaryData.fromObject(model).toObject(PatchExtensionProperties.class);
        Assertions.assertEquals(false, model.autoUpgradeMinorVersion());
        Assertions.assertEquals("bkpodepooginuv", model.releaseTrain());
        Assertions.assertEquals("iheogna", model.version());
        Assertions.assertEquals("xth", model.configurationSettings().get("o"));
        Assertions.assertEquals("jqul", model.configurationProtectedSettings().get("gsntnbybkzgcwr"));
    }

    // Use "Map.of" if available
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
