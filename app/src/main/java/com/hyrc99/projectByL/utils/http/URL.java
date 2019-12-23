package com.hyrc99.projectByL.utils.http;


import com.hyrc99.projectByL.activity.badBehaviorDel.bean.BadBean;
import com.hyrc99.projectByL.activity.company.bean.ComPanyDelBean;
import com.hyrc99.projectByL.activity.company.bean.QualificationsBase;
import com.hyrc99.projectByL.activity.main.fragMent.fragmentItem1List.bean.NewsBean;
import com.hyrc99.projectByL.activity.personSearch.bean.PersonBean;
import com.hyrc99.projectByL.activity.personSearch.bean.PersonComBean;
import com.hyrc99.projectByL.activity.search.bean.BadBehavior;
import com.hyrc99.projectByL.activity.search.bean.CompanyBean;
import com.hyrc99.projectByL.activity.search.bean.EvaluateBean;
import com.hyrc99.projectByL.activity.search.bean.ProjectBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface URL {
    //请求前缀
    String HTTPAPI = "http://218.60.147.18/";
    String HTTPAPI2 = "http://rc.cweun.org/";

    /**
     * 获取新闻
     *
     * @param map 参数
     * @return 数据
     */
    @GET("NEWS/GETNEWSLIST")
    Call<NewsBean> getNews(@QueryMap Map<String, String> map);

    //信用动态详情
    String NEWSINFO_ROOT = HTTPAPI + "NEWS/NEWINFO?";

    //不良行为
    @GET("NEWS/GETBADPUBLIST")
    Call<BadBehavior> getBadPubList(@QueryMap Map<String, String> map);

    //不良行为详情
    @GET("NEWS/BADINFO")
    Call<BadBean> getBadInfo(@QueryMap Map<String, String> map);

    //工程
    @GET("APISVR/APP/GetPROJByPRJNM")
    Call<ProjectBean> getProjectList(@QueryMap Map<String, String> map);

    //评价查询
    @GET("APISVR/APP/GetJUDGESLB")
    Call<EvaluateBean> getJudgeslb(@QueryMap Map<String, String> map);

    //单位查询
    @GET("DEPT/GETDEPTLIST")
    Call<CompanyBean> getDeptlist(@QueryMap Map<String, String> map);

    //获取单位基本信息
    @GET("APISVR/APP/GetBASE")
    Call<ComPanyDelBean> getBase(@Query("ID") int ID);

    //获取单位资质
    @GET("APISVR/APP/GetAPTM")
    Call<QualificationsBase> getAptm(@Query("ID") int ID);

    @GET("APISVR/APP/GetPERByNAMEAndIDENTITYID")

    Call<PersonBean> getPerbyNameAndIdentityid(@QueryMap Map<String, String> map);

    @GET("APISVR/APP/GetPERByJINDEX")
    Call<PersonComBean> getPerbyJindex(@QueryMap Map<String, String> map);
}
