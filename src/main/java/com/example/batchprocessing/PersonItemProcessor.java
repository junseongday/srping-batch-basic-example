package com.example.batchprocessing;

import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    LoggerFactory.getLogger(PersonItemProcessor.class);
    @Override
    public Person process(Person person) throws Exception {
        return null;
    }
}
