package ru.fischerski.shamalnotepad.db.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.fischerski.shamalnotepad.db.dao.enums.Mode;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id", nullable = false)
    private Long documentId;


    @Column(name = "title", unique = true)
    private String title;

    @Column(name = "note")
    private String note;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "mode")
    private Mode mode;
}