package com.example.demo;

import com.example.demo.data.BaseDeDonneesTests;
import com.example.demo.data.VoitureTest;
import com.example.demo.service.StatistiqueTests;
import com.example.demo.web.WebTests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({VoitureTest.class, BaseDeDonneesTests.class, StatistiqueTests.class, WebTests.class})
public class AllTests {
}
