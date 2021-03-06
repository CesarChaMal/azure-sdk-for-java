/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.collection;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.apigeneration.LangDefinition.MethodConversion;

/**
 * Provides access to deleting a resource from Azure, identifying it by its name and its resource group.
 *
 * (Note: this interface is not intended to be implemented by user code)
 */
@LangDefinition(ContainerName = "CollectionActions", CreateAsyncMethods = true, MethodConversionType = MethodConversion.OnlyMethod)
public interface SupportsDeletingByGroup {
    /**
     * Deletes a resource from Azure, identifying it by its name and its resource group.
     *
     * @param groupName The group the resource is part of
     * @param name The name of the resource
     */
    void delete(String groupName, String name);
}
