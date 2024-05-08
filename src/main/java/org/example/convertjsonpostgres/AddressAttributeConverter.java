package org.example.convertjsonpostgres;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;


@Converter
@Slf4j


public class AddressAttributeConverter implements AttributeConverter<Address, String> {



    private static final ObjectMapper objectMapper = new ObjectMapper();



    @Override
    public String convertToDatabaseColumn(Address address) {
        try {
            return objectMapper.writeValueAsString(address);
        } catch (JsonProcessingException jpe) {
            log.error("Failed to convert Address to JSON", jpe);
            throw new RuntimeException("Failed to convert Address to JSON", jpe);
        }
    }

    @Override
    public Address convertToEntityAttribute(String value) {
        try {
            return objectMapper.readValue(value, Address.class);
        } catch (JsonProcessingException e) {
            log.warn("Cannot convert JSON into Address");
            return null;
        }
    }




}
