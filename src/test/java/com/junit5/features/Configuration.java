package com.junit5.features;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({ "com.junit5.features" })
public class Configuration {

}
