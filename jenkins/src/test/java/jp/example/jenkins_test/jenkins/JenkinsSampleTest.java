package jp.example.jenkins_test.jenkins;

import static org.junit.Assert.*;
import jp.example.jenkins_test.jenkins.JenkinsSample;

import org.junit.Test;

public class JenkinsSampleTest {

	@Test
	public void testGetSample() {
		JenkinsSample sample = new JenkinsSample();
		String string = "AAA";
		sample.setSample(string);
		assertEquals("getSample",string, sample.getSample());
	}

	
	@Test
	public void testGetSample2() {
		JenkinsSample sample = new JenkinsSample();
		String string = "AAA";
		sample.setSample2(string);
		assertEquals("getSample2",string, sample.getSample2());
	}
}
