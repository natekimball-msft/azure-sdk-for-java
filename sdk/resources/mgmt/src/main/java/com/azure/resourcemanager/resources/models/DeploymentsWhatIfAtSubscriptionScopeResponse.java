// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.resources.fluent.inner.WhatIfOperationResultInner;

/** Contains all response data for the whatIfAtSubscriptionScope operation. */
public final class DeploymentsWhatIfAtSubscriptionScopeResponse
    extends ResponseBase<DeploymentsWhatIfAtSubscriptionScopeHeaders, WhatIfOperationResultInner> {
    /**
     * Creates an instance of DeploymentsWhatIfAtSubscriptionScopeResponse.
     *
     * @param request the request which resulted in this DeploymentsWhatIfAtSubscriptionScopeResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeploymentsWhatIfAtSubscriptionScopeResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        WhatIfOperationResultInner value,
        DeploymentsWhatIfAtSubscriptionScopeHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public WhatIfOperationResultInner getValue() {
        return super.getValue();
    }
}
