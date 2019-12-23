package com.hyrc99.projectByL.activity.badBehaviorDel.bean;

import com.hyrc99.projectByL.activity.search.bean.BaseBean;

/**
 * @description 作用:不良行为 详情Bean
 * @date: 2019/10/31
 * @author: 卢融霜
 */
public class BadBean {

    /**
     * code : 1 msg : 获取成功 data : {"ID":158,"BADID":158,"FRM":null,"COMID":null,"NAME":"辽宁金泽建设工程有限公司","MAINOBJ":"施工单位","BHTYPE":"质量安全","BHCD":"4-3-07","BHBAD":"在承担昌图县金山水库除险加固工程施工中，存在干砌石厚度不满足设计要求等行为，责令其限期整改，造成施工滞后。","BDARD":"《水利工程质量管理规定》水利部令第7号、《辽宁省水利建设市场主体不良行为认定及处理办法（试行）》（辽水建管【2013】240）","DDESI":"通报批评","DORGAN":"辽宁省水利厅","CORGAN":"昌图县水利局
     * 辽宁省水利厅","TEXTID":"辽水建管【2019】184","DTIME":"2019-06-28","VTIME":"2020-06-27","PTIME":"2019-07-29","DSCRPT":"核定该单位违规失信行为为一般不良行为，扣减辽宁水利信用平台初始分值1份，并在辽宁水利信用平台予以公告。","SCORE":null,"COMMENT":null,"STATUS":null}
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

    public static class DataBean extends BaseBean {
        /**
         * ID : 158 BADID : 158 FRM : null COMID : null NAME : 辽宁金泽建设工程有限公司 MAINOBJ : 施工单位 BHTYPE :
         * 质量安全 BHCD : 4-3-07 BHBAD : 在承担昌图县金山水库除险加固工程施工中，存在干砌石厚度不满足设计要求等行为，责令其限期整改，造成施工滞后。 BDARD :
         * 《水利工程质量管理规定》水利部令第7号、《辽宁省水利建设市场主体不良行为认定及处理办法（试行）》（辽水建管【2013】240） DDESI : 通报批评 DORGAN :
         * 辽宁省水利厅 CORGAN : 昌图县水利局 辽宁省水利厅 TEXTID : 辽水建管【2019】184 DTIME : 2019-06-28 VTIME :
         * 2020-06-27 PTIME : 2019-07-29 DSCRPT : 核定该单位违规失信行为为一般不良行为，扣减辽宁水利信用平台初始分值1份，并在辽宁水利信用平台予以公告。
         * SCORE : null COMMENT : null STATUS : null
         */

        private int ID;
        private int BADID;
        private Object FRM;
        private Object COMID;
        private String NAME;
        private String MAINOBJ;
        private String BHTYPE;
        private String BHCD;
        private String BHBAD;
        private String BDARD;
        private String DDESI;
        private String DORGAN;
        private String CORGAN;
        private String TEXTID;
        private String DTIME;
        private String VTIME;
        private String PTIME;
        private String DSCRPT;
        private Object SCORE;
        private Object COMMENT;
        private Object STATUS;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getBADID() {
            return BADID;
        }

        public void setBADID(int BADID) {
            this.BADID = BADID;
        }

        public Object getFRM() {
            return FRM;
        }

        public void setFRM(Object FRM) {
            this.FRM = FRM;
        }

        public Object getCOMID() {
            return COMID;
        }

        public void setCOMID(Object COMID) {
            this.COMID = COMID;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public String getMAINOBJ() {
            return MAINOBJ;
        }

        public void setMAINOBJ(String MAINOBJ) {
            this.MAINOBJ = MAINOBJ;
        }

        public String getBHTYPE() {
            return BHTYPE;
        }

        public void setBHTYPE(String BHTYPE) {
            this.BHTYPE = BHTYPE;
        }

        public String getBHCD() {
            return BHCD;
        }

        public void setBHCD(String BHCD) {
            this.BHCD = BHCD;
        }

        public String getBHBAD() {
            return BHBAD;
        }

        public void setBHBAD(String BHBAD) {
            this.BHBAD = BHBAD;
        }

        public String getBDARD() {
            return BDARD;
        }

        public void setBDARD(String BDARD) {
            this.BDARD = BDARD;
        }

        public String getDDESI() {
            return DDESI;
        }

        public void setDDESI(String DDESI) {
            this.DDESI = DDESI;
        }

        public String getDORGAN() {
            return DORGAN;
        }

        public void setDORGAN(String DORGAN) {
            this.DORGAN = DORGAN;
        }

        public String getCORGAN() {
            return CORGAN;
        }

        public void setCORGAN(String CORGAN) {
            this.CORGAN = CORGAN;
        }

        public String getTEXTID() {
            return TEXTID;
        }

        public void setTEXTID(String TEXTID) {
            this.TEXTID = TEXTID;
        }

        public String getDTIME() {
            return DTIME;
        }

        public void setDTIME(String DTIME) {
            this.DTIME = DTIME;
        }

        public String getVTIME() {
            return VTIME;
        }

        public void setVTIME(String VTIME) {
            this.VTIME = VTIME;
        }

        public String getPTIME() {
            return PTIME;
        }

        public void setPTIME(String PTIME) {
            this.PTIME = PTIME;
        }

        public String getDSCRPT() {
            return DSCRPT;
        }

        public void setDSCRPT(String DSCRPT) {
            this.DSCRPT = DSCRPT;
        }

        public Object getSCORE() {
            return SCORE;
        }

        public void setSCORE(Object SCORE) {
            this.SCORE = SCORE;
        }

        public Object getCOMMENT() {
            return COMMENT;
        }

        public void setCOMMENT(Object COMMENT) {
            this.COMMENT = COMMENT;
        }

        public Object getSTATUS() {
            return STATUS;
        }

        public void setSTATUS(Object STATUS) {
            this.STATUS = STATUS;
        }

        @Override
        public int getBeanId() {
            return ID;
        }
    }
}
