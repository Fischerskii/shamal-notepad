package ru.fischerski.shamalnotepad.db.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Table(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chapter_id", nullable = false)
    private Long chapterId;

    @Column(name = "chapter_name")
    private String chapterName;

    @Column(name = "document_contains")
    private String documentContains;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chapter)) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(chapterId, chapter.chapterId) && Objects.equals(chapterName, chapter.chapterName) && Objects.equals(documentContains, chapter.documentContains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapterId, chapterName, documentContains);
    }
}