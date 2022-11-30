package com.lol.higg.controller;

import com.google.gson.Gson;
import com.lol.higg.dto.lol.MatchDTO;
import com.lol.higg.util.ApiKey;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Log4j2
@Controller
@RequestMapping("/higg/list")
public class ListController {

    private ApiKey apiKey;

    @GetMapping()
    public void listForm(HttpSession session){
        log.info("list get 진입 ...");
        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + session.getAttribute("gameCode"));

        String[] gameCode = (String[]) session.getAttribute("gameCode");
        log.info(gameCode);

        MatchDTO[] matchDTO = new MatchDTO[gameCode.length];

        for(int i=0; i<gameCode.length; i++){
            log.info(gameCode[i]);

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders httpHeaders = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>("", httpHeaders);

            String url = "https://asia.api.riotgames.com/lol/match/v5/matches/" + gameCode[i] + apiKey.getKey();

            String result = restTemplate.getForObject(url, String.class, httpHeaders);

            Gson gson = new Gson();
            matchDTO[i] = gson.fromJson(result, MatchDTO.class);
        }
        session.setAttribute("matchDTO", matchDTO);
        session.invalidate();
    }

}
