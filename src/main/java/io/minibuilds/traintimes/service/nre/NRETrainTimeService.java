package io.minibuilds.traintimes.service.nre;

import io.minibuilds.traintimes.model.TrainService;
import io.minibuilds.traintimes.service.TrainTimesService;
import io.minibuilds.traintimes.service.nre.request.GetDepBoardWithDetailsRequestEnvelope;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class NRETrainTimeService implements TrainTimesService {

  private final NREApiService service;

  private final String token;

  public NRETrainTimeService(String token) {
    this.token = token;

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://lite.realtime.nationalrail.co.uk/")
        .addConverterFactory(SimpleXmlConverterFactory.create(new Persister(new AnnotationStrategy())))
        .build();

     service = retrofit.create(NREApiService.class);
  }

  @Override
  public List<TrainService> getTrainServices(String from, String to) throws IOException {
    var t = service.getDepartureBoard(GetDepBoardWithDetailsRequestEnvelope.create(token, from, to)).execute();
    var response = t.body();

    if (!t.isSuccessful() || response == null) {
        return List.of();
    }

    var trainServices = response.getBody().getDeparture().getStationBoard().getTrainServices();

    if (trainServices == null) {
      return List.of();
    }

    return trainServices.stream().map(Mapper::map).collect(Collectors.toList());
  }
}
