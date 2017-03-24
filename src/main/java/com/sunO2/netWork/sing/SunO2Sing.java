package com.sunO2.netWork.sing;

import com.sunO2.app.SunO2Context;
import com.sunO2.netWork.ISunO2Network;
import com.sunO2.netWork.sing.up.SingUp;

import static spark.Spark.*;

/**
 * Created by admin on 17/3/24.
 */
public class SunO2Sing implements ISunO2Network {

    public SunO2Sing(SunO2Context context){
        initSing(context);
    }

    private void initSing(SunO2Context context) {
        get("/singUp",new SingUp(context));//登录
    }
}
