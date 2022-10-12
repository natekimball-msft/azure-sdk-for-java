// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.DevCenterInner;
import java.util.Map;

/** An immutable client-side representation of DevCenter. */
public interface DevCenter {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Managed identity properties.
     *
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.DevCenterInner object.
     *
     * @return the inner object.
     */
    DevCenterInner innerModel();

    /** The entirety of the DevCenter definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DevCenter definition stages. */
    interface DefinitionStages {
        /** The first stage of the DevCenter definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DevCenter definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the DevCenter definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Name of the resource group within the Azure subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the DevCenter definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DevCenter create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DevCenter create(Context context);
        }
        /** The stage of the DevCenter definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DevCenter definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity properties.
             *
             * @param identity Managed identity properties.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
    }
    /**
     * Begins update for the DevCenter resource.
     *
     * @return the stage of resource update.
     */
    DevCenter.Update update();

    /** The template for DevCenter update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DevCenter apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DevCenter apply(Context context);
    }
    /** The DevCenter update stages. */
    interface UpdateStages {
        /** The stage of the DevCenter update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the DevCenter update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Managed identity properties.
             *
             * @param identity Managed identity properties.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DevCenter refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DevCenter refresh(Context context);
}
