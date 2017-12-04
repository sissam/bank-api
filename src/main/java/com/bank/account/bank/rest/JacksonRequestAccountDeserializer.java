package com.bank.account.bank.rest;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class JacksonRequestAccountDeserializer extends StdDeserializer<RequestAccount> {

    public JacksonRequestAccountDeserializer(){this(null);}

    public JacksonRequestAccountDeserializer(Class<RequestAccount> t){super(t);}

    @Override
    public RequestAccount deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        RequestAccount requestAccount = new RequestAccount();
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String type = node.get("type").asText();
        requestAccount.setType(type);
        return requestAccount;
    }
}
