package com.cdc.exafluence;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterSaveEvent;
import org.springframework.stereotype.Component;

@Component
public class MongoDBChangeListener extends AbstractMongoEventListener<Object>
{
	   @Override
	    public void onAfterSave(AfterSaveEvent<Object> event) {
	        // Handle the event after an entity is saved
	        // You can send the data to a Kafka topic here
	        // For simplicity, we'll print the change event to the console
	        System.out.println("MongoDB Change Event: " + event.getSource());
	    }
}
