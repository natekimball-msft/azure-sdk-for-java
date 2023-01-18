// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mixedreality.fluent.models.RemoteRenderingAccountInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to get resource collection. It contains a list of resources and a URL link to get the next set
 * of results.
 */
@Fluent
public final class RemoteRenderingAccountPage {
    /*
     * List of resources supported by the Resource Provider.
     */
    @JsonProperty(value = "value")
    private List<RemoteRenderingAccountInner> value;

    /*
     * URL to get the next set of resource list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RemoteRenderingAccountPage class. */
    public RemoteRenderingAccountPage() {
    }

    /**
     * Get the value property: List of resources supported by the Resource Provider.
     *
     * @return the value value.
     */
    public List<RemoteRenderingAccountInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources supported by the Resource Provider.
     *
     * @param value the value value to set.
     * @return the RemoteRenderingAccountPage object itself.
     */
    public RemoteRenderingAccountPage withValue(List<RemoteRenderingAccountInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of resource list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of resource list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the RemoteRenderingAccountPage object itself.
     */
    public RemoteRenderingAccountPage withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
