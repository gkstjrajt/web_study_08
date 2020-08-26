-- 계정 추가 및 권한 부여 --
	-- 현재 연결 계정 확인
SELECT USER FROM DUAL;

-- 계정 생성
CREATE USER JSP_STUDY IDENTIFIED BY rootroot;

-- 계정 권한 부여
GRANT CONNECT, RESOURCE, CREATE SYNONYM, CREATE VIEW TO JSP_STUDY;

-- 계정 확인
SELECT * 
  FROM DBA_USERS
 WHERE USERNAME = 'JSP_STUDY';
