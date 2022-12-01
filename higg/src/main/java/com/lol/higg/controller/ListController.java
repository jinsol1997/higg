package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.lol.MatchDTO;
import com.lol.higg.dto.lol.SummonerDTO;
import com.lol.higg.util.ApiKey;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Log4j2
@Controller
@RequestMapping("/higg/list")
public class ListController {

    @GetMapping()
    public void listForm(Model model, HttpSession session) {

        SummonerDTO summonerDTO = (SummonerDTO) session.getAttribute("summonerDTO");

        String url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + summonerDTO.getPuuid() + "/ids?start=0&count=10&" + ApiKey.key;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        Gson gson = new Gson();

        String result = restTemplate.getForObject(url, String.class, httpHeaders);
        String[] gameCode = gson.fromJson(result, String[].class);

        MatchDTO[] matchDTO = new MatchDTO[gameCode.length];

        url = "https://asia.api.riotgames.com/lol/match/v5/matches/" + gameCode[0] + "?" + ApiKey.key;

        for(int i=0; i< gameCode.length; i++){
            url = "https://asia.api.riotgames.com/lol/match/v5/matches/" + gameCode[i] + "?" + ApiKey.key;
            matchDTO[i] = restTemplate.getForObject(url, MatchDTO.class);
        }

        log.info(matchDTO[0].getInfo().getParticipants());
        for(int i=0; i<matchDTO[0].getInfo().getParticipants().size(); i++){
            log.info(matchDTO[0].getInfo().getParticipants().get(i).getSummonerName());
        }

        model.addAttribute("summonerDTO", summonerDTO);
        model.addAttribute("matchDTO", matchDTO);
    }

}
