package com.bank.account.bank.rest;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JacksonRequestAccountSerializer extends StdSerializer<RequestAccount>
{
    public JacksonRequestAccountSerializer(){this(null);}

    protected  JacksonRequestAccountSerializer(Class<RequestAccount> t){
        super(t);
    }

    @Override
    public void serialize(RequestAccount requestAccount, JsonGenerator jsonGen, SerializerProvider provider) throws IOException{
        jsonGen.writeStringField("type", requestAccount.getType());
    }
}
