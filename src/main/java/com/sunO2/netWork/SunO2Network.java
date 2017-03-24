package com.sunO2.netWork;

import com.sunO2.netWork.sing.SunO2Sing;

/**
 * Created by admin on 17/3/24.
 *
 * SunO2 API 接口注册中心  所有的服务器API接口 都从此处注册
 */
public class SunO2Network extends InjectNetwork{

    private static SunO2Network instance = new SunO2Network();

    private SunO2Network(){

    }

    public static SunO2Network getInstance(){
        return instance;
    }

    @Override
    public InjectNetwork init() {
       addNetwork(SunO2Sing.class); //添加登录
        return this;
    }
}
