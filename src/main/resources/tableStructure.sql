create table media_file (
       id bigint not null auto_increment,
        content longblob,
        name varchar(255),
        type varchar(255),
        primary key (id)
    )

    create table psychometric_form (
       form_id bigint not null auto_increment,
        question1 varchar(32),
        question10 varchar(10),
        question100 varchar(10),
        question101 varchar(10),
        question102 varchar(10),
        question103 varchar(10),
        question104 varchar(10),
        question11 varchar(10),
        question12 varchar(10),
        question13 varchar(10),
        question14 varchar(10),
        question15 varchar(10),
        question16 varchar(10),
        question17 varchar(10),
        question18 varchar(10),
        question19 varchar(10),
        question2 varchar(32),
        question20 varchar(10),
        question21 varchar(10),
        question22 varchar(10),
        question23 varchar(10),
        question24 varchar(10),
        question25 varchar(10),
        question26 varchar(10),
        question27 varchar(10),
        question28 varchar(10),
        question29 varchar(10),
        question30 varchar(10),
        question31 varchar(10),
        question32 varchar(10),
        question33 varchar(10),
        question34 varchar(10),
        question35 varchar(10),
        question36 varchar(10),
        question37 varchar(10),
        question38 varchar(10),
        question39 varchar(10),
        question4 varchar(16),
        question40 varchar(10),
        question41 varchar(10),
        question42 varchar(10),
        question43 varchar(10),
        question44 varchar(10),
        question45 varchar(10),
        question46 varchar(10),
        question47 varchar(10),
        question48 varchar(10),
        question49 varchar(10),
        question5 varchar(10),
        question50 varchar(10),
        question51 varchar(10),
        question52 varchar(10),
        question53 varchar(10),
        question54 varchar(10),
        question55 varchar(10),
        question56 varchar(10),
        question57 varchar(10),
        question58 varchar(10),
        question59 varchar(10),
        question6 varchar(10),
        question60 varchar(10),
        question61 varchar(10),
        question62 varchar(10),
        question63 varchar(10),
        question64 varchar(10),
        question65 varchar(10),
        question66 varchar(10),
        question67 varchar(10),
        question68 varchar(10),
        question69 varchar(10),
        question7 varchar(10),
        question70 varchar(10),
        question71 varchar(10),
        question72 varchar(10),
        question73 varchar(10),
        question74 varchar(10),
        question75 varchar(10),
        question76 varchar(10),
        question77 varchar(10),
        question78 varchar(10),
        question79 varchar(10),
        question8 varchar(10),
        question80 varchar(10),
        question81 varchar(10),
        question82 varchar(10),
        question83 varchar(10),
        question84 varchar(10),
        question85 varchar(10),
        question86 varchar(10),
        question87 varchar(10),
        question88 varchar(10),
        question89 varchar(10),
        question9 varchar(10),
        question90 varchar(10),
        question91 varchar(10),
        question92 varchar(10),
        question93 varchar(10),
        question94 varchar(10),
        question95 varchar(10),
        question96 varchar(10),
        question97 varchar(10),
        question98 varchar(10),
        question99 varchar(10),
        file_id bigint,
        primary key (form_id)
    )

    alter table psychometric_form
       add constraint FK9yw13ejin77t6s83va9ev28m4
       foreign key (file_id)
       references media_file (id)