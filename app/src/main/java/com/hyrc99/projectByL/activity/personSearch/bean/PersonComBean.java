package com.hyrc99.projectByL.activity.personSearch.bean;

import java.util.List;

/**
 * @description 作用:
 * @date: 2019/11/15
 * @author: 卢融霜
 */
public class PersonComBean {


    /**
     * code : 1
     * msg : 获取成功
     * data : [{"RN":1,"ID":41,"NAME":"王贵宝","IDENTITYID":"130623197707135418","TITLE":"高级工程师","VTIME":"2020-02-06","PNAME":"部直属","UNITNAME":"北京海策工程咨询有限公司","CERTID":"JLZ2009080063","REGID":"A00D2007093001","SPECTY":"水工建筑、环境保护"},{"RN":2,"ID":22605,"NAME":"王福禄","IDENTITYID":"210722195710246813","TITLE":"高级工程师","VTIME":"2022-01-27","PNAME":"辽宁省","UNITNAME":"朝阳禹盛环境工程监理有限公司","CERTID":"JLZ2012210035","REGID":"0B002019609032","SPECTY":"水土保持"},{"RN":3,"ID":34469,"NAME":"王大鹏","IDENTITYID":"210222196511151712","TITLE":"高级工程师","VTIME":"2022-03-19","PNAME":"辽宁省","UNITNAME":"大连方舟工程监理咨询有限公司","CERTID":"JLZ2012210007","REGID":"A0002009668013","SPECTY":"水工建筑"},{"RN":4,"ID":22373,"NAME":"王金宽","IDENTITYID":"211011195305165538","TITLE":"高级工程师","VTIME":"2017-06-06","PNAME":"辽宁省","UNITNAME":"大连金木工程监理有限公司","CERTID":"JLZ2005210007","REGID":"A0002012965009","SPECTY":"水工建筑"},{"RN":5,"ID":14270,"NAME":"王军","IDENTITYID":"211322196502150079","TITLE":"高级工程师","VTIME":"2021-02-01","PNAME":"辽宁省","UNITNAME":"抚顺市兴利水利建设工程监理有限公司","CERTID":"JLZ2005210114","REGID":"A0002019412065","SPECTY":"水工建筑"},{"RN":6,"ID":28050,"NAME":"王宇","IDENTITYID":"222301196204291835","TITLE":"高级工程师","VTIME":"2021-05-15","PNAME":"吉林省","UNITNAME":"吉林省东明水务监理咨询有限公司","CERTID":"JLZ2008150029","REGID":"A0002018614039","SPECTY":"水工建筑"},{"RN":7,"ID":40502,"NAME":"王卫东","IDENTITYID":"110102196901043333","TITLE":"高级工程师","VTIME":"2019-12-27","PNAME":"北京市","UNITNAME":"京水江河（北京）工程咨询有限公司","CERTID":"JLZ2012110053","REGID":"A0002014483067","SPECTY":"水工建筑"},{"RN":8,"ID":3293,"NAME":"王希友","IDENTITYID":"210102196409086634","TITLE":"教授级高级工程师","VTIME":"2020-03-02","PNAME":"辽宁省","UNITNAME":"辽宁宏禹水利工程建设监理有限公司","CERTID":"JLZ2009210013","REGID":"A0002007012007","SPECTY":"地质勘察"},{"RN":9,"ID":12273,"NAME":"王烈","IDENTITYID":"210882198011182131","TITLE":"高级工程师","VTIME":"2021-01-14","PNAME":"辽宁省","UNITNAME":"辽宁江河水利水电工程建设监理有限公司","CERTID":"JLZ2013220090","REGID":"AB0D2014096193","SPECTY":"水工建筑、环境保护、水土保持"},{"RN":10,"ID":5977,"NAME":"王廷威","IDENTITYID":"210603195311261034","TITLE":"高级工程师","VTIME":"2019-06-01","PNAME":"辽宁省","UNITNAME":"辽宁瑞宸工程建设监理咨询有限公司","CERTID":"JLZ2012210013","REGID":"A0002018971072","SPECTY":"水工建筑"},{"RN":11,"ID":31776,"NAME":"王迎发","IDENTITYID":"210521196610010034","TITLE":"高级工程师","VTIME":"2021-02-09","PNAME":"辽宁省","UNITNAME":"辽宁瑞宸工程建设监理咨询有限公司","CERTID":"JLZ2009210017","REGID":"A00D2018971060","SPECTY":"水工建筑、环境保护"},{"RN":12,"ID":34507,"NAME":"王世霏","IDENTITYID":"210624196411267819","TITLE":"高级工程师","VTIME":"2021-08-21","PNAME":"辽宁省","UNITNAME":"辽宁水利土木工程咨询有限公司","CERTID":"JLZ2013210008","REGID":"A0002009013182","SPECTY":"工程测量"},{"RN":13,"ID":16504,"NAME":"王明","IDENTITYID":"210102195501166018","TITLE":"高级工程师","VTIME":"2022-02-03","PNAME":"辽宁省","UNITNAME":"辽宁天阳工程技术咨询服务有限公司","CERTID":"JLZ2013210019","REGID":"A0002011870004","SPECTY":"水工建筑"},{"RN":14,"ID":5546,"NAME":"王立捷","IDENTITYID":"210103195409182126","TITLE":"高级工程师","VTIME":"2020-12-31","PNAME":"辽宁省","UNITNAME":"沈阳龙辉工程项目管理咨询有限公司","CERTID":"JLZ2005210087","REGID":"A0002013182005","SPECTY":"水工建筑"},{"RN":15,"ID":23837,"NAME":"王辉","IDENTITYID":"612401196301050978","TITLE":"高级工程师","VTIME":"2022-09-05","PNAME":"北京市","UNITNAME":"中国水利水电建设工程咨询北京有限公司","CERTID":"JLZ2005080466","REGID":"A0002007083136","SPECTY":"水工建筑"}]
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
         * ID : 41
         * NAME : 王贵宝
         * IDENTITYID : 130623197707135418
         * TITLE : 高级工程师
         * VTIME : 2020-02-06
         * PNAME : 部直属
         * UNITNAME : 北京海策工程咨询有限公司
         * CERTID : JLZ2009080063
         * REGID : A00D2007093001
         * SPECTY : 水工建筑、环境保护
         */

        private int RN;
        private int ID;
        private String NAME;
        private String IDENTITYID;
        private String TITLE;
        private String VTIME;
        private String PNAME;
        private String UNITNAME;
        private String CERTID;
        private String REGID;
        private String SPECTY;

        public int getRN() {
            return RN;
        }

        public void setRN(int RN) {
            this.RN = RN;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public String getIDENTITYID() {
            return IDENTITYID;
        }

        public void setIDENTITYID(String IDENTITYID) {
            this.IDENTITYID = IDENTITYID;
        }

        public String getTITLE() {
            return TITLE;
        }

        public void setTITLE(String TITLE) {
            this.TITLE = TITLE;
        }

        public String getVTIME() {
            return VTIME;
        }

        public void setVTIME(String VTIME) {
            this.VTIME = VTIME;
        }

        public String getPNAME() {
            return PNAME;
        }

        public void setPNAME(String PNAME) {
            this.PNAME = PNAME;
        }

        public String getUNITNAME() {
            return UNITNAME;
        }

        public void setUNITNAME(String UNITNAME) {
            this.UNITNAME = UNITNAME;
        }

        public String getCERTID() {
            return CERTID;
        }

        public void setCERTID(String CERTID) {
            this.CERTID = CERTID;
        }

        public String getREGID() {
            return REGID;
        }

        public void setREGID(String REGID) {
            this.REGID = REGID;
        }

        public String getSPECTY() {
            return SPECTY;
        }

        public void setSPECTY(String SPECTY) {
            this.SPECTY = SPECTY;
        }
    }
}
