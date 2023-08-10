
set names utf8mb4;
drop database if exists `eattingwhat`;
create database `eattingwhat`;
use `eattingwhat`;


CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `ssuper` int(11) DEFAULT NULL,
  `redpaper` int(11) DEFAULT NULL,
  `reg_member` datetime DEFAULT NULL,
  `past_member` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20170005 DEFAULT CHARSET=utf8mb4;


INSERT INTO `customer` VALUES ('20170001', '2017764402.jpg', '小a', '123456', '18475961111', '广东省湛江市岭南师范学院新民B', '2019-09-30 00:00:00', '2020-06-24 22:43:32', '2', '4', '2019-09-30 00:00:00', '2021-09-30 00:00:00');
INSERT INTO `customer` VALUES ('20170002', 'default_user_logo.jpg', '小b', '123456', '18475962222', '广东省湛江市岭南师范学院新民B', '2019-09-30 00:00:00', '2020-06-24 22:44:08', '2', '0', null, null);
INSERT INTO `customer` VALUES ('20170003', 'default_user_logo.jpg', '小c', '123456', '18475963333', '广东省湛江市岭南师范学院新民B', '2019-09-30 00:00:00', '2020-06-16 16:38:43', '2', '6', '2019-09-30 00:00:00', '2020-03-30 00:00:00');


CREATE TABLE `dishes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `store_id` int(11) DEFAULT NULL COMMENT '商店id',
  `name` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `describle` varchar(100) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60170028 DEFAULT CHARSET=utf8mb4;


INSERT INTO `dishes` VALUES ('60170001', '40170001', '毛血旺烤鱼', '13.5', '11+1种味道，热辣集结过足瘾', '401700011.png');
INSERT INTO `dishes` VALUES ('60170002', '40170001', '重庆豆花烤鱼', '13.5', '温柔，就是你夹起豆花的时候', '401700012.png');
INSERT INTO `dishes` VALUES ('60170003', '40170001', '鲜青椒烤鱼', '13.5', '不管我给你多少青椒，你都会喜欢我', '401700013.png');
INSERT INTO `dishes` VALUES ('60170004', '40170001', '香辣排骨虾', '13.5', '一个干锅里的麻辣梦', '401700015.png');
INSERT INTO `dishes` VALUES ('60170005', '40170001', '串烤牛蛙', '13.5', '来，串烧界的喷香大长腿', '401700016.png');
INSERT INTO `dishes` VALUES ('60170006', '40170002', '汉堡包', '13.5', '百分百纯牛肉只以少许盐与胡椒调味配搭爽脆酸瓜洋葱粒与美味番茄醬经典滋味让你无法抵挡!', '401700021.png');
INSERT INTO `dishes` VALUES ('60170007', '40170002', '吉士汉堡包', '13.5', '百分百纯牛肉与香软芝士融为一体配合爽脆酸瓜洋葱粒与美味番茄醬丰富口感一咬即刻涌现！', '401700022.png');
INSERT INTO `dishes` VALUES ('60170008', '40170002', '双层吉士汉堡', '13.5', '百分百纯牛肉与双层香软芝士融为一体，加上松软面包及美味酱料，两倍滋味诱惑，无人能挡！', '401700023.png');
INSERT INTO `dishes` VALUES ('60170009', '40170002', '麦香鸡', '13.5', '清脆爽口的生菜，给你植物纤维；金黄酥脆的鸡肉则来自精心培育的优质嫩鸡。营养配搭，让你多一个好滋味的健康选择。', '401700024.png');
INSERT INTO `dishes` VALUES ('60170010', '40170002', '麦香鱼', '13.5', '鱼柳由阿拉斯加狭鳕鱼制成，外皮炸得金黄酥脆，内里又保留了鱼肉的鲜嫩多汁。美味鱼肉与滋味沙拉酱配搭，风味独特。', '401700025.png');
INSERT INTO `dishes` VALUES ('60170011', '40170002', '麦辣鸡腿汉堡', '13.5', '金黄脆辣的外皮，里面是鲜嫩幼滑的鸡腿肉，搭配清爽生菜和美味沙拉酱，多重滋味，一次打动您挑剔的味蕾。', '401700026.png');
INSERT INTO `dishes` VALUES ('60170012', '40170002', '培根蔬萃双层牛堡', '13.5', '一层爽脆生菜，一片鲜番茄，两片培根，两片牛肉，一层特别酱料！一口咬下去，超满足啦！', '401700026.png');
INSERT INTO `dishes` VALUES ('60170013', '40170002', '巨无霸', '13.5', '两块百分百纯牛肉，搭配洒有鲜芝麻的松软面包、清新爽口的生菜、洋葱和酸黄瓜!', '401700026.png');
INSERT INTO `dishes` VALUES ('60170014', '40170002', '原味板烧鸡腿堡', '13.5', '原块去骨鸡排嫩滑多汁，加洋葱及胡椒调味，与翠绿新鲜的生菜和香浓烧鸡酱搭配，口感丰富!', '401700026.png');
INSERT INTO `dishes` VALUES ('60170015', '40170003', '肯德基金汤肥牛饭', '36.5', '1份肯德基金汤肥牛饭+1份香辣鸡翅（2块装）或1块吮指原味鸡+ 1杯百事可乐（中）或1份芙蓉荟蔬汤', 'KFC金汤肥牛饭.jpg');
INSERT INTO `dishes` VALUES ('60170016', '40170003', '香辣鸡腿堡单人餐', '33.5', '1份香辣鸡腿堡+1份新奥尔良烤翅+1杯百事可乐(大)', '香辣鸡腿堡单人餐.jpg');
INSERT INTO `dishes` VALUES ('60170017', '40170003', '小龙虾单人餐', '35', '2个干煸风味小龙虾塔可青年+1份香辣黄金鸡柳（4条装）/1份薯条（中）+1杯百事可乐（中）', '干煸风味小龙虾塔可青年单人餐.jpg');
INSERT INTO `dishes` VALUES ('60170018', '40170003', '缤纷畅享双人餐', '70', '香辣鸡腿堡*1+新奥尔良烤鸡腿堡*1+劲爆鸡米花(小)*1+热辣香骨鸡（3块装）*2+黄金鸡块(5块装)*1+2杯百事可乐（中）', '缤纷畅享双人餐.jpg');
INSERT INTO `dishes` VALUES ('60170019', '40170005', '酸奶杨枝甘露', '14', '在杨枝甘露中添加酸奶，使其口感更佳。酸奶开胃，杨枝甘露养胃，另添加西米露，让其口感更上一层楼！', '酸奶杨枝甘露.jpg');
INSERT INTO `dishes` VALUES ('60170020', '40170005', '青蛙撞奶', '17', '青蛙撞奶是由一层撞奶作为铺底，加上黑糖和具有嚼劲的黑糖珍珠，上面再加上一层奶油，其口感丰富，绝对让你赞不绝口！', '青蛙撞奶.jpg');
INSERT INTO `dishes` VALUES ('60170021', '40170005', '金桔柠檬', '10', '金桔柠檬是由手打的而并非机器打的柠檬汁构成，再加上一两块现打金桔以及一两片柠檬，其口感又酸爽解渴又回味甘甜！', '金桔柠檬.jpg');
INSERT INTO `dishes` VALUES ('60170022', '40170005', '23号杨枝甘露', '17', '杨枝甘露23号是吸取前面顾客对于杨枝甘露的回馈，进而加以改进的杨枝甘露新品，绝对让你品尝出不一样的杨枝甘露。', '23号杨枝甘露.jpg');
INSERT INTO `dishes` VALUES ('60170023', '40170008', '羊肉串10串', '15', '采用早上购买的新鲜羊肉，经过短时间的串成串，及时冷冻后，待到晚上，解冻后恢复肉感，再将其烤成串，力保口感味道不流失。', '羊肉串10串.jpg');
INSERT INTO `dishes` VALUES ('60170024', '40170008', '精品套餐', '39.9', '包含了本店拿手好菜，适合1~2人食用。', '精品套餐.jpg');
INSERT INTO `dishes` VALUES ('60170025', '40170008', '魅力把把烧套餐', '79.9', '主打本店串串烧，既让你能吃，也让你够吃。适合1~2人食用。', '魅力把把烧套餐.jpg');
INSERT INTO `dishes` VALUES ('60170026', '40170008', '快乐小聚四人套餐', '158.8', '既有本店拿手烧烤，也有本店拿手好串，还附赠一瓶大可乐。适合4人食用。', '快乐小聚四人套餐.jpg');
INSERT INTO `dishes` VALUES ('60170027', '40170008', '热辣欢聚多人套餐', '258', '主打香辣口味，既有拿手好菜小龙虾，还有麻辣鲜香羊肉串等，让你辣的过瘾！适合4~5人食用。', '热辣欢聚多人套餐.jpg');


CREATE TABLE `evaluation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `anonymity` int(11) DEFAULT NULL,
  `customer_id` int(11) DEFAULT NULL,
  `customer_image` varchar(255) DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `ordering_id` int(11) DEFAULT NULL,
  `store_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `evaluation` varchar(255) DEFAULT NULL,
  `image1` varchar(255) DEFAULT NULL,
  `image2` varchar(255) DEFAULT NULL,
  `image3` varchar(255) DEFAULT NULL,
  `image4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70170003 DEFAULT CHARSET=utf8mb4;


INSERT INTO `evaluation` VALUES ('70170001', '0', '20170001', '2017764402.jpg', '小a', '50170003', '40170001', '2020-06-21 11:29:18', '5', '就在印象汇负一楼，挺好找到的，经常来它家吃烤鱼，价格实惠，烤鱼味道也很不错，生意很不错，经常都是需要排队一段时间才能等到位置，服务态度也不错。', '1da42303dc5243a3a8582984a9295671.jpg', '95dceee8abee4aaeb1dece3d2c53e24d.jpg', '4b56689380ed48a8987127bc6e5ea333.jpg', '7da7f3d23f3d40b2b25a9caff634e637.jpg');
INSERT INTO `evaluation` VALUES ('70170002', '1', '20170004', 'a5e09664856841e4a96c1a49add800ac.jpg', '18475963874', '50170004', '40170001', '2020-06-23 20:42:01', '5', 'qdawd', 'a7159f89371747a7bf5af7804d5dddea.jpg', '', '', '');


CREATE TABLE `ordering` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `deliverer_id` int(11) DEFAULT NULL,
  `store_id` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `ordering_state` int(11) DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `price_sum` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50170005 DEFAULT CHARSET=utf8mb4;


INSERT INTO `ordering` VALUES ('50170001', '20170001', '30170001', '40170002', '2020-06-16 16:46:08', '岭南师范学院新民B', '1', null, '121.5');
INSERT INTO `ordering` VALUES ('50170002', '20170001', '30170001', '40170005', '2020-06-16 16:46:23', '岭南师范学院新民B', '2', '2020-06-16 16:46:33', '197');
INSERT INTO `ordering` VALUES ('50170003', '20170001', '30170001', '40170001', '2020-06-21 11:17:18', '广东省湛江市岭南师范学院新民B', '3', '2020-06-21 11:18:41', '54');
INSERT INTO `ordering` VALUES ('50170004', '20170004', '30170001', '40170001', '2020-06-23 20:41:50', '广东省湛江赤坎区123123', '3', '2020-06-23 20:41:51', '13.5');


CREATE TABLE `ordering_dishes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ordering_id` int(11) DEFAULT NULL,
  `dishes_id` int(11) DEFAULT NULL,
  `dishes_name` varchar(45) DEFAULT NULL,
  `dishes_count` int(11) DEFAULT NULL,
  `dishes_price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8mb4;


INSERT INTO `ordering_dishes` VALUES ('1001', '50170001', '60170006', '汉堡包', '4', '13.5');
INSERT INTO `ordering_dishes` VALUES ('1002', '50170001', '60170007', '吉士汉堡包', '5', '13.5');
INSERT INTO `ordering_dishes` VALUES ('1003', '50170002', '60170019', '酸奶杨枝甘露', '3', '14');
INSERT INTO `ordering_dishes` VALUES ('1004', '50170002', '60170020', '青蛙撞奶', '1', '17');
INSERT INTO `ordering_dishes` VALUES ('1005', '50170002', '60170021', '金桔柠檬', '7', '10');
INSERT INTO `ordering_dishes` VALUES ('1006', '50170002', '60170022', '23号杨枝甘露', '4', '17');
INSERT INTO `ordering_dishes` VALUES ('1007', '50170003', '60170001', '毛血旺烤鱼', '4', '13.5');
INSERT INTO `ordering_dishes` VALUES ('1008', '50170004', '60170001', '毛血旺烤鱼', '1', '13.5');


CREATE TABLE `store` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  `last_login_date` datetime DEFAULT NULL,
  `ssuper` int(11) DEFAULT NULL,
  `monthly_sales` int(11) DEFAULT NULL,
  `store_mark` double DEFAULT NULL,
  `store_state` int(11) DEFAULT NULL,
  `describle` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `storefront` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40170012 DEFAULT CHARSET=utf8mb4;


INSERT INTO `store` VALUES ('40170001', '探鱼', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 16:38:42', '4', '1003', '4.1', '1', '作为专业的烤鱼品牌，探鱼从取名上就开始用心。探，有探索的意义，象征欢迎顾客来探鱼探寻美食美味，也象征着探鱼对美味的不断探索，不断创新的精神！\n探鱼希望带给大家童年情怀，顾客在探鱼餐厅不止是吃到美味，还能够有一些情感上的呼应和记忆，能够唤起一些甜蜜的美好的记忆。顾客在感受探鱼的时候，遇见了一个童年的自己。', '探鱼logo.png', '探鱼店面.jpg');
INSERT INTO `store` VALUES ('40170002', '麦当劳', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 16:38:42', '4', '1003', '4.1', '1', '麦当劳一直将食品安全与品质视为重中之重，将其贯穿于从田间到餐桌的每一个环节。从农业的种植、养殖；到工厂化的生产加工；再到流通环节的从分发中心\n配送到各个门店，传递给每位顾客，这是一个完整的过程。麦当劳只从经过严格选拔的供应商处采购食品原材料，并通过严格的供应商管理系统和标准确保始终为顾客提供安全和高品质的食品。', '麦当劳logo.png', '麦当劳店面.jpg');
INSERT INTO `store` VALUES ('40170003', '肯德基', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '肯德基一直都在努力探索，把贴心的服务回馈给广大中国消费者。如今中国肯德基已在1000多个城市和乡镇开设了5300余家连锁餐厅，遍及中国大陆的所有省、直辖市和自治区。其口号：\"生活如此多娇\"、\"尽情自在肯德基\"。', 'KFClogo.jpg', 'KFC店面.jpeg');
INSERT INTO `store` VALUES ('40170004', '510快餐', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '细心把握食品安全，旨在将美味带给顾客。以严待员工，以心待顾客。', '510logo.jpg', '510店面.jpg');
INSERT INTO `store` VALUES ('40170005', '心上饮', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '\"心上饮\"奶茶拥有独特配方，凭借极好口感和性价比赢得了奶茶行业的一致好评，拥有数十家运营良好的连锁加盟店。', '心上饮logo.jpg', '心上饮店面.jpg');
INSERT INTO `store` VALUES ('40170006', '红鼻子餐厅', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '多年来，红鼻子以特色经营为基础，以服务满意为保证，着力打造红鼻子品牌餐饮文化建设。专业的服务素质、温欣的笑容、华丽的装饰。红鼻子把顾客的满意作为餐厅发展的方向，给顾客带来愉快的心灵体验与高品味享受。', '红鼻子logo.jpg', '红鼻子店面.jpg');
INSERT INTO `store` VALUES ('40170007', '139餐厅', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '139倾心打造至高品味的美食场所，创立了最爱中餐、燕鲍翅精作房等特色餐饮品牌，将传统大型中餐与特色餐饮相结合，满足不同消费群体的不同需求。专业的团队，个性化的装修、极显人性化的亲和服务。', '139logo.jpg', '139店面.jpg');
INSERT INTO `store` VALUES ('40170008', '才记烧烤', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '学习海底捞公司的经营文化，\"体验美味、享受生活、拥有健康、共创卓越\"的发展理念，倡导\"用双手改变命运，靠勤奋实现梦想\"的价值取向，旨在将最好的服务提供给每个光临的顾客。', '才记烧烤logo.jpg', '才记烧烤店面.jpg');
INSERT INTO `store` VALUES ('40170009', '阿婆牛杂', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:33', '4', '1003', '4.1', '1', '阿婆牛杂馆专营牛肚、牛筋、牛百腩，采用进口原料秘制而成，搭配自制辣酱口感十足、原汁原味。', '阿婆牛杂logo.jpg', '阿婆牛杂店面.jpeg');
INSERT INTO `store` VALUES ('40170010', '云端风车', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:34', '4', '1003', '4.1', '1', '云端风车奶茶采用优质的材料制作而成，精选的珍珠，来自于椰子原产地的新鲜椰果，在注重健康的同时还加融入了中西方文化加以创造，使奶茶更具有丰富的口感和视觉冲击感。', '云端风车logo.jpg', '云端风车店面.jpg');
INSERT INTO `store` VALUES ('40170011', '咸骨粥饺子店', '1234', '0668-1234', '湛江赤坎区寸金四横路19号', '2012-09-30 00:00:00', '2020-06-16 08:15:34', '4', '1003', '4.1', '1', '在这里面你所喝到的粥不仅味道好，还能够根据自己的需要来进行调味，比如说加糖或者加盐，还有一些下饭的小菜供你挑选，这里的小菜，有炒包菜，炒土豆丝等等，很多的人也都是喜欢这里的小菜，所以愿意经常来此喝粥。', '粥店logo.jpg', '粥店店面.jpg');
