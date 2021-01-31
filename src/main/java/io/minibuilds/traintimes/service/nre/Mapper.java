package io.minibuilds.traintimes.service.nre;

import io.minibuilds.traintimes.model.CallingPoint;
import io.minibuilds.traintimes.model.TrainService;
import io.minibuilds.traintimes.service.nre.response.DepartureBoardCallingPoint;
import io.minibuilds.traintimes.service.nre.response.DepartureBoardTrainService;

import java.util.stream.Collectors;

public class Mapper {
  public static TrainService map(DepartureBoardTrainService ts) {
    return new TrainService(ts.getTime(), ts.getExpectedTime(), ts.getCallingPoints().getCallingPoints().stream().map(Mapper::map).collect(Collectors.toList()));
  }

  public static CallingPoint map(DepartureBoardCallingPoint c) {
    return new CallingPoint(c.getLocationName(), c.getTime(), c.getExpectedTime());
  }
}
