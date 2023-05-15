package com.example.javaproject2.week4.d5;

import java.util.List;

public class KafkaLineReader implements LineReader{
    private String kafkaUrl;

    public KafkaLineReader(String kafkaUrl) {
        this.kafkaUrl = kafkaUrl;
    }

    @Override
    public List<String> getLines() {
        return null;
    }
}
