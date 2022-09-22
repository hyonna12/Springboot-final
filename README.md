# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요


### 테이블 생성
```sql
create table stadium(
    id int primary KEY auto_increment,
    name VARCHAR(100) UNIQUE NOT null,
    createDate TIMESTAMP
);

create table team(
    id int primary KEY auto_increment,
    stadiumId int,
    name VARCHAR(100) UNIQUE NOT null,
    region VARCHAR(100) UNIQUE NOT NULL,
    createDate TIMESTAMP
);

create table player(
    id int primary KEY auto_increment,
    name varchar(100) unique not null,
    number INT,
    teamId int,
    position varchar(100) not null,
    createDate TIMESTAMP
);

CREATE TABLE expulsion(
	 id int auto_increment primary key,
    reason varchar(100) ubasedbnique not null,
    playerId int,
    createDate timestamp
);
```

### 더미데이터 추가
```sql
INSERT into stadium(name,createDate)
VALUES("사직야구장",now());
INSERT into stadium(name,createDate)
VALUES("삼성야구장",now());
INSERT into stadium(name,createDate)
VALUES("잠실야구장",now());


INSERT into team(stadiumId,name,region,createDate)
VALUES(1,"롯데","부산" ,now());
INSERT into team(stadiumId,name,region,createDate)
VALUES(2,"삼성","대구" ,now());
INSERT into team(stadiumId,name,region,createDate)
VALUES(3,"두산","서울",now());   


INSERT into player(name,number,teamId,position,createDate)
VALUES("강민성",79,1,"투수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("김동욱",76,1,"내야수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("고승민",65,1,"외야수",NOW());

INSERT into player(name,number,teamId,position,createDate)
VALUES("원태인",18,2,"투수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("김선우",114,2,"내야수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("구자욱",5,2,"외야수",NOW());

INSERT into player(name,number,teamId,position,createDate)
VALUES("박치국",1,3,"투수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("안재석",3,3,"내야수",now());
INSERT into player(name,number,teamId,position,createDate)
VALUES("정수빈",31,3,"외야수",now());

```