// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Server version capabilities. */
@Immutable
public final class ServerVersionCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerVersionCapability.class);

    /*
     * server version
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The supportedVcores property.
     */
    @JsonProperty(value = "supportedVcores", access = JsonProperty.Access.WRITE_ONLY)
    private List<VcoreCapability> supportedVcores;

    /*
     * The status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Get the name property: server version.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedVcores property: The supportedVcores property.
     *
     * @return the supportedVcores value.
     */
    public List<VcoreCapability> supportedVcores() {
        return this.supportedVcores;
    }

    /**
     * Get the status property: The status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedVcores() != null) {
            supportedVcores().forEach(e -> e.validate());
        }
    }
}
