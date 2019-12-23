package com.hyrc99.projectByL.activity.personSearch.bean;

import java.util.List;

/**
 * @description 作用:
 * @date: 2019/11/15
 * @author: 卢融霜
 */
public class PersonBean {

    /**
     * code : 1  msg : 获取成功 data : [{"RN":1,"ID":16504,"NAME":"王明","IDENTITYID":"210102195501166018","TITLE":"高级工程师","VTIME":"2022-02-03","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁天阳工程技术咨询服务有限公司"},{"RN":2,"ID":3293,"NAME":"王希友","IDENTITYID":"210102196409086634","TITLE":"教授级高级工程师","VTIME":"2020-03-02","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁宏禹水利工程建设监理有限公司"},{"RN":3,"ID":5546,"NAME":"王立捷","IDENTITYID":"210103195409182126","TITLE":"高级工程师","VTIME":"2020-12-31","JTEXT":"总监","JINDEX":1,"UNITNAME":"沈阳龙辉工程项目管理咨询有限公司"},{"RN":4,"ID":34469,"NAME":"王大鹏","IDENTITYID":"210222196511151712","TITLE":"高级工程师","VTIME":"2022-03-19","JTEXT":"总监","JINDEX":1,"UNITNAME":"大连方舟工程监理咨询有限公司"},{"RN":5,"ID":31776,"NAME":"王迎发","IDENTITYID":"210521196610010034","TITLE":"高级工程师","VTIME":"2018-04-08","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁瑞宸工程建设监理咨询有限公司"},{"RN":6,"ID":5977,"NAME":"王廷威","IDENTITYID":"210603195311261034","TITLE":"高级工程师","VTIME":"2018-11-26","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁瑞宸工程建设监理咨询有限公司"},{"RN":7,"ID":34507,"NAME":"王世霏","IDENTITYID":"210624196411267819","TITLE":"高级工程师","VTIME":"2021-08-21","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁水利土木工程咨询有限公司"},{"RN":8,"ID":22605,"NAME":"王福禄","IDENTITYID":"210722195710246813","TITLE":"高级工程师","VTIME":"2019-07-31","JTEXT":"总监","JINDEX":1,"UNITNAME":"朝阳禹盛环境工程监理有限公司"},{"RN":9,"ID":12273,"NAME":"王烈","IDENTITYID":"210882198011182131","TITLE":"高级工程师","VTIME":"2021-01-14","JTEXT":"总监","JINDEX":1,"UNITNAME":"辽宁江河水利水电工程建设监理有限公司"},{"RN":10,"ID":22373,"NAME":"王金宽","IDENTITYID":"211011195305165538","TITLE":"高级工程师","VTIME":"2017-06-06","JTEXT":"总监","JINDEX":1,"UNITNAME":"大连金木工程监理有限公司"},{"RN":11,"ID":23232,"NAME":"王晓军","IDENTITYID":"211011197001115557","TITLE":"高级工程师","VTIME":"2019-10-28","JTEXT":"总监","JINDEX":1,"UNITNAME":"凤城市嘉恒水利工程监理有限公司"},{"RN":12,"ID":14270,"NAME":"王军","IDENTITYID":"211322196502150079","TITLE":"高级工程师","VTIME":"2020-01-02","JTEXT":"总监","JINDEX":1,"UNITNAME":"抚顺市兴利水利建设工程监理有限公司"},{"RN":13,"ID":40486,"NAME":"王敏","IDENTITYID":"110108196402272228","TITLE":"高级工程师","VTIME":"2021-03-30","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"丹东承润水利建筑工程监理有限公司"},{"RN":14,"ID":48405,"NAME":"王永利","IDENTITYID":"14022219850306701X","TITLE":"助理工程师","VTIME":"2021-02-01","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"盘锦河海土木工程咨询有限公司"},{"RN":15,"ID":210,"NAME":"王景军","IDENTITYID":"150430197410257699","TITLE":"工程师","VTIME":"2018-05-04","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"辽阳鑫利土木工程监理咨询有限公司"},{"RN":16,"ID":44206,"NAME":"王珏琼","IDENTITYID":"152105198207162188","TITLE":"高级工程师","VTIME":"2021-05-15","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"朝阳禹盛环境工程监理有限公司"},{"RN":17,"ID":30868,"NAME":"王保泽","IDENTITYID":"210102195305096016","TITLE":"教授级高级工程师","VTIME":"2019-07-19","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"辽宁江河水利水电工程建设监理有限公司"},{"RN":18,"ID":17153,"NAME":"王树山","IDENTITYID":"210102195410186611","TITLE":"高级工程师","VTIME":"2021-04-11","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"沈阳宏邦监理咨询有限公司"},{"RN":19,"ID":16504,"NAME":"王明","IDENTITYID":"210102195501166018","TITLE":"高级工程师","VTIME":"2022-02-03","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"辽宁天阳工程技术咨询服务有限公司"},{"RN":20,"ID":4153,"NAME":"王永鹏","IDENTITYID":"210102195501216636","TITLE":"高级工程师","VTIME":"2021-12-31","JTEXT":"监理工程师","JINDEX":2,"UNITNAME":"辽宁省水库移民工程监理有限公司"}]
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
         * RN : 1 ID : 16504 NAME : 王明 IDENTITYID : 210102195501166018 TITLE : 高级工程师 VTIME :
         * 2022-02-03 JTEXT : 总监 JINDEX : 1 UNITNAME : 辽宁天阳工程技术咨询服务有限公司
         */

        private int RN;
        private int ID;
        private String NAME;
        private String IDENTITYID;
        private String TITLE;
        private String VTIME;
        private String JTEXT;
        private int JINDEX;
        private String UNITNAME;

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

        public String getJTEXT() {
            return JTEXT;
        }

        public void setJTEXT(String JTEXT) {
            this.JTEXT = JTEXT;
        }

        public int getJINDEX() {
            return JINDEX;
        }

        public void setJINDEX(int JINDEX) {
            this.JINDEX = JINDEX;
        }

        public String getUNITNAME() {
            return UNITNAME;
        }

        public void setUNITNAME(String UNITNAME) {
            this.UNITNAME = UNITNAME;
        }
    }
}
