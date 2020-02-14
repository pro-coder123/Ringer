package com.iboxz.ringer.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Notification {

    @Id
    private int id;
    private String sender, receiver, message; // message will be a string of sender space channel name
    private boolean call_status;

}
