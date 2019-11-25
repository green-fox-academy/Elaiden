package com.elaiden.iamgroottest.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void translateMessage_parameterNotPresent_expectedBadRequest() throws Exception {
    mockMvc.perform(get("/groot"))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void translateMessage_parameterPresentButEmpty_expectedBadRequest() throws Exception {
    mockMvc.perform(get("/groot").param("message", ""))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

  @Test
  public void translateMessage_parameterPresentAndMessageGiven_ExpectedOk() throws Exception {
    mockMvc.perform(get("/groot").param("message", "somemessage"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("somemessage")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void calculateArrowSpeed_parametersPresentAndValid_expectedOk() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "10.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.0)))
        .andExpect(jsonPath("$.time", is(10.0)))
        .andExpect(jsonPath("$.speed", is(10.0)));
  }

  @Test
  public void calculateArrowSpeed_parametersNotPresent_expectedBadRequest() throws Exception {
    mockMvc.perform(get("/yondu"))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void calculateArrowSpeed_parametersPresentTimeZero_expectedBadRequest() throws Exception {
    mockMvc.perform(get("/yondu").param("distance", "100.0").param("time", "0.0"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.distance", is(100.0)))
        .andExpect(jsonPath("$.time", is(0.0)))
        .andExpect(jsonPath("$.speed", is("Infinity")));
  }
}