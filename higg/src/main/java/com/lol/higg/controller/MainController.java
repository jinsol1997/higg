package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.SummonerDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Log4j2
@Controller
@RequestMapping("/higg/main")
public class MainController {

    @GetMapping
    public void mainForm(){}

    @PostMapping
    @ResponseBody
    public String search(@RequestParam("searchName") String searchName){

        RestTemplate restTemplate = new RestTemplate();


        // 요청시 필요한 Header 설정
        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("test", "testValue");
        //httpHeaders.add("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity<>("", httpHeaders);

        String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + searchName + "?api_key=RGAPI-a52aa3a0-e3b6-4f78-829d-e280b142e8d8";

        log.info(url);

        String result = restTemplate.getForObject(url, String.class, httpHeaders);

        Gson gson = new Gson();
        SummonerDTO summonerDTO = gson.fromJson(result, SummonerDTO.class);


        log.info(summonerDTO);

        return result;
    }

}
