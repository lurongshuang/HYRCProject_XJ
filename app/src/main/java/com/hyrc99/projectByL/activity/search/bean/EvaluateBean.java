package com.hyrc99.projectByL.activity.search.bean;

import java.util.List;

/**
 * @description 作用: 评价查询Bea
 * @date: 2019/11/4
 * @author: 卢融霜
 */
public class EvaluateBean{

    /**
     * code : 1
     * msg : 获取成功
     * data : [{"RN":1,"UNITNAME":"楚雄欣源水利电力勘察设计有限责任公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AAA","VTIME":"2020-12-05"},{"RN":2,"UNITNAME":"福建省建江水利水电设计咨询有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":3,"UNITNAME":"甘肃省水利水电勘测设计研究院有限责任公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AAA","VTIME":"2020-12-05"},{"RN":4,"UNITNAME":"广东邦鑫勘测科技股份有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":5,"UNITNAME":"广东粤水电勘测设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":6,"UNITNAME":"广东中灏勘察设计咨询有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":7,"UNITNAME":"广州市宏涛水务勘测设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":8,"UNITNAME":"哈密红星勘测设计有限责任公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":9,"UNITNAME":"莆田市水利水电勘测设计院有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":10,"UNITNAME":"韶关市水利水电勘测设计咨询有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":11,"UNITNAME":"四川大学工程设计研究院有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"BBB","VTIME":"2020-12-05"},{"RN":12,"UNITNAME":"四川都成泽源工程勘察设计有限责任公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":13,"UNITNAME":"四川省西点电力设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":14,"UNITNAME":"四川新永一集团有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":15,"UNITNAME":"伊犁花城勘测设计研究有限责任公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":16,"UNITNAME":"宜昌市水利水电勘察设计院有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":17,"UNITNAME":"云南华禹水利水电勘察设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"BBB","VTIME":"2020-12-05"},{"RN":18,"UNITNAME":"云南能阳水利水电勘察设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"},{"RN":19,"UNITNAME":"云南秀川水利水电勘察设计有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"A","VTIME":"2020-12-05"},{"RN":20,"UNITNAME":"中船勘察设计研究院有限公司","YEAR":"2017","JTEXT":"勘察","RESULT":"AA","VTIME":"2020-12-05"}]
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
         * RN : 1
         * UNITNAME : 楚雄欣源水利电力勘察设计有限责任公司
         * YEAR : 2017
         * JTEXT : 勘察
         * RESULT : AAA
         * VTIME : 2020-12-05
         */

        private int RN;
        private String UNITNAME;
        private String YEAR;
        private String JTEXT;
        private String RESULT;
        private String VTIME;

        public int getRN() {
            return RN;
        }

        public void setRN(int RN) {
            this.RN = RN;
        }

        public String getUNITNAME() {
            return UNITNAME;
        }

        public void setUNITNAME(String UNITNAME) {
            this.UNITNAME = UNITNAME;
        }

        public String getYEAR() {
            return YEAR;
        }

        public void setYEAR(String YEAR) {
            this.YEAR = YEAR;
        }

        public String getJTEXT() {
            return JTEXT;
        }

        public void setJTEXT(String JTEXT) {
            this.JTEXT = JTEXT;
        }

        public String getRESULT() {
            return RESULT;
        }

        public void setRESULT(String RESULT) {
            this.RESULT = RESULT;
        }

        public String getVTIME() {
            return VTIME;
        }

        public void setVTIME(String VTIME) {
            this.VTIME = VTIME;
        }
    }
}
