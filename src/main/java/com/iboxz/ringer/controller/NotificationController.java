package com.iboxz.ringer.controller;

import com.iboxz.ringer.domain.Notification;
import com.iboxz.ringer.exceptions.InternalServerErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin
public class NotificationController {


    private final SimpMessagingTemplate template;

    @Autowired
    NotificationController(SimpMessagingTemplate template){

        this.template = template;

    }
    @PostMapping(value = "/send")
    public ResponseEntity<?> saveNotification(@RequestBody Notification notification) throws InternalServerErrorException
    {
        this.template.convertAndSendToUser(notification.getReceiver(),"/notif",notification.getMessage());
        return new ResponseEntity<>(notification, HttpStatus.CREATED);
    }



}
