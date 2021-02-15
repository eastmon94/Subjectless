drop table if exists `user`;

create table `user` (
	`num` int auto_increment,
	`user_id` varchar(128) not null,
	`email` varchar(128) not null,
	`password` varchar(128) not null,
	`name` varchar(30) default null,
	`create_date` datetime not null default current_timestamp,
	primary key(`num`),
	unique key `unique_userid` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;