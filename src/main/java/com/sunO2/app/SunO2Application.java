package com.sunO2.app;

import static spark.Spark.*;

/**
 * Created by admin on 17/3/24.
 */
public class SunO2Application implements ApplicationWapper{

    private SunO2Context mContext;

    public SunO2Application() {
      mContext = new SunO2Context();
      initService();
    }

    public SunO2Context getContext() {
        return mContext;
    }

    private void initService() {
        port(8081);
        ipAddress("http://bbs.bugke.com");
    }
}
