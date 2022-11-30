package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.SummonerDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Log4j2
@Controller
@RequestMapping("/higg/main")
public class MainController {

    @GetMapping
    public void mainForm() {
    }

    @PostMapping
    @ResponseBody
    public String search(@RequestParam("searchName") String searchName) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>("", httpHeaders);

        String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + searchName + "?api_key=RGAPI-a52aa3a0-e3b6-4f78-829d-e280b142e8d8";

        String result = restTemplate.getForObject(url, String.class, httpHeaders);

        Gson gson = new Gson();
        SummonerDTO summonerDTO = gson.fromJson(result, SummonerDTO.class);

        String puuid = summonerDTO.getPuuid();

        url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + puuid + "/ids?start=0&count=20&api_key=RGAPI-a52aa3a0-e3b6-4f78-829d-e280b142e8d8";

        result = restTemplate.getForObject(url, String.class, httpHeaders);

        String[] gameCode = gson.fromJson(result, String[].class);

        for(int i=0; i<gameCode.length; i++){
            log.info(gameCode[i]);
        }

        

        return puuid;
    }

}
