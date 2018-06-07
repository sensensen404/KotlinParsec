package com.morimi.parsec.json

import org.junit.Test

import org.junit.Assert.*

class JsonTest {

    @Test
    fun parse() {
        val parser = Json()
        val result = parser.parse("{\"name\":\"NIX\",\"age\":18,\"detail\":{\"skills\":[\"Swift on iOS\",\"C on Linux\"],\"projects\":[{\"name\":\"coolie\",\"intro\":\"Generate models from a JSON file\"},{\"name\":\"parser\",\"intro\":null}]}}")
        println(result)

        val test2 = parser.parse("\"GetUserPostByIdResult\":{\"Age\":\"33\",\"ID\":\"2server\",\"Name\":\"haorooms\"")
        println(test2)

        val test3 = parser.parse("{\"weekly\":{\"quantity\":4,\"leftQuantity\":4},\"nextWeekDate\":244023317,\"freeQuantity\":1,\"changeConfig\":{\"11\":3,\"16\":4,\"21\":5,\"26\":6},\"oldUser\":{\"quantity\":7,\"leftQuantity\":7},\"coins\":19460,\"price\":980}")
        println(test3)

        val test4 = parser.parse("[{\"id\":3,\"name\":\"传说开始了2\",\"condition\":3,\"desc\":{\"allDone\":\"你的任务完成的很好，我们的洋葱号也已经建造完成啦，但是藏宝图仍藏在险恶之地，只有真正的勇士才能得到，快去协助葱宝找到藏宝图吧！\",\"afterUnlock\":\"你太厉害啦！多亏了你，葱宝才拿到了足够多的木材，我们的洋葱号马上就要建造完成了，但是藏宝图仍藏在险恶之地，只有真正的勇士才能得到，快去协助葱宝找到藏宝图吧！\",\"beforeUnlock\":\"别着急，造船的木材还没有收集够呢~ 没有坚固的战船我们怎么能征服星辰大海呢~快去完成学习任务收集木材吧！\"},\"status\":{\"state\":\"unlock\"},\"typetasks\":[{\"id\":1,\"name\":\"入门\",\"subtasks\":[{\"typetaskId\":1,\"id\":41,\"introduction\":\"邀请家长使用洋葱家长小程序\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"bindParentWechatSP\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"https://test.yangcong345.com/parent-app-share-mp.html?userId=5948a47d3123814fe367f12a&fromType=appTask\",\"needAuth\":false,\"name\":\"让家长了解我的进步\",\"isActivity\":false,\"status\":{\"subtaskId\":41,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":26,\"introduction\":\"完成一个物理课知识点\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中物理\",\"subjectId\":2,\"stageId\":2}],\"desc\":[],\"trigger\":\"weekPhysicsTopic\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/physicsLearn\",\"needAuth\":false,\"name\":\"第一颗苹果\",\"isActivity\":false,\"status\":{\"subtaskId\":26,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":40,\"introduction\":\"让家长帮我领取7天金牌提分会员\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"全部\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"inviteParent\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"https://test.yangcong345.com/parent-app-activity-invite.html?userId=5948a47d3123814fe367f12a&userType=vipTask\",\"needAuth\":false,\"name\":\"体验金牌提分\",\"isActivity\":false,\"status\":{\"subtaskId\":40,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":5,\"introduction\":\"成为洋葱金牌提分会员\",\"rewards\":[{\"type\":\"coin\",\"count\":2000,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"V\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•V\",\"imgUrl\":\"\",\"content\":\"成为金牌提分用户才能获得，通过金牌提分课，解锁所有解题课内容，获得定制学习计划 ，快速提分！\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/\",\"text\":\"成为金牌提分会员，可以解锁所有解题课内容，更有其他特权等着你哦！\"}],\"trigger\":\"vip\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/home?tab=vip\",\"needAuth\":false,\"name\":\"金牌提分\",\"isActivity\":false,\"status\":{\"subtaskId\":5,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":4,\"introduction\":\"完成一个指定解题课\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"破\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•破\",\"imgUrl\":\"\",\"content\":\"非常稀有，完成特定解题课获得。通过学习这类解题课靠自己就能搞定考试大题/难题\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2},{\"text\":\"高中数学\",\"subjectId\":1,\"stageId\":3}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"解题课中还有一类，专为大家解决难题大题。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"在这类解题课中，可以看到历届真题，大题，学懂这些解题课，是我们考试拿高分的关键哦\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_delightful.png\",\"text\":\"解题课只对金牌提分会员开放，但这一次是免费为你开放的，记得学完后，把原料拿给我呀～\"}],\"trigger\":\"D\",\"count\":0,\"interactive\":\"selectTopic\",\"interludeUrl\":\"\",\"module\":\"none\",\"needAuth\":false,\"name\":\"解题课：难题攻破\",\"isActivity\":false,\"status\":{\"subtaskId\":4,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":3,\"introduction\":\"完成一个指定解题课\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"解\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•解\",\"imgUrl\":\"\",\"content\":\"是一种高阶材料，通过完成特定解题课获得，这类解题课带你举一反三，会做一道题就会做一类题\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2},{\"text\":\"高中数学\",\"subjectId\":1,\"stageId\":3}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"解题课类型有多种，不同的解题课类型，功效不一样。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"接下来的解题课会帮大家归纳解题方法。教大家以“不变”应“万变”～很神奇吧\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_delightful.png\",\"text\":\"通常只有金牌提分会员才能学习解题课，这次学习体验是免费的，抓住机会呀！\"}],\"trigger\":\"C\",\"count\":0,\"interactive\":\"selectTopic\",\"interludeUrl\":\"\",\"module\":\"none\",\"needAuth\":false,\"name\":\"解题课：举一反三\",\"isActivity\":false,\"status\":{\"subtaskId\":3,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":2,\"introduction\":\"完成一个指定解题课\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"\",\"type\":\"stuff\",\"count\":1,\"title\":\"造船木材\",\"imgUrl\":\"\",\"content\":\"通过完成指定解题课获得。解题课视频，让做题的思路变清晰。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2},{\"text\":\"高中数学\",\"subjectId\":1,\"stageId\":3}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_dorky.png\",\"text\":\"看来这次得麻烦你帮忙完成解题课才行呀。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"接下来的解题课会传授给大家的非常实用的解题思路。是我们打败数学大魔王的必胜法宝。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_delightful.png\",\"text\":\"只有金牌提分会员才能学习解题课，本葱为你申请了“免费”机会，记得帮我拿“智慧药剂”哦\"}],\"trigger\":\"B\",\"count\":0,\"interactive\":\"selectTopic\",\"interludeUrl\":\"\",\"module\":\"none\",\"needAuth\":false,\"name\":\"解题课：解题思路\",\"isActivity\":false,\"status\":{\"subtaskId\":2,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":1,\"id\":1,\"introduction\":\"完成一个概念课\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2},{\"text\":\"高中数学\",\"subjectId\":1,\"stageId\":3}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_confusing.png\",\"text\":\"哦？概念课吗？每个小节都有洋葱特制的概念课...\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"概念课是浓缩了某一个小节知识点的精华，是我们构建“数学大厦”的必要基础哦！\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_delightful.png\",\"text\":\"概念课一般都是免费内容，一节概念课大概5分钟，很快就可以掌握完成哒～祝你好运咯\"}],\"trigger\":\"A\",\"count\":0,\"interactive\":\"selectTopic\",\"interludeUrl\":\"\",\"module\":\"none\",\"needAuth\":false,\"name\":\"快速领悟知识\",\"isActivity\":false,\"status\":{\"subtaskId\":1,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}}],\"leveltaskId\":3}]},{\"id\":4,\"name\":\"发现新世界\",\"condition\":3,\"desc\":{\"allDone\":\"干的漂亮，你已经证明了你是一个值得信赖的队友，快跟葱宝一起踏上未知的征程追寻属于你的宝藏！\",\"afterUnlock\":\"好险哦，差点与宝藏失之交臂，好在现在藏宝图已经到手了，接下来的挑战将会更加艰巨。如果没有你这样有勇有谋的队友，葱宝肯定找不到宝藏，所以快上船吧，跟葱宝一起踏上未知的征程追寻属于你的宝藏！\",\"beforeUnlock\":\"洋葱号已经建造完成啦。但是如果没有藏宝图，我们会迷失在苍茫的大海之上的，快去帮助葱宝找到海贼王的藏宝图吧！\"},\"status\":{\"state\":\"unlock\"},\"typetasks\":[{\"id\":2,\"name\":\"进阶\",\"subtasks\":[{\"typetaskId\":2,\"id\":12,\"introduction\":\"在试炼场添加一个专项秘籍并完成秘籍的学习\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"专\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•专\",\"imgUrl\":\"\",\"content\":\"完成一个专项课程包可以获得。专项课程包整理了不同知识点里相同的学习规律和解题技巧。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"专项秘籍整理集合了不同知识点里相同的规律和学习技巧。是大家备战考试的好帮手！\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"选择一个专项秘籍，有针对性地提高和挑战自己吧！\"}],\"trigger\":\"specialPackage\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/specialPackage\",\"needAuth\":false,\"name\":\"专项秘籍\",\"isActivity\":false,\"status\":{\"subtaskId\":12,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":2,\"id\":30,\"introduction\":\"让爸爸妈妈给我的学情报告点赞\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"studyResultToParent\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"https://test.yangcong345.com/parent-wx-task-report.html?userId=5948a47d3123814fe367f12a&extra=share&isSupportTutorial=true&agree=true\",\"needAuth\":false,\"name\":\"给家长分享我的学习成果\",\"isActivity\":false,\"status\":{\"subtaskId\":30,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":2,\"id\":10,\"introduction\":\"在试炼场添加一个升星秘籍并完成秘籍的学习\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"升\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•升\",\"imgUrl\":\"\",\"content\":\"完成一个升星课程包可以获得，测试天梯前完成升星课程包可以大幅提升天梯测试成功率。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"升星秘籍是洋葱根据你当前的天梯段位而特别为你定制的哦\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"完成升星秘籍，再进行天梯测试，天梯测试的成功率会有大大的提升！\"}],\"trigger\":\"commonPackage\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/commonPackage\",\"needAuth\":false,\"name\":\"升星秘籍\",\"isActivity\":false,\"status\":{\"subtaskId\":10,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":2,\"id\":9,\"introduction\":\"在试炼场完成天梯定位赛\",\"rewards\":[{\"type\":\"coin\",\"count\":400,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"定\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•定\",\"imgUrl\":\"\",\"content\":\"完成一次天梯定位赛获得，定位赛完成之后可以获得初始天梯称号，天梯称号代表了学习水平和实力。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"完成一次定位赛测试就可以获得自己的天梯称号，天梯称号代表了自己的数学实力和水平哦。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"一次定位赛需要完成10个数学测试题，定位赛机会只有一次哦！准备好我们就开始吧！\"}],\"trigger\":\"location\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/locationGame\",\"needAuth\":true,\"name\":\"我的天梯称号\",\"isActivity\":false,\"status\":{\"subtaskId\":9,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":2,\"id\":11,\"introduction\":\"试炼场的天梯水平到达白银II 或以上\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"银\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•银\",\"imgUrl\":\"\",\"content\":\"天梯段位到达白银以上可以获得的智慧药剂。天梯段位代表了自己的学习水平，可以通过测试提高。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"天梯称号有6个等级：青铜，白银，黄金，铂金，钻石和最高的洋葱学霸\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"定一个小目标，通过测试，将自己的天梯称号升至白银II 吧！\"}],\"trigger\":\"silverTwo\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/silverTwo\",\"needAuth\":false,\"name\":\"小菜一碟\",\"isActivity\":false,\"status\":{\"subtaskId\":11,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":2,\"id\":8,\"introduction\":\"在试炼场完成一次天梯测试\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"},{\"flag\":\"测\",\"type\":\"stuff\",\"count\":1,\"title\":\"智慧药剂•测\",\"imgUrl\":\"\",\"content\":\"完成一次天梯测试可以获得的智慧药剂。通过天梯测试，可以检验知识的掌握情况。\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"来到洋葱学习，你一定很想知道自己的数学水平和实力吧。\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"你可以选择已经学习过的数学知识来进行答题测试。\"}],\"trigger\":\"rank\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/rankGame\",\"needAuth\":false,\"name\":\"试炼开始\",\"isActivity\":false,\"status\":{\"subtaskId\":8,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}}],\"leveltaskId\":4}]},{\"id\":5,\"name\":\"向白云打满舵\",\"condition\":0,\"desc\":{},\"status\":{\"state\":\"unlock\"},\"typetasks\":[{\"id\":3,\"name\":\"其他\",\"subtasks\":[{\"typetaskId\":3,\"id\":6,\"introduction\":\"把洋葱分享安利给家人\",\"rewards\":[{\"type\":\"coin\",\"count\":1000,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[{\"image\":\"\",\"text\":\"有别于其他学习方式，和洋葱一起学习需要经常用到手机设备～\"},{\"image\":\"\",\"text\":\"获得家长和家人的支持，更有助于你的洋葱“学习之旅”\"},{\"image\":\"\",\"text\":\"把洋葱的“好”和你正在学习的内容，分享安利给家长，爸爸妈妈会更了解洋葱，更支持你哦\"}],\"trigger\":\"shareVipPage\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/familyPurchase\",\"needAuth\":false,\"name\":\"为洋葱带盐\",\"isActivity\":false,\"status\":{\"subtaskId\":6,\"state\":\"canReward\",\"topicId\":null,\"doneCount\":1}},{\"typetaskId\":3,\"id\":13,\"introduction\":\"绑定手机，获取最洋葱动态\",\"rewards\":[{\"type\":\"coin\",\"count\":500,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"bindPhone\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/bindPhone\",\"needAuth\":false,\"name\":\"获取洋葱资讯\",\"isActivity\":false,\"status\":{\"subtaskId\":13,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":3,\"id\":16,\"introduction\":\"给我的形象穿上一件服装\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"每个同学在洋葱都有专属于自己的洋葱形象哦\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"服装不仅可以让你的洋葱形象看上去更加炫酷，还有更多好玩的套装和增效效果等着你去发现呢！\"}],\"trigger\":\"growUpChangeClothes\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/changeClothes\",\"needAuth\":false,\"name\":\"洋葱show\",\"isActivity\":true,\"status\":{\"subtaskId\":16,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":3,\"id\":17,\"introduction\":\"用金币抽一次服装\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"洋葱币可以用来抽取服装哦\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"抽到的服装有B，A，S级等级之分，试试你的手气吧！\"}],\"trigger\":\"coinsExtractClothes\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/coinsExtractClothes\",\"needAuth\":false,\"name\":\"抽服装\",\"isActivity\":false,\"status\":{\"subtaskId\":17,\"state\":\"getReward\",\"topicId\":\"\",\"doneCount\":1}},{\"typetaskId\":3,\"id\":14,\"introduction\":\"填写学校信息，和同学一起学习比赛\",\"rewards\":[{\"type\":\"coin\",\"count\":500,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"bindSchool\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/bindSchool\",\"needAuth\":false,\"name\":\"和大家一起学\",\"isActivity\":false,\"status\":{\"subtaskId\":14,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":3,\"id\":27,\"introduction\":\"填写年级信息，洋葱为你定制学习计划\",\"rewards\":[{\"type\":\"coin\",\"count\":500,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"schoolYear\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/schoolYear\",\"needAuth\":false,\"name\":\"我的年级\",\"isActivity\":true,\"status\":{\"subtaskId\":27,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":3,\"id\":18,\"introduction\":\"看完一个洋葱真人秀视频\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_happy.png\",\"text\":\"洋葱真人秀里欢乐多多！大家可以在这里和喜欢的洋葱老师们进行互动哦\"},{\"image\":\"https://fp.yangcong345.com/task_guide_mascot_illus_smile.png\",\"text\":\"洋葱真人秀还会和大家分享有趣的学校生活，讨论好玩的热点话题\"}],\"trigger\":\"realityShow\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/realityShow\",\"needAuth\":false,\"name\":\"洋葱真人秀\",\"isActivity\":false,\"status\":{\"subtaskId\":18,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":null}},{\"typetaskId\":3,\"id\":15,\"introduction\":\"我的努力，值得炫耀\",\"rewards\":[{\"type\":\"coin\",\"count\":500,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"studyReport\",\"count\":0,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/studyReport\",\"needAuth\":true,\"name\":\"晒出我的学习成果\",\"isActivity\":false,\"status\":{\"subtaskId\":15,\"state\":\"getReward\",\"topicId\":null,\"doneCount\":1}}],\"leveltaskId\":5},{\"id\":4,\"name\":\"每周\",\"subtasks\":[{\"typetaskId\":4,\"id\":7,\"introduction\":\"一周内，登录一次洋葱数学\",\"rewards\":[{\"type\":\"coin\",\"count\":100,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"login\",\"count\":1,\"interactive\":\"none\",\"interludeUrl\":\"\",\"module\":\"none\",\"needAuth\":false,\"name\":\"周签到\",\"isActivity\":false,\"status\":{\"subtaskId\":7,\"state\":\"canReward\",\"topicId\":\"\",\"doneCount\":2}},{\"typetaskId\":4,\"id\":19,\"introduction\":\"本周完成两个新知识点的学习（不限学科）\",\"rewards\":[{\"type\":\"coin\",\"count\":400,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"weekTopic\",\"count\":2,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/home?tab=learn\",\"needAuth\":false,\"name\":\"持之以恒\",\"isActivity\":false,\"status\":{\"subtaskId\":19,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":0}},{\"typetaskId\":4,\"id\":20,\"introduction\":\"本周完成三次天梯测试\",\"rewards\":[{\"type\":\"coin\",\"count\":300,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"初中数学\",\"subjectId\":1,\"stageId\":2}],\"desc\":[],\"trigger\":\"weekLadder\",\"count\":3,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/home?tab=ladder\",\"needAuth\":false,\"name\":\"接受挑战吧，少年~\",\"isActivity\":false,\"status\":{\"subtaskId\":20,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":0}},{\"typetaskId\":4,\"id\":23,\"introduction\":\"看一个真人秀视频\",\"rewards\":[{\"type\":\"coin\",\"count\":100,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"weekShowVideo\",\"count\":1,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/home?tab=show\",\"needAuth\":false,\"name\":\"轻松一刻\",\"isActivity\":false,\"status\":{\"subtaskId\":23,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":0}},{\"typetaskId\":4,\"id\":25,\"introduction\":\"分享一次任意的洋葱视频\",\"rewards\":[{\"type\":\"coin\",\"count\":100,\"imgUrl\":\"\",\"displayId\":\"\"}],\"matching\":[{\"text\":\"所有学科\",\"subjectId\":0,\"stageId\":0}],\"desc\":[],\"trigger\":\"weekShareVideo\",\"count\":1,\"interactive\":\"direct\",\"interludeUrl\":\"\",\"module\":\"ycmath://yangcong345.com/home?tab=learn\",\"needAuth\":false,\"name\":\"我的“洋葱”分你一半\",\"isActivity\":false,\"status\":{\"subtaskId\":25,\"state\":\"unbegin\",\"topicId\":null,\"doneCount\":null}}],\"leveltaskId\":5}]}]")
        println(test4)
    }
}