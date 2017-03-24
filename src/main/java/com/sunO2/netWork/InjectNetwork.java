package com.sunO2.netWork;

import com.sunO2.app.SunO2Context;

import java.util.ArrayList;

/**
 * Created by admin on 17/3/24.
 *
 * 服务器接口注册基本类 用于返回
 */
public abstract class InjectNetwork implements Inject {


    ArrayList<Class<? extends ISunO2Network>> arrayList = new ArrayList<Class<? extends ISunO2Network>>();

    InjectNetwork(){

    }

    abstract InjectNetwork init();

    public  ArrayList<Class<? extends ISunO2Network>> getManifest() {
        return arrayList;
    }


    public final void addNetwork(Class<? extends ISunO2Network> iSunO2Newwork){
        arrayList.add(iSunO2Newwork);
    }
}
