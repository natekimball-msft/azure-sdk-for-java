// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.imageanalysis;

import com.azure.ai.vision.imageanalysis.implementation.ImageAnalysisClientImpl;
import com.azure.ai.vision.imageanalysis.implementation.models.ImageUrl;
import com.azure.ai.vision.imageanalysis.models.ImageAnalysisOptions;
import com.azure.ai.vision.imageanalysis.models.ImageAnalysisResult;
import com.azure.ai.vision.imageanalysis.models.VisualFeatures;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous ImageAnalysisClient type.
 *
 * <!-- src_embed com.azure.ai.vision.imageanalysis.async-client -->
 * <pre>
 * &#47;&#47;
 * &#47;&#47; Create an asynchronous Image Analysis client.
 * &#47;&#47;
 * ImageAnalysisAsyncClient client = new ImageAnalysisClientBuilder&#40;&#41;
 *     .endpoint&#40;endpoint&#41;
 *     .credential&#40;new KeyCredential&#40;key&#41;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.ai.vision.imageanalysis.async-client -->
 */
@ServiceClient(builder = ImageAnalysisClientBuilder.class, isAsync = true)
public final class ImageAnalysisAsyncClient {

    @Generated
    private final ImageAnalysisClientImpl serviceClient;

    /**
     * Initializes an instance of ImageAnalysisAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ImageAnalysisAsyncClient(ImageAnalysisClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Performs a single Image Analysis operation.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>language</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The desired language for result generation (a two-letter language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td>
     * </tr>
     * <tr>
     * <td>gender-neutral-caption</td>
     * <td>Boolean</td>
     * <td>No</td>
     * <td>Boolean flag for enabling gender-neutral captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td>
     * </tr>
     * <tr>
     * <td>smartcrops-aspect-ratios</td>
     * <td>List&lt;Double&gt;</td>
     * <td>No</td>
     * <td>A list of aspect ratios to use for smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td>
     * </tr>
     * <tr>
     * <td>model-version</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     url: String (Required)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BinaryData>> analyzeFromUrlWithResponse(List<String> visualFeatures, BinaryData imageContent,
        RequestOptions requestOptions) {
        return this.serviceClient.analyzeFromUrlWithResponseAsync(visualFeatures, imageContent, requestOptions);
    }

    /**
     * Performs a single Image Analysis operation.
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @param language The desired language for result generation (a two-letter language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.
     * @param genderNeutralCaption Boolean flag for enabling gender-neutral captioning for Caption and Dense Captions
     * features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or 'child').
     * @param smartCropsAspectRatios A list of aspect ratios to use for smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive).
     * @param modelVersion The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImageAnalysisResult> analyzeFromUrl(List<VisualFeatures> visualFeatures, ImageUrl imageContent,
        String language, Boolean genderNeutralCaption, List<Double> smartCropsAspectRatios, String modelVersion) {
        // Generated convenience method for analyzeFromUrlWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (language != null) {
            requestOptions.addQueryParam("language", language, false);
        }
        if (genderNeutralCaption != null) {
            requestOptions.addQueryParam("gender-neutral-caption", String.valueOf(genderNeutralCaption), false);
        }
        if (smartCropsAspectRatios != null) {
            requestOptions.addQueryParam("smartcrops-aspect-ratios", JacksonAdapter.createDefaultSerializerAdapter()
                .serializeIterable(smartCropsAspectRatios, CollectionFormat.CSV), false);
        }
        if (modelVersion != null) {
            requestOptions.addQueryParam("model-version", modelVersion, false);
        }
        return analyzeFromUrlWithResponse(visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.toList()),
            BinaryData.fromObject(imageContent), requestOptions).flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ImageAnalysisResult.class));
    }

    /**
     * Performs a single Image Analysis operation.
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImageAnalysisResult> analyzeFromUrl(List<VisualFeatures> visualFeatures, ImageUrl imageContent) {
        // Generated convenience method for analyzeFromUrlWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return analyzeFromUrlWithResponse(visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.toList()),
            BinaryData.fromObject(imageContent), requestOptions).flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ImageAnalysisResult.class));
    }

    /**
     * Performs a single Image Analysis operation.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>language</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The desired language for result generation (a two-letter language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.</td>
     * </tr>
     * <tr>
     * <td>gender-neutral-caption</td>
     * <td>Boolean</td>
     * <td>No</td>
     * <td>Boolean flag for enabling gender-neutral captioning for Caption and Dense Captions features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or
     * 'child').</td>
     * </tr>
     * <tr>
     * <td>smartcrops-aspect-ratios</td>
     * <td>List&lt;Double&gt;</td>
     * <td>No</td>
     * <td>A list of aspect ratios to use for smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive). In the form of "," separated string.</td>
     * </tr>
     * <tr>
     * <td>model-version</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * BinaryData
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     captionResult (Optional): {
     *         confidence: double (Required)
     *         text: String (Required)
     *     }
     *     denseCaptionsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 confidence: double (Required)
     *                 text: String (Required)
     *                 boundingBox (Required): {
     *                     x: int (Required)
     *                     y: int (Required)
     *                     w: int (Required)
     *                     h: int (Required)
     *                 }
     *             }
     *         ]
     *     }
     *     metadata (Required): {
     *         height: int (Required)
     *         width: int (Required)
     *     }
     *     modelVersion: String (Required)
     *     objectsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 tags (Required): [
     *                      (Required){
     *                         confidence: double (Required)
     *                         name: String (Required)
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     peopleResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *                 confidence: double (Required)
     *             }
     *         ]
     *     }
     *     readResult (Optional): {
     *         blocks (Required): [
     *              (Required){
     *                 lines (Required): [
     *                      (Required){
     *                         text: String (Required)
     *                         boundingPolygon (Required): [
     *                              (Required){
     *                                 x: int (Required)
     *                                 y: int (Required)
     *                             }
     *                         ]
     *                         words (Required): [
     *                              (Required){
     *                                 text: String (Required)
     *                                 boundingPolygon (Required): [
     *                                     (recursive schema, see above)
     *                                 ]
     *                                 confidence: double (Required)
     *                             }
     *                         ]
     *                     }
     *                 ]
     *             }
     *         ]
     *     }
     *     smartCropsResult (Optional): {
     *         values (Required): [
     *              (Required){
     *                 aspectRatio: double (Required)
     *                 boundingBox (Required): (recursive schema, see boundingBox above)
     *             }
     *         ]
     *     }
     *     tagsResult (Optional): {
     *         values (Required): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return represents the outcome of an Image Analysis operation along with {@link Response} on successful
     * completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BinaryData>> analyzeFromImageDataWithResponse(List<String> visualFeatures, BinaryData imageContent,
        RequestOptions requestOptions) {
        return this.serviceClient.analyzeFromImageDataWithResponseAsync(visualFeatures, imageContent, requestOptions);
    }

    /**
     * Performs a single Image Analysis operation.
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @param language The desired language for result generation (a two-letter language code).
     * If this option is not specified, the default value 'en' is used (English).
     * See https://aka.ms/cv-languages for a list of supported languages.
     * @param genderNeutralCaption Boolean flag for enabling gender-neutral captioning for Caption and Dense Captions
     * features.
     * By default captions may contain gender terms (for example: 'man', 'woman', or 'boy', 'girl').
     * If you set this to "true", those will be replaced with gender-neutral terms (for example: 'person' or 'child').
     * @param smartCropsAspectRatios A list of aspect ratios to use for smart cropping.
     * Aspect ratios are calculated by dividing the target crop width in pixels by the height in pixels.
     * Supported values are between 0.75 and 1.8 (inclusive).
     * If this parameter is not specified, the service will return one crop region with an aspect
     * ratio it sees fit between 0.5 and 2.0 (inclusive).
     * @param modelVersion The version of cloud AI-model used for analysis.
     * The format is the following: 'latest' (default value) or 'YYYY-MM-DD' or 'YYYY-MM-DD-preview', where 'YYYY',
     * 'MM', 'DD' are the year, month and day associated with the model.
     * This is not commonly set, as the default always gives the latest AI model with recent improvements.
     * If however you would like to make sure analysis results do not change over time, set this value to a specific
     * model version.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImageAnalysisResult> analyzeFromImageData(List<VisualFeatures> visualFeatures, BinaryData imageContent,
        String language, Boolean genderNeutralCaption, List<Double> smartCropsAspectRatios, String modelVersion) {
        // Generated convenience method for analyzeFromImageDataWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (language != null) {
            requestOptions.addQueryParam("language", language, false);
        }
        if (genderNeutralCaption != null) {
            requestOptions.addQueryParam("gender-neutral-caption", String.valueOf(genderNeutralCaption), false);
        }
        if (smartCropsAspectRatios != null) {
            requestOptions.addQueryParam("smartcrops-aspect-ratios", JacksonAdapter.createDefaultSerializerAdapter()
                .serializeIterable(smartCropsAspectRatios, CollectionFormat.CSV), false);
        }
        if (modelVersion != null) {
            requestOptions.addQueryParam("model-version", modelVersion, false);
        }
        return analyzeFromImageDataWithResponse(visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.toList()), imageContent,
            requestOptions).flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ImageAnalysisResult.class));
    }

    /**
     * Performs a single Image Analysis operation.
     *
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param imageContent The image to be analyzed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ImageAnalysisResult> analyzeFromImageData(List<VisualFeatures> visualFeatures, BinaryData imageContent) {
        // Generated convenience method for analyzeFromImageDataWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return analyzeFromImageDataWithResponse(visualFeatures.stream()
            .map(paramItemValue -> Objects.toString(paramItemValue, "")).collect(Collectors.toList()), imageContent,
            requestOptions).flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ImageAnalysisResult.class));
    }

    /**
     * Performs a single Image Analysis operation on a give image URL.
     *
     * @param imageUrl The publicly accessible URL of the image to analyze.
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param options Additional image analysis options.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     *
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     * 
     * <!-- src_embed com.azure.ai.vision.imageanalysis.async-analysis-from-url -->
     * <pre>
     * &#47;&#47;
     * &#47;&#47; Asynchronous analysis of an image file &#40;https:&#47;&#47;aka.ms&#47;azsdk&#47;image-analysis&#47;sample.jpg&#41;,
     * &#47;&#47; using all visual features, with all options set. You will likely need fewer visual features
     * &#47;&#47; and only some &#40;or no&#41; options set.
     * &#47;&#47;
     * ImageAnalysisOptions options = new ImageAnalysisOptions&#40;&#41;
     *     .setLanguage&#40;&quot;en&quot;&#41;
     *     .setGenderNeutralCaption&#40;true&#41;
     *     .setSmartCropsAspectRatios&#40;Arrays.asList&#40;0.9, 1.33&#41;&#41;
     *     .setModelVersion&#40;&quot;latest&quot;&#41;;
     *
     * Mono&lt;ImageAnalysisResult&gt; result = client.analyze&#40;
     *     new URL&#40;&quot;https:&#47;&#47;aka.ms&#47;azsdk&#47;image-analysis&#47;sample.jpg&quot;&#41;,
     *     Arrays.asList&#40;
     *         VisualFeatures.SMART_CROPS,
     *         VisualFeatures.CAPTION,
     *         VisualFeatures.DENSE_CAPTIONS,
     *         VisualFeatures.OBJECTS,
     *         VisualFeatures.PEOPLE,
     *         VisualFeatures.READ,
     *         VisualFeatures.TAGS&#41;,
     *     options&#41;;
     * </pre>
     * <!-- end com.azure.ai.vision.imageanalysis.async-analysis-from-url -->
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImageAnalysisResult> analyze(URL imageUrl, List<VisualFeatures> visualFeatures,
        ImageAnalysisOptions options) {
        if (options == null) {
            return analyzeFromUrl(visualFeatures, new ImageUrl(imageUrl.toString()), null, null, null, null);
        } else {
            return analyzeFromUrl(visualFeatures, new ImageUrl(imageUrl.toString()), options.getLanguage(),
                options.isGenderNeutralCaption(), options.getSmartCropsAspectRatios(), options.getModelVersion());
        }
    }

    /**
     * Performs a single Image Analysis operation on a give image buffer.
     *
     * @param imageData The image to analyze.
     * @param visualFeatures A list of visual features to analyze.
     * Seven visual features are supported: Caption, DenseCaptions, Read (OCR), Tags, Objects, SmartCrops, and People.
     * At least one visual feature must be specified.
     * @param options Additional image analysis options.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     *
     * @return represents the outcome of an Image Analysis operation on successful completion of {@link Mono}.
     * 
     * <!-- src_embed com.azure.ai.vision.imageanalysis.async-analysis-from-file -->
     * <pre>
     * &#47;&#47;
     * &#47;&#47; Asynchronous analysis of an image file &#40;sample.jpg&#41;, using all visual features,
     * &#47;&#47; with all options set. You will likely need fewer visual features and only
     * &#47;&#47; some &#40;or no&#41; options set.
     * &#47;&#47;
     * ImageAnalysisOptions options = new ImageAnalysisOptions&#40;&#41;
     *     .setLanguage&#40;&quot;en&quot;&#41;
     *     .setGenderNeutralCaption&#40;true&#41;
     *     .setSmartCropsAspectRatios&#40;Arrays.asList&#40;0.9, 1.33&#41;&#41;
     *     .setModelVersion&#40;&quot;latest&quot;&#41;;
     *
     * Mono&lt;ImageAnalysisResult&gt; result = client.analyze&#40;
     *     BinaryData.fromFile&#40;new File&#40;&quot;sample.jpg&quot;&#41;.toPath&#40;&#41;&#41;,
     *     Arrays.asList&#40;
     *         VisualFeatures.SMART_CROPS,
     *         VisualFeatures.CAPTION,
     *         VisualFeatures.DENSE_CAPTIONS,
     *         VisualFeatures.OBJECTS,
     *         VisualFeatures.PEOPLE,
     *         VisualFeatures.READ,
     *         VisualFeatures.TAGS&#41;,
     *     options&#41;;
     * </pre>
     * <!-- end com.azure.ai.vision.imageanalysis.async-analysis-from-file -->
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ImageAnalysisResult> analyze(BinaryData imageData, List<VisualFeatures> visualFeatures,
        ImageAnalysisOptions options) {
        if (options == null) {
            return analyzeFromImageData(visualFeatures, imageData, null, null, null, null);
        } else {
            return analyzeFromImageData(visualFeatures, imageData, options.getLanguage(),
                options.isGenderNeutralCaption(), options.getSmartCropsAspectRatios(), options.getModelVersion());
        }
    }
}
