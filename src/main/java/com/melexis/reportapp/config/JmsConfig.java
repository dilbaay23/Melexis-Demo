package com.melexis.reportapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * Created By Moon
 * 18/12/2021, za
 **/

@Configuration
@EnableJms
public class JmsConfig {

/*    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
                                                    DefaultJmsListenerContainerFactoryConfigurer configurer) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        // This provides all boot's default to this factory, including the message converter
        configurer.configure(factory, connectionFactory);
        factory.setMessageConverter(this.jacksonJmsMessageConverter());
        // You could still override some of Boot's default if necessary.
        return factory;
    }


   @Bean // Serialize message content to json using TextMessage
   public MessageConverter jacksonJmsMessageConverter() {
       MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
       converter.setTargetType(MessageType.TEXT);

       converter.setObjectMapper(new ObjectMapper());
       return converter;
   }*/
}
