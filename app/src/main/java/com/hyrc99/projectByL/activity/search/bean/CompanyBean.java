package com.hyrc99.projectByL.activity.search.bean;

import java.util.List;

/**
 * @description 作用:
 * @date: 2019/11/4
 * @author: 卢融霜
 */
public class CompanyBean {

    /**
     * code : 1 msg : 获取成功 data : {"total":34,"rows":[{"ID":6,"company_id":2583,"NUM":0,"UnitName":"朝阳市燕都建设工程招标投标有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张宝权","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":7,"company_id":2581,"NUM":0,"UnitName":"朝阳禹盛环境工程监理有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"尹利","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":30,"company_id":2398,"NUM":0,"UnitName":"朝阳市水利规划勘测设计院","type":"011000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王高起","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":31,"company_id":2397,"NUM":0,"UnitName":"朝阳县水利勘测设计队","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"陈广华","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":35,"company_id":2390,"NUM":0,"UnitName":"朝阳鑫盛水务工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王成岩","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":84,"company_id":2225,"NUM":0,"UnitName":"朝阳县腾跃水电工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"曹晓光","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":135,"company_id":2978,"NUM":0,"UnitName":"朝阳市水利水电建筑工程有限责任公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"李国坤","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":195,"company_id":4054,"NUM":0,"UnitName":"朝阳建设集团有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"郝彦斌","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":197,"company_id":4019,"NUM":0,"UnitName":"朝阳方正中原建设工程招标投标有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"刘铁英","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":199,"company_id":2469,"NUM":0,"UnitName":"朝阳莱恩水务工程建设有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张宏博","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":330,"company_id":5136,"NUM":0,"UnitName":"朝阳华宇工程招标代理有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"赵建华","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":416,"company_id":5110,"NUM":0,"UnitName":"朝阳华盛水利水电设计咨询有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"郭庆荣","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":418,"company_id":3905,"NUM":0,"UnitName":"朝阳东北建筑安装工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"付力","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":428,"company_id":6011,"NUM":0,"UnitName":"朝阳正大工程咨询有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王昕凯","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":430,"company_id":6062,"NUM":0,"UnitName":"朝阳顺泽水利工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王继灵","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":438,"company_id":5774,"NUM":0,"UnitName":"朝阳宏泰水利工程监理有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"李娜","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":464,"company_id":5706,"NUM":0,"UnitName":"朝阳市鉴阳市政公用工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"毛子鉴","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":531,"company_id":6263,"NUM":0,"UnitName":"朝阳盛泰水利工程检测有限公司","type":"000000100000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张莹莹","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":544,"company_id":7482,"NUM":0,"UnitName":"朝阳市燕都水利设计有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"曹继文","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":730,"company_id":12122,"NUM":0,"UnitName":"朝阳市顺达水利工程设计有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"陈广吉","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null}],"footer":[]}
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
         * total : 34 rows : [{"ID":6,"company_id":2583,"NUM":0,"UnitName":"朝阳市燕都建设工程招标投标有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张宝权","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":7,"company_id":2581,"NUM":0,"UnitName":"朝阳禹盛环境工程监理有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"尹利","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":30,"company_id":2398,"NUM":0,"UnitName":"朝阳市水利规划勘测设计院","type":"011000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王高起","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":31,"company_id":2397,"NUM":0,"UnitName":"朝阳县水利勘测设计队","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"陈广华","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":35,"company_id":2390,"NUM":0,"UnitName":"朝阳鑫盛水务工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王成岩","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":84,"company_id":2225,"NUM":0,"UnitName":"朝阳县腾跃水电工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"曹晓光","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":135,"company_id":2978,"NUM":0,"UnitName":"朝阳市水利水电建筑工程有限责任公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"李国坤","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":195,"company_id":4054,"NUM":0,"UnitName":"朝阳建设集团有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"郝彦斌","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":197,"company_id":4019,"NUM":0,"UnitName":"朝阳方正中原建设工程招标投标有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"刘铁英","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":199,"company_id":2469,"NUM":0,"UnitName":"朝阳莱恩水务工程建设有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张宏博","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":330,"company_id":5136,"NUM":0,"UnitName":"朝阳华宇工程招标代理有限公司","type":"000000010000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"赵建华","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":416,"company_id":5110,"NUM":0,"UnitName":"朝阳华盛水利水电设计咨询有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"郭庆荣","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":418,"company_id":3905,"NUM":0,"UnitName":"朝阳东北建筑安装工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"付力","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":428,"company_id":6011,"NUM":0,"UnitName":"朝阳正大工程咨询有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王昕凯","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":430,"company_id":6062,"NUM":0,"UnitName":"朝阳顺泽水利工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"王继灵","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":438,"company_id":5774,"NUM":0,"UnitName":"朝阳宏泰水利工程监理有限公司","type":"000001000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"李娜","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":464,"company_id":5706,"NUM":0,"UnitName":"朝阳市鉴阳市政公用工程有限公司","type":"000010000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"毛子鉴","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":531,"company_id":6263,"NUM":0,"UnitName":"朝阳盛泰水利工程检测有限公司","type":"000000100000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"张莹莹","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":544,"company_id":7482,"NUM":0,"UnitName":"朝阳市燕都水利设计有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"曹继文","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null},{"ID":730,"company_id":12122,"NUM":0,"UnitName":"朝阳市顺达水利工程设计有限公司","type":"001000000000","UnitTYPE":null,"Province":"辽宁省","City":"朝阳市","LegalRepresent":"陈广吉","Aptitude":null,"IsOtherProvince":null,"ChargeName":null,"BidProxy":null,"PublishStatus":8,"PublishTime":"2019/11/4","CancelPublishTime":null}]
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
             * ID : 6 company_id : 2583 NUM : 0 UnitName : 朝阳市燕都建设工程招标投标有限公司 type : 000000010000
             * UnitTYPE : null Province : 辽宁省 City : 朝阳市 LegalRepresent : 张宝权 Aptitude : null
             * IsOtherProvince : null ChargeName : null BidProxy : null PublishStatus : 8
             * PublishTime : 2019/11/4 CancelPublishTime : null
             */

            private int ID;
            private int company_id;
            private int NUM;
            private String UnitName;
            private String type;
            private Object UnitTYPE;
            private String Province;
            private String City;
            private String LegalRepresent;
            private Object Aptitude;
            private Object IsOtherProvince;
            private Object ChargeName;
            private Object BidProxy;
            private int PublishStatus;
            private String PublishTime;
            private Object CancelPublishTime;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public int getNUM() {
                return NUM;
            }

            public void setNUM(int NUM) {
                this.NUM = NUM;
            }

            public String getUnitName() {
                return UnitName;
            }

            public void setUnitName(String UnitName) {
                this.UnitName = UnitName;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Object getUnitTYPE() {
                return UnitTYPE;
            }

            public void setUnitTYPE(Object UnitTYPE) {
                this.UnitTYPE = UnitTYPE;
            }

            public String getProvince() {
                return Province;
            }

            public void setProvince(String Province) {
                this.Province = Province;
            }

            public String getCity() {
                return City;
            }

            public void setCity(String City) {
                this.City = City;
            }

            public String getLegalRepresent() {
                return LegalRepresent;
            }

            public void setLegalRepresent(String LegalRepresent) {
                this.LegalRepresent = LegalRepresent;
            }

            public Object getAptitude() {
                return Aptitude;
            }

            public void setAptitude(Object Aptitude) {
                this.Aptitude = Aptitude;
            }

            public Object getIsOtherProvince() {
                return IsOtherProvince;
            }

            public void setIsOtherProvince(Object IsOtherProvince) {
                this.IsOtherProvince = IsOtherProvince;
            }

            public Object getChargeName() {
                return ChargeName;
            }

            public void setChargeName(Object ChargeName) {
                this.ChargeName = ChargeName;
            }

            public Object getBidProxy() {
                return BidProxy;
            }

            public void setBidProxy(Object BidProxy) {
                this.BidProxy = BidProxy;
            }

            public int getPublishStatus() {
                return PublishStatus;
            }

            public void setPublishStatus(int PublishStatus) {
                this.PublishStatus = PublishStatus;
            }

            public String getPublishTime() {
                return PublishTime;
            }

            public void setPublishTime(String PublishTime) {
                this.PublishTime = PublishTime;
            }

            public Object getCancelPublishTime() {
                return CancelPublishTime;
            }

            public void setCancelPublishTime(Object CancelPublishTime) {
                this.CancelPublishTime = CancelPublishTime;
            }

            @Override
            public int getBeanId() {
                return company_id;
            }
        }
    }
}
