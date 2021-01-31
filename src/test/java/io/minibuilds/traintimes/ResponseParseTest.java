package io.minibuilds.traintimes;

import io.minibuilds.traintimes.service.nre.response.DepartureBoardResponseEnvelope;
import org.junit.jupiter.api.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;


public class ResponseParseTest {

  @Test
  public void test_response_with_details() throws Exception {
    Strategy strategy = new AnnotationStrategy();
    Serializer serializer = new Persister(strategy);

    InputStream is = getClass().getClassLoader().getResourceAsStream("test-response.xml");

    DepartureBoardResponseEnvelope t = serializer.read(DepartureBoardResponseEnvelope.class, is);

    assertThat(t).isNotNull();
    assertThat(t.getBody()).isNotNull();
  }

}