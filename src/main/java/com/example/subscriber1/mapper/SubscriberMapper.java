package com.example.subscriber1.mapper;

import com.example.subscriber1.dto.InfluencerDTO;
import com.example.subscriber1.model.Influencer;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface SubscriberMapper {
  Influencer toEntity(InfluencerDTO dto);

}
