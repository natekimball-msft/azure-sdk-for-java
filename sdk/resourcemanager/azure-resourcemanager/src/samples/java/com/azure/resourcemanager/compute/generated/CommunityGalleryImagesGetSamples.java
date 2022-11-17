// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for CommunityGalleryImages Get. */
public final class CommunityGalleryImagesGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/GalleryRP/stable/2022-03-03/examples/communityGalleryExamples/CommunityGalleryImage_Get.json
     */
    /**
     * Sample code: Get a community gallery image.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getACommunityGalleryImage(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getCommunityGalleryImages()
            .getWithResponse("myLocation", "publicGalleryName", "myGalleryImageName", Context.NONE);
    }
}
