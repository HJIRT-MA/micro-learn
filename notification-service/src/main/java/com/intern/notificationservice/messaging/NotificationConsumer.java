package com.intern.notificationservice.messaging;


import com.intern.notificationservice.config.RabbitConfig;
import com.intern.notificationservice.dto.NotificationEmailDto;
import com.intern.notificationservice.service.NotificationService;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer{
    private final NotificationService notificationService;
    private final Validator validator;

    public NotificationConsumer(NotificationService notificationService, Validator validator) {
        this.notificationService = notificationService;
        this.validator = validator;
    }
    @RabbitListener(queues = RabbitConfig.QUEUE_EMAIL)
    public void recevoir(NotificationEmailDto notification) {
        var violations = validator.validate(notification);
        if (!violations.isEmpty()) new ConstraintViolationException(violations);
        notificationService.envoyerEmail(notification);
    }
}
