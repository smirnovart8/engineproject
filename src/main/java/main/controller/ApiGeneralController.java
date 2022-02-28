package main.controller;

import main.api.response.InitResponse;
import main.api.response.PostResponse;
import main.api.response.SettingsResponse;
import main.service.SettingsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ApiGeneralController {

    private final InitResponse initResponse;
    private final SettingsService settingsService;
    private final PostResponse postResponse;

    public ApiGeneralController(InitResponse initResponse, SettingsService settingsService, PostResponse postResponse) {
        this.initResponse = initResponse;
        this.settingsService = settingsService;
        this.postResponse = postResponse;
    }

    @GetMapping ("/settings")
    private SettingsResponse settings () {
        return settingsService.getGlobalSettings();
    }

    @GetMapping("/init")
    private InitResponse init () {
        return initResponse;
    }

}
