-- 1. create table book
DROP TABLE book CASCADE CONSTRAINTS;
CREATE TABLE book
(  bookid      VARCHAR2(5) 
 , title       VARCHAR2(200)   NOT NULL
 , author      VARCHAR2(50)    NOT NULL
 , price       NUMBER(10)
 , isbn        VARCHAR2(13)
 , publish     VARCHAR2(30)
 , regdate     DATE    DEFAULT sysdate
 , moddate     DATE
 , CONSTRAINT pk_book PRIMARY KEY (bookid)
);
