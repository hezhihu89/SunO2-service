package com.sunO2;

import com.sunO2.app.SunO2Context;
import com.sunO2.netWork.ISunO2Network;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * Created by admin on 17/3/24.
 *
 * 部署服务器 API
 */
public class SunO2DeployRoute implements Runnable{

    private  ISunO2DeployRouteListener sunO2DeployRouteListener;

    private SunO2Context mContext;

    private ArrayList<Class<? extends ISunO2Network>> sunO2Networks;

    public SunO2DeployRoute(SunO2Context context,ArrayList<Class<? extends ISunO2Network>> sunO2Networks,
                            ISunO2DeployRouteListener sunO2DeployRouteListener){
         this.sunO2DeployRouteListener = sunO2DeployRouteListener;
         this.sunO2Networks = sunO2Networks;
         this.mContext = context;
    }


    public void run() {
        sunO2DeployRouteListener.deloyRouteStart();
        int size = sunO2Networks.size();
        for(int i=0;i<size;i++){
            Class<? extends ISunO2Network> clazz = sunO2Networks.get(i);
            try {
                Constructor<?>[] constructors = clazz.getConstructors();
                if (constructors != null) {
                    for (Constructor constructor : constructors) {
                        Class<?>[] param = constructor.getParameterTypes();
                        if (param != null && param.length == 1) {
                            Class aClass0 = param[0];
                            if (aClass0.isInstance(mContext)) {
                                constructor.setAccessible(true);
                                ISunO2Network sunO2Network = (ISunO2Network) constructor.newInstance(mContext);
                                sunO2DeployRouteListener.deloyRouteInstance(size, i + 1, sunO2Network);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sunO2DeployRouteListener.deloyed();
    }



}
