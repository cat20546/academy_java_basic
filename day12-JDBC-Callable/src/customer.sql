-- day12-JDBC-Callable

-- Customer 테이블을 생성 후 작업
-- 존재하는 객체 먼저 drop

drop table customer;
drop procedure sp_insert_customer;
drop sequence seq_cust_userid;

-- 1. CUSTOMER table DDL
CREATE TABLE customer
(  userid       VARCHAR2(4)
 , name         VARCHAR2(15)   NOT NULL
 , birthyear    NUMBER(4)
 , address      VARCHAR2(50)
 , phone        VARCHAR2(13)
 , grade        VARCHAR2(6) DEFAULT 'SILVER' 
 , regdate      DATE        DEFAULT SYSDATE
 , moddate      DATE
 , CONSTRAINT pk_customer_userid PRIMARY KEY (userid)
 , CONSTRAINT ck_customer_grade CHECK (grade IN ('SILVER', 'GOLD', 'VIP'))
);

-- Table CUSTOMER이(가) 생성되었습니다.


-- 2. SEQ_CUST_USERID sequence DDL
CREATE SEQUENCE seq_cust_userid
START WITH 1
NOCYCLE;

-- Sequence SEQ_CUST_USERID이(가) 생성되었습니다.


-- 3. SP_INSERT_CUSTOMER procedure DDL
CREATE OR REPLACE PROCEDURE SP_INSERT_CUSTOMER
(  v_name       IN  customer.name%TYPE
 , v_address    IN  customer.address%TYPE
 , v_phone      IN  customer.phone%TYPE
 , v_msg        OUT VARCHAR2
)
IS
    -- 신규로 자동 생성되는 유저아이디를 저장할 변수
    v_new_userid    customer.userid%TYPE;    
BEGIN
    -- 유저 아이디 자동 생성
    v_new_userid := 'C' || LPAD(seq_cust_userid.nextval, 3, '0');
    
    -- 생성된 아이디, 매개변수로 입력된 이름, 주소, 전화번호로 INSERT
    INSERT INTO customer(userid, name, address, phone)
    VALUES (v_new_userid, v_name, v_address, v_phone)
    ;
    
    -- 커밋
    commit;
    
    -- 저장된 아이디 및 유저 정보 출력 메시지 작성
    v_msg := v_new_userid || ' : ' || v_name || ' 정보가 저장되었습니다.';
    
    
END SP_INSERT_CUSTOMER;
/

SET SERVEROUTPUT ON
SHOW ERRORS

-- Procedure SP_INSERT_CUSTOMER이(가) 컴파일되었습니다.



