package org.zerock.javawebbook.todo2.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public enum ModelMapperUtil {
    INSTANCE;

    private ModelMapper modelMapper;

    // Constructor to initialize the modelMapper
    ModelMapperUtil() {
        this.modelMapper = new ModelMapper();
        this.modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.LOOSE);
    }

    public ModelMapper get() {
        return modelMapper;
    }
}
