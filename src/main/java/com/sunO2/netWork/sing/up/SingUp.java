package com.sunO2.netWork.sing.up;

import com.sunO2.app.SunO2Context;
import com.sunO2.netWork.SunO2Route;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Created by admin on 17/3/24.
 */
public class SingUp extends SunO2Route implements Route{

    public SingUp(SunO2Context context) {
        super(context);
    }

    public Object handle(Request request, Response response) throws Exception {
        return "hello world";
    }
}
