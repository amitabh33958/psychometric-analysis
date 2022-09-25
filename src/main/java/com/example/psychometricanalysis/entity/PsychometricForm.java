package com.example.psychometricanalysis.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "psychometric_form")
public class PsychometricForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formId;

    @Column(length = 32)
    private String question1;

    @Column(length = 32)
    private String question2;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fileId")
    private MediaFile mediaFile;

    @Column(length = 16)
    private String question4;

    @Column(length = 10)
    private String question5;

    @Column(length = 10)
    private String question6;

    @Column(length = 10)
    private String question7;

    @Column(length = 10)
    private String question8;

    @Column(length = 10)
    private String question9;

    @Column(length = 10)
    private String question10;

    @Column(length = 10)
    private String question11;

    @Column(length = 10)
    private String question12;

    @Column(length = 10)
    private String question13;

    @Column(length = 10)
    private String question14;

    @Column(length = 10)
    private String question15;

    @Column(length = 10)
    private String question16;

    @Column(length = 10)
    private String question17;

    @Column(length = 10)
    private String question18;

    @Column(length = 10)
    private String question19;

    @Column(length = 10)
    private String question20;

    @Column(length = 10)
    private String question21;

    @Column(length = 10)
    private String question22;

    @Column(length = 10)
    private String question23;

    @Column(length = 10)
    private String question24;

    @Column(length = 10)
    private String question25;

    @Column(length = 10)
    private String question26;

    @Column(length = 10)
    private String question27;

    @Column(length = 10)
    private String question28;

    @Column(length = 10)
    private String question29;

    @Column(length = 10)
    private String question30;

    @Column(length = 10)
    private String question31;

    @Column(length = 10)
    private String question32;

    @Column(length = 10)
    private String question33;

    @Column(length = 10)
    private String question34;

    @Column(length = 10)
    private String question35;

    @Column(length = 10)
    private String question36;

    @Column(length = 10)
    private String question37;

    @Column(length = 10)
    private String question38;

    @Column(length = 10)
    private String question39;

    @Column(length = 10)
    private String question40;

    @Column(length = 10)
    private String question41;

    @Column(length = 10)
    private String question42;

    @Column(length = 10)
    private String question43;

    @Column(length = 10)
    private String question44;

    @Column(length = 10)
    private String question45;

    @Column(length = 10)
    private String question46;

    @Column(length = 10)
    private String question47;

    @Column(length = 10)
    private String question48;

    @Column(length = 10)
    private String question49;

    @Column(length = 10)
    private String question50;

    @Column(length = 10)
    private String question51;

    @Column(length = 10)
    private String question52;

    @Column(length = 10)
    private String question53;

    @Column(length = 10)
    private String question54;

    @Column(length = 10)
    private String question55;

    @Column(length = 10)
    private String question56;

    @Column(length = 10)
    private String question57;

    @Column(length = 10)
    private String question58;

    @Column(length = 10)
    private String question59;

    @Column(length = 10)
    private String question60;

    @Column(length = 10)
    private String question61;

    @Column(length = 10)
    private String question62;

    @Column(length = 10)
    private String question63;

    @Column(length = 10)
    private String question64;

    @Column(length = 10)
    private String question65;

    @Column(length = 10)
    private String question66;

    @Column(length = 10)
    private String question67;

    @Column(length = 10)
    private String question68;

    @Column(length = 10)
    private String question69;

    @Column(length = 10)
    private String question70;

    @Column(length = 10)
    private String question71;

    @Column(length = 10)
    private String question72;

    @Column(length = 10)
    private String question73;

    @Column(length = 10)
    private String question74;

    @Column(length = 10)
    private String question75;

    @Column(length = 10)
    private String question76;

    @Column(length = 10)
    private String question77;

    @Column(length = 10)
    private String question78;

    @Column(length = 10)
    private String question79;

    @Column(length = 10)
    private String question80;

    @Column(length = 10)
    private String question81;

    @Column(length = 10)
    private String question82;

    @Column(length = 10)
    private String question83;

    @Column(length = 10)
    private String question84;

    @Column(length = 10)
    private String question85;

    @Column(length = 10)
    private String question86;

    @Column(length = 10)
    private String question87;

    @Column(length = 10)
    private String question88;

    @Column(length = 10)
    private String question89;

    @Column(length = 10)
    private String question90;

    @Column(length = 10)
    private String question91;

    @Column(length = 10)
    private String question92;

    @Column(length = 10)
    private String question93;

    @Column(length = 10)
    private String question94;

    @Column(length = 10)
    private String question95;

    @Column(length = 10)
    private String question96;

    @Column(length = 10)
    private String question97;

    @Column(length = 10)
    private String question98;

    @Column(length = 10)
    private String question99;

    @Column(length = 10)
    private String question100;

    @Column(length = 10)
    private String question101;

    @Column(length = 10)
    private String question102;

    @Column(length = 10)
    private String question103;

    @Column(length = 10)
    private String question104;

    public PsychometricForm(String question1, String question2, MediaFile mediaFile, String question4, String question5, String question6, String question7, String question8, String question9, String question10, String question11, String question12, String question13, String question14, String question15, String question16, String question17, String question18, String question19, String question20, String question21, String question22, String question23, String question24, String question25, String question26, String question27, String question28, String question29, String question30, String question31, String question32, String question33, String question34, String question35, String question36, String question37, String question38, String question39, String question40, String question41, String question42, String question43, String question44, String question45, String question46, String question47, String question48, String question49, String question50, String question51, String question52, String question53, String question54, String question55, String question56, String question57, String question58, String question59, String question60, String question61, String question62, String question63, String question64, String question65, String question66, String question67, String question68, String question69, String question70, String question71, String question72, String question73, String question74, String question75, String question76, String question77, String question78, String question79, String question80, String question81, String question82, String question83, String question84, String question85, String question86, String question87, String question88, String question89, String question90, String question91, String question92, String question93, String question94, String question95, String question96, String question97, String question98, String question99, String question100, String question101, String question102, String question103, String question104) {
        this.question1 = question1;
        this.question2 = question2;
        this.mediaFile = mediaFile;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.question7 = question7;
        this.question8 = question8;
        this.question9 = question9;
        this.question10 = question10;
        this.question11 = question11;
        this.question12 = question12;
        this.question13 = question13;
        this.question14 = question14;
        this.question15 = question15;
        this.question16 = question16;
        this.question17 = question17;
        this.question18 = question18;
        this.question19 = question19;
        this.question20 = question20;
        this.question21 = question21;
        this.question22 = question22;
        this.question23 = question23;
        this.question24 = question24;
        this.question25 = question25;
        this.question26 = question26;
        this.question27 = question27;
        this.question28 = question28;
        this.question29 = question29;
        this.question30 = question30;
        this.question31 = question31;
        this.question32 = question32;
        this.question33 = question33;
        this.question34 = question34;
        this.question35 = question35;
        this.question36 = question36;
        this.question37 = question37;
        this.question38 = question38;
        this.question39 = question39;
        this.question40 = question40;
        this.question41 = question41;
        this.question42 = question42;
        this.question43 = question43;
        this.question44 = question44;
        this.question45 = question45;
        this.question46 = question46;
        this.question47 = question47;
        this.question48 = question48;
        this.question49 = question49;
        this.question50 = question50;
        this.question51 = question51;
        this.question52 = question52;
        this.question53 = question53;
        this.question54 = question54;
        this.question55 = question55;
        this.question56 = question56;
        this.question57 = question57;
        this.question58 = question58;
        this.question59 = question59;
        this.question60 = question60;
        this.question61 = question61;
        this.question62 = question62;
        this.question63 = question63;
        this.question64 = question64;
        this.question65 = question65;
        this.question66 = question66;
        this.question67 = question67;
        this.question68 = question68;
        this.question69 = question69;
        this.question70 = question70;
        this.question71 = question71;
        this.question72 = question72;
        this.question73 = question73;
        this.question74 = question74;
        this.question75 = question75;
        this.question76 = question76;
        this.question77 = question77;
        this.question78 = question78;
        this.question79 = question79;
        this.question80 = question80;
        this.question81 = question81;
        this.question82 = question82;
        this.question83 = question83;
        this.question84 = question84;
        this.question85 = question85;
        this.question86 = question86;
        this.question87 = question87;
        this.question88 = question88;
        this.question89 = question89;
        this.question90 = question90;
        this.question91 = question91;
        this.question92 = question92;
        this.question93 = question93;
        this.question94 = question94;
        this.question95 = question95;
        this.question96 = question96;
        this.question97 = question97;
        this.question98 = question98;
        this.question99 = question99;
        this.question100 = question100;
        this.question101 = question101;
        this.question102 = question102;
        this.question103 = question103;
        this.question104 = question104;
    }
}
