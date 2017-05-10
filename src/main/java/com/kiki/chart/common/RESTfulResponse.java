package com.kiki.chart.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 统一封装RESTful响应体
 *
 * @author kiki
 * @since 1.0
 */
public class RESTfulResponse {
    private String functionResult = null;
    private String message = null;

    public RESTfulResponse() {
    }

    public RESTfulResponse(String result, String message) {
        this.functionResult = result;
        this.message = message;
    }

    public RESTfulResponse(String result) {
        this.functionResult = result;
    }

    public String getFunctionResult() {
        return this.functionResult;
    }

    public void setFunctionResult(String functionResult) {
        this.functionResult = functionResult;
    }

    @JsonInclude(Include.NON_NULL)
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static RESTfulResponse successResponse() {
        return new RESTfulResponse("SUCCESS");
    }

    public static RESTfulResponse successResponse(String message) {
        return new RESTfulResponse("SUCCESS", message);
    }

    public static RESTfulResponse failedResponse(String result, String message) {
        return new RESTfulResponse(result, message);
    }

    public static RESTfulResponse failedResponse() {
        return new RESTfulResponse("FATAL_FAIL");
    }
}
