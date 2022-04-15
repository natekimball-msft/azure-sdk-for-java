// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container group encryption properties. */
@Fluent
public final class EncryptionProperties {
    /*
     * The keyvault base url.
     */
    @JsonProperty(value = "vaultBaseUrl", required = true)
    private String vaultBaseUrl;

    /*
     * The encryption key name.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /*
     * The encryption key version.
     */
    @JsonProperty(value = "keyVersion", required = true)
    private String keyVersion;

    /**
     * Get the vaultBaseUrl property: The keyvault base url.
     *
     * @return the vaultBaseUrl value.
     */
    public String vaultBaseUrl() {
        return this.vaultBaseUrl;
    }

    /**
     * Set the vaultBaseUrl property: The keyvault base url.
     *
     * @param vaultBaseUrl the vaultBaseUrl value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withVaultBaseUrl(String vaultBaseUrl) {
        this.vaultBaseUrl = vaultBaseUrl;
        return this;
    }

    /**
     * Get the keyName property: The encryption key name.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The encryption key name.
     *
     * @param keyName the keyName value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The encryption key version.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The encryption key version.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the EncryptionProperties object itself.
     */
    public EncryptionProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultBaseUrl() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property vaultBaseUrl in model EncryptionProperties"));
        }
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyName in model EncryptionProperties"));
        }
        if (keyVersion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property keyVersion in model EncryptionProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EncryptionProperties.class);
}
