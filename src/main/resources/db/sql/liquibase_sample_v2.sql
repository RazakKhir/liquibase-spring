CREATE TABLE `liquibase_test_v2` (
    `id` binary(16) NOT NULL,
    `description` varchar(255) DEFAULT NULL,
    `created_user` varchar(50) DEFAULT NULL,
    `version` int(11) NOT NULL DEFAULT '0',
    `active` bit(1) NOT NULL DEFAULT b'1',
    PRIMARY KEY (`id`)
)DEFAULT CHARSET=utf8;