// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of a catalog. */
@Fluent
public final class CatalogProperties extends CatalogUpdateProperties {
    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * When the catalog was last synced.
     */
    @JsonProperty(value = "lastSyncTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastSyncTime;

    /** Creates an instance of CatalogProperties class. */
    public CatalogProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the lastSyncTime property: When the catalog was last synced.
     *
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /** {@inheritDoc} */
    @Override
    public CatalogProperties withGitHub(GitCatalog gitHub) {
        super.withGitHub(gitHub);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CatalogProperties withAdoGit(GitCatalog adoGit) {
        super.withAdoGit(adoGit);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
