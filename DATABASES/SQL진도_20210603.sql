--DESC: Description ���̺���������
DESC dept;
--select: ���̺��� ��ȸ
SELECT
concat(deptno,' ��') as "�μ���ȣ"
,dname as "�μ���"
,concat(loc,'��') as "��ġ"
FROM dept
WHERE loc = 'NEW YORK';
-- DUAL �������̺��̸�. ���̺��� ���� ������ select �Ҷ�
SELECT 3+5 as "3���ϱ�8��" from dual;
--���ڵ� (row) : �÷�(�ʵ�field)�鵵 ����
SELECT concat (count(*),'��') as "������ 2000�� ����" FROM emp WHERE sal > 1000;
--ū����ǥ(�ʵ��),��������ǥ(����ó��=��,����)
SELECT * FROM emp WHERE ename != 'KING';
SELECT * FROM emp WHERE hiredate >= '1982/01/01';
-- OR�� +(������),AND�� x(������)
SELECT * FROM emp
WHERE deptno = 10 OR job = 'MANAGER';
SELECT * FROM emp WHERE sal
NOT BETWEEN 2000 AND 3000;
SELECT * FROM emp WHERE hiredate
between '1981/01/01' AND '1981.12.31';
SELECT * FROM emp WHERE comm 
NOT IN (300,500,1400);
-- LIKE ��ȸ, ���ϵ�ī�� ��ȸ
--(��)Ű���忡 ��ȣ�� ������ �Լ�upper(),concat(),count()
SELECT * FROM emp WHERE ename LIKE upper('K%');
SELECT * FROM emp WHERE ename LIKE '%N';
-- null�� �� �߿��� ����:null���� ������ �˻�X
-- �׷���, null���� �ʵ忡 ������, �˻���?
SELECT * FROM emp WHERE comm IS NULL;
-- NVL(Null VaLue) �ΰ��� ��ġ�ϴ� �Լ�
-- ����߿� Ŀ�̼��� 0�� ���� �����? null ����� ���Ϸ���
-- �Ʒ� E�� emp���̺��� �˸��ƽ� ��Ī����  E.*�� emp.*�� ��������
SELECT nvl2(comm,0,100),E.* FROM emp E WHERE NVL(comm,0) >= 0;
-- NVL2(�ʵ��,���� �ƴҶ� 100, ���϶� 0)NVL(�ʵ��,���϶�0)
-- ����Ŭ�� ǥ������ x, ANSI���� ǥ��O�Դϴ�.
SELECT DECODE(comm,null,0,100),NVL2(comm,100,0),E.* FROM emp E WHERE NVL(comm,0) >= 0;
-- ������������ ���� sort = ���� order by �ʵ�� ��������[�ʱⰪ]|��������
-- (��)��������? (select������ �ߺ��Ǿ��ִ�...)�Դϴ�.
SELECT ROWNUM E.* FROM (--���̺�� 
SELECT * FROM emp ORDER BY sal DESC--��������
) E WHERE ROWNUM = 1;
-- �� �������������� �ؼ� �Ҷ��� ���ʺ��� �ؼ�
-- �� ���Ŀ��� 1� ���� limit�� Mysql(������DB)�� ��ɾ�.
-- Mysql(������DB)�ִ� AI(AutoIncrement)�ڵ������� ��� ����ŬX
-- �ߺ����ڵ�(row)�� �����ϴ� ��� distinct
SELECT deptno AS "�μ���ȣ" FROM emp;--�������� �μ���ȣ�� ���
SELECT DISTINCT deptno AS "�μ���ȣ" FROM emp;
-- (��)���ڿ��� �����Ҷ� concat�Լ��ܿ� || ���������� 2���� ���ļ� ����
SELECT ename ||' is a '|| job AS "���ڿ� ����" FROM emp;
-- ������� select ������ Read
-- ���Ŀ��� CRUD�߿� Insert,Update,Delete 3���� ������ ��



