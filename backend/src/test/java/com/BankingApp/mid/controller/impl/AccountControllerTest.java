package com.BankingApp.mid.controller.impl;

import com.BankingApp.mid.model.Account;
import com.BankingApp.mid.model.Bank;
import com.BankingApp.mid.repository.AccountRepository;
import com.BankingApp.mid.repository.BankRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.ApplicationContextTestUtils;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class AccountControllerTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    BankRepository bankRepository;

    // test account controller
    @Autowired
    WebApplicationContext webApplicationContext;

    MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();


    Account account;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        Optional<Bank> bankOptional= bankRepository.findById(1L);
        assertEquals(true, bankOptional.isPresent());
        account = new Account(1L,"Nuha","333 main street", bankOptional.get());

    }

    @AfterEach
    public void tearDown(){
        accountRepository.deleteById(1L);
    }



    // One Test for *** GET Req ***
    @Test
    void getAllAccount_validRequest_AllAccount() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        System.out.println(mvcResult.getResponse().getContentAsString());

        assertTrue(mvcResult.getResponse().getContentAsString().contains("id"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("id"));

    }

    // *** test post ***
    @Test
    void saveAccount_validBody_AccountSaved() throws Exception {
        String body = objectMapper.writeValueAsString(account);

        mockMvc.perform(MockMvcRequestBuilders.post("/api/accounts").content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andReturn();

        assertTrue(accountRepository.findAll().toString().contains("id"));

    }

    // *** test put req ***
    @Test
    void updateAccount() throws Exception {
        account.setAccountNum("3838383");

        String body = objectMapper.writeValueAsString(account);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/accounts/3").content(body).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent())
                .andReturn();

        assertTrue(accountRepository.findAll().toString().contains("3838383"));
    }






}