package br.com.gejunit5.junit5;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.runner.RunWith;
 
@RunWith(JUnitPlatform.class)
@SelectPackages({ "br.com.gejunit5.junit5" })
public class TestWithJUnit5 { }
