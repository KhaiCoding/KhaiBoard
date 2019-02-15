package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "freeboard")
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "freeid")    //  _를 사용한 변수를 사용할 경우 에러를 유발, _앞까지만 인식하기때문
    private Long freeid;

    @Column(name="content")
    private String content;

    @Column(name = "title")
    private String title;

    @Column(name = "writer")
    private String writer;

}
