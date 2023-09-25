// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.FluxComplianceState;
import com.azure.resourcemanager.kubernetesconfiguration.models.HelmReleasePropertiesDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.ObjectReferenceDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.ObjectStatusConditionDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.ObjectStatusDefinition;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ObjectStatusDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ObjectStatusDefinition model =
            BinaryData
                .fromString(
                    "{\"name\":\"wtgrhpdjpj\",\"namespace\":\"asxazjpqyegualhb\",\"kind\":\"hejjz\",\"complianceState\":\"Non-Compliant\",\"appliedBy\":{\"name\":\"gwdslfhotwm\",\"namespace\":\"npwlbjnpg\"},\"statusConditions\":[{\"lastTransitionTime\":\"2021-10-08T18:53:29Z\",\"message\":\"ehxnltyfsop\",\"reason\":\"suesnzw\",\"status\":\"jbavorxzdm\",\"type\":\"ctbqvudwx\"},{\"lastTransitionTime\":\"2021-03-23T22:55:01Z\",\"message\":\"vo\",\"reason\":\"ujjugwdkcglh\",\"status\":\"azjdyggd\",\"type\":\"ixhbkuofqweykhm\"},{\"lastTransitionTime\":\"2021-08-01T10:52:51Z\",\"message\":\"fyexfwhy\",\"reason\":\"i\",\"status\":\"yvdcsitynnaa\",\"type\":\"ectehf\"},{\"lastTransitionTime\":\"2021-03-19T08:13:40Z\",\"message\":\"jeyp\",\"reason\":\"ezrkgqhcjrefo\",\"status\":\"mkqsleyyv\",\"type\":\"qjpkcattpngjcrc\"}],\"helmReleaseProperties\":{\"lastRevisionApplied\":8852498521438996261,\"helmChartRef\":{\"name\":\"vmdajvnysou\",\"namespace\":\"e\"},\"failureCount\":3884440405716336055,\"installFailureCount\":4529960801894599237,\"upgradeFailureCount\":8165911566744254843}}")
                .toObject(ObjectStatusDefinition.class);
        Assertions.assertEquals("wtgrhpdjpj", model.name());
        Assertions.assertEquals("asxazjpqyegualhb", model.namespace());
        Assertions.assertEquals("hejjz", model.kind());
        Assertions.assertEquals(FluxComplianceState.NON_COMPLIANT, model.complianceState());
        Assertions.assertEquals("gwdslfhotwm", model.appliedBy().name());
        Assertions.assertEquals("npwlbjnpg", model.appliedBy().namespace());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-08T18:53:29Z"), model.statusConditions().get(0).lastTransitionTime());
        Assertions.assertEquals("ehxnltyfsop", model.statusConditions().get(0).message());
        Assertions.assertEquals("suesnzw", model.statusConditions().get(0).reason());
        Assertions.assertEquals("jbavorxzdm", model.statusConditions().get(0).status());
        Assertions.assertEquals("ctbqvudwx", model.statusConditions().get(0).type());
        Assertions.assertEquals(8852498521438996261L, model.helmReleaseProperties().lastRevisionApplied());
        Assertions.assertEquals("vmdajvnysou", model.helmReleaseProperties().helmChartRef().name());
        Assertions.assertEquals("e", model.helmReleaseProperties().helmChartRef().namespace());
        Assertions.assertEquals(3884440405716336055L, model.helmReleaseProperties().failureCount());
        Assertions.assertEquals(4529960801894599237L, model.helmReleaseProperties().installFailureCount());
        Assertions.assertEquals(8165911566744254843L, model.helmReleaseProperties().upgradeFailureCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ObjectStatusDefinition model =
            new ObjectStatusDefinition()
                .withName("wtgrhpdjpj")
                .withNamespace("asxazjpqyegualhb")
                .withKind("hejjz")
                .withComplianceState(FluxComplianceState.NON_COMPLIANT)
                .withAppliedBy(new ObjectReferenceDefinition().withName("gwdslfhotwm").withNamespace("npwlbjnpg"))
                .withStatusConditions(
                    Arrays
                        .asList(
                            new ObjectStatusConditionDefinition()
                                .withLastTransitionTime(OffsetDateTime.parse("2021-10-08T18:53:29Z"))
                                .withMessage("ehxnltyfsop")
                                .withReason("suesnzw")
                                .withStatus("jbavorxzdm")
                                .withType("ctbqvudwx"),
                            new ObjectStatusConditionDefinition()
                                .withLastTransitionTime(OffsetDateTime.parse("2021-03-23T22:55:01Z"))
                                .withMessage("vo")
                                .withReason("ujjugwdkcglh")
                                .withStatus("azjdyggd")
                                .withType("ixhbkuofqweykhm"),
                            new ObjectStatusConditionDefinition()
                                .withLastTransitionTime(OffsetDateTime.parse("2021-08-01T10:52:51Z"))
                                .withMessage("fyexfwhy")
                                .withReason("i")
                                .withStatus("yvdcsitynnaa")
                                .withType("ectehf"),
                            new ObjectStatusConditionDefinition()
                                .withLastTransitionTime(OffsetDateTime.parse("2021-03-19T08:13:40Z"))
                                .withMessage("jeyp")
                                .withReason("ezrkgqhcjrefo")
                                .withStatus("mkqsleyyv")
                                .withType("qjpkcattpngjcrc")))
                .withHelmReleaseProperties(
                    new HelmReleasePropertiesDefinition()
                        .withLastRevisionApplied(8852498521438996261L)
                        .withHelmChartRef(new ObjectReferenceDefinition().withName("vmdajvnysou").withNamespace("e"))
                        .withFailureCount(3884440405716336055L)
                        .withInstallFailureCount(4529960801894599237L)
                        .withUpgradeFailureCount(8165911566744254843L));
        model = BinaryData.fromObject(model).toObject(ObjectStatusDefinition.class);
        Assertions.assertEquals("wtgrhpdjpj", model.name());
        Assertions.assertEquals("asxazjpqyegualhb", model.namespace());
        Assertions.assertEquals("hejjz", model.kind());
        Assertions.assertEquals(FluxComplianceState.NON_COMPLIANT, model.complianceState());
        Assertions.assertEquals("gwdslfhotwm", model.appliedBy().name());
        Assertions.assertEquals("npwlbjnpg", model.appliedBy().namespace());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-08T18:53:29Z"), model.statusConditions().get(0).lastTransitionTime());
        Assertions.assertEquals("ehxnltyfsop", model.statusConditions().get(0).message());
        Assertions.assertEquals("suesnzw", model.statusConditions().get(0).reason());
        Assertions.assertEquals("jbavorxzdm", model.statusConditions().get(0).status());
        Assertions.assertEquals("ctbqvudwx", model.statusConditions().get(0).type());
        Assertions.assertEquals(8852498521438996261L, model.helmReleaseProperties().lastRevisionApplied());
        Assertions.assertEquals("vmdajvnysou", model.helmReleaseProperties().helmChartRef().name());
        Assertions.assertEquals("e", model.helmReleaseProperties().helmChartRef().namespace());
        Assertions.assertEquals(3884440405716336055L, model.helmReleaseProperties().failureCount());
        Assertions.assertEquals(4529960801894599237L, model.helmReleaseProperties().installFailureCount());
        Assertions.assertEquals(8165911566744254843L, model.helmReleaseProperties().upgradeFailureCount());
    }
}
