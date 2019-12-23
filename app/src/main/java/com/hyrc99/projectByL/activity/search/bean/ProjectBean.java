package com.hyrc99.projectByL.activity.search.bean;

import java.util.List;

/**
 * @description 作用: 项目查询 Bean
 * @date: 2019/10/31
 * @author: 卢融霜
 */
public class ProjectBean{

    /**
     * code : 1 msg : 获取成功 data : [{"RN":1,"PRJNM":"辽宁卓异装备制造有限公司6#厂房工程","JINDEX":2,"JTEXT":"勘察","STEXT":"签约已实施"},{"RN":2,"PRJNM":"辽宁卓异装备制造有限公司8#、9#厂房工程","JINDEX":2,"JTEXT":"勘察","STEXT":"签约已实施"},{"RN":3,"PRJNM":"2010年阜新市烟草公司提灌站工程委托设计合同书","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":4,"PRJNM":"2011年阜新市烟草公司基础设施水源工程委托设计合同书","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":5,"PRJNM":"鞍钢集团矿业公司大孤山选矿厂新建中间粉矿仓工程水土保持方案编制技术咨询合同","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":6,"PRJNM":"鞍钢集团矿业公司齐大山铁矿采场北部新建破碎胶带工程水土保持方案编制技术咨询合同","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":7,"PRJNM":"鞍山钢铁集团公司老区铁矿山改扩建规划项目南沙河北支流金胡新村段河道改造工程初步设计技术服务合同书","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":8,"PRJNM":"北票市汇丰集团兴旺有限公司供水工程初步设计","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":9,"PRJNM":"朝阳市喀左县中三家镇鑫兴矿业有限公司长皋河河道选矿工程防洪应急预案","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":10,"PRJNM":"抚顺市顺城区黄旗河（抚顺新星肠衣有限公司新建厂区段）堤线规划报告","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":11,"PRJNM":"抚顺市望花区古城（辽宁抚工工具有限公司厂区（二期）段）洪水复核评价报告","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":12,"PRJNM":"锦州市小凌河金属公司段河道整治工程设计合同","JINDEX":3,"JTEXT":"设计","STEXT":"签约已实施"},{"RN":13,"PRJNM":"工程造价咨询项目定点服务合同","JINDEX":4,"JTEXT":"咨询","STEXT":"签约已实施"},{"RN":14,"PRJNM":"工程造价咨询项目定点服务合同","JINDEX":4,"JTEXT":"咨询","STEXT":"签约已实施"},{"RN":15,"PRJNM":"工程造价咨询项目定点服务合同","JINDEX":4,"JTEXT":"咨询","STEXT":"签约已实施"},{"RN":16,"PRJNM":"北营矿业公司老尾矿库溃坝治理工程","JINDEX":5,"JTEXT":"施工","STEXT":"完工已验收"},{"RN":17,"PRJNM":"朝阳县龙泉口酒业有限公司供水工程","JINDEX":5,"JTEXT":"施工","STEXT":"完工已验收"},{"RN":18,"PRJNM":"大连惠盛百泰生物科技有限公司方塘工程施工","JINDEX":5,"JTEXT":"施工","STEXT":"完工已验收"},{"RN":19,"PRJNM":"丹东市自来水总公司鸭绿江水源泵站工程","JINDEX":5,"JTEXT":"施工","STEXT":"完工已验收"},{"RN":20,"PRJNM":"抚顺禾丰农牧有限公司关门山种猪场项目水源井工程","JINDEX":5,"JTEXT":"施工","STEXT":"完工已验收"}]
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
         * RN : 1 PRJNM : 辽宁卓异装备制造有限公司6#厂房工程 JINDEX : 2 JTEXT : 勘察 STEXT : 签约已实施
         */

        private int RN;
        private String PRJNM;
        private int JINDEX;
        private String JTEXT;
        private String STEXT;

        public int getRN() {
            return RN;
        }

        public void setRN(int RN) {
            this.RN = RN;
        }

        public String getPRJNM() {
            return PRJNM;
        }

        public void setPRJNM(String PRJNM) {
            this.PRJNM = PRJNM;
        }

        public int getJINDEX() {
            return JINDEX;
        }

        public void setJINDEX(int JINDEX) {
            this.JINDEX = JINDEX;
        }

        public String getJTEXT() {
            return JTEXT;
        }

        public void setJTEXT(String JTEXT) {
            this.JTEXT = JTEXT;
        }

        public String getSTEXT() {
            return STEXT;
        }

        public void setSTEXT(String STEXT) {
            this.STEXT = STEXT;
        }
    }
}
