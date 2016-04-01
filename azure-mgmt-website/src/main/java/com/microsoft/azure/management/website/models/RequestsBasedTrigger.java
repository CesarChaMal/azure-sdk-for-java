/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;


/**
 * RequestsBasedTrigger.
 */
public class RequestsBasedTrigger {
    /**
     * Count.
     */
    private Integer count;

    /**
     * TimeInterval.
     */
    private String timeInterval;

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Get the timeInterval value.
     *
     * @return the timeInterval value
     */
    public String getTimeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval value.
     *
     * @param timeInterval the timeInterval value to set
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }

}