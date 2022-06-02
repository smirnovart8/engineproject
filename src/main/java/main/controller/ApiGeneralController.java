package main.controller;

import main.api.response.InitResponseDTO;
import main.api.response.PostResponseDTO;
import main.api.response.SettingsResponseDTO;
import main.service.PostService;
import main.service.SettingsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiGeneralController {

  private final InitResponseDTO initResponse;
  private final SettingsService settingsService;

  public ApiGeneralController(InitResponseDTO initResponse, SettingsService settingsService,
      PostService postResponse) {
    this.initResponse = initResponse;
    this.settingsService = settingsService;
  }

  @GetMapping("/settings")
  private SettingsResponseDTO settings() {
    return settingsService.getGlobalSettings();
  }

  @GetMapping("/init")
  private ResponseEntity<?> init() {
    return ResponseEntity.ok(initResponse);
  }

}
