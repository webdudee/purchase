
package com.ai1tutorial.json.employee.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success",
    "timestamp",
    "base",
    "date",
    "rates"
})
public class CurrencyRates {

    /**
     * The Success Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("success")
    private Boolean success = false;
    /**
     * The Timestamp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    private Integer timestamp = 0;
    /**
     * The Base Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    private String base = "";
    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    private String date = "";
    /**
     * The Rates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    private Rates rates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The Success Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    /**
     * The Success Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CurrencyRates withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * The Timestamp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * The Timestamp Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public CurrencyRates withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The Base Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     * The Base Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    public CurrencyRates withBase(String base) {
        this.base = base;
        return this;
    }

    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * The Date Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public CurrencyRates withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * The Rates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public Rates getRates() {
        return rates;
    }

    /**
     * The Rates Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public CurrencyRates withRates(Rates rates) {
        this.rates = rates;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CurrencyRates withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(success).append(timestamp).append(base).append(date).append(rates).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrencyRates) == false) {
            return false;
        }
        CurrencyRates rhs = ((CurrencyRates) other);
        return new EqualsBuilder().append(success, rhs.success).append(timestamp, rhs.timestamp).append(base, rhs.base).append(date, rhs.date).append(rates, rhs.rates).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
