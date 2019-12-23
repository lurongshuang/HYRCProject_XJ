package com.hyrc99.projectByL.activity.company.bean;

/**
 * @description 作用:单位基本信息 bean
 * @date: 2019/11/6
 * @author: 卢融霜
 */
public class ComPanyDelBean {


    /**
     * code : 1
     * msg : 获取成功
     * data : {"UNITNAME":"凌源市水利建筑勘测设计院","ADDRESS":"辽宁省朝阳市","REGCAP":81.5,"SETIME":"1981-01-01","ENRID":"122113824650103643","ENRJG":"辽宁省住房和城乡建设厅","REGADD":"凌源市南大街南段2c-11号","MANRAG":"水利行业（水库枢纽、灌溉排涝、河道整治）"}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * UNITNAME : 凌源市水利建筑勘测设计院
         * ADDRESS : 辽宁省朝阳市
         * REGCAP : 81.5
         * SETIME : 1981-01-01
         * ENRID : 122113824650103643
         * ENRJG : 辽宁省住房和城乡建设厅
         * REGADD : 凌源市南大街南段2c-11号
         * MANRAG : 水利行业（水库枢纽、灌溉排涝、河道整治）
         */

        private String UNITNAME;
        private String ADDRESS;
        private String REGCAP;
        private String SETIME;
        private String ENRID;
        private String ENRJG;
        private String REGADD;
        private String MANRAG;

        public String getUNITNAME() {
            return UNITNAME;
        }

        public void setUNITNAME(String UNITNAME) {
            this.UNITNAME = UNITNAME;
        }

        public String getADDRESS() {
            return ADDRESS;
        }

        public void setADDRESS(String ADDRESS) {
            this.ADDRESS = ADDRESS;
        }

        public String getREGCAP() {
            return REGCAP;
        }

        public void setREGCAP(String REGCAP) {
            this.REGCAP = REGCAP;
        }

        public String getSETIME() {
            return SETIME;
        }

        public void setSETIME(String SETIME) {
            this.SETIME = SETIME;
        }

        public String getENRID() {
            return ENRID;
        }

        public void setENRID(String ENRID) {
            this.ENRID = ENRID;
        }

        public String getENRJG() {
            return ENRJG;
        }

        public void setENRJG(String ENRJG) {
            this.ENRJG = ENRJG;
        }

        public String getREGADD() {
            return REGADD;
        }

        public void setREGADD(String REGADD) {
            this.REGADD = REGADD;
        }

        public String getMANRAG() {
            return MANRAG;
        }

        public void setMANRAG(String MANRAG) {
            this.MANRAG = MANRAG;
        }
    }
}
