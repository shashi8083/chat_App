package org.jsp.chat.model;

import lombok.*;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
    private String senderName;
	@Column(nullable = false)
    private String receiverName;
	@Column(nullable = false)
    private String message;
	@Column(nullable = false)
    private String date;
	@Column(nullable = false)
    private Status status;
}
