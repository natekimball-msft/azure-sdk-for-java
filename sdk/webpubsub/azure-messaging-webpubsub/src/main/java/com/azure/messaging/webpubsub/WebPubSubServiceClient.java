// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.webpubsub;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.messaging.webpubsub.implementation.WebPubSubUtil;
import com.azure.messaging.webpubsub.implementation.WebPubSubsImpl;
import com.azure.messaging.webpubsub.implementation.models.AddToGroupsRequest;
import com.azure.messaging.webpubsub.models.WebPubSubClientProtocol;
import com.azure.messaging.webpubsub.models.GetClientAccessTokenOptions;
import com.azure.messaging.webpubsub.models.WebPubSubClientAccessToken;
import com.azure.messaging.webpubsub.models.WebPubSubContentType;
import com.azure.messaging.webpubsub.models.WebPubSubPermission;

import java.util.List;

import static com.azure.messaging.webpubsub.WebPubSubServiceAsyncClient.configureClientAccessTokenRequestOptions;

/**
 * Initializes a new instance of the synchronous AzureWebPubSubServiceRestAPI type.
 */
@ServiceClient(builder = WebPubSubServiceClientBuilder.class)
public final class WebPubSubServiceClient {
    private final WebPubSubsImpl serviceClient;
    private final String endpoint;
    private final AzureKeyCredential keyCredential;
    private final String hub;

    /**
     * Initializes an instance of WebPubSubs client.
     *
     * @param serviceClient the service client implementation.
     */
    WebPubSubServiceClient(WebPubSubsImpl serviceClient, String hub, String endpoint,
                           AzureKeyCredential keyCredential) {
        this.serviceClient = serviceClient;
        this.endpoint = endpoint;
        this.keyCredential = keyCredential;
        this.hub = hub;
    }

    /**
     * Creates a client access token.
     *
     * @param options Options to apply when creating the client access token.
     * @return A new client access instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WebPubSubClientAccessToken getClientAccessToken(GetClientAccessTokenOptions options) {
        final WebPubSubClientProtocol webPubSubClientProtocol = options.getWebPubSubClientProtocol();
        final String path = webPubSubClientProtocol.equals(WebPubSubClientProtocol.MQTT)
            ? "clients/mqtt/hubs/" : "client/hubs/";
        if (this.keyCredential == null) {
            Response<BinaryData> response = serviceClient.generateClientTokenWithResponse(hub,
                configureClientAccessTokenRequestOptions(options));
            return WebPubSubUtil.createToken(WebPubSubUtil.getToken(response.getValue()), endpoint, hub, path);
        }
        final String audience = endpoint + (endpoint.endsWith("/") ? "" : "/") + path + hub;
        final String token = WebPubSubAuthenticationPolicy.getAuthenticationToken(audience, options, keyCredential);
        return WebPubSubUtil.createToken(token, endpoint, hub, path);
    }

    /**
     * Generate token for the client to connect Azure Web PubSub service.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>userId</td><td>String</td><td>No</td><td>User Id.</td></tr>
     *     <tr><td>role</td><td>Iterable&lt;String&gt;</td><td>No</td><td>Roles that the connection with the generated token will have. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     *     <tr><td>minutesToExpire</td><td>Integer</td><td>No</td><td>The expire time of the generated token.</td></tr>
     *     <tr><td>group</td><td>Iterable&lt;String&gt;</td><td>No</td><td>Groups that the connection will join when it connects. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     token: String
     * }
     * }</pre>
     *
     * @param hub Target hub name, which should start with alphabetic characters and only contain alpha-numeric
     * characters or underscore.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     * false.
     */
    Response<BinaryData> generateClientTokenWithResponse(String hub, RequestOptions requestOptions) {
        return this.serviceClient.generateClientTokenWithResponse(hub, requestOptions);
    }

    /**
     * Broadcast content inside request body to all the connected client connections.
     *
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToAllWithResponse(BinaryData message, WebPubSubContentType contentType,
                                                long contentLength, RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString());
        requestOptions.setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentLength));
        return this.serviceClient.sendToAllWithResponse(hub, "", message, requestOptions);
    }

    /**
     * Broadcast content inside request body to all the connected client connections.
     *
     * @param message The payload body.
     * @param contentType Upload file type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendToAll(String message, WebPubSubContentType contentType) {
        sendToAllWithResponse(BinaryData.fromString(message),
            new RequestOptions().setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString()));
    }

    /**
     * Broadcast content inside request body to all the connected client connections.
     *
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToAllWithResponse(BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToAllWithResponse(hub, "", message, requestOptions);
    }

    /**
     * Check if the connection with the given connectionId exists.
     *
     * @param connectionId The connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> connectionExistsWithResponse(String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.connectionExistsWithResponse(hub, connectionId, requestOptions);
    }

    /**
     * Close the client connection.
     *
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> closeConnectionWithResponse(String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.closeConnectionWithResponse(hub, connectionId, requestOptions);
    }

    /**
     * Send content inside request body to the specific connection.
     *
     * @param connectionId The connection ID.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToConnectionWithResponse(String connectionId, BinaryData message,
                                                       WebPubSubContentType contentType, long contentLength, RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString());
        requestOptions.setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentLength));
        return this.serviceClient.sendToConnectionWithResponse(hub, connectionId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific connection.
     *
     * @param connectionId The connection ID.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendToConnection(String connectionId, String message, WebPubSubContentType contentType) {
        this.sendToConnectionWithResponse(connectionId, BinaryData.fromString(message),
            new RequestOptions().setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString()));
    }

    /**
     * Send content inside request body to the specific connection.
     *
     * @param connectionId The connection ID.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToConnectionWithResponse(String connectionId, BinaryData message,
                                                       RequestOptions requestOptions) {
        return this.serviceClient.sendToConnectionWithResponse(hub, connectionId, "", message, requestOptions);
    }

    /**
     * Check if there are any client connections inside the given group.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> groupExistsWithResponse(String group, RequestOptions requestOptions) {
        return this.serviceClient.groupExistsWithResponse(hub, group, requestOptions);
    }

    /**
     * Send content inside request body to a group of connections.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToGroupWithResponse(String group, BinaryData message, WebPubSubContentType contentType,
                                                  long contentLength, RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString());
        requestOptions.setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentLength));
        return this.serviceClient.sendToGroupWithResponse(hub, group, "", message, requestOptions);
    }

    /**
     * Send content inside request body to a group of connections.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendToGroup(String group, String message, WebPubSubContentType contentType) {
        sendToGroupWithResponse(group, BinaryData.fromString(message),
            new RequestOptions().setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString()));
    }

    /**
     * Send content inside request body to a group of connections.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToGroupWithResponse(String group, BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToGroupWithResponse(hub, group, "", message, requestOptions);
    }

    /**
     * Add a connection to the target group.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> addConnectionToGroupWithResponse(String group, String connectionId,
                                                           RequestOptions requestOptions) {
        return this.serviceClient.addConnectionToGroupWithResponse(hub, group, connectionId, requestOptions);
    }

    private Response<Void> addConnectionsToGroupsWithResponse(BinaryData groupsToAdd,
                                                              RequestOptions requestOptions) {
        return this.serviceClient.addConnectionsToGroupsWithResponse(hub, groupsToAdd, requestOptions);
    }

    /**
     * Add filtered connections to multiple groups.
     * <p><strong>Request Body Schema</strong></p>
     *
     * <pre>{@code
     * {
     *     groups: Iterable<String> (Optional)
     *     filter: String (Optional)
     * }
     * }</pre>
     *
     * @param groups Target group names. Rejected by server on status code 400 if this parameter is null.
     * @param filter The filter to apply to the connections.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void addConnectionsToGroups(List<String> groups, String filter) {
        // Convert requestBody to Binary Data String
        AddToGroupsRequest requestBody = new AddToGroupsRequest();
        requestBody.setGroups(groups);
        requestBody.setFilter(filter);
        BinaryData body = BinaryData.fromObject(requestBody);
        addConnectionsToGroupsWithResponse(body, new RequestOptions());
    }

    /**
     * Remove a connection from the target group.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeConnectionFromGroupWithResponse(String group, String connectionId,
                                                                RequestOptions requestOptions) {
        return this.serviceClient.removeConnectionFromGroupWithResponse(hub, group, connectionId, requestOptions);
    }

    /**
     * Remove a connection from all groups.
     *
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the {@link Response}.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeConnectionFromAllGroupsWithResponse(String connectionId,
                                                                    RequestOptions requestOptions) {
        return this.serviceClient.removeConnectionFromAllGroupsWithResponse(hub, connectionId, requestOptions);
    }

    /**
     * Check if there are any client connections connected for the given user.
     *
     * @param userId Target user ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> userExistsWithResponse(String userId, RequestOptions requestOptions) {
        return this.serviceClient.userExistsWithResponse(hub, userId, requestOptions);
    }

    /**
     * Send content inside request body to the specific user.
     *
     * @param userId The user ID.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToUserWithResponse(String userId, BinaryData message, WebPubSubContentType contentType,
                                                 long contentLength, RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString());
        requestOptions.setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentLength));
        return this.serviceClient.sendToUserWithResponse(hub, userId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific user.
     *
     * @param userId The user ID.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendToUser(String userId, String message, WebPubSubContentType contentType) {
        sendToUserWithResponse(userId, BinaryData.fromString(message),
            new RequestOptions().setHeader(HttpHeaderName.CONTENT_TYPE, contentType.toString()));
    }

    /**
     * Send content inside request body to the specific user.
     *
     * @param userId The user ID.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendToUserWithResponse(String userId, BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToUserWithResponse(hub, userId, "", message, requestOptions);
    }

    /**
     * Add a user to the target group.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param userId Target user ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> addUserToGroupWithResponse(String group, String userId, RequestOptions requestOptions) {
        return this.serviceClient.addUserToGroupWithResponse(hub, group, userId, requestOptions);
    }

    /**
     * Remove a user from the target group.
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param userId Target user ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeUserFromGroupWithResponse(String group, String userId, RequestOptions requestOptions) {
        return this.serviceClient.removeUserFromGroupWithResponse(hub, group, userId, requestOptions);
    }

    /**
     * Remove a user from all groups.
     *
     * @param userId Target user ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeUserFromAllGroupsWithResponse(String userId, RequestOptions requestOptions) {
        return this.serviceClient.removeUserFromAllGroupsWithResponse(hub, userId, requestOptions);
    }

    /**
     * Grant permission to the connection.
     *
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> grantPermissionWithResponse(WebPubSubPermission permission, String connectionId,
                                                      RequestOptions requestOptions) {
        return this.serviceClient.grantPermissionWithResponse(hub, permission.toString(), connectionId, requestOptions);
    }

    /**
     * Revoke permission for the connection.
     *
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> revokePermissionWithResponse(WebPubSubPermission permission, String connectionId,
                                                       RequestOptions requestOptions) {
        return this.serviceClient.revokePermissionWithResponse(hub, permission.toString(), connectionId,
            requestOptions);
    }

    /**
     * Check if a connection has permission to the specified action.
     *
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Boolean> checkPermissionWithResponse(WebPubSubPermission permission, String connectionId,
                                                         RequestOptions requestOptions) {
        return this.serviceClient.checkPermissionWithResponse(hub, permission.toString(), connectionId, requestOptions);
    }

    /**
     * Close the connections in the hub.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections in the hub.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     * false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> closeAllConnectionsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.closeAllConnectionsWithResponse(hub, requestOptions);
    }

    /**
     * Close connections in the specific group.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections in the group.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     * false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> closeGroupConnectionsWithResponse(String group, RequestOptions requestOptions) {
        return this.serviceClient.closeGroupConnectionsWithResponse(hub, group, requestOptions);
    }

    /**
     * Close connections for the specific user.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections for the user.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param userId The user ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     * false.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> closeUserConnectionsWithResponse(String userId, RequestOptions requestOptions) {
        return this.serviceClient.closeUserConnectionsWithResponse(hub, userId, requestOptions);
    }
}
