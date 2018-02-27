package org.gradle.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Abner on 2/22/2018.
 */
public class GreeterTest {
  private Greeter object;

  @Before
  public void initialize() {
    object = new Greeter();
  }

  @Test
  public void testGetGreeting() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithWord() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithWords() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithNumbers() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithChar() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithDouble() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithBoolean() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithNone() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingWithInteger() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

  @Test
  public void testGetGreetingLabel() throws Exception {
    final String expectedResuld = "Start example with gradle by Abner";
    assertEquals(object.getGreeting(), expectedResuld);
  }

}
