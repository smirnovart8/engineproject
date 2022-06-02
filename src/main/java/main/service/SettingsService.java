package main.service;

import java.util.ArrayList;
import java.util.List;
import main.api.response.SettingsResponseDTO;
import main.model.GlobalSettings;
import main.repository.GlobalSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {

  @Autowired
  private GlobalSettingsRepository globalSettingsRepository;

  public SettingsResponseDTO getGlobalSettings() {
    SettingsResponseDTO settingsResponseDTO = new SettingsResponseDTO();
    List<GlobalSettings> settings = new ArrayList<>();

    globalSettingsRepository.findAll().forEach(s -> settings.add(s));

    settings.forEach(s -> {
      switch (s.getCode()) {
        case "MULTIUSER_MODE":
          if (s.getValue().equalsIgnoreCase("1")) {
            settingsResponseDTO.setMultiUserMode(true);
          }
          break;

        case "POST_PREMODERATION":
          if (s.getValue().equalsIgnoreCase("1")) {
            settingsResponseDTO.setPostPremoderation(true);
          }
          break;
        case "STATISTICS_IS_PUBLIC":
          if (s.getValue().equalsIgnoreCase("1")) {
            settingsResponseDTO.setStatisticsIsPublic(true);
          }
          break;
      }
    });

    return settingsResponseDTO;

  }

}
