package com.example.psychometricanalysis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "media_file")
@NoArgsConstructor
public class MediaFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    @Lob
    private byte[] content;

    public MediaFile(String name, String type, byte[] content) {
        this.name = name;
        this.type = type;
        this.content = content;
    }
}
