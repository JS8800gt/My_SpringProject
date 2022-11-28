CREATE SEQUENCE SEQ_MEMBER;
DROP TABLE TBL_MEMBER;

CREATE TABLE TBL_MEMBER(
	MEMBER_NUMBER NUMBER CONSTRAINT PK_MEMBER PRIMARY KEY,
	MEMBER_ID VARCHAR2(20) UNIQUE,
	MEMBER_PW VARCHAR2(20),
	MEMBER_NAME VARCHAR2(25),
	MEMBER_EMAIL VARCHAR2(50) UNIQUE,
	MEMBER_PHONE_NUMBER VARCHAR2(11),
	MEMBER_GENDER VARCHAR2(25),
	MEMBER_BIRTH DATE,
	MEMBER_SIGNUP_DATE DATE,
	MEMBER_TYPE VARCHAR2(25),
	MEMBER_STATUS VARCHAR2(10)
);

SELECT * FROM TBL_MEMBER;