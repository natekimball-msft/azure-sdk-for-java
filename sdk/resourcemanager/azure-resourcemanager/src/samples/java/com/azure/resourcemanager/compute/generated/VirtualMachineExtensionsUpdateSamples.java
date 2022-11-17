// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.management.SubResource;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.compute.models.KeyVaultSecretReference;
import com.azure.resourcemanager.compute.models.VirtualMachineExtensionUpdate;
import java.io.IOException;

/** Samples for VirtualMachineExtensions Update. */
public final class VirtualMachineExtensionsUpdateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-08-01/examples/virtualMachineExamples/VirtualMachineExtensions_Update.json
     */
    /**
     * Sample code: Update VM extension.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateVMExtension(com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getVirtualMachineExtensions()
            .update(
                "myResourceGroup",
                "myVM",
                "myVMExtension",
                new VirtualMachineExtensionUpdate()
                    .withPublisher("extPublisher")
                    .withType("extType")
                    .withTypeHandlerVersion("1.2")
                    .withAutoUpgradeMinorVersion(true)
                    .withSettings(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"UserName\":\"xyz@microsoft.com\"}", Object.class, SerializerEncoding.JSON))
                    .withSuppressFailures(true)
                    .withProtectedSettingsFromKeyVault(
                        new KeyVaultSecretReference()
                            .withSecretUrl("fakeTokenPlaceholder")
                            .withSourceVault(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/a53f7094-a16c-47af-abe4-b05c05d0d79a/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/kvName"))),
                Context.NONE);
    }
}
