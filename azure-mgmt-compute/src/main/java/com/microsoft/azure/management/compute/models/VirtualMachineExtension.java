/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a Virtual Machine Extension.
 */
@JsonFlatten
public class VirtualMachineExtension extends Resource {
    /**
     * Gets or sets how the extension handler should be forced to update even
     * if the extension configuration has not changed. Possible values
     * include: 'RerunExtension'.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private ForceUpdateTagTypes forceUpdateTag;

    /**
     * Gets or sets the name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.publisher")
    private String publisher;

    /**
     * Gets or sets the type of the extension handler.
     */
    @JsonProperty(value = "properties.type")
    private String virtualMachineExtensionType;

    /**
     * Gets or sets the type version of the extension handler.
     */
    @JsonProperty(value = "properties.typeHandlerVersion")
    private String typeHandlerVersion;

    /**
     * Gets or sets whether the extension handler should be automatically
     * upgraded across minor versions.
     */
    @JsonProperty(value = "properties.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /**
     * Gets or sets Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.settings")
    private Object settings;

    /**
     * Gets or sets Json formatted protected settings for the extension.
     */
    @JsonProperty(value = "properties.protectedSettings")
    private Object protectedSettings;

    /**
     * Gets or sets the provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets or sets the virtual machine extension instance view.
     */
    @JsonProperty(value = "properties.instanceView")
    private VirtualMachineExtensionInstanceView instanceView;

    /**
     * Get the forceUpdateTag value.
     *
     * @return the forceUpdateTag value
     */
    public ForceUpdateTagTypes getForceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag value.
     *
     * @param forceUpdateTag the forceUpdateTag value to set
     */
    public void setForceUpdateTag(ForceUpdateTagTypes forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
    }

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Get the virtualMachineExtensionType value.
     *
     * @return the virtualMachineExtensionType value
     */
    public String getVirtualMachineExtensionType() {
        return this.virtualMachineExtensionType;
    }

    /**
     * Set the virtualMachineExtensionType value.
     *
     * @param virtualMachineExtensionType the virtualMachineExtensionType value to set
     */
    public void setVirtualMachineExtensionType(String virtualMachineExtensionType) {
        this.virtualMachineExtensionType = virtualMachineExtensionType;
    }

    /**
     * Get the typeHandlerVersion value.
     *
     * @return the typeHandlerVersion value
     */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion value.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set
     */
    public void setTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Get the autoUpgradeMinorVersion value.
     *
     * @return the autoUpgradeMinorVersion value
     */
    public Boolean getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion value.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set
     */
    public void setAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
    }

    /**
     * Get the settings value.
     *
     * @return the settings value
     */
    public Object getSettings() {
        return this.settings;
    }

    /**
     * Set the settings value.
     *
     * @param settings the settings value to set
     */
    public void setSettings(Object settings) {
        this.settings = settings;
    }

    /**
     * Get the protectedSettings value.
     *
     * @return the protectedSettings value
     */
    public Object getProtectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings value.
     *
     * @param protectedSettings the protectedSettings value to set
     */
    public void setProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the instanceView value.
     *
     * @return the instanceView value
     */
    public VirtualMachineExtensionInstanceView getInstanceView() {
        return this.instanceView;
    }

    /**
     * Set the instanceView value.
     *
     * @param instanceView the instanceView value to set
     */
    public void setInstanceView(VirtualMachineExtensionInstanceView instanceView) {
        this.instanceView = instanceView;
    }

}