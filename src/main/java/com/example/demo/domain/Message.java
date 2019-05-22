package com.example.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;


@Data
public class Message {

    private String id;    //id

    private Integer code;  //返回码

    private String msg; //消息

    private Date startTime;  //时间戳

    private Date sendTime;  //时间戳

    private String logPath; //日志地址
}
