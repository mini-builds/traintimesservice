package io.minibuilds.traintimes.service.nre;

import io.minibuilds.traintimes.model.TrainService;
import io.minibuilds.traintimes.service.TrainTimesService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.util.List;


public class NRETrainTimeServiceTestRig {

  @Test
  @Ignore
  public void test() throws Exception {
    TrainTimesService service = new NRETrainTimeService(System.getenv("NRE_TOKEN"));
    List<TrainService> services = service.getTrainServices("RDG", "BSK");
    System.out.println(services);
  }
}