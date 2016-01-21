/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.network.models.ConnectionResetSharedKey;
import com.microsoft.azure.management.network.models.ConnectionSharedKey;
import com.microsoft.azure.management.network.models.ConnectionSharedKeyResult;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetworkGatewayConnection;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworkGatewayConnectionsOperations.
 */
public final class VirtualNetworkGatewayConnectionsOperationsImpl implements VirtualNetworkGatewayConnectionsOperations {
    /** The Retrofit service to perform REST calls. */
    private VirtualNetworkGatewayConnectionsService service;
    /** The service client containing this operation class. */
    private NetworkManagementClient client;

    /**
     * Initializes an instance of VirtualNetworkGatewayConnectionsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualNetworkGatewayConnectionsOperationsImpl(Retrofit retrofit, NetworkManagementClient client) {
        this.service = retrofit.create(VirtualNetworkGatewayConnectionsService.class);
        this.client = client;
    }

    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGatewayConnection object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<VirtualNetworkGatewayConnection> createOrUpdate(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<VirtualNetworkGatewayConnection>() { }.getType());
    }

    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters, final ServiceCallback<VirtualNetworkGatewayConnection> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualNetworkGatewayConnectionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<VirtualNetworkGatewayConnection>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The Get VirtualNetworkGatewayConnection operation retrieves information about the specified virtual network gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGatewayConnection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<VirtualNetworkGatewayConnection> get(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkGatewayConnectionName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute(), null);
    }

    /**
     * The Get VirtualNetworkGatewayConnection operation retrieves information about the specified virtual network gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<VirtualNetworkGatewayConnection> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (virtualNetworkGatewayConnectionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<VirtualNetworkGatewayConnection>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<VirtualNetworkGatewayConnection> getDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<VirtualNetworkGatewayConnection, CloudException>()
                .register(200, new TypeToken<VirtualNetworkGatewayConnection>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.delete(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> deleteAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<Void> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualNetworkGatewayConnectionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param connectionSharedKeyName The virtual network gateway connection shared key name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionSharedKeyResult object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ConnectionSharedKeyResult> getSharedKey(String resourceGroupName, String connectionSharedKeyName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (connectionSharedKeyName == null) {
            throw new IllegalArgumentException("Parameter connectionSharedKeyName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSharedKey(resourceGroupName, connectionSharedKeyName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSharedKeyDelegate(call.execute(), null);
    }

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param connectionSharedKeyName The virtual network gateway connection shared key name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSharedKeyAsync(String resourceGroupName, String connectionSharedKeyName, final ServiceCallback<ConnectionSharedKeyResult> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (connectionSharedKeyName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter connectionSharedKeyName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSharedKey(resourceGroupName, connectionSharedKeyName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ConnectionSharedKeyResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSharedKeyDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ConnectionSharedKeyResult> getSharedKeyDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ConnectionSharedKeyResult, CloudException>()
                .register(200, new TypeToken<ConnectionSharedKeyResult>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetworkGatewayConnection&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<VirtualNetworkGatewayConnection>> list(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(resourceGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listAsync(String resourceGroupName, final ServiceCallback<PageImpl<VirtualNetworkGatewayConnection>> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(resourceGroupName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<VirtualNetworkGatewayConnection>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<VirtualNetworkGatewayConnection>> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<VirtualNetworkGatewayConnection>, CloudException>()
                .register(200, new TypeToken<PageImpl<VirtualNetworkGatewayConnection>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway connection shared key operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionResetSharedKey object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<ConnectionResetSharedKey> resetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionResetSharedKey parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.resetSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<ConnectionResetSharedKey>() { }.getType());
    }

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param parameters Parameters supplied to the Begin Reset Virtual Network Gateway connection shared key operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> resetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionResetSharedKey parameters, final ServiceCallback<ConnectionResetSharedKey> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualNetworkGatewayConnectionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.resetSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<ConnectionResetSharedKey>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Parameters supplied to the Begin Set Virtual Network Gateway conection Shared key operation throughNetwork resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionSharedKey object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<ConnectionSharedKey> setSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKey parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        Response<ResponseBody> result = service.setSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<ConnectionSharedKey>() { }.getType());
    }

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param parameters Parameters supplied to the Begin Set Virtual Network Gateway conection Shared key operation throughNetwork resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> setSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, ConnectionSharedKey parameters, final ServiceCallback<ConnectionSharedKey> serviceCallback) {
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (virtualNetworkGatewayConnectionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter virtualNetworkGatewayConnectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.setSharedKey(resourceGroupName, virtualNetworkGatewayConnectionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<ConnectionSharedKey>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;VirtualNetworkGatewayConnection&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<VirtualNetworkGatewayConnection>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<VirtualNetworkGatewayConnection>> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<PageImpl<VirtualNetworkGatewayConnection>>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<PageImpl<VirtualNetworkGatewayConnection>> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<VirtualNetworkGatewayConnection>, CloudException>()
                .register(200, new TypeToken<PageImpl<VirtualNetworkGatewayConnection>>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

}