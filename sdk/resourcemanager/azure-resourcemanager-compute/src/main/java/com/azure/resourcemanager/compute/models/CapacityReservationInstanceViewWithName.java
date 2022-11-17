// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The instance view of a capacity reservation that includes the name of the capacity reservation. It is used for the
 * response to the instance view of a capacity reservation group.
 */
@Fluent
public final class CapacityReservationInstanceViewWithName extends CapacityReservationInstanceView {
    /*
     * The name of the capacity reservation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of CapacityReservationInstanceViewWithName class. */
    public CapacityReservationInstanceViewWithName() {
    }

    /**
     * Get the name property: The name of the capacity reservation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationInstanceViewWithName withUtilizationInfo(CapacityReservationUtilization utilizationInfo) {
        super.withUtilizationInfo(utilizationInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationInstanceViewWithName withStatuses(List<InstanceViewStatus> statuses) {
        super.withStatuses(statuses);
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
