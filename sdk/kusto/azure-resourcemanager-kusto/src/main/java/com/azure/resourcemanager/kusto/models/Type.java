// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** The type of resource, for instance Microsoft.Kusto/clusters/databases. */
public enum Type {
    /** Enum value Microsoft.Kusto/clusters/databases. */
    MICROSOFT_KUSTO_CLUSTERS_DATABASES("Microsoft.Kusto/clusters/databases"),

    /** Enum value Microsoft.Kusto/clusters/attachedDatabaseConfigurations. */
    MICROSOFT_KUSTO_CLUSTERS_ATTACHED_DATABASE_CONFIGURATIONS(
        "Microsoft.Kusto/clusters/attachedDatabaseConfigurations");

    /** The actual serialized value for a Type instance. */
    private final String value;

    Type(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Type instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Type object, or null if unable to parse.
     */
    @JsonCreator
    public static Type fromString(String value) {
        if (value == null) {
            return null;
        }
        Type[] items = Type.values();
        for (Type item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
