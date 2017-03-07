package com.plivo.helper.api.response.call;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CallListFactory {
	@SerializedName("server_code")
	public Integer serverCode ;

    @SerializedName("api_id")
    public String apiId ;
    
    @SerializedName("calls")
    public List<String> callList;
    
    public String error ;
    
    public CallListFactory() {
        // empty
    }

	@Override
	public String toString() {
		return "CallListFactory [serverCode=" + serverCode + ", apiId=" + apiId
				+ ", callList=" + callList + ", error=" + error + "]";
	}
    
}
