package com.klu;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
@WebMvcTest(MS1Controller.class)
class MS1ControllerUnitTest
{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MS1Service service;

    @Test
    void add_shouldReturnAdditionResult() throws Exception
    {
        when(service.add(5, 10)).thenReturn(15);

        mockMvc.perform(get("/ms1/add")
                .param("a", "5")
                .param("b", "10"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Addition = 15"));
    }
}
