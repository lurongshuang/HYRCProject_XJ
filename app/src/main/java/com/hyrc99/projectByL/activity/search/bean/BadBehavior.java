package com.hyrc99.projectByL.activity.search.bean;

import java.util.List;

/**
 * 不良行为Bean
 */
public class BadBehavior{

    /**
     * code : 1 msg : 获取成功 data : {"total":73,"rows":[{"ID":158,"BADID":158,"FRM":null,"COMID":null,"NAME":"辽宁金泽建设工程有限公司","MAINOBJ":"施工单位","BHTYPE":"质量安全","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2020-06-27","PTIME":"2019-07-29","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null},{"ID":159,"BADID":157,"FRM":null,"COMID":null,"NAME":"铁岭北方水利建设工程有限公司","MAINOBJ":"施工单位","BHTYPE":"质量安全","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2020-06-27","PTIME":"2019-07-29","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null},{"ID":93,"BADID":797,"FRM":null,"COMID":null,"NAME":"四川金旭顺建筑工程有限公司","MAINOBJ":"施工单位","BHTYPE":"其他","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2019-12-29
     * 0:00:00","PTIME":"2017-06-30","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null}],"footer":[]}
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
         * total : 73 rows : [{"ID":158,"BADID":158,"FRM":null,"COMID":null,"NAME":"辽宁金泽建设工程有限公司","MAINOBJ":"施工单位","BHTYPE":"质量安全","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2020-06-27","PTIME":"2019-07-29","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null},{"ID":159,"BADID":157,"FRM":null,"COMID":null,"NAME":"铁岭北方水利建设工程有限公司","MAINOBJ":"施工单位","BHTYPE":"质量安全","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2020-06-27","PTIME":"2019-07-29","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null},{"ID":93,"BADID":797,"FRM":null,"COMID":null,"NAME":"四川金旭顺建筑工程有限公司","MAINOBJ":"施工单位","BHTYPE":"其他","BHCD":null,"BHBAD":null,"BDARD":null,"DDESI":null,"DORGAN":null,"CORGAN":null,"TEXTID":null,"DTIME":null,"VTIME":"2019-12-29
         * 0:00:00","PTIME":"2017-06-30","DSCRPT":null,"SCORE":null,"COMMENT":null,"STATUS":null}]
         * footer : []
         */

        private int total;
        private List<RowsBean> rows;
        private List<?> footer;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public List<?> getFooter() {
            return footer;
        }

        public void setFooter(List<?> footer) {
            this.footer = footer;
        }

        public static class RowsBean extends BaseBean {
            /**
             * ID : 158 BADID : 158 FRM : null COMID : null NAME : 辽宁金泽建设工程有限公司 MAINOBJ : 施工单位
             * BHTYPE : 质量安全 BHCD : null BHBAD : null BDARD : null DDESI : null DORGAN : null CORGAN
             * : null TEXTID : null DTIME : null VTIME : 2020-06-27 PTIME : 2019-07-29 DSCRPT : null
             * SCORE : null COMMENT : null STATUS : null
             */

            private int ID;
            private int BADID;
            private Object FRM;
            private Object COMID;
            private String NAME;
            private String MAINOBJ;
            private String BHTYPE;
            private Object BHCD;
            private Object BHBAD;
            private Object BDARD;
            private Object DDESI;
            private Object DORGAN;
            private Object CORGAN;
            private Object TEXTID;
            private Object DTIME;
            private String VTIME;
            private String PTIME;
            private Object DSCRPT;
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

            public Object getBHCD() {
                return BHCD;
            }

            public void setBHCD(Object BHCD) {
                this.BHCD = BHCD;
            }

            public Object getBHBAD() {
                return BHBAD;
            }

            public void setBHBAD(Object BHBAD) {
                this.BHBAD = BHBAD;
            }

            public Object getBDARD() {
                return BDARD;
            }

            public void setBDARD(Object BDARD) {
                this.BDARD = BDARD;
            }

            public Object getDDESI() {
                return DDESI;
            }

            public void setDDESI(Object DDESI) {
                this.DDESI = DDESI;
            }

            public Object getDORGAN() {
                return DORGAN;
            }

            public void setDORGAN(Object DORGAN) {
                this.DORGAN = DORGAN;
            }

            public Object getCORGAN() {
                return CORGAN;
            }

            public void setCORGAN(Object CORGAN) {
                this.CORGAN = CORGAN;
            }

            public Object getTEXTID() {
                return TEXTID;
            }

            public void setTEXTID(Object TEXTID) {
                this.TEXTID = TEXTID;
            }

            public Object getDTIME() {
                return DTIME;
            }

            public void setDTIME(Object DTIME) {
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

            public Object getDSCRPT() {
                return DSCRPT;
            }

            public void setDSCRPT(Object DSCRPT) {
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
}
