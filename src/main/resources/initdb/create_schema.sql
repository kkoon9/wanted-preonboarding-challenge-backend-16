-- schema.sql
CREATE TABLE IF NOT EXISTS `performances`
(
    `id`         BIGINT                                   NOT NULL AUTO_INCREMENT,
    `name`       varchar(255)                             NOT NULL COMMENT '공연/전시 이름',
    `round`      INT                                      NOT NULL COMMENT '회차',
    `type`       varchar(12)                              NOT NULL COMMENT 'NONE, CONCERT, EXHIBITION',
    `start_date` datetime                                 NOT NULL COMMENT '공연 일시',
    `can_reserve` tinyint                                 NOT NULL DEFAULT 1,
    `created_at` DATETIME   DEFAULT NOW()                 NOT NULL,
    `updated_at` DATETIME   DEFAULT NOW()                 NOT NUll,
    PRIMARY KEY (id),
    UNIQUE KEY (id, round)
);

CREATE TABLE IF NOT EXISTS `performance_seat_infos`
(
    `id`             BIGINT                 NOT NULL AUTO_INCREMENT,
    `performance_id` BIGINT                 NOT NULL COMMENT '공연전시ID',
    `price`      INT                        NOT NULL COMMENT '가격',
    `round`          INT                    NOT NULL COMMENT '회차(FK)',
    `gate`           INT                    NOT NULL COMMENT '입장 게이트',
    `line`           CHAR(2)                NOT NULL COMMENT '좌석 열',
    `seat`           INT                    NOT NULL COMMENT '좌석 행',
    `can_reserve` tinyint                   NOT NULL DEFAULT 1,
    `created_at`     DATETIME DEFAULT NOW() NOT NULL,
    `updated_at`     DATETIME DEFAULT NOW() NOT NUll,
    PRIMARY KEY (id),
    UNIQUE KEY performance_seat_info_unique (performance_id, round, `line`, seat)
);

CREATE TABLE IF NOT EXISTS `reservations`
(
    `id`                        BIGINT                 NOT NULL AUTO_INCREMENT,
    `performance_seat_infos_id` BIGINT                 NOT NULL COMMENT '공연전시ID',
    `user_id`                   BIGINT                 NOT NULL COMMENT '유저ID',
    `created_at`                DATETIME DEFAULT NOW() NOT NULL,
    `updated_at`                DATETIME DEFAULT NOW() NOT NUll,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS `users`
(
    `id`             BIGINT                 NOT NULL AUTO_INCREMENT,
    `name`           varchar(255)           NOT NULL COMMENT '예약자명',
    `phone_number`   varchar(255)           NOT NULL COMMENT '예약자 휴대전화 번호',
    `created_at`     DATETIME DEFAULT NOW() NOT NULL,
    `updated_at`     DATETIME DEFAULT NOW() NOT NUll,
    PRIMARY KEY (id)
    );

