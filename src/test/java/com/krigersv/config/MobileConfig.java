package com.krigersv.config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${env}.properties"
})
public interface MobileConfig extends Config {

    @Key("platformName")
    String getPlatformName();

    @Key("deviceName")
    String getDeviceName();

    @Key("osVersion")
    String getVersion();

    @Key("app")
    String getApp();

    @Key("projectName")
    String getProject();

    @Key("buildName")
    String getBuild();

    @Key("testName")
    String getTestName();
}
