package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.lol.SummonerDTO;
import com.lol.higg.util.ApiKey;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpSession;

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

        String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + searchName + "?" + ApiKey.key;

        String result = restTemplate.getForObject(url, String.class, httpHeaders);

        Gson gson = new Gson();
        SummonerDTO summonerDTO = gson.fromJson(result, SummonerDTO.class);

        session.setAttribute("summonerDTO", summonerDTO);

        return "redirect:/higg/list";
    }

}
