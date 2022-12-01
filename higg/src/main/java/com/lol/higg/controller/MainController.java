package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.lol.SummonerDTO;
import com.lol.higg.util.ApiKey;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Log4j2
@Controller
@RequestMapping("/higg/main")
public class MainController {

    @GetMapping
    public void mainForm() {
    }

    @PostMapping
    public String search(@RequestParam("searchName") String searchName, HttpSession session) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>("", httpHeaders);

        String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + searchName + "?" + ApiKey.key;

        String result = restTemplate.getForObject(url, String.class, httpHeaders);

        Gson gson = new Gson();
        SummonerDTO summonerDTO = gson.fromJson(result, SummonerDTO.class);

        session.setAttribute("summonerDTO", summonerDTO);

//        String puuid = summonerDTO.getPuuid();
//
//        url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + puuid + "/ids?start=0&count=10&" + ApiKey.key;
//
//        result = restTemplate.getForObject(url, String.class, httpHeaders);
//
//        String[] gameCode = gson.fromJson(result, String[].class);
//
//        session.setAttribute("gameCode", gameCode);

        return "redirect:/higg/list";
    }

}
