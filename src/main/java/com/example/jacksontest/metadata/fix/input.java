
package com.example.jacksontest.metadata.fix;

import java.io.Serializable;

import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;

import com.example.jacksontest.metadata.AbstractInput;
import com.fasterxml.jackson.core.JsonFactory;
import org.joda.time.DateTime;
import org.springframework.util.StringUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
public class input
    extends AbstractInput
    implements Serializable
{
	private static final JsonFactory FACTORY = new JsonFactory();
	public input$T02_Inbk_Account T02_Inbk_Account = new input$T02_Inbk_Account();
    public String application_id;
    public input$T08_ExternalData_Info T08_ExternalData_Info = new input$T08_ExternalData_Info();
    public String channel_id;
    public input$T07_Pboc_Info T07_Pboc_Info = new input$T07_Pboc_Info();
    public input$T01_Apply_Info T01_Apply_Info = new input$T01_Apply_Info();
    public input$DSWorkflow DSWorkflow = new input$DSWorkflow();
    public String product_id;
    public void parseFillProperty(String inputJson) throws Exception {
        JsonParser jsonParser = FACTORY.createParser(inputJson);
        try {
            fillInputRoot(jsonParser);
        } finally {
            jsonParser.close();
        }
    }

    private void fillInputRoot(JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 8;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("product_id".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.product_id = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("T01_Apply_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.T01_Apply_Info = new input$T01_Apply_Info();
                fillInputT01_Apply_Info(this.T01_Apply_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("application_id".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.application_id = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("DSWorkflow".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.DSWorkflow = new input$DSWorkflow();
                fillInputDSWorkflow(this.DSWorkflow, jsonParser);
		        attrNeedCnt--;
		    } else if ("channel_id".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.channel_id = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("T02_Inbk_Account".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.T02_Inbk_Account = new input$T02_Inbk_Account();
                fillInputT02_Inbk_Account(this.T02_Inbk_Account, jsonParser);
		        attrNeedCnt--;
		    } else if ("T08_ExternalData_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.T08_ExternalData_Info = new input$T08_ExternalData_Info();
                fillInputT08_ExternalData_Info(this.T08_ExternalData_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T07_Pboc_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        this.T07_Pboc_Info = new input$T07_Pboc_Info();
                fillInputT07_Pboc_Info(this.T07_Pboc_Info, jsonParser);
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT07_Pboc_Info(input$T07_Pboc_Info T07_Pboc_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 474;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("pboc_pub_xzcf_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_xzcf_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loan_orgnum_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loan_orgnum_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_badloan_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_badloan_if = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_od_cc_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_cc_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqterm_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqterm_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqterm_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqterm_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_amt_max".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_amt_max = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_ovdamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_ovdamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_loan_maxod_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_loan_maxod_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_scc_maxod_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_scc_maxod_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlq500upamt_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlq500upamt_if = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_acceschkorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_acceschkorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_consta_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_consta_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_birthday".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_birthday = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_update3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_update3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_consta_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_consta_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_update2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_update2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_officephone1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_officephone1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_update1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_update1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_guacredunpaidloanorg".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_guacredunpaidloanorg = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqterm_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqterm_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_cur = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_officephone3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_officephone3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_officephone2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_officephone2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_pub_qzzx_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_qzzx_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_officephone5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_officephone5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_update5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_update5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_officephone4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_officephone4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_update4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_update4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_consta_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_consta_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_utlrate75up_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_utlrate75up_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_sumlimitamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_sumlimitamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_cleared_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_cleared_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_spouse_comp".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_spouse_comp = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_worst_status_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_worst_status_cur = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_joinyear1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_joinyear1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_joinyear4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_joinyear4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_joinyear5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_joinyear5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_joinyear2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_joinyear2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_joinyear3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_joinyear3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_otherloan_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_otherloan_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_selfstate_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_selfstate_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_house_1stopen_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_house_1stopen_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crd_orgnum_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crd_orgnum_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_guacredunpaidavgamt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_guacredunpaidavgamt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_record_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_record_if = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_mspj_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_mspj_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile2_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile2_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_reject_code".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_reject_code = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_house_cleared_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_cleared_if = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_coll_credloan_cur_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_coll_credloan_cur_if = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelq180d_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelq180d_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_basic_edudegree".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_edudegree = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq1cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq1cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq1cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq1cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_else_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_else_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_credit_maxod_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_credit_maxod_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_car_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_car_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_rvlv_loan_avgrp_in6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_rvlv_loan_avgrp_in6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_other_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_other_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_bankln_guacredunpaidorg".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_bankln_guacredunpaidorg = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_nodelq90d_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_nodelq90d_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_deq_telecom_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_deq_telecom_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_nbankln_guacredunpaidamt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_nbankln_guacredunpaidamt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_cc_maxod_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_cc_maxod_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp5_kind".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp5_kind = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_consta_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_consta_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_cur = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loan_orgnum_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loan_orgnum_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq1cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq1cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq2cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq2cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan__maxdlqtermamt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan__maxdlqtermamt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_orgnum_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_orgnum_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_orgnum_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_orgnum_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_prsnl_cnt_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_prsnl_cnt_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_cre_avgrp_in6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_cre_avgrp_in6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq1cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq1cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq1cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq1cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_householdaddr".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_householdaddr = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlq_mths_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlq_mths_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlq_mths_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlq_mths_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_credit_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_credit_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq2cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq2cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_credit_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_credit_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq1cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq1cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_scc_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_scc_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_1stopen_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_1stopen_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_fund_latest_status".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fund_latest_status = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_loanovdue_mon".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_loanovdue_mon = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_credit_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_credit_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_consta_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_consta_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_orgs".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_orgs = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_conti_dlqcnt_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_conti_dlqcnt_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelq30d_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelq30d_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_scc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_scc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq2cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq2cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_marriage".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_marriage = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq2cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq2cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelq90d_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelq90d_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_bad_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_bad_if = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin1m_loan".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin1m_loan = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_fund_mthstoservic_ratio".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fund_mthstoservic_ratio = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_studentloanorg3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_studentloanorg3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_md_c_orgcnt_lmt08_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_md_c_orgcnt_lmt08_p = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_total_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_total_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_amt_used".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_amt_used = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credloan_repay_status".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credloan_repay_status = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile3_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile3_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_unclred_cnt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_unclred_cnt_cur = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_pboc_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_pboc_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq1cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq1cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_loan_orgs".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_loan_orgs = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_update3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_update3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_reside_update2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_update2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_ccappr_cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_ccappr_cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_update1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_update1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_comsumerorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_comsumerorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_busiloan_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_busiloan_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_creditlimit_75per".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_creditlimit_75per = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_lmtutlrate".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_lmtutlrate = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_disnote_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_disnote_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_orgnum_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_orgnum_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_repayments_amt_inst".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_repayments_amt_inst = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqamt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqamt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp1_kind".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp1_kind = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_nonbank_loan_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_nonbank_loan_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq1cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq1cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq1cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq1cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq2cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq2cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_deq_telecom_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_deq_telecom_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_creditcardorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_creditcardorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq2cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq2cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_repay_amt_mthly".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_repay_amt_mthly = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_houseloan_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_houseloan_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_payamtmonth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_payamtmonth = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loan_orgnum_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loan_orgnum_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlqcnt_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlqcnt_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_housefundownpercent".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_housefundownpercent = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_pub_tax_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_tax_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_rmb_unclsed_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_rmb_unclsed_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_accum_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_accum_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_credloan_mon".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_credloan_mon = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_1stopenacct_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_1stopenacct_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_basic_dk_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_dk_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_unclsed_undlqcur_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_unclsed_undlqcur_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_min_creditlimit".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_min_creditlimit = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_orgnum_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_orgnum_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_consta_dlqcnt_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_consta_dlqcnt_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_loan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_loan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_cc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_cc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq1cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq1cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_bal_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_bal_e = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqterm_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqterm_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_nodelq30d_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_nodelq30d_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_executed_cases".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_executed_cases = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_bal_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_bal_p = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_ccappr_cnt_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_ccappr_cnt_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_identity_marriage".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_identity_marriage = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_dlq_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_dlq_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_spouse_id".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_spouse_id = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_nbankln_guacredunpaidorg".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_nbankln_guacredunpaidorg = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_coll_max_dlqterm".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_coll_max_dlqterm = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_houseall_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_houseall_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_identity_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_identity_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_creditappr_cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_creditappr_cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_compaddr2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_compaddr2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_compaddr1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_compaddr1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_compaddr5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_compaddr5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp3_kind".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp3_kind = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_compaddr4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_compaddr4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_compaddr3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_compaddr3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loanappr_cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loanappr_cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loanappr_cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loanappr_cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_bankln_guacredunpaidamt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_bankln_guacredunpaidamt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_houseorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_houseorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_guacredunpaidamt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_guacredunpaidamt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crdtappr_cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crdtappr_cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_zlsqf_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_zlsqf_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crdtappr_cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crdtappr_cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_asset_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_asset_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_ccappr_cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_ccappr_cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_orgnum_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_orgnum_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_nationality".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_nationality = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_basic_dk_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_dk_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_acceschkorg_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_acceschkorg_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_avg_limitrate".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_avg_limitrate = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_nrvlv_loan_maxod_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_nrvlv_loan_maxod_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_nodelq30d_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_nodelq30d_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_warrant_worst_status_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_warrant_worst_status_cur = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile1_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile1_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_fund_earliest_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fund_earliest_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_unclsed_org_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_unclsed_org_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_nodelqflg_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_nodelqflg_p6m = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_ovdamt_q90d_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_ovdamt_q90d_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_maxdlqtermamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_maxdlqtermamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_businessorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_businessorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_comp5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_comp5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_avg_useamt_in6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_avg_useamt_in6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_comp3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_comp3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_comp4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_comp4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_comp1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_comp1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_creditappr_cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_creditappr_cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_comp2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_comp2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_fund_ltstdpsit_amt_mthly".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fund_ltstdpsit_amt_mthly = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_500nodelqflg_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_500nodelqflg_p6m = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_ln_avgrp_in6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_ln_avgrp_in6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_lmtutlrate90up_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_lmtutlrate90up_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq1cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq1cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_comhs_accum_dlq1cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_comhs_accum_dlq1cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq2cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq2cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_total_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_total_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_housefundcompercent".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_housefundcompercent = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_mspj_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_mspj_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq2cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq2cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_accum_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_accum_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_accum_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_accum_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin2y_port".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin2y_port = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_postaddr".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_postaddr = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_amt_max".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_amt_max = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_gender".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_gender = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_credit_orgs".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_credit_orgs = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq1cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq1cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq1cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq1cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_avg_activelmt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_avg_activelmt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_noncarhouse_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_noncarhouse_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_specialtrade2_p5y".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_specialtrade2_p5y = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_loan_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_loan_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_rank".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_rank = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq1cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq1cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_unclred_avgdue_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_unclred_avgdue_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_identity_occupation".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_identity_occupation = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq1cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq1cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_creditappr_cnt_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_creditappr_cnt_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_rvlv_loan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_rvlv_loan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crd_orgnum_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crd_orgnum_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crd_orgnum_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crd_orgnum_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_bank_loan_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_bank_loan_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_lmtutlrate_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_lmtutlrate_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_scc_maxod_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_scc_maxod_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_else_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_else_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_mthly".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_mthly = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_consta_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_consta_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_homephone3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_homephone3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_basic_assetdsp_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_assetdsp_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_homephone4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_homephone4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_homephone5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_homephone5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_basic_bad_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_bad_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_credit_maxod_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_credit_maxod_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_car_1stopen_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_car_1stopen_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_orgs".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_orgs = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_qzzx_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_qzzx_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_otsunclsed_sum_crdlmt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_otsunclsed_sum_crdlmt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_nodelq90d_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_nodelq90d_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_homephone1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_homephone1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_ovdamt_q180d_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_ovdamt_q180d_p60m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_homephone2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_homephone2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_noncrhs_avgamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_noncrhs_avgamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp4_kind".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp4_kind = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin2y_merchant".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin2y_merchant = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_otherspayamtmonth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_otherspayamtmonth = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_consta_dlqcnt_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_consta_dlqcnt_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_maxdlqteramt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_maxdlqteramt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_maxdlqteramt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_maxdlqteramt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin2y_warrant".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin2y_warrant = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_latest_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_latest_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loanappr_cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loanappr_cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_accum_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_accum_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_spouse_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_spouse_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_maxdlqtermamt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_maxdlqtermamt_p12m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_maxdlqtermamt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_maxdlqtermamt_p24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_1stopenacct_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_1stopenacct_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_email".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_email = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_cur = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_xzcf_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_xzcf_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_num_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_num_p = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_cc_maxod_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_cc_maxod_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_repayments_pct".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_repayments_pct = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_unclsed_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_unclsed_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_sumloanamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_sumloanamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_update5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_update5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_amt_used".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_amt_used = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_max_dlqterm_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_max_dlqterm_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_update4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_update4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_bal_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_bal_p = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_num_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_num_e = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_if = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_car_cleared_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_car_cleared_if = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_guaranchkorg_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_guaranchkorg_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_bal_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_bal_e = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_scc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_scc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_max_dlqterm_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_max_dlqterm_cur = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_unclsed_sum_creditlmt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_unclsed_sum_creditlmt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_basic_bad_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_bad_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_1stopen_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_1stopen_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_collectionCnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_collectionCnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq2cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq2cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_house_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_house_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_basic_asset_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_basic_asset_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_amt_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_amt_p = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_othersorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_othersorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_utlrate85up_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_utlrate85up_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_lmtutlrate2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_lmtutlrate2 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile4_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile4_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_credit_mon".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_credit_mon = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_flgsccnodelq6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_flgsccnodelq6m = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_amt_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_amt_e = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_1stnormopenacct_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_1stnormopenacct_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_ccappr_cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_ccappr_cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_ccappr_cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_ccappr_cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_houseloan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_houseloan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_zlsqf_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_zlsqf_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_consta_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_consta_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile5_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile5_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_basic_loanovdue_maxmon".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_basic_loanovdue_maxmon = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_consta_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_consta_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_consta_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_consta_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_otherloan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_otherloan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_guaranchkorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_guaranchkorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_utlrate50up_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_utlrate50up_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_loan_amt_sum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_loan_amt_sum = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_fund_max_duration_byorg".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fund_max_duration_byorg = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_limit".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_limit = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_maxdlqtermamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_maxdlqtermamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loanappr_cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loanappr_cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlq_mths_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlq_mths_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_amt_min".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_amt_min = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_bal0up_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_bal0up_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_house_cnt_current".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_house_cnt_current = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_coll_credloan_his_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_coll_credloan_his_if = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_maxdlqtermamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_maxdlqtermamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_scc_amt_sum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_scc_amt_sum = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crd_orgnum_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crd_orgnum_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq2cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq2cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq2cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq2cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelq_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelq_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_unclred_bal_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_unclred_bal_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqamt_mthly".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqamt_mthly = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_1stopenacct_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_1stopenacct_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_noncrhs_orgcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_noncrhs_orgcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_due_amt_inst".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_due_amt_inst = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_record_if".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_record_if = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_work_status".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_work_status = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_credit_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_credit_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_car_cleared_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_car_cleared_mths = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_update5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_update5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_amt_min".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_amt_min = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_avg_creditlmt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_avg_creditlmt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_score".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_score = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_bgstate_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_bgstate_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_avg_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_avg_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_cur = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_amt_sum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_amt_sum = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_conti_dlqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_conti_dlqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_conti_dlqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_conti_dlqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin1m_self".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin1m_self = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_cc_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_cc_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_inq_numin1m_cc".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_numin1m_cc = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq2cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq2cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_worst_status_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_worst_status_cur = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_md_c_yq_ws_rl6_24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_md_c_yq_ws_rl6_24m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_dlq_accts".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_dlq_accts = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_update1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_update1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_update2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_update2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_update3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_update3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_hfund_update4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_hfund_update4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_consta_dlqcnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_consta_dlqcnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_utlzed_creditline".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_utlzed_creditline = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_maxdlqtermamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_maxdlqtermamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq2cnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq2cnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_house_accum_dlq2cnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_house_accum_dlq2cnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_identity_education".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_identity_education = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlqamt_cur".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlqamt_cur = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_maxdlqtermamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_maxdlqtermamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_rvlv_loan_amt_sum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_rvlv_loan_amt_sum = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_nrvlv_loan_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_nrvlv_loan_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_loan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_loan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqterm_p60m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqterm_p60m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_specialtrade_p5y".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_specialtrade_p5y = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_nrvlv_loan_maxod_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_nrvlv_loan_maxod_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_inq_orgsin1m_loan".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_orgsin1m_loan = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_loan_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_loan_mth = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_pub_tax_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_pub_tax_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_fellback_sum_cnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_fellback_sum_cnt = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_maxdlqtermamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_maxdlqtermamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_nrvlv_loan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_nrvlv_loan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_inq_orgsin1m_cc".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_inq_orgsin1m_cc = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_decision_code".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_decision_code = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_scc_1st_mth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_scc_1st_mth = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_unclsed_avgutllmt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_unclsed_avgutllmt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_cc_avg_useamt_in6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_cc_avg_useamt_in6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_addr5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_addr5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_reside_addr4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_addr4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_reside_addr1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_addr1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_acct_nrvlv_credit_amt_sum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_nrvlv_credit_amt_sum = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelqcnt_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelqcnt_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_addr3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_addr3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_nodelqcnt_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_nodelqcnt_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_reside_addr2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_reside_addr2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_guarantee_sum_balance".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_guarantee_sum_balance = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_max_dlqamt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_max_dlqamt_p3m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_rvlv_loan_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_rvlv_loan_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlqcnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlqcnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_busiloan_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_busiloan_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_edulevel".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_edulevel = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_amt_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_amt_e = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_accum_dlq2cnt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_accum_dlq2cnt_p6m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_dlq_mths_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_dlq_mths_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_warrant_amt_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_warrant_amt_p = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_fammerorg_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_fammerorg_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_career_comp2_kind".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_career_comp2_kind = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_max_dlqterm_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_max_dlqterm_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_acct_rvlv_loan_orgs".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_acct_rvlv_loan_orgs = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_accum_dlq2cnt_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_accum_dlq2cnt_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_cc_num".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_cc_num = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_creditblank_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_creditblank_flag = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_scc_bgstate_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_scc_bgstate_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_credit_ltest_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_credit_ltest_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_md_l_cnt_l3_12".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_md_l_cnt_l3_12 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_num_p".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_num_p = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile5".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile5 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loanappr_cnt_p1m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loanappr_cnt_p1m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_credit_all_1stopen_mths".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_credit_all_1stopen_mths = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_identy_mobile4".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_identy_mobile4 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pbocv_cc_maxdlqtermamt_p6m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_cc_maxdlqtermamt_p6m = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pboc_related_duty_num_e".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_related_duty_num_e = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_loan_zdgbstate_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_loan_zdgbstate_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pboc_od_rvlv_loan_maxod_amt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pboc_od_rvlv_loan_maxod_amt = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_crd_orgnum_p3m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_crd_orgnum_p3m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_md_culmt_pctp16".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_md_culmt_pctp16 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loan_orgnum_p24m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loan_orgnum_p24m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("pbocv_query_loan_orgnum_p12m".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T07_Pboc_Info.pbocv_query_loan_orgnum_p12m = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_Info(input$T08_ExternalData_Info T08_ExternalData_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 12;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("T088_Fh_Detail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T088_Fh_Detail = new input$T08_ExternalData_Info$T088_Fh_Detail();
                fillInputT08_ExternalData_InfoT088_Fh_Detail(T08_ExternalData_Info.T088_Fh_Detail, jsonParser);
		        attrNeedCnt--;
		    } else if ("T081_Ficoscore_Detail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T081_Ficoscore_Detail = new input$T08_ExternalData_Info$T081_Ficoscore_Detail();
                fillInputT08_ExternalData_InfoT081_Ficoscore_Detail(T08_ExternalData_Info.T081_Ficoscore_Detail, jsonParser);
		        attrNeedCnt--;
		    } else if ("T082_Td_Detail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T082_Td_Detail = new input$T08_ExternalData_Info$T082_Td_Detail();
                fillInputT08_ExternalData_InfoT082_Td_Detail(T08_ExternalData_Info.T082_Td_Detail, jsonParser);
		        attrNeedCnt--;
		    } else if ("T0811_BadPeopleDetailAction".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T0811_BadPeopleDetailAction = new input$T08_ExternalData_Info$T0811_BadPeopleDetailAction();
                fillInputT08_ExternalData_InfoT0811_BadPeopleDetailAction(T08_ExternalData_Info.T0811_BadPeopleDetailAction, jsonParser);
		        attrNeedCnt--;
		    } else if ("T085_Br_Als".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T085_Br_Als = new input$T08_ExternalData_Info$T085_Br_Als();
                fillInputT08_ExternalData_InfoT085_Br_Als(T08_ExternalData_Info.T085_Br_Als, jsonParser);
		        attrNeedCnt--;
		    } else if ("T087_Tel_Auth".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T087_Tel_Auth = new input$T08_ExternalData_Info$T087_Tel_Auth();
                fillInputT08_ExternalData_InfoT087_Tel_Auth(T08_ExternalData_Info.T087_Tel_Auth, jsonParser);
		        attrNeedCnt--;
		    } else if ("T085_Br_Alu".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T085_Br_Alu = new input$T08_ExternalData_Info$T085_Br_Alu();
                fillInputT08_ExternalData_InfoT085_Br_Alu(T08_ExternalData_Info.T085_Br_Alu, jsonParser);
		        attrNeedCnt--;
		    } else if ("T083_Dxm_Risk".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T083_Dxm_Risk = new input$T08_ExternalData_Info$T083_Dxm_Risk();
                fillInputT08_ExternalData_InfoT083_Dxm_Risk(T08_ExternalData_Info.T083_Dxm_Risk, jsonParser);
		        attrNeedCnt--;
		    } else if ("T087_Tel_Period".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T087_Tel_Period = new input$T08_ExternalData_Info$T087_Tel_Period();
                fillInputT08_ExternalData_InfoT087_Tel_Period(T08_ExternalData_Info.T087_Tel_Period, jsonParser);
		        attrNeedCnt--;
		    } else if ("T089_Bhzx_Speciallist".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T089_Bhzx_Speciallist = new input$T08_ExternalData_Info$T089_Bhzx_Speciallist();
                fillInputT08_ExternalData_InfoT089_Bhzx_Speciallist(T08_ExternalData_Info.T089_Bhzx_Speciallist, jsonParser);
		        attrNeedCnt--;
		    } else if ("T087_Tel_State".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T087_Tel_State = new input$T08_ExternalData_Info$T087_Tel_State();
                fillInputT08_ExternalData_InfoT087_Tel_State(T08_ExternalData_Info.T087_Tel_State, jsonParser);
		        attrNeedCnt--;
		    } else if ("T085_Br_Speciallist".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T08_ExternalData_Info.T085_Br_Speciallist = new input$T08_ExternalData_Info$T085_Br_Speciallist();
                fillInputT08_ExternalData_InfoT085_Br_Speciallist(T08_ExternalData_Info.T085_Br_Speciallist, jsonParser);
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT085_Br_Speciallist(input$T08_ExternalData_Info$T085_Br_Speciallist T085_Br_Speciallist, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 13;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("br_spl_bank_bad".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_bank_bad = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_bank_fraud".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_bank_fraud = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_nbank_odue".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_nbank_odue = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_nbank_lost".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_nbank_lost = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_nbank_fraud".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_nbank_fraud = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_bank_lost".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_bank_lost = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_bank_odue".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_bank_odue = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_nbank_refuse".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_nbank_refuse = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_speciallist_full_response".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_speciallist_full_response = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_nbank_bad".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_nbank_bad = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_speciallist_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_speciallist_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_flag_speciallist_c".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_flag_speciallist_c = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("br_spl_bank_refuse".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Speciallist.br_spl_bank_refuse = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT087_Tel_State(input$T08_ExternalData_Info$T087_Tel_State T087_Tel_State, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 2;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("tel_state_code".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_State.tel_state_code = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("tel_state_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_State.tel_state_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT089_Bhzx_Speciallist(input$T08_ExternalData_Info$T089_Bhzx_Speciallist T089_Bhzx_Speciallist, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 5;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("bhzx_p2pescapedebtstatus".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T089_Bhzx_Speciallist.bhzx_p2pescapedebtstatus = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("bhzx_supremecourtexecutedstat".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T089_Bhzx_Speciallist.bhzx_supremecourtexecutedstat = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("bhzx_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T089_Bhzx_Speciallist.bhzx_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("bhzx_multipartyloanstatus".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T089_Bhzx_Speciallist.bhzx_multipartyloanstatus = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("bhzx_maxoverduestatus".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T089_Bhzx_Speciallist.bhzx_maxoverduestatus = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT087_Tel_Period(input$T08_ExternalData_Info$T087_Tel_Period T087_Tel_Period, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 2;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("tel_period_value".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_Period.tel_period_value = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("tel_period_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_Period.tel_period_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT083_Dxm_Risk(input$T08_ExternalData_Info$T083_Dxm_Risk T083_Dxm_Risk, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 7;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("dxm_risk_result".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_result = new ArrayList();
    		    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
		        	String ___dxm_risk_result = jsonParser.getText();
                    T083_Dxm_Risk.dxm_risk_result.add(___dxm_risk_result);;
		        }
		        attrNeedCnt--;
		    } else if ("dxm_risk_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("dxm_risk_blackreason".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_blackreason = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("dxm_risk_retmsg".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_retmsg = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("dxm_risk_blackdetail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_blackdetail = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("dxm_risk_blacklevel".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_blacklevel = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("dxm_risk_retcode".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T083_Dxm_Risk.dxm_risk_retcode = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT085_Br_Alu(input$T08_ExternalData_Info$T085_Br_Alu T085_Br_Alu, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 15;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("br_alu_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m3_cell_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m3_cell_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m6_cell_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m6_cell_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m1_id_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m1_id_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m1_cell_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m1_cell_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m6_cell_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m6_cell_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m3_id_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m3_id_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m6_id_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m6_id_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m3_id_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m3_id_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m12_id_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m12_id_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m6_id_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m6_id_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m12_cell_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m12_cell_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m3_cell_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m3_cell_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m12_cell_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m12_cell_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_alu_m12_id_tot_monnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Alu.br_alu_m12_id_tot_monnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT087_Tel_Auth(input$T08_ExternalData_Info$T087_Tel_Auth T087_Tel_Auth, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 2;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("tel_auth_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_Auth.tel_auth_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("tel_auth_code".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T087_Tel_Auth.tel_auth_code = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT085_Br_Als(input$T08_ExternalData_Info$T085_Br_Als T085_Br_Als, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 9;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("br_als_m3_cell_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m3_cell_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m1_id_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m1_id_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m1_cell_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m1_cell_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m12_cell_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m12_cell_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m6_cell_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m6_cell_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m12_id_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m12_id_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m3_id_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m3_id_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("br_als_m6_id_nbank_orgnum".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T085_Br_Als.br_als_m6_id_nbank_orgnum = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT0811_BadPeopleDetailAction(input$T08_ExternalData_Info$T0811_BadPeopleDetailAction T0811_BadPeopleDetailAction, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 8;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("BPD_zt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_zt = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("BPD_xd".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_xd = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("BPD_sd".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_sd = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("BPD_casetime".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_casetime = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("BPD_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("BPD_code".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_code = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("BPD_wfxw".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_wfxw = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("BPD_casecnt".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T0811_BadPeopleDetailAction.BPD_casecnt = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT082_Td_Detail(input$T08_ExternalData_Info$T082_Td_Detail T082_Td_Detail, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 4;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("td_ruleid_list".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T082_Td_Detail.td_ruleid_list = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("td_riskname_list".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T082_Td_Detail.td_riskname_list = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("td_score_list".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T082_Td_Detail.td_score_list = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("td_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T082_Td_Detail.td_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT081_Ficoscore_Detail(input$T08_ExternalData_Info$T081_Ficoscore_Detail T081_Ficoscore_Detail, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 5;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("fico_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T081_Ficoscore_Detail.fico_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("fico_score".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T081_Ficoscore_Detail.fico_score = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("fico_reasoncode".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T081_Ficoscore_Detail.fico_reasoncode = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("fico_state".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T081_Ficoscore_Detail.fico_state = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("fico_onestoptxid".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T081_Ficoscore_Detail.fico_onestoptxid = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT08_ExternalData_InfoT088_Fh_Detail(input$T08_ExternalData_Info$T088_Fh_Detail T088_Fh_Detail, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 3;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("fahai_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T088_Fh_Detail.fahai_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("fahai_full_response".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T088_Fh_Detail.fahai_full_response = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("fahai_matchratio_list".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T088_Fh_Detail.fahai_matchratio_list = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT02_Inbk_Account(input$T02_Inbk_Account T02_Inbk_Account, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 2;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("T021_Inbk_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T02_Inbk_Account.T021_Inbk_Info = new input$T02_Inbk_Account$T021_Inbk_Info();
                fillInputT02_Inbk_AccountT021_Inbk_Info(T02_Inbk_Account.T021_Inbk_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T022_Inbk_BlackList".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T02_Inbk_Account.T022_Inbk_BlackList = new input$T02_Inbk_Account$T022_Inbk_BlackList();
                fillInputT02_Inbk_AccountT022_Inbk_BlackList(T02_Inbk_Account.T022_Inbk_BlackList, jsonParser);
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT02_Inbk_AccountT022_Inbk_BlackList(input$T02_Inbk_Account$T022_Inbk_BlackList T022_Inbk_BlackList, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 2;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("inbk_blacklist_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T022_Inbk_BlackList.inbk_blacklist_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_blacklist_type".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T022_Inbk_BlackList.inbk_blacklist_type = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT02_Inbk_AccountT021_Inbk_Info(input$T02_Inbk_Account$T021_Inbk_Info T021_Inbk_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 16;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("inbk_current_overdue_amount".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_current_overdue_amount = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("inbk_last_credit_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_last_credit_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("inbk_last_loan_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_last_loan_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("inbk_user_credit_limit".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_user_credit_limit = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("inbk_is_current_overdue".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_is_current_overdue = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_prdt_credit_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_prdt_credit_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("inbk_first_application_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_first_application_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_current_overdue_days".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_current_overdue_days = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_first_loan_date".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_first_loan_date = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("inbk_current_remain_principal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_current_remain_principal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("inbk_30day_reject_times".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_30day_reject_times = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_history_max_days_overdue".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_history_max_days_overdue = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_user_account_status".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_user_account_status = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_approved_before_flag".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_approved_before_flag = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("inbk_prdt_credit_limit".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_prdt_credit_limit = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("inbk_user_credit_bal".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T021_Inbk_Info.inbk_user_credit_bal = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputDSWorkflow(input$DSWorkflow DSWorkflow, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 3;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("state".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        DSWorkflow.state = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("next_ds_codes".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        DSWorkflow.next_ds_codes = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("step_no".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        DSWorkflow.step_no = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_Info(input$T01_Apply_Info T01_Apply_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 7;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("T012_Idcard_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T012_Idcard_Info = new input$T01_Apply_Info$T012_Idcard_Info();
                fillInputT01_Apply_InfoT012_Idcard_Info(T01_Apply_Info.T012_Idcard_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T013_Bankcard_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T013_Bankcard_Info = new input$T01_Apply_Info$T013_Bankcard_Info();
                fillInputT01_Apply_InfoT013_Bankcard_Info(T01_Apply_Info.T013_Bankcard_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T014_Facerecog_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T014_Facerecog_Info = new input$T01_Apply_Info$T014_Facerecog_Info();
                fillInputT01_Apply_InfoT014_Facerecog_Info(T01_Apply_Info.T014_Facerecog_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T011_Cus_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T011_Cus_Info = new input$T01_Apply_Info$T011_Cus_Info();
                fillInputT01_Apply_InfoT011_Cus_Info(T01_Apply_Info.T011_Cus_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T015_Credit_Info".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T015_Credit_Info = new input$T01_Apply_Info$T015_Credit_Info();
                fillInputT01_Apply_InfoT015_Credit_Info(T01_Apply_Info.T015_Credit_Info, jsonParser);
		        attrNeedCnt--;
		    } else if ("T017_Platform_DecisionInfo".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T017_Platform_DecisionInfo = new input$T01_Apply_Info$T017_Platform_DecisionInfo();
                fillInputT01_Apply_InfoT017_Platform_DecisionInfo(T01_Apply_Info.T017_Platform_DecisionInfo, jsonParser);
		        attrNeedCnt--;
		    } else if ("T016_Apply_Derivate".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T01_Apply_Info.T016_Apply_Derivate = new input$T01_Apply_Info$T016_Apply_Derivate();
                fillInputT01_Apply_InfoT016_Apply_Derivate(T01_Apply_Info.T016_Apply_Derivate, jsonParser);
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT016_Apply_Derivate(input$T01_Apply_Info$T016_Apply_Derivate T016_Apply_Derivate, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 6;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("appdrv_regaddr_city".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_regaddr_city = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appdrv_mobile_city".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_mobile_city = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appdrv_telphone_city".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_telphone_city = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appdrv_regaddr_prov".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_regaddr_prov = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appdrv_mobile_prov".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_mobile_prov = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appdrv_telphone_prov".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T016_Apply_Derivate.appdrv_telphone_prov = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT017_Platform_DecisionInfo(input$T01_Apply_Info$T017_Platform_DecisionInfo T017_Platform_DecisionInfo, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 71;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("platform_reserved_dou1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_dou1 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("mobileInfo".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.mobileInfo = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("platform_reserved_dou2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_dou2 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("platform_reserved_str3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_str3 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("platform_reserved_str2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_str2 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("platform_reserved_dou3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_dou3 = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("riskGrade".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.riskGrade = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("platform_reserved_str1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_str1 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("student_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.student_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("whole_power".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.whole_power = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("customerStickiness".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.customerStickiness = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("institutionType".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.institutionType = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("pay_type".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.pay_type = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("destination_tendency".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.destination_tendency = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("creditRating".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.creditRating = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("RM1025".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1025 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1024".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1024 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1021".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1021 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1020".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1020 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1023".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1023 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1022".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1022 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("occupation".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.occupation = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1018".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1018 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1017".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1017 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1019".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1019 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1014".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1014 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1013".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1013 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("order_platform".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.order_platform = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("RM1016".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1016 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("odc_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.odc_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("RM1015".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1015 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1010".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1010 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1012".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1012 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1011".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1011 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("education".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.education = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("platform_reserved_int1".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_int1 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("platform_reserved_int2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_int2 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("platform_reserved_int3".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.platform_reserved_int3 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1007".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1007 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1006".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1006 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1009".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1009 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1008".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1008 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1003".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1003 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1002".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1002 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1005".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1005 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1004".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1004 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM1001".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM1001 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("family_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.family_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("price_sensitive".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.price_sensitive = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("flight_airport_tendency".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.flight_airport_tendency = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("RM0010".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0010 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0009".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0009 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0005".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0005 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0006".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0006 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0007".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0007 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0008".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0008 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0001".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0001 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0002".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0002 = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("RM0003".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0003 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("RM0004".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.RM0004 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("car_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.car_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("consumer_stability".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.consumer_stability = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("loanAppRating".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.loanAppRating = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("rest_regular".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.rest_regular = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("vacation_day_desire".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.vacation_day_desire = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("plan_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.plan_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("pbocQuery".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.pbocQuery = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("loanAppRating2".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.loanAppRating2 = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("city_stable".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.city_stable = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("house_prob".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.house_prob = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("login_period".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T017_Platform_DecisionInfo.login_period = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT015_Credit_Info(input$T01_Apply_Info$T015_Credit_Info T015_Credit_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 7;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("app_withdrawamount".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_withdrawamount = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("app_creditid".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_creditid = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("app_creditrate".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_creditrate = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("app_creditlimit".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_creditlimit = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("app_totalperiod".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_totalperiod = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("app_eventtype".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_eventtype = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("app_repaytype".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T015_Credit_Info.app_repaytype = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT011_Cus_Info(input$T01_Apply_Info$T011_Cus_Info T011_Cus_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 23;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("applist_occupation".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_occupation = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact2_relation".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact2_relation = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_company".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_company = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_company_telephone".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_company_telephone = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_res_addr_detail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_res_addr_detail = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact2_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact2_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_education_degree".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_education_degree = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_comp_addr_city".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_comp_addr_city = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_comp_addr_prov".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_comp_addr_prov = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_res_addr_district".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_res_addr_district = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact2_name".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact2_name = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_name".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_name = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact1_name".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact1_name = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_income".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_income = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_res_addr_prov".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_res_addr_prov = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_comp_addr_detail".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_comp_addr_detail = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_res_addr_city".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_res_addr_city = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_industry".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_industry = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_comp_addr_district".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_comp_addr_district = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact1_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact1_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_contact1_relation".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_contact1_relation = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_marital_state".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T011_Cus_Info.applist_marital_state = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT014_Facerecog_Info(input$T01_Apply_Info$T014_Facerecog_Info T014_Facerecog_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 4;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("f_facerecog_fail_count".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T014_Facerecog_Info.f_facerecog_fail_count = jsonParser.getIntValue();
		        attrNeedCnt--;
		    } else if ("f_facerecog_score".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T014_Facerecog_Info.f_facerecog_score = new BigDecimal(jsonParser.getDoubleValue()).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		        attrNeedCnt--;
		    } else if ("f_facerecog_result".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T014_Facerecog_Info.f_facerecog_result = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("f_facerecog_trial_count".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T014_Facerecog_Info.f_facerecog_trial_count = jsonParser.getIntValue();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT013_Bankcard_Info(input$T01_Apply_Info$T013_Bankcard_Info T013_Bankcard_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 4;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("appcrd_card_no".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T013_Bankcard_Info.appcrd_card_no = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appcrd_mobile".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T013_Bankcard_Info.appcrd_mobile = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appcrd_bank_name".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T013_Bankcard_Info.appcrd_bank_name = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("appcrd_name".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T013_Bankcard_Info.appcrd_name = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

    private void fillInputT01_Apply_InfoT012_Idcard_Info(input$T01_Apply_Info$T012_Idcard_Info T012_Idcard_Info, JsonParser jsonParser) throws Exception {
        int attrNeedCnt = 6;
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            if(attrNeedCnt <= 0) {
                continue;
            }
            String fieldName = jsonParser.getCurrentName();
            if ("applist_regaddr".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_regaddr = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_id_enddate".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_id_enddate = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_id_nbr".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_id_nbr = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_id_issuing_authority".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_id_issuing_authority = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_id_nationality".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_id_nationality = jsonParser.getText();
		        attrNeedCnt--;
		    } else if ("applist_id_type".equals(fieldName)) {
		        if(Objects.equals(jsonParser.currentToken(), JsonToken.FIELD_NAME)){
			        jsonParser.nextToken();
		        }
		        T012_Idcard_Info.applist_id_type = jsonParser.getText();
		        attrNeedCnt--;
		    }
            else if (fieldName == null) {
                jsonParser.nextToken();
            } else {
                jsonParser = jsonParser.skipChildren();
                jsonParser.nextToken();
            }
        }
    }

}
