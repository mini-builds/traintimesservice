package io.minibuilds.traintimes.service.nre.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soapenv:Envelope")
@NamespaceList({
    @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "soapenv"),
    @Namespace(reference = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", prefix = "typ"),
    @Namespace(reference = "http://thalesgroup.com/RTTI/2017-10-01/ldb/", prefix = "ldb")
})
public class GetDepBoardWithDetailsRequestEnvelope {

  public static GetDepBoardWithDetailsRequestEnvelope create(String token, String from, String to) {
    return new GetDepBoardWithDetailsRequestEnvelope(new GetDepBoardWithDetailsRequestHeader(new AccessToken(token)), new GetDepBoardWithDetailsRequestBody(new GetDepBoardWithDetailsRequest(from, to)));
  }

  @Element(name = "soapenv:Header", required = false)
  private final GetDepBoardWithDetailsRequestHeader header;


  @Element(name = "soapenv:Body", required = false)
  private final GetDepBoardWithDetailsRequestBody body;

  public GetDepBoardWithDetailsRequestEnvelope(GetDepBoardWithDetailsRequestHeader header, GetDepBoardWithDetailsRequestBody body) {
    this.header = header;
    this.body = body;
  }

  public GetDepBoardWithDetailsRequestHeader getHeader() {
    return header;
  }

  public GetDepBoardWithDetailsRequestBody getBody() {
    return body;
  }

}
