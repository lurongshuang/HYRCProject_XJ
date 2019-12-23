package com.hyrc99.projectByL.activity.company.bean;

import java.util.List;

/**
 * @description 作用: 单位资质 bean
 * @date: 2019/11/6
 * @author: 卢融霜
 */
public class QualificationsBase {

    /**
     * code : 1
     * msg : 获取成功
     * data : [{"APVM":"勘察","SPECTY":"工程勘察专业资质","GRADE":"乙级","VTIME":"2020-06-30","CERTID":"B221009861"},{"APVM":"设计","SPECTY":"工程设计行业资质","GRADE":"乙级","VTIME":"2021-11-10","CERTID":"A121009864"}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * APVM : 勘察
         * SPECTY : 工程勘察专业资质
         * GRADE : 乙级
         * VTIME : 2020-06-30
         * CERTID : B221009861
         */

        private String APVM;
        private String SPECTY;
        private String GRADE;
        private String VTIME;
        private String CERTID;

        public String getAPVM() {
            return APVM;
        }

        public void setAPVM(String APVM) {
            this.APVM = APVM;
        }

        public String getSPECTY() {
            return SPECTY;
        }

        public void setSPECTY(String SPECTY) {
            this.SPECTY = SPECTY;
        }

        public String getGRADE() {
            return GRADE;
        }

        public void setGRADE(String GRADE) {
            this.GRADE = GRADE;
        }

        public String getVTIME() {
            return VTIME;
        }

        public void setVTIME(String VTIME) {
            this.VTIME = VTIME;
        }

        public String getCERTID() {
            return CERTID;
        }

        public void setCERTID(String CERTID) {
            this.CERTID = CERTID;
        }
    }
}
