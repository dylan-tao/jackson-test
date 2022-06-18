
package com.example.jacksontest.metadata;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class input extends AbstractInput implements Serializable {

	private static final JsonFactory FACTORY = new JsonFactory();
	public input$T07_Pboc_Info T07_Pboc_Info = new input$T07_Pboc_Info();

	@Override
	public void parseFillProperty(String inputJson) throws Exception {
		JsonParser jsonParser = FACTORY.createParser(inputJson);
		try {
			fillInputRoot(jsonParser);
		} finally {
			jsonParser.close();
		}
	}

	private void fillInputRoot(JsonParser jsonParser) throws Exception {
		int attrNeedCnt = 1;
		while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
			if(attrNeedCnt <= 0) {
				continue;
			}
			String fieldName = jsonParser.getCurrentName();
			if ("T07_Pboc_Info".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				this.T07_Pboc_Info = new input$T07_Pboc_Info();
				fillInputT07_Pboc_Info(this.T07_Pboc_Info, jsonParser);
				attrNeedCnt--;
			}
			else{
				jsonParser.nextToken();
			}
		}
	}

	private void fillInputT07_Pboc_Info(input$T07_Pboc_Info T07_Pboc_Info, JsonParser jsonParser) throws Exception {
		int attrNeedCnt = 9;
		while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
			if(attrNeedCnt <= 0) {
				continue;
			}
			String fieldName = jsonParser.getCurrentName();
			if ("pbocv_identity_education".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_identity_education = jsonParser.getText();
				attrNeedCnt--;
			} else if ("pbocv_identity_marriage".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_identity_marriage = jsonParser.getText();
				attrNeedCnt--;
			} else if ("pbocv_loan_houseall_cnt".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_loan_houseall_cnt = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pbocv_query_creditappr_cnt_p3m".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_query_creditappr_cnt_p3m = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pbocv_query_orgnum_p12m".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_query_orgnum_p12m = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pbocv_cc_1stopenacct_mths".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_cc_1stopenacct_mths = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pboc_inq_numin1m_self".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pboc_inq_numin1m_self = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pbocv_credit_dlq_mths_p12m".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_credit_dlq_mths_p12m = jsonParser.getIntValue();
				attrNeedCnt--;
			} else if ("pbocv_credit_max_dlqterm_p24m".equals(fieldName)) {
				if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
					jsonParser.nextToken();
				}
				T07_Pboc_Info.pbocv_credit_max_dlqterm_p24m = jsonParser.getIntValue();
				attrNeedCnt--;
			}
			else{
				jsonParser.nextToken();
			}
		}
	}
}
