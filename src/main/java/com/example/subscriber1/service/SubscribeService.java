package com.example.subscriber1.service;


import com.example.subscriber1.dto.InfluencerDTO;
import com.example.subscriber1.mapper.SubscriberMapper;
import com.example.subscriber1.model.Influencer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class SubscribeService {
    private final SubscriberMapper subscriberMapper;


    public SubscribeService(SubscriberMapper subscriberMapper) {
        this.subscriberMapper = subscriberMapper;

    }

    @KafkaListener(topics = "manager")
    public void receiveOrder(InfluencerDTO dto) {

        Influencer influencer = subscriberMapper.toEntity(dto);
        System.out.println(influencer);
    }

}
