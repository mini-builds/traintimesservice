package io.minibuilds.traintimes.service.nre;

import io.minibuilds.traintimes.service.nre.request.GetDepBoardWithDetailsRequestEnvelope;
import io.minibuilds.traintimes.service.nre.response.DepartureBoardResponseEnvelope;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NREApiService {
  @Headers({"Content-Type: text/xml; charset=utf-8", "SOAPAction: \"http://thalesgroup.com/RTTI/2015-05-14/ldb/GetDepBoardWithDetails\""})
  @POST("OpenLDBWS/ldb11.asmx")
  Call<DepartureBoardResponseEnvelope> getDepartureBoard(@Body GetDepBoardWithDetailsRequestEnvelope getDepBoardWithDetailsRequestEnvelope);

}
