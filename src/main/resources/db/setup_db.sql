create database if not exists PerozonBlog_db;
create user if not exists 'blog_user'@'localhost' identified by 'blog123';
grant all privileges on PerozonBlog_db.* to 'blog_user'@'localhost';
flush privileges;
