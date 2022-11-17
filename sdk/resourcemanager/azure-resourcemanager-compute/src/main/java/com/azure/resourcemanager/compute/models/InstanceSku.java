// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role instance SKU. */
@Immutable
public final class InstanceSku {
    /*
     * The sku name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The tier of the cloud service role instance.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /** Creates an instance of InstanceSku class. */
    public InstanceSku() {
    }

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: The tier of the cloud service role instance.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
