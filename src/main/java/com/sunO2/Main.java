package com.sunO2;

import com.sunO2.app.SunO2Application;
import com.sunO2.netWork.ISunO2Network;
import com.sunO2.netWork.SunO2Network;

/**
 * Created by admin on 17/3/24.
 */
public class Main {

    public static void main(String[] args){
        initNetwork(new SunO2Application());
    }


    private static void initNetwork(SunO2Application application){

        new SunO2DeployRoute(application.getContext(),SunO2Network.getInstance().init().getManifest(),
                new ISunO2DeployRouteListener(){


                    public void deloyRouteStart() {
                        System.out.println("服务器启动 开始部署路由 API 功能");
                    }


                    public void deloyRouteInstance(int total, int current, ISunO2Network sunO2Network) {
                        int progress = (current/total) * 100;
                        System.out.println("progress :" + progress + "%; 当前部署 API :" + sunO2Network.getClass().getSimpleName());

                    }


                    public void deloyed() {
                        System.out.println("部署完成");
                    }
                }).run();
    }
}
