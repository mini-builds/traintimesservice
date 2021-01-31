package io.minibuilds.traintimes.service;

import io.minibuilds.traintimes.model.TrainService;

import java.io.IOException;
import java.util.List;

public interface TrainTimesService {
  List<TrainService> getTrainServices(String from, String to) throws IOException;
}
