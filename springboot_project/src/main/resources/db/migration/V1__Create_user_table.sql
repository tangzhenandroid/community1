create table USER
(
  ID           INTEGER  auto_increment,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR,
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT,
  constraint USER_PK
    primary key (ID)
);