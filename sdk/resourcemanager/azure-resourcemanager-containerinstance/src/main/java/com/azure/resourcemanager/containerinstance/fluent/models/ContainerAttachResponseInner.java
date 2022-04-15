// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The information for the output stream from container attach. */
@Fluent
public final class ContainerAttachResponseInner {
    /*
     * The uri for the output stream from the attach.
     */
    @JsonProperty(value = "webSocketUri")
    private String webSocketUri;

    /*
     * The password to the output stream from the attach. Send as an
     * Authorization header value when connecting to the websocketUri.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the webSocketUri property: The uri for the output stream from the attach.
     *
     * @return the webSocketUri value.
     */
    public String webSocketUri() {
        return this.webSocketUri;
    }

    /**
     * Set the webSocketUri property: The uri for the output stream from the attach.
     *
     * @param webSocketUri the webSocketUri value to set.
     * @return the ContainerAttachResponseInner object itself.
     */
    public ContainerAttachResponseInner withWebSocketUri(String webSocketUri) {
        this.webSocketUri = webSocketUri;
        return this;
    }

    /**
     * Get the password property: The password to the output stream from the attach. Send as an Authorization header
     * value when connecting to the websocketUri.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password to the output stream from the attach. Send as an Authorization header
     * value when connecting to the websocketUri.
     *
     * @param password the password value to set.
     * @return the ContainerAttachResponseInner object itself.
     */
    public ContainerAttachResponseInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
