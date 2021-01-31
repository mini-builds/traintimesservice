package io.minibuilds.traintimes.service.nre.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

@Root(name = "soap:Envelope")
@NamespaceList({
    @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/", prefix = "soap"),
    @Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi"),
    @Namespace(reference = "http://www.w3.org/2001/XMLSchema", prefix = "xsd")
})
public class DepartureBoardResponseEnvelope {
  @Element(name = "Body", required = false)
  private DepartureBoardResponseBody body;

  public DepartureBoardResponseEnvelope() { }

  public DepartureBoardResponseEnvelope(DepartureBoardResponseBody body) {
    this.body = body;
  }

  public DepartureBoardResponseBody getBody() {
    return body;
  }

}
