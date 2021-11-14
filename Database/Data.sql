/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data Department
INSERT INTO Department	(DepartmentName, author_id	,	CreateDate	 ,	ModifiedDate)
VALUES                  (N'Marketing'	,	5		,	'2020-03-05' ,	'2020-03-05'),
						(N'Sale'		,	1		,	'2020-03-07' ,	'2020-03-07'),
						(N'Bảo vệ'		,	2		,	'2020-03-08' ,	'2020-03-08'),
						(N'Nhân sự'		,	3		,	'2020-03-10' ,	'2020-03-10'),
						(N'Kỹ thuật'	,	4		,	NOW()		 ,	NOW()		),
						(N'Tài chính'	,	6		,	NOW()		 ,	NOW()		),
						(N'Phó giám đốc',	7		,	'2020-04-07' ,	'2020-04-07'),
						(N'Giám đốc'	,	8		,	'2020-04-07' ,	'2020-04-07'),
						(N'Thư kí'		,	9		,	'2020-04-09' ,	'2020-04-09'),
						(N'Bán hàng'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng1'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng2'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng3'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng4'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng5'	,	5		,	'2020-04-09' ,	'2020-04-09'),
                        (N'Bán hàng6'	,	5		,	'2020-04-09' ,	'2020-04-09');

-- Add data Account
-- password: 123456
INSERT INTO `Account`(Email								, Username			,	`password`,															FirstName,		LastName,		 DepartmentID	,	CreateDate		,	`Role`		)
VALUES 				('haidang29productions@gmail.com'	, 'dangblack'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Phan'	,		'Thị Hằng'	,   '1'			,	'2020-03-05'	,	'Admin'		),
					('account1@gmail.com'				, 'quanganh'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Anh'	,		'Tong Quang'	,   '1'			,	'2020-03-05'	,	'Admin'		),
                    ('account2@gmail.com'				, 'vanchien'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Chien',		'Nguyen Van'	,   '2'			,	'2020-03-07'	,	'User'		),
                    ('account3@gmail.com'				, 'cocoduongqua'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Do'	,		'Duong'			,   '3'			,	'2020-03-08'	,	'User'		),
                    ('account4@gmail.com'				, 'doccocaubai'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Thang',		'Nguyen Chien'  ,   '4'			,	'2020-03-10'	,	'User'		),
                    ('dapphatchetngay@gmail.com'		, 'khabanh'			,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Kha'	,		'Ngo Ba'		,   '1'			,	NOW()			,	'Admin'		),
                    ('songcodaoly@gmail.com'			, 'huanhoahong'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Huan'	,		'Bui Xuan'		,   '7'			,	NOW()			,	'Admin'		),
                    ('sontungmtp@gmail.com'				, 'tungnui'			,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Tung'	,		'Nguyen Thanh'	,   '8'			,	'2020-04-07'	,	'Admin'		),
                    ('duongghuu@gmail.com'				, 'duongghuu'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Huu'	,		'Duong Van'		,   '9'			,	'2020-04-07'	,	'Admin'		),
                    ('vtiaccademy@gmail.com'			, 'vtiaccademy'		,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'le'	,		'van toan'		,   '10'		,	'2021-05-09'	,	'Manager'	),
                    ('vtiaccademe@gmail.com'			, 'vtiaccademy1'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'le'	,		'cong phương'	,   '10'		,	'2020-06-09'	,	'Manager'	),
                    ('vtiaccademy2@gmail.com'			, 'vtiaccademy2'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'do'	,		'Vi Tinh'		,   '10'		,	'2020-07-09'	,	'Manager'	),
                    ('vtiaccademy3@gmail.com'			, 'vtiaccademy3'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'Ai'	,		'Van Ti'		,   '10'		,	'2021-04-09'	,	'User'	),
                    ('vtiaccademy4@gmail.com'			, 'vtiaccademy4'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'ha'	,		'Vi Toan'		,   '10'		,	'2020-09-09'	,	'User'	),
                    ('vtiaccademy5@gmail.com'			, 'vtiaccademy5'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'do'	,		'hai Ti'		,   '10'		,	'2018-02-09'	,	'Manager'	),
                    ('vtiaccademy6@gmail.com'			, 'vtiaccademy6'	,	'$2a$10$W2neF9.6Agi6kAKVq8q3fec5dHW8KUA.b0VSIGdIZyUravfLpyIFi',		'tran'	,		'Vi Tuan'		,   '10'		,	'2016-01-09'	,	'Manager'	);
ALTER TABLE Department
ADD FOREIGN KEY (author_id) REFERENCES `Account`(AccountID);