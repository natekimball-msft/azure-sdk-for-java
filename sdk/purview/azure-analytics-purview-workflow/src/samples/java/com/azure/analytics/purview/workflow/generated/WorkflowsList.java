// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.analytics.purview.workflow.WorkflowsClient;
import com.azure.analytics.purview.workflow.WorkflowsClientBuilder;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class WorkflowsList {
    public static void main(String[] args) {
        WorkflowsClient workflowsClient =
                new WorkflowsClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.workflow.generated.workflowslist.workflowslist
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = workflowsClient.list(requestOptions);
        // END:com.azure.analytics.purview.workflow.generated.workflowslist.workflowslist
    }
}
